package generaloss.spatialmath;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ClassWriter {

    private static final String TAB = "    ";

    private final String packagе, name, generics, header;
    private final List<String> imports;
    private final List<Method> constructors;
    private final List<Method> methods;
    private final List<String> fields;

    public ClassWriter(String packagе, String name, String generics, String header) {
        this.packagе = packagе;
        this.name = name;
        this.generics = generics;
        this.header = header;
        this.imports = new ArrayList<>();
        this.constructors = new ArrayList<>();
        this.methods = new ArrayList<>();
        this.fields = new ArrayList<>();
    }


    public ClassWriter addImport(String importName) {
        this.imports.add(importName);
        return this;
    }

    public ClassWriter addField(String fieldName) {
        this.fields.add(fieldName);
        return this;
    }

    public ClassWriter addConstructor(String header, String... lines) {
        this.constructors.add(new Method(null, "public " + name + header, lines));
        return this;
    }

    public ClassWriter addGenericsConstructor(String generics, String header, String... lines) {
        this.constructors.add(new Method(null, "public " + generics + " " + name + header, lines));
        return this;
    }

    public ClassWriter addMethod(String header, String... lines) {
        this.methods.add(new Method(null, header, lines));
        return this;
    }

    public ClassWriter addAnnotatedMethod(String annotation, String header, String... lines) {
        this.methods.add(new Method(annotation, header, lines));
        return this;
    }

    public ClassWriter addMethodSplitter() {
        this.methods.add(null);
        return this;
    }


    private String makeCode() {
        final StringBuilder builder = new StringBuilder();

        if(!packagе.isEmpty()){
            builder.append("package " + packagе + ";\n");
            builder.append("\n");
        }
        // imports
        if(!imports.isEmpty()){
            for(String Import: imports)
                builder.append("import " + Import + ";\n");
            builder.append("\n");
        }
        // class

        builder.append("public class " + name);
        if(!generics.isEmpty()) builder.append(generics);
        if(!header.isEmpty()) builder.append(" " + header);
        builder.append(" {\n\n");
        // fields
        if(!fields.isEmpty()){
            for(String field: fields)
                builder.append(TAB + field + "\n");
            builder.append("\n");
        }
        // constructors
        if(!constructors.isEmpty()){
            for(Method constructor: constructors){
                builder.append(TAB + constructor.header + " {");
                if(constructor.lines.length == 0){
                    builder.append(" }\n");
                }else{
                    builder.append("\n");
                    for(String line: constructor.lines)
                        builder.append(TAB + TAB + line + "\n");
                    builder.append(TAB + "}\n");
                }
                builder.append("\n");
            }
        }
        // methods
        for(Method method: methods){
            if(method != null){
                if(method.annotation != null)
                    builder.append(TAB + method.annotation + "\n");
                builder.append(TAB + method.header + " {\n");
                for(String line: method.lines)
                    builder.append(TAB + TAB + line + "\n");
                builder.append(TAB + "}\n");
            }
            builder.append("\n");
        }
        // class
        builder.append("}");

        return builder.toString();
    }

    public ClassWriter write(String path) {
        final String code = this.makeCode();

        try {
            final File file = new File(path + "/" + name + ".java");
            file.mkdirs();
            file.createNewFile();

            final PrintStream printStream = new PrintStream(file);
            printStream.write(code.getBytes());
            printStream.close();

        }catch(IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Generated class '" + name + "' (" + code.split("\n").length + " lines)");
        return this;
    }


    private static class Method {

        private final String annotation;
        private final String header;
        private final String[] lines;

        public Method(String annotation, String header, String... lines) {
            this.annotation = annotation;
            this.header = header;
            this.lines = lines;
        }

        public String annotation() {
            return annotation;
        }

        public String header() {
            return header;
        }

        public String[] lines() {
            return lines;
        }

    }

}
