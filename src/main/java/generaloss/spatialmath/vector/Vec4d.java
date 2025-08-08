package generaloss.spatialmath.vector;

import generaloss.spatialmath.Maths;
import java.util.Objects;

public class Vec4d {

    public double x;
    public double y;
    public double z;
    public double w;

    public Vec4d() { }

    public Vec4d(float xyzw) {
        this.set(xyzw);
    }

    public Vec4d(double xyzw) {
        this.set(xyzw);
    }

    public Vec4d(int xyzw) {
        this.set(xyzw);
    }

    public Vec4d(float x, float y) {
        this.set(x, y);
    }

    public Vec4d(double x, double y) {
        this.set(x, y);
    }

    public Vec4d(int x, int y) {
        this.set(x, y);
    }

    public Vec4d(float x, float y, float z) {
        this.set(x, y, z);
    }

    public Vec4d(double x, double y, double z) {
        this.set(x, y, z);
    }

    public Vec4d(int x, int y, int z) {
        this.set(x, y, z);
    }

    public Vec4d(float x, float y, float z, float w) {
        this.set(x, y, z, w);
    }

    public Vec4d(double x, double y, double z, double w) {
        this.set(x, y, z, w);
    }

    public Vec4d(int x, int y, int z, int w) {
        this.set(x, y, z, w);
    }

    public Vec4d(Vec2f vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4d(Vec2d vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4d(Vec2i vector) {
        this.set(vector.x, vector.y);
    }

    public Vec4d(Vec3f vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d(Vec3d vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d(Vec3i vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d(Vec4f vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d(Vec4d vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d(Vec4i vector) {
        this.set(vector.x, vector.y, vector.z, vector.w);
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getW() {
        return w;
    }


    public Vec4d set(double xyzw) {
        this.x = xyzw;
        this.y = xyzw;
        this.z = xyzw;
        this.w = xyzw;
        return this;
    }

    public Vec4d set(float xyzw) {
        return this.set((double) xyzw);
    }

    public Vec4d set(int xyzw) {
        return this.set((double) xyzw);
    }

    public Vec4d set(double x, double y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vec4d set(float x, float y) {
        return this.set((double) x, y);
    }

    public Vec4d set(int x, int y) {
        return this.set((double) x, y);
    }

    public Vec4d set(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec4d set(float x, float y, float z) {
        return this.set((double) x, y, z);
    }

    public Vec4d set(int x, int y, int z) {
        return this.set((double) x, y, z);
    }

    public Vec4d set(double x, double y, double z, double w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
        return this;
    }

    public Vec4d set(float x, float y, float z, float w) {
        return this.set((double) x, y, z, w);
    }

    public Vec4d set(int x, int y, int z, int w) {
        return this.set((double) x, y, z, w);
    }

    public Vec4d set(Vec2f vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4d set(Vec2d vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4d set(Vec2i vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec4d set(Vec3f vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d set(Vec3d vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d set(Vec3i vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec4d set(Vec4f vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d set(Vec4d vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d set(Vec4i vector) {
        return this.set(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4d add(double xyzw) {
        this.x += xyzw;
        this.y += xyzw;
        this.z += xyzw;
        this.w += xyzw;
        return this;
    }

    public Vec4d add(float xyzw) {
        return this.add((double) xyzw);
    }

    public Vec4d add(int xyzw) {
        return this.add((double) xyzw);
    }

    public Vec4d add(double x, double y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vec4d add(float x, float y) {
        return this.add((double) x, y);
    }

    public Vec4d add(int x, int y) {
        return this.add((double) x, y);
    }

    public Vec4d add(double x, double y, double z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Vec4d add(float x, float y, float z) {
        return this.add((double) x, y, z);
    }

    public Vec4d add(int x, int y, int z) {
        return this.add((double) x, y, z);
    }

    public Vec4d add(double x, double y, double z, double w) {
        this.x += x;
        this.y += y;
        this.z += z;
        this.w += w;
        return this;
    }

    public Vec4d add(float x, float y, float z, float w) {
        return this.add((double) x, y, z, w);
    }

    public Vec4d add(int x, int y, int z, int w) {
        return this.add((double) x, y, z, w);
    }

    public Vec4d add(Vec2f vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4d add(Vec2d vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4d add(Vec2i vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec4d add(Vec3f vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4d add(Vec3d vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4d add(Vec3i vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec4d add(Vec4f vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d add(Vec4d vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d add(Vec4i vector) {
        return this.add(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4d sub(double xyzw) {
        this.x -= xyzw;
        this.y -= xyzw;
        this.z -= xyzw;
        this.w -= xyzw;
        return this;
    }

    public Vec4d sub(float xyzw) {
        return this.sub((double) xyzw);
    }

    public Vec4d sub(int xyzw) {
        return this.sub((double) xyzw);
    }

    public Vec4d sub(double x, double y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vec4d sub(float x, float y) {
        return this.sub((double) x, y);
    }

    public Vec4d sub(int x, int y) {
        return this.sub((double) x, y);
    }

    public Vec4d sub(double x, double y, double z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }

    public Vec4d sub(float x, float y, float z) {
        return this.sub((double) x, y, z);
    }

    public Vec4d sub(int x, int y, int z) {
        return this.sub((double) x, y, z);
    }

    public Vec4d sub(double x, double y, double z, double w) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        this.w -= w;
        return this;
    }

    public Vec4d sub(float x, float y, float z, float w) {
        return this.sub((double) x, y, z, w);
    }

    public Vec4d sub(int x, int y, int z, int w) {
        return this.sub((double) x, y, z, w);
    }

    public Vec4d sub(Vec2f vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4d sub(Vec2d vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4d sub(Vec2i vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec4d sub(Vec3f vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4d sub(Vec3d vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4d sub(Vec3i vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec4d sub(Vec4f vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d sub(Vec4d vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d sub(Vec4i vector) {
        return this.sub(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4d mul(double xyzw) {
        this.x *= xyzw;
        this.y *= xyzw;
        this.z *= xyzw;
        this.w *= xyzw;
        return this;
    }

    public Vec4d mul(float xyzw) {
        return this.mul((double) xyzw);
    }

    public Vec4d mul(int xyzw) {
        return this.mul((double) xyzw);
    }

    public Vec4d mul(double x, double y) {
        this.x *= x;
        this.y *= y;
        return this;
    }

    public Vec4d mul(float x, float y) {
        return this.mul((double) x, y);
    }

    public Vec4d mul(int x, int y) {
        return this.mul((double) x, y);
    }

    public Vec4d mul(double x, double y, double z) {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        return this;
    }

    public Vec4d mul(float x, float y, float z) {
        return this.mul((double) x, y, z);
    }

    public Vec4d mul(int x, int y, int z) {
        return this.mul((double) x, y, z);
    }

    public Vec4d mul(double x, double y, double z, double w) {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        this.w *= w;
        return this;
    }

    public Vec4d mul(float x, float y, float z, float w) {
        return this.mul((double) x, y, z, w);
    }

    public Vec4d mul(int x, int y, int z, int w) {
        return this.mul((double) x, y, z, w);
    }

    public Vec4d mul(Vec2f vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4d mul(Vec2d vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4d mul(Vec2i vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec4d mul(Vec3f vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4d mul(Vec3d vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4d mul(Vec3i vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec4d mul(Vec4f vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d mul(Vec4d vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d mul(Vec4i vector) {
        return this.mul(vector.x, vector.y, vector.z, vector.w);
    }


    public Vec4d div(double xyzw) {
        this.x /= xyzw;
        this.y /= xyzw;
        this.z /= xyzw;
        this.w /= xyzw;
        return this;
    }

    public Vec4d div(float xyzw) {
        return this.div((double) xyzw);
    }

    public Vec4d div(int xyzw) {
        return this.div((double) xyzw);
    }

    public Vec4d div(double x, double y) {
        this.x /= x;
        this.y /= y;
        return this;
    }

    public Vec4d div(float x, float y) {
        return this.div((double) x, y);
    }

    public Vec4d div(int x, int y) {
        return this.div((double) x, y);
    }

    public Vec4d div(double x, double y, double z) {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        return this;
    }

    public Vec4d div(float x, float y, float z) {
        return this.div((double) x, y, z);
    }

    public Vec4d div(int x, int y, int z) {
        return this.div((double) x, y, z);
    }

    public Vec4d div(double x, double y, double z, double w) {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        this.w /= w;
        return this;
    }

    public Vec4d div(float x, float y, float z, float w) {
        return this.div((double) x, y, z, w);
    }

    public Vec4d div(int x, int y, int z, int w) {
        return this.div((double) x, y, z, w);
    }

    public Vec4d div(Vec2f vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4d div(Vec2d vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4d div(Vec2i vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec4d div(Vec3f vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4d div(Vec3d vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4d div(Vec3i vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec4d div(Vec4f vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d div(Vec4d vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d div(Vec4i vector) {
        return this.div(vector.x, vector.y, vector.z, vector.w);
    }


    public static double dst2(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        final double dx = (x2 - x1);
        final double dy = (y2 - y1);
        final double dz = (z2 - z1);
        final double dw = (w2 - w1);
        return (dx * dx + dy * dy + dz * dz + dw * dw);
    }

    public static double dst2(double x1, double y1, double z1, double w1, float x2, float y2, float z2, float w2) {
        return dst2(x1, y1, z1, w1, (double) x2, y2, z2, w2);
    }

    public static double dst2(double x1, double y1, double z1, double w1, int x2, int y2, int z2, int w2) {
        return dst2(x1, y1, z1, w1, (double) x2, y2, z2, w2);
    }

    public static double dst2(double x, double y, double z, double w, Vec4f vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst2(double x, double y, double z, double w, Vec4d vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst2(double x, double y, double z, double w, Vec4i vector) {
        return dst2(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst2(Vec4d vector, float x, float y, float z, float w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst2(Vec4d vector, double x, double y, double z, double w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst2(Vec4d vector, int x, int y, int z, int w) {
        return dst2(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst2(Vec4d vector1, Vec4f vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double dst2(Vec4d vector1, Vec4d vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double dst2(Vec4d vector1, Vec4i vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public double dst2(float x, float y, float z, float w) {
        return dst2(this, x, y, z, w);
    }

    public double dst2(double x, double y, double z, double w) {
        return dst2(this, x, y, z, w);
    }

    public double dst2(int x, int y, int z, int w) {
        return dst2(this, x, y, z, w);
    }

    public double dst2(Vec4f vector) {
        return dst2(this, vector);
    }

    public double dst2(Vec4d vector) {
        return dst2(this, vector);
    }

    public double dst2(Vec4i vector) {
        return dst2(this, vector);
    }


    public static double dst(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return Math.sqrt(dst2(x1, y1, z1, w1, x2, y2, z2, w2));
    }

    public static double dst(double x1, double y1, double z1, double w1, float x2, float y2, float z2, float w2) {
        return dst(x1, y1, z1, w1, (double) x2, y2, z2, w2);
    }

    public static double dst(double x1, double y1, double z1, double w1, int x2, int y2, int z2, int w2) {
        return dst(x1, y1, z1, w1, (double) x2, y2, z2, w2);
    }

    public static double dst(double x, double y, double z, double w, Vec4f vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst(double x, double y, double z, double w, Vec4d vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst(double x, double y, double z, double w, Vec4i vector) {
        return dst(x, y, z, w, vector.x, vector.y, vector.z, vector.w);
    }

    public static double dst(Vec4d vector, float x, float y, float z, float w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst(Vec4d vector, double x, double y, double z, double w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst(Vec4d vector, int x, int y, int z, int w) {
        return dst(vector.x, vector.y, vector.z, vector.w, x, y, z, w);
    }

    public static double dst(Vec4d vector1, Vec4f vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double dst(Vec4d vector1, Vec4d vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double dst(Vec4d vector1, Vec4i vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public double dst(float x, float y, float z, float w) {
        return dst(this, x, y, z, w);
    }

    public double dst(double x, double y, double z, double w) {
        return dst(this, x, y, z, w);
    }

    public double dst(int x, int y, int z, int w) {
        return dst(this, x, y, z, w);
    }

    public double dst(Vec4f vector) {
        return dst(this, vector);
    }

    public double dst(Vec4d vector) {
        return dst(this, vector);
    }

    public double dst(Vec4i vector) {
        return dst(this, vector);
    }


    public static Vec4d shorter(Vec4d vector1, Vec4d vector2) {
        return (vector1.len2() < vector2.len2()) ? vector1 : vector2;
    }

    public static Vec4d longer(Vec4d vector1, Vec4d vector2) {
        return (vector1.len2() > vector2.len2()) ? vector1 : vector2;
    }

    public Vec4d setShorter(Vec4d vector1, Vec4d vector2) {
        return this.set(shorter(vector1, vector2));
    }

    public Vec4d setLonger(Vec4d vector1, Vec4d vector2) {
        return this.set(longer(vector1, vector2));
    }


    public double minComp() {
        return Math.min(x, Math.min(y, Math.min(z, w)));
    }

    public double maxComp() {
        return Math.max(x, Math.max(y, Math.max(z, w)));
    }


    public static Vec4d minComps(Vec4d dst, double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return dst.set(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2), Math.min(w1, w2));
    }

    public static Vec4d minComps(Vec4d dst, double x1, double y1, double z1, double w1, Vec4d vector2) {
        return minComps(dst, x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static Vec4d minComps(Vec4d dst, Vec4d vector1, double x2, double y2, double z2, double w2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static Vec4d minComps(Vec4d dst, Vec4d vector1, double xyzw2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, xyzw2, xyzw2, xyzw2, xyzw2);
    }

    public static Vec4d minComps(Vec4d dst, Vec4d vector1, Vec4d vector2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public Vec4d setMinComps(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return minComps(this, x1, y1, z1, w1, x2, y2, z2, w2);
    }

    public Vec4d setMinComps(double x1, double y1, double z1, double w1, Vec4d vector2) {
        return minComps(this, x1, y1, z1, w1, vector2);
    }

    public Vec4d setMinComps(Vec4d vector1, double x2, double y2, double z2, double w2) {
        return minComps(this, vector1, x2, y2, z2, w2);
    }

    public Vec4d setMinComps(Vec4d vector1, double xyzw2) {
        return minComps(this, vector1, xyzw2);
    }

    public Vec4d setMinComps(Vec4d vector1, Vec4d vector2) {
        return minComps(this, vector1, vector2);
    }

    public Vec4d setMinComps(double x2, double y2, double z2, double w2) {
        return this.setMinComps(this, x2, y2, z2, w2);
    }

    public Vec4d setMinComps(double xyzw2) {
        return this.setMinComps(this, xyzw2);
    }

    public Vec4d setMinComps(Vec4d vector2) {
        return this.setMinComps(this, vector2);
    }


    public static Vec4d maxComps(Vec4d dst, double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return dst.set(Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2), Math.max(w1, w2));
    }

    public static Vec4d maxComps(Vec4d dst, double x1, double y1, double z1, double w1, Vec4d vector2) {
        return maxComps(dst, x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static Vec4d maxComps(Vec4d dst, Vec4d vector1, double x2, double y2, double z2, double w2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static Vec4d maxComps(Vec4d dst, Vec4d vector1, double xyzw2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, xyzw2, xyzw2, xyzw2, xyzw2);
    }

    public static Vec4d maxComps(Vec4d dst, Vec4d vector1, Vec4d vector2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public Vec4d setMaxComps(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return maxComps(this, x1, y1, z1, w1, x2, y2, z2, w2);
    }

    public Vec4d setMaxComps(double x1, double y1, double z1, double w1, Vec4d vector2) {
        return maxComps(this, x1, y1, z1, w1, vector2);
    }

    public Vec4d setMaxComps(Vec4d vector1, double x2, double y2, double z2, double w2) {
        return maxComps(this, vector1, x2, y2, z2, w2);
    }

    public Vec4d setMaxComps(Vec4d vector1, double xyzw2) {
        return maxComps(this, vector1, xyzw2);
    }

    public Vec4d setMaxComps(Vec4d vector1, Vec4d vector2) {
        return maxComps(this, vector1, vector2);
    }

    public Vec4d setMaxComps(double x2, double y2, double z2, double w2) {
        return this.setMaxComps(this, x2, y2, z2, w2);
    }

    public Vec4d setMaxComps(double xyzw2) {
        return this.setMaxComps(this, xyzw2);
    }

    public Vec4d setMaxComps(Vec4d vector2) {
        return this.setMaxComps(this, vector2);
    }


    public boolean isShorter(double comparableX, double comparableY, double comparableZ, double comparableW) {
        return this.len2() < len2(comparableX, comparableY, comparableZ, comparableW);
    }

    public boolean isShorter(Vec4d comparable) {
        return this.isShorter(comparable.x, comparable.y, comparable.z, comparable.w);
    }

    public boolean isLonger(double comparableX, double comparableY, double comparableZ, double comparableW) {
        return this.len2() > len2(comparableX, comparableY, comparableZ, comparableW);
    }

    public boolean isLonger(Vec4d comparable) {
        return this.isLonger(comparable.x, comparable.y, comparable.z, comparable.w);
    }


    public boolean isZero() {
        return x == 0D && y == 0D && z == 0D && w == 0D;
    }

    public boolean isNotZero() {
        return x != 0D || y != 0D || z != 0D || w != 0D;
    }

    public Vec4d zero() {
        return this.set(0D);
    }

    public Vec4d zeroCompsThatLess(double x, double y, double z, double w) {
        if(Math.abs(this.x) < Math.abs(x))
            this.x = 0D;
        if(Math.abs(this.y) < Math.abs(y))
            this.y = 0D;
        if(Math.abs(this.z) < Math.abs(z))
            this.z = 0D;
        if(Math.abs(this.w) < Math.abs(w))
            this.w = 0D;
        return this;
    }

    public Vec4d zeroCompsThatLess(float x, float y, float z, float w) {
        return this.zeroCompsThatLess((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatLess(int x, int y, int z, int w) {
        return this.zeroCompsThatLess((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatLess(float xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatLess(double xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatLess(int xyzw) {
        return this.zeroCompsThatLess(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatLess(Vec4f vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatLess(Vec4d vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatLess(Vec4i vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatZero(double x, double y, double z, double w) {
        if(x == 0D)
            this.x = 0D;
        if(y == 0D)
            this.y = 0D;
        if(z == 0D)
            this.z = 0D;
        if(w == 0D)
            this.w = 0D;
        return this;
    }

    public Vec4d zeroCompsThatZero(float x, float y, float z, float w) {
        return this.zeroCompsThatZero((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatZero(int x, int y, int z, int w) {
        return this.zeroCompsThatZero((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatZero(float xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatZero(double xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatZero(int xyzw) {
        return this.zeroCompsThatZero(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatZero(Vec4f vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatZero(Vec4d vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatZero(Vec4i vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatBigger(double x, double y, double z, double w) {
        if(Math.abs(this.x) > Math.abs(x))
            this.x = 0D;
        if(Math.abs(this.y) > Math.abs(y))
            this.y = 0D;
        if(Math.abs(this.z) > Math.abs(z))
            this.z = 0D;
        if(Math.abs(this.w) > Math.abs(w))
            this.w = 0D;
        return this;
    }

    public Vec4d zeroCompsThatBigger(float x, float y, float z, float w) {
        return this.zeroCompsThatBigger((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatBigger(int x, int y, int z, int w) {
        return this.zeroCompsThatBigger((double) x, y, z, w);
    }

    public Vec4d zeroCompsThatBigger(float xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatBigger(double xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatBigger(int xyzw) {
        return this.zeroCompsThatBigger(xyzw, xyzw, xyzw, xyzw);
    }

    public Vec4d zeroCompsThatBigger(Vec4f vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatBigger(Vec4d vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }

    public Vec4d zeroCompsThatBigger(Vec4i vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z, vector.w);
    }


    public double hypervolume() {
        return x * y * z * w;
    }


    public static double len2(double x, double y, double z, double w) {
        return x * x + y * y + z * z + w * w;
    }

    public static double len2(Vec4d vector) {
        return len2(vector.x, vector.y, vector.z, vector.w);
    }

    public static double len(double x, double y, double z, double w) {
        return Math.sqrt(len2(x, y, z, w));
    }

    public static double len(Vec4d vector) {
        return Math.sqrt(len2(vector.x, vector.y, vector.z, vector.w));
    }

    public double len2() {
        return len2(this);
    }

    public double len() {
        return len(this);
    }


    public Vec4d nor() {
        double len = this.len2();
        if(len == 0D || len == 1D)
            return this;
        
        len = 1D / Math.sqrt(len);
        return this.mul(len);
    }


    public Vec4d abs() {
        if(x < 0D) x *= -1D;
        if(y < 0D) y *= -1D;
        if(z < 0D) z *= -1D;
        if(w < 0D) w *= -1D;
        return this;
    }


    public static Vec4d lerp(Vec4d dst, double startX, double startY, double startZ, double startW, double endX, double endY, double endZ, double endW, double t) {
        return dst.set(
            Maths.lerp(startX, endX, t),
            Maths.lerp(startY, endY, t),
            Maths.lerp(startZ, endZ, t),
            Maths.lerp(startW, endW, t)
        );
    }

    public static Vec4d lerp(Vec4d dst, Vec4d start, Vec4d end, double t) {
        return lerp(dst, start.x, start.y, start.z, start.w, end.x, end.y, end.z, end.w, t);
    }

    public Vec4d lerp(double startX, double startY, double startZ, double startW, double endX, double endY, double endZ, double endW, double t) {
        return lerp(this, startX, startY, startZ, startW, endX, endY, endZ, endW, t);
    }

    public Vec4d lerp(Vec4d start, Vec4d end, double t) {
        return lerp(this, start, end, t);
    }


    public static double dot(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return x1 * x2 + y1 * y2 + z1 * z2 + w1 * w2;
    }

    public static double dot(Vec4d vector1, double x2, double y2, double z2, double w2) {
        return dot(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static double dot(double x1, double y1, double z1, double w1, Vec4d vector2) {
        return dot(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double dot(Vec4d vector1, Vec4d vector2) {
        return dot(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public double dot(Vec4d vector) {
        return dot(this, vector);
    }

    public double dot(double x, double y, double z, double w) {
        return dot(this, x, y, z, w);
    }


    public Vec4d frac() {
        x = Maths.frac(x);
        y = Maths.frac(y);
        z = Maths.frac(z);
        w = Maths.frac(w);
        return this;
    }


    public Vec4i signum(Vec4i dst) {
        return dst.set(Math.signum(x), Math.signum(y), Math.signum(z), Math.signum(w));
    }


    public static double angleBetweenRad(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        final double lengthProduct = len(x1, y1, z1, w1) * len(x2, y2, z2, w2);
        if(lengthProduct == 0D)
            return 0D;
        final double cos = dot(x1, y1, z1, w1, x2, y2, z2, w2) / lengthProduct;
        return Math.acos(Maths.clamp(cos, -1D, 1D));
    }

    public static double angleBetweenRad(Vec4d vector1, double x2, double y2, double z2, double w2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static double angleBetweenRad(double x1, double y1, double z1, double w1, Vec4d vector2) {
        return angleBetweenRad(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double angleBetweenRad(Vec4d vector1, Vec4d vector2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public double angleBetweenRad(double x, double y, double z, double w) {
        return angleBetweenRad(this, x, y, z, w);
    }

    public double angleBetweenRad(Vec4d vector) {
        return angleBetweenRad(this, vector);
    }

    public static double angleBetween(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return angleBetweenRad(x1, y1, z1, w1, x2, y2, z2, w2) * Maths.TO_DEG;
    }

    public static double angleBetween(Vec4d vector1, double x2, double y2, double z2, double w2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, vector1.w, x2, y2, z2, w2);
    }

    public static double angleBetween(double x1, double y1, double z1, double w1, Vec4d vector2) {
        return angleBetween(x1, y1, z1, w1, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public static double angleBetween(Vec4d vector1, Vec4d vector2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, vector1.w, vector2.x, vector2.y, vector2.z, vector2.w);
    }

    public double angleBetween(double x, double y, double z, double w) {
        return angleBetween(this, x, y, z, w);
    }

    public double angleBetween(Vec4d vector) {
        return angleBetween(this, vector);
    }


    public int xFloor() {
        return Maths.floor(x);
    }

    public int xRound() {
        return Maths.round(x);
    }

    public int xCeil() {
        return Maths.ceil(x);
    }

    public int yFloor() {
        return Maths.floor(y);
    }

    public int yRound() {
        return Maths.round(y);
    }

    public int yCeil() {
        return Maths.ceil(y);
    }

    public int zFloor() {
        return Maths.floor(z);
    }

    public int zRound() {
        return Maths.round(z);
    }

    public int zCeil() {
        return Maths.ceil(z);
    }

    public int wFloor() {
        return Maths.floor(w);
    }

    public int wRound() {
        return Maths.round(w);
    }

    public int wCeil() {
        return Maths.ceil(w);
    }


    public Vec4d floor() {
        x = Maths.floor(x);
        y = Maths.floor(y);
        z = Maths.floor(z);
        w = Maths.floor(w);
        return this;
    }

    public Vec4d round() {
        x = Maths.round(x);
        y = Maths.round(y);
        z = Maths.round(z);
        w = Maths.round(w);
        return this;
    }

    public Vec4d ceil() {
        x = Maths.ceil(x);
        y = Maths.ceil(y);
        z = Maths.ceil(z);
        w = Maths.ceil(w);
        return this;
    }


    public Vec4f castFloat() {
        return new Vec4f(this);
    }

    public Vec4i castInt() {
        return new Vec4i(this);
    }


    public Vec4d clamp(double minX, double minY, double minZ, double minW, double maxX, double maxY, double maxZ, double maxW) {
        return this.set(
            Maths.clamp(x, minX, maxX),
            Maths.clamp(y, minY, maxY),
            Maths.clamp(z, minZ, maxZ),
            Maths.clamp(w, minW, maxW)
        );
    }

    public Vec4d clamp(double minX, double minY, double minZ, double minW, Vec4d max) {
        return this.clamp(minX, minY, minZ, minW, max.x, max.y, max.z, max.w);
    }

    public Vec4d clamp(double minXYZW, double maxXYZW) {
        return this.clamp(minXYZW, minXYZW, minXYZW, minXYZW, maxXYZW, maxXYZW, maxXYZW, maxXYZW);
    }

    public Vec4d clamp(double minXYZW, Vec4d max) {
        return this.clamp(minXYZW, minXYZW, minXYZW, minXYZW, max.x, max.y, max.z, max.w);
    }

    public Vec4d clamp(Vec4d min, double maxX, double maxY, double maxZ, double maxW) {
        return this.clamp(min.x, min.y, min.z, min.w, maxX, maxY, maxZ, maxW);
    }

    public Vec4d clamp(Vec4d min, double maxXYZW) {
        return this.clamp(min.x, min.y, min.z, min.w, maxXYZW, maxXYZW, maxXYZW, maxXYZW);
    }

    public Vec4d clamp(Vec4d min, Vec4d max) {
        return this.clamp(min.x, min.y, min.z, min.w, max.x, max.y, max.z, max.w);
    }


    public Vec4d clampLength(double max) {
        final double len = this.len();
        if(len <= max)
            return this;
        return this.nor().mul(max);
    }


    public Vec4d reduce(double reduceX, double reduceY, double reduceZ, double reduceW) {
        final double len = this.len();
        return this.nor().mul(len - reduceX, len - reduceY, len - reduceZ, len - reduceW);
    }


    public Vec4d copy() {
        return new Vec4d(this);
    }

    public static boolean equals(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return Double.compare(x1, x2) == 0 && Double.compare(y1, y2) == 0 && Double.compare(z1, z2) == 0 && Double.compare(w1, w2) == 0;
    }

    public static boolean notEquals(double x1, double y1, double z1, double w1, double x2, double y2, double z2, double w2) {
        return Double.compare(x1, x2) != 0 || Double.compare(y1, y2) != 0 || Double.compare(z1, z2) != 0 || Double.compare(w1, w2) != 0;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || getClass() != object.getClass())
            return false;
        
        final Vec4d vec = (Vec4d) object;
        return Vec4d.equals(x, y, z, w, vec.x, vec.y, vec.z, vec.w);
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