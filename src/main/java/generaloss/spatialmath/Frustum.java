package generaloss.spatialmath;

import generaloss.spatialmath.axisaligned.AABoxBody;
import generaloss.spatialmath.matrix.Matrix4f;
import generaloss.spatialmath.vector.Vec3f;
import generaloss.spatialmath.vector.Vec4f;

import static generaloss.spatialmath.matrix.Matrix4f.*;

public class Frustum {

    private final Vec4f[] vectors;

    public Frustum() {
        this.vectors = new Vec4f[]{
            new Vec4f(), new Vec4f(), new Vec4f(),
            new Vec4f(), new Vec4f(), new Vec4f()
        };
    }

    public Frustum(Matrix4f combined) {
        this();
        this.setFrustum(combined);
    }

    public Frustum(Matrix4f view, Matrix4f projection) {
        this();
        this.setFrustum(projection, view);
    }


    public void setFrustum(float[] combined) {
        final float v0 = combined[M03];
        final float v1 = combined[M13];
        final float v2 = combined[M23];
        final float v3 = combined[M33];

        vectors[0].set((v0 - combined[M00]), (v1 - combined[M10]), (v2 - combined[M20]), (v3 - combined[M30])).nor();
        vectors[1].set((v0 + combined[M00]), (v1 + combined[M10]), (v2 + combined[M20]), (v3 + combined[M30])).nor();
        vectors[2].set((v0 + combined[M01]), (v1 + combined[M11]), (v2 + combined[M21]), (v3 + combined[M31])).nor();
        vectors[3].set((v0 - combined[M01]), (v1 - combined[M11]), (v2 - combined[M21]), (v3 - combined[M31])).nor();
        vectors[4].set((v0 - combined[M02]), (v1 - combined[M12]), (v2 - combined[M22]), (v3 - combined[M32])).nor();
        vectors[5].set((v0 + combined[M02]), (v1 + combined[M12]), (v2 + combined[M22]), (v3 + combined[M32])).nor();
    }

    public void setFrustum(Matrix4f combined) {
        this.setFrustum(combined.values);
    }

    public void setFrustum(Matrix4f view, Matrix4f projection) {
        final float[] combined = Matrix4f.mulToNew(projection.values, view.values);
        this.setFrustum(combined);
    }


    private float multiply(int index, float x, float y, float z) {
        final Vec4f vector = vectors[index];
        return (vector.x * x) + (vector.y * y) + (vector.z * z) + vector.w;
    }


    public boolean isPointIn(float x, float y, float z) {
        for(int i = 0; i < 6; i++)
            if(this.multiply(i, x, y, z) <= 0F)
                return false;
        return true;
    }

    public boolean isPointIn(Vec3f point) {
        return this.isPointIn(point.x, point.y, point.z);
    }


    public boolean isMeshIn(float... points) {
        loop:
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < points.length; j += 3) {
                final float x = points[j];
                final float y = points[j + 1];
                final float z = points[j + 2];

                if(this.multiply(i, x, y, z) > 0F)
                    continue loop;
            }
            return false;
        }
        return true;
    }

    public boolean isMeshIn(Vec3f... points) {
        loop:
        for(int i = 0; i < 6; i++) {
            for(Vec3f point: points)
                if(this.multiply(i, point.x, point.y, point.z) > 0F)
                    continue loop;
            return false;
        }
        return true;
    }


    public boolean isAABoxIn(float minX, float minY, float minZ, float maxX, float maxY, float maxZ) {
        return this.isMeshIn(
            minX, minY, minZ, maxX, minY, minZ, minX, maxY, minZ, maxX, maxY, minZ,
            minX, minY, maxZ, maxX, minY, maxZ, minX, maxY, maxZ, maxX, maxY, maxZ
        );
    }

    public boolean isAABoxIn(Vec3f min, Vec3f max) {
        return this.isAABoxIn(min.x, min.y, min.z, max.x, max.y, max.z);
    }

    public boolean isAABoxIn(AABoxBody box) {
        return this.isAABoxIn(box.min(), box.max());
    }

}