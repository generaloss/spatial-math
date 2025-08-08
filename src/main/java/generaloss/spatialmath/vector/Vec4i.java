package generaloss.spatialmath.vector;

import generaloss.spatialmath.Maths;
import generaloss.spatialmath.Mathc;
import java.util.Objects;

public class Vec4i {

    public int x;
    public int y;
    public int z;
    public int w;

    public Vec4i() { }

    public Vec4i(float xyzw) {
        this.set(xyzw);
    }

    public Vec4i(double xyzw) {
        this.set(xyzw);
    }

    public Vec4i(int xyzw) {
        this.set(xyzw);
    }

    public Vec4i(float x, float y) {
        this.set(x, y);
    }

    public Vec4i(double x, double y) {
        this.set(x, y);
    }

    public Vec4i(int x, int y) {
        this.set(x, y);
    }

    public Vec4i(float x, float y, float z) {
        this.set(x, y, z);
    }

    public Vec4i(double x, double y, double z) {
        this.set(x, y, z);
    }

    public Vec4i(int x, int y, int z) {
        this.set(x, y, z);
    }

    public Vec4i(float x, float y, float z, float w) {
        this.set(x, y, z, w);
    }

    public Vec4i(double x, double y, double z, double w) {
        this.set(x, y, z, w);
    }

    public Vec4i(int x, int y, int z, int w) {
        this.set(x, y, z, w);
    }

    public Vec4i(Vec2f vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4i(Vec2d vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4i(Vec2i vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4i(Vec3f vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i(Vec3d vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i(Vec3i vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i(Vec4f vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i(Vec4d vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i(Vec4i vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public int getW() {
        return w;
    }


    public Vec4i set(int xyzw) {
        this.x = xyzw;
        this.y = xyzw;
        this.z = xyzw;
        this.w = xyzw;
        return this;
    }

    public Vec4i set(float xyzw) {
        return this.set((int) xyzw);
    }

    public Vec4i set(double xyzw) {
        return this.set((int) xyzw);
    }

    public Vec4i set(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vec4i set(float x, float y) {
        return this.set((int) x, (int) y);
    }

    public Vec4i set(double x, double y) {
        return this.set((int) x, (int) y);
    }

    public Vec4i set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec4i set(float x, float y, float z) {
        return this.set((int) x, (int) y, (int) z);
    }

    public Vec4i set(double x, double y, double z) {
        return this.set((int) x, (int) y, (int) z);
    }

    public Vec4i set(int x, int y, int z, int w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }

    public Vec4i set(float x, float y, float z, float w) {
        return this.set((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i set(double x, double y, double z, double w) {
        return this.set((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i set(Vec2f vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4i set(Vec2d vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4i set(Vec2i vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4i set(Vec3f vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i set(Vec3d vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i set(Vec3i vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4i set(Vec4f vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i set(Vec4d vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i set(Vec4i vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4i add(int xyzw) {
        this.x += xyzw;
        this.y += xyzw;
        this.z += xyzw;
        this.w += xyzw;
        return this;
    }

    public Vec4i add(float xyzw) {
        return this.add((int) xyzw);
    }

    public Vec4i add(double xyzw) {
        return this.add((int) xyzw);
    }

    public Vec4i add(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vec4i add(float x, float y) {
        return this.add((int) x, (int) y);
    }

    public Vec4i add(double x, double y) {
        return this.add((int) x, (int) y);
    }

    public Vec4i add(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Vec4i add(float x, float y, float z) {
        return this.add((int) x, (int) y, (int) z);
    }

    public Vec4i add(double x, double y, double z) {
        return this.add((int) x, (int) y, (int) z);
    }

    public Vec4i add(int x, int y, int z, int w) {
        this.x += x;
        this.y += y;
        this.z += z;
        this.w += w;
        return this;
    }

    public Vec4i add(float x, float y, float z, float w) {
        return this.add((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i add(double x, double y, double z, double w) {
        return this.add((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i add(Vec2f vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4i add(Vec2d vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4i add(Vec2i vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4i add(Vec3f vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4i add(Vec3d vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4i add(Vec3i vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4i add(Vec4f vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i add(Vec4d vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i add(Vec4i vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4i sub(int xyzw) {
        this.x -= xyzw;
        this.y -= xyzw;
        this.z -= xyzw;
        this.w -= xyzw;
        return this;
    }

    public Vec4i sub(float xyzw) {
        return this.sub((int) xyzw);
    }

    public Vec4i sub(double xyzw) {
        return this.sub((int) xyzw);
    }

    public Vec4i sub(int x, int y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vec4i sub(float x, float y) {
        return this.sub((int) x, (int) y);
    }

    public Vec4i sub(double x, double y) {
        return this.sub((int) x, (int) y);
    }

    public Vec4i sub(int x, int y, int z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }

    public Vec4i sub(float x, float y, float z) {
        return this.sub((int) x, (int) y, (int) z);
    }

    public Vec4i sub(double x, double y, double z) {
        return this.sub((int) x, (int) y, (int) z);
    }

    public Vec4i sub(int x, int y, int z, int w) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        this.w -= w;
        return this;
    }

    public Vec4i sub(float x, float y, float z, float w) {
        return this.sub((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i sub(double x, double y, double z, double w) {
        return this.sub((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i sub(Vec2f vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4i sub(Vec2d vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4i sub(Vec2i vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4i sub(Vec3f vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4i sub(Vec3d vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4i sub(Vec3i vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4i sub(Vec4f vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i sub(Vec4d vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i sub(Vec4i vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4i mul(int xyzw) {
        this.x *= xyzw;
        this.y *= xyzw;
        this.z *= xyzw;
        this.w *= xyzw;
        return this;
    }

    public Vec4i mul(float xyzw) {
        return this.mul((int) xyzw);
    }

    public Vec4i mul(double xyzw) {
        return this.mul((int) xyzw);
    }

    public Vec4i mul(int x, int y) {
        this.x *= x;
        this.y *= y;
        return this;
    }

    public Vec4i mul(float x, float y) {
        return this.mul((int) x, (int) y);
    }

    public Vec4i mul(double x, double y) {
        return this.mul((int) x, (int) y);
    }

    public Vec4i mul(int x, int y, int z) {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        return this;
    }

    public Vec4i mul(float x, float y, float z) {
        return this.mul((int) x, (int) y, (int) z);
    }

    public Vec4i mul(double x, double y, double z) {
        return this.mul((int) x, (int) y, (int) z);
    }

    public Vec4i mul(int x, int y, int z, int w) {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        this.w *= w;
        return this;
    }

    public Vec4i mul(float x, float y, float z, float w) {
        return this.mul((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i mul(double x, double y, double z, double w) {
        return this.mul((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i mul(Vec2f vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4i mul(Vec2d vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4i mul(Vec2i vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4i mul(Vec3f vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4i mul(Vec3d vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4i mul(Vec3i vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4i mul(Vec4f vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i mul(Vec4d vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i mul(Vec4i vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4i div(int xyzw) {
        this.x /= xyzw;
        this.y /= xyzw;
        this.z /= xyzw;
        this.w /= xyzw;
        return this;
    }

    public Vec4i div(float xyzw) {
        return this.div((int) xyzw);
    }

    public Vec4i div(double xyzw) {
        return this.div((int) xyzw);
    }

    public Vec4i div(int x, int y) {
        this.x /= x;
        this.y /= y;
        return this;
    }

    public Vec4i div(float x, float y) {
        return this.div((int) x, (int) y);
    }

    public Vec4i div(double x, double y) {
        return this.div((int) x, (int) y);
    }

    public Vec4i div(int x, int y, int z) {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        return this;
    }

    public Vec4i div(float x, float y, float z) {
        return this.div((int) x, (int) y, (int) z);
    }

    public Vec4i div(double x, double y, double z) {
        return this.div((int) x, (int) y, (int) z);
    }

    public Vec4i div(int x, int y, int z, int w) {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        this.w /= w;
        return this;
    }

    public Vec4i div(float x, float y, float z, float w) {
        return this.div((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i div(double x, double y, double z, double w) {
        return this.div((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i div(Vec2f vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4i div(Vec2d vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4i div(Vec2i vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4i div(Vec3f vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4i div(Vec3d vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4i div(Vec3i vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4i div(Vec4f vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i div(Vec4d vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i div(Vec4i vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }


    public static int dst2(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        final int dx = (x2 - x1);
        final int dy = (y2 - y1);
        final int dz = (z2 - z1);
        final int dw = (w2 - w1);
        return (dx * dx + dy * dy + dz * dz + dw * dw);
    }

    public static int dst2(int x1, int y1, int z1, int w1, float x2, float y2, float z2, float w2) {
        return dst2(x1, y1, z1, w1, (int) x2, (int) y2, (int) z2, (int) w2);
    }

    public static int dst2(int x1, int y1, int z1, int w1, double x2, double y2, double z2, double w2) {
        return dst2(x1, y1, z1, w1, (int) x2, (int) y2, (int) z2, (int) w2);
    }

    public static int dst2(int x, int y, int z, int w, Vec4f vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static int dst2(int x, int y, int z, int w, Vec4d vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static int dst2(int x, int y, int z, int w, Vec4i vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static int dst2(Vec4i vector, float x, float y, float z, float w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static int dst2(Vec4i vector, double x, double y, double z, double w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static int dst2(Vec4i vector, int x, int y, int z, int w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static int dst2(Vec4i vector1, Vec4f vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static int dst2(Vec4i vector1, Vec4d vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static int dst2(Vec4i vector1, Vec4i vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public int dst2(float x, float y, float z, float w) {
        return dst2(this, x, y, z, w);
    }

    public int dst2(double x, double y, double z, double w) {
        return dst2(this, x, y, z, w);
    }

    public int dst2(int x, int y, int z, int w) {
        return dst2(this, x, y, z, w);
    }

    public int dst2(Vec4f vector) {
        return dst2(this, vector);
    }

    public int dst2(Vec4d vector) {
        return dst2(this, vector);
    }

    public int dst2(Vec4i vector) {
        return dst2(this, vector);
    }


    public static float dst(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return Mathc.sqrt(dst2(x1, y1, z1, w1, x2, y2, z2, w2));
    }

    public static float dst(int x1, int y1, int z1, int w1, float x2, float y2, float z2, float w2) {
        return dst(x1, y1, z1, w1, (int) x2, (int) y2, (int) z2, (int) w2);
    }

    public static float dst(int x1, int y1, int z1, int w1, double x2, double y2, double z2, double w2) {
        return dst(x1, y1, z1, w1, (int) x2, (int) y2, (int) z2, (int) w2);
    }

    public static float dst(int x, int y, int z, int w, Vec4f vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static float dst(int x, int y, int z, int w, Vec4d vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static float dst(int x, int y, int z, int w, Vec4i vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static float dst(Vec4i vector, float x, float y, float z, float w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static float dst(Vec4i vector, double x, double y, double z, double w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static float dst(Vec4i vector, int x, int y, int z, int w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static float dst(Vec4i vector1, Vec4f vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static float dst(Vec4i vector1, Vec4d vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static float dst(Vec4i vector1, Vec4i vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public float dst(float x, float y, float z, float w) {
        return dst(this, x, y, z, w);
    }

    public float dst(double x, double y, double z, double w) {
        return dst(this, x, y, z, w);
    }

    public float dst(int x, int y, int z, int w) {
        return dst(this, x, y, z, w);
    }

    public float dst(Vec4f vector) {
        return dst(this, vector);
    }

    public float dst(Vec4d vector) {
        return dst(this, vector);
    }

    public float dst(Vec4i vector) {
        return dst(this, vector);
    }


    public static Vec4i shorter(Vec4i vector1, Vec4i vector2) {
        return (vector1.len2() < vector2.len2()) ? vector1 : vector2;
    }

    public static Vec4i longer(Vec4i vector1, Vec4i vector2) {
        return (vector1.len2() > vector2.len2()) ? vector1 : vector2;
    }

    public Vec4i setShorter(Vec4i vector1, Vec4i vector2) {
        return this.set(shorter(vector1, vector2));
    }

    public Vec4i setLonger(Vec4i vector1, Vec4i vector2) {
        return this.set(longer(vector1, vector2));
    }


    public int minComp() {
        return Math.min(x, Math.min(y, Math.min(z, w)));
    }

    public int maxComp() {
        return Math.max(x, Math.max(y, Math.max(z, w)));
    }


    public static Vec4i minComps(Vec4i dst, int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return dst.set(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2), Math.min(w1, w2));
    }

    public static Vec4i minComps(Vec4i dst, int x1, int y1, int z1, int w1, Vec4i vector2) {
        return minComps(dst, x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static Vec4i minComps(Vec4i dst, Vec4i vector1, int x2, int y2, int z2, int w2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static Vec4i minComps(Vec4i dst, Vec4i vector1, int xyzw2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, xyzw2, xyzw2, xyzw2, xyzw2);
    }

    public static Vec4i minComps(Vec4i dst, Vec4i vector1, Vec4i vector2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public Vec4i setMinComps(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return minComps(this, x1, y1, z1, w1, x2, y2, z2, w2);
    }

    public Vec4i setMinComps(int x1, int y1, int z1, int w1, Vec4i vector2) {
        return minComps(this, x1, y1, z1, w1, vector2);
    }

    public Vec4i setMinComps(Vec4i vector1, int x2, int y2, int z2, int w2) {
        return minComps(this, vector1, x2, y2, z2, w2);
    }

    public Vec4i setMinComps(Vec4i vector1, int xyzw2) {
        return minComps(this, vector1, xyzw2);
    }

    public Vec4i setMinComps(Vec4i vector1, Vec4i vector2) {
        return minComps(this, vector1, vector2);
    }

    public Vec4i setMinComps(int x2, int y2, int z2, int w2) {
        return this.setMinComps(this, x2, y2, z2, w2);
    }

    public Vec4i setMinComps(int xyzw2) {
        return this.setMinComps(this, xyzw2);
    }

    public Vec4i setMinComps(Vec4i vector2) {
        return this.setMinComps(this, vector2);
    }


    public static Vec4i maxComps(Vec4i dst, int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return dst.set(Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2), Math.max(w1, w2));
    }

    public static Vec4i maxComps(Vec4i dst, int x1, int y1, int z1, int w1, Vec4i vector2) {
        return maxComps(dst, x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static Vec4i maxComps(Vec4i dst, Vec4i vector1, int x2, int y2, int z2, int w2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static Vec4i maxComps(Vec4i dst, Vec4i vector1, int xyzw2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, xyzw2, xyzw2, xyzw2, xyzw2);
    }

    public static Vec4i maxComps(Vec4i dst, Vec4i vector1, Vec4i vector2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public Vec4i setMaxComps(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return maxComps(this, x1, y1, z1, w1, x2, y2, z2, w2);
    }

    public Vec4i setMaxComps(int x1, int y1, int z1, int w1, Vec4i vector2) {
        return maxComps(this, x1, y1, z1, w1, vector2);
    }

    public Vec4i setMaxComps(Vec4i vector1, int x2, int y2, int z2, int w2) {
        return maxComps(this, vector1, x2, y2, z2, w2);
    }

    public Vec4i setMaxComps(Vec4i vector1, int xyzw2) {
        return maxComps(this, vector1, xyzw2);
    }

    public Vec4i setMaxComps(Vec4i vector1, Vec4i vector2) {
        return maxComps(this, vector1, vector2);
    }

    public Vec4i setMaxComps(int x2, int y2, int z2, int w2) {
        return this.setMaxComps(this, x2, y2, z2, w2);
    }

    public Vec4i setMaxComps(int xyzw2) {
        return this.setMaxComps(this, xyzw2);
    }

    public Vec4i setMaxComps(Vec4i vector2) {
        return this.setMaxComps(this, vector2);
    }


    public boolean isShorter(int comparableX, int comparableY, int comparableZ, int comparableW) {
        return this.len2() < len2(comparableX, comparableY, comparableZ, comparableW);
    }

    public boolean isShorter(Vec4i comparable) {
        return this.isShorter(comparable.x, comparable.y, comparable.z, comparable.w);
    }

    public boolean isLonger(int comparableX, int comparableY, int comparableZ, int comparableW) {
        return this.len2() > len2(comparableX, comparableY, comparableZ, comparableW);
    }

    public boolean isLonger(Vec4i comparable) {
        return this.isLonger(comparable.x, comparable.y, comparable.z, comparable.w);
    }


    public boolean isZero() {
        return x == 0 && y == 0 && z == 0 && w == 0;
    }

    public boolean isNotZero() {
        return x != 0 || y != 0 || z != 0 || w != 0;
    }

    public Vec4i zero() {
        return this.set(0);
    }

    public Vec4i zeroCompsThatLess(int x, int y, int z, int w) {
        if(Math.abs(this.x) < Math.abs(x))
            this.x = 0;
        if(Math.abs(this.y) < Math.abs(y))
            this.y = 0;
        if(Math.abs(this.z) < Math.abs(z))
            this.z = 0;
        if(Math.abs(this.w) < Math.abs(w))
            this.w = 0;
        return this;
    }

    public Vec4i zeroCompsThatLess(float x, float y, float z, float w) {
        return this.zeroCompsThatLess((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatLess(double x, double y, double z, double w) {
        return this.zeroCompsThatLess((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatLess(float xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatLess(double xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatLess(int xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatLess(Vec4f vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatLess(Vec4d vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatLess(Vec4i vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatZero(int x, int y, int z, int w) {
        if(x == 0)
            this.x = 0;
        if(y == 0)
            this.y = 0;
        if(z == 0)
            this.z = 0;
        if(w == 0)
            this.w = 0;
        return this;
    }

    public Vec4i zeroCompsThatZero(float x, float y, float z, float w) {
        return this.zeroCompsThatZero((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatZero(double x, double y, double z, double w) {
        return this.zeroCompsThatZero((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatZero(float xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatZero(double xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatZero(int xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatZero(Vec4f vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatZero(Vec4d vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatZero(Vec4i vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatBigger(int x, int y, int z, int w) {
        if(Math.abs(this.x) > Math.abs(x))
            this.x = 0;
        if(Math.abs(this.y) > Math.abs(y))
            this.y = 0;
        if(Math.abs(this.z) > Math.abs(z))
            this.z = 0;
        if(Math.abs(this.w) > Math.abs(w))
            this.w = 0;
        return this;
    }

    public Vec4i zeroCompsThatBigger(float x, float y, float z, float w) {
        return this.zeroCompsThatBigger((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatBigger(double x, double y, double z, double w) {
        return this.zeroCompsThatBigger((int) x, (int) y, (int) z, (int) w);
    }

    public Vec4i zeroCompsThatBigger(float xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatBigger(double xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatBigger(int xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4i zeroCompsThatBigger(Vec4f vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatBigger(Vec4d vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4i zeroCompsThatBigger(Vec4i vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }


    public int hypervolume() {
        return x * y * z * w;
    }


    public static int len2(int x, int y, int z, int w) {
        return x * x + y * y + z * z + w * w;
    }

    public static int len2(Vec4i vector) {
        return len2(vector.x, vector.y, vector.z, vector.w);
    }

    public static float len(int x, int y, int z, int w) {
        return Mathc.sqrt(len2(x, y, z, w));
    }

    public static float len(Vec4i vector) {
        return Mathc.sqrt(len2(vector.x, vector.y, vector.z, vector.w));
    }

    public int len2() {
        return len2(this);
    }

    public float len() {
        return len(this);
    }


    public Vec4i abs() {
        if(x < 0) x *= -1;
        if(y < 0) y *= -1;
        if(z < 0) z *= -1;
        if(w < 0) w *= -1;
        return this;
    }


    public static Vec4i lerp(Vec4i dst, int startX, int startY, int startZ, int startW, int endX, int endY, int endZ, int endW, float t) {
        return dst.set(
            Maths.lerp(startX, endX, t),
            Maths.lerp(startY, endY, t),
            Maths.lerp(startZ, endZ, t),
            Maths.lerp(startW, endW, t)
        );
    }

    public static Vec4i lerp(Vec4i dst, Vec4i start, Vec4i end, float t) {
        return lerp(dst, start.x, start.y, start.z, start.w, end.x, end.y, end.z, end.w, t);
    }

    public Vec4i lerp(int startX, int startY, int startZ, int startW, int endX, int endY, int endZ, int endW, float t) {
        return lerp(this, startX, startY, startZ, startW, endX, endY, endZ, endW, t);
    }

    public Vec4i lerp(Vec4i start, Vec4i end, float t) {
        return lerp(this, start, end, t);
    }


    public static int dot(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return x1 * x2 + y1 * y2 + z1 * z2 + w1 * w2;
    }

    public static int dot(Vec4i vector1, int x2, int y2, int z2, int w2) {
        return dot(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static int dot(int x1, int y1, int z1, int w1, Vec4i vector2) {
        return dot(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static int dot(Vec4i vector1, Vec4i vector2) {
        return dot(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public int dot(Vec4i vector) {
        return dot(this, vector);
    }

    public int dot(int x, int y, int z, int w) {
        return dot(this, x, y, z, w);
    }


    public Vec4i signum(Vec4i dst) {
        return dst.set(Math.signum(x), Math.signum(y), Math.signum(z), Math.signum(w));
    }


    public static float angleBetweenRad(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        final float lengthProduct = len(x1, y1, z1, w1) * len(x2, y2, z2, w2);
        if(lengthProduct == 0)
            return 0;
        final float cos = dot(x1, y1, z1, w1, x2, y2, z2, w2) / lengthProduct;
        return Mathc.acos(Maths.clamp(cos, -1, 1));
    }

    public static float angleBetweenRad(Vec4i vector1, int x2, int y2, int z2, int w2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static float angleBetweenRad(int x1, int y1, int z1, int w1, Vec4i vector2) {
        return angleBetweenRad(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static float angleBetweenRad(Vec4i vector1, Vec4i vector2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public float angleBetweenRad(int x, int y, int z, int w) {
        return angleBetweenRad(this, x, y, z, w);
    }

    public float angleBetweenRad(Vec4i vector) {
        return angleBetweenRad(this, vector);
    }

    public static float angleBetween(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return angleBetweenRad(x1, y1, z1, w1, x2, y2, z2, w2) * Maths.TO_DEG;
    }

    public static float angleBetween(Vec4i vector1, int x2, int y2, int z2, int w2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static float angleBetween(int x1, int y1, int z1, int w1, Vec4i vector2) {
        return angleBetween(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static float angleBetween(Vec4i vector1, Vec4i vector2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public float angleBetween(int x, int y, int z, int w) {
        return angleBetween(this, x, y, z, w);
    }

    public float angleBetween(Vec4i vector) {
        return angleBetween(this, vector);
    }


    public Vec4f castFloat() {
        return new Vec4f(this);
    }

    public Vec4d castDouble() {
        return new Vec4d(this);
    }


    public Vec4i clamp(int minX, int minY, int minZ, int minW, int maxX, int maxY, int maxZ, int maxW) {
        return this.set(
            Maths.clamp(x, minX, maxX),
            Maths.clamp(y, minY, maxY),
            Maths.clamp(z, minZ, maxZ),
            Maths.clamp(w, minW, maxW)
        );
    }

    public Vec4i clamp(int minX, int minY, int minZ, int minW, Vec4i max) {
        return this.clamp(minX, minY, minZ, minW, max.x, max.y, max.z, max.w);
    }

    public Vec4i clamp(int minXYZW, int maxXYZW) {
        return this.clamp(minXYZW, minXYZW, minXYZW, minXYZW, maxXYZW, maxXYZW, maxXYZW, maxXYZW);
    }

    public Vec4i clamp(int minXYZW, Vec4i max) {
        return this.clamp(minXYZW, minXYZW, minXYZW, minXYZW, max.x, max.y, max.z, max.w);
    }

    public Vec4i clamp(Vec4i min, int maxX, int maxY, int maxZ, int maxW) {
        return this.clamp(min.x, min.y, min.z, min.w, maxX, maxY, maxZ, maxW);
    }

    public Vec4i clamp(Vec4i min, int maxXYZW) {
        return this.clamp(min.x, min.y, min.z, min.w, maxXYZW, maxXYZW, maxXYZW, maxXYZW);
    }

    public Vec4i clamp(Vec4i min, Vec4i max) {
        return this.clamp(min.x, min.y, min.z, min.w, max.x, max.y, max.z, max.w);
    }


    public Vec4i copy() {
        return new Vec4i(this);
    }

    public static boolean equals(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return x1 == x2 && y1 == y2 && z1 == z2 && w1 == w2;
    }

    public static boolean notEquals(int x1, int y1, int z1, int w1, int x2, int y2, int z2, int w2) {
        return x1 != x2 || y1 != y2 || z1 != z2 || w1 != w2;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || getClass() != object.getClass())
            return false;
        
        final Vec4i vec = (Vec4i) object;
        return Vec4i.equals(x, y, z, w, vec.x, vec.y, vec.z, vec.w);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z, w);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + ", " + w + "}";
    }

}