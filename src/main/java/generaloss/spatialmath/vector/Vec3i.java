package generaloss.spatialmath.vector;

import generaloss.spatialmath.Maths;
import generaloss.spatialmath.Mathc;
import generaloss.spatialmath.matrix.Matrix3f;
import generaloss.spatialmath.matrix.Matrix4f;
import generaloss.spatialmath.matrix.*;
import java.util.Objects;

public class Vec3i {

    public int x;
    public int y;
    public int z;

    public Vec3i() { }

    public Vec3i(float xyz) {
        this.set(xyz);
    }

    public Vec3i(double xyz) {
        this.set(xyz);
    }

    public Vec3i(int xyz) {
        this.set(xyz);
    }

    public Vec3i(float x, float y) {
        this.set(x, y);
    }

    public Vec3i(double x, double y) {
        this.set(x, y);
    }

    public Vec3i(int x, int y) {
        this.set(x, y);
    }

    public Vec3i(float x, float y, float z) {
        this.set(x, y, z);
    }

    public Vec3i(double x, double y, double z) {
        this.set(x, y, z);
    }

    public Vec3i(int x, int y, int z) {
        this.set(x, y, z);
    }

    public Vec3i(Vec2f vector) {
        this.set(vector.x, vector.y);
    }

    public Vec3i(Vec2d vector) {
        this.set(vector.x, vector.y);
    }

    public Vec3i(Vec2i vector) {
        this.set(vector.x, vector.y);
    }

    public Vec3i(Vec3f vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec3i(Vec3d vector) {
        this.set(vector.x, vector.y, vector.z);
    }

    public Vec3i(Vec3i vector) {
        this.set(vector.x, vector.y, vector.z);
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


    public Vec3i set(int xyz) {
        this.x = xyz;
        this.y = xyz;
        this.z = xyz;
        return this;
    }

    public Vec3i set(float xyz) {
        return this.set((int) xyz);
    }

    public Vec3i set(double xyz) {
        return this.set((int) xyz);
    }

    public Vec3i set(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vec3i set(float x, float y) {
        return this.set((int) x, (int) y);
    }

    public Vec3i set(double x, double y) {
        return this.set((int) x, (int) y);
    }

    public Vec3i set(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec3i set(float x, float y, float z) {
        return this.set((int) x, (int) y, (int) z);
    }

    public Vec3i set(double x, double y, double z) {
        return this.set((int) x, (int) y, (int) z);
    }

    public Vec3i set(Vec2f vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec3i set(Vec2d vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec3i set(Vec2i vector) {
        return this.set(vector.x, vector.y);
    }

    public Vec3i set(Vec3f vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec3i set(Vec3d vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec3i set(Vec3i vector) {
        return this.set(vector.x, vector.y, vector.z);
    }

    public Vec3i setXY(int x, int y) {
        this.x = x;
        this.y = y;
        return this;
    }

    public Vec3i setXY(float x, float y) {
        return setXY((int) x, (int) y);
    }

    public Vec3i setXY(double x, double y) {
        return setXY((int) x, (int) y);
    }

    public Vec3i setXZ(int x, int z) {
        this.x = x;
        this.z = z;
        return this;
    }

    public Vec3i setXZ(float x, float z) {
        return setXZ((int) x, (int) z);
    }

    public Vec3i setXZ(double x, double z) {
        return setXZ((int) x, (int) z);
    }

    public Vec3i setYZ(int y, int z) {
        this.y = y;
        this.z = z;
        return this;
    }

    public Vec3i setYZ(float y, float z) {
        return setYZ((int) y, (int) z);
    }

    public Vec3i setYZ(double y, double z) {
        return setYZ((int) y, (int) z);
    }

    public Vec3i setXY(Vec2f vector) {
        return setXY(vector.x, vector.y);
    }

    public Vec3i setXY(Vec2d vector) {
        return setXY(vector.x, vector.y);
    }

    public Vec3i setXY(Vec2i vector) {
        return setXY(vector.x, vector.y);
    }

    public Vec3i setXZ(Vec2f vector) {
        return setXZ(vector.x, vector.y);
    }

    public Vec3i setXZ(Vec2d vector) {
        return setXZ(vector.x, vector.y);
    }

    public Vec3i setXZ(Vec2i vector) {
        return setXZ(vector.x, vector.y);
    }

    public Vec3i setYZ(Vec2f vector) {
        return setYZ(vector.x, vector.y);
    }

    public Vec3i setYZ(Vec2d vector) {
        return setYZ(vector.x, vector.y);
    }

    public Vec3i setYZ(Vec2i vector) {
        return setYZ(vector.x, vector.y);
    }


    public Vec3i add(int xyz) {
        this.x += xyz;
        this.y += xyz;
        this.z += xyz;
        return this;
    }

    public Vec3i add(float xyz) {
        return this.add((int) xyz);
    }

    public Vec3i add(double xyz) {
        return this.add((int) xyz);
    }

    public Vec3i add(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vec3i add(float x, float y) {
        return this.add((int) x, (int) y);
    }

    public Vec3i add(double x, double y) {
        return this.add((int) x, (int) y);
    }

    public Vec3i add(int x, int y, int z) {
        this.x += x;
        this.y += y;
        this.z += z;
        return this;
    }

    public Vec3i add(float x, float y, float z) {
        return this.add((int) x, (int) y, (int) z);
    }

    public Vec3i add(double x, double y, double z) {
        return this.add((int) x, (int) y, (int) z);
    }

    public Vec3i add(Vec2f vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec3i add(Vec2d vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec3i add(Vec2i vector) {
        return this.add(vector.x, vector.y);
    }

    public Vec3i add(Vec3f vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec3i add(Vec3d vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec3i add(Vec3i vector) {
        return this.add(vector.x, vector.y, vector.z);
    }

    public Vec3i addXY(int x, int y) {
        this.x += x;
        this.y += y;
        return this;
    }

    public Vec3i addXY(float x, float y) {
        return addXY((int) x, (int) y);
    }

    public Vec3i addXY(double x, double y) {
        return addXY((int) x, (int) y);
    }

    public Vec3i addXZ(int x, int z) {
        this.x += x;
        this.z += z;
        return this;
    }

    public Vec3i addXZ(float x, float z) {
        return addXZ((int) x, (int) z);
    }

    public Vec3i addXZ(double x, double z) {
        return addXZ((int) x, (int) z);
    }

    public Vec3i addYZ(int y, int z) {
        this.y += y;
        this.z += z;
        return this;
    }

    public Vec3i addYZ(float y, float z) {
        return addYZ((int) y, (int) z);
    }

    public Vec3i addYZ(double y, double z) {
        return addYZ((int) y, (int) z);
    }

    public Vec3i addXY(Vec2f vector) {
        return addXY(vector.x, vector.y);
    }

    public Vec3i addXY(Vec2d vector) {
        return addXY(vector.x, vector.y);
    }

    public Vec3i addXY(Vec2i vector) {
        return addXY(vector.x, vector.y);
    }

    public Vec3i addXZ(Vec2f vector) {
        return addXZ(vector.x, vector.y);
    }

    public Vec3i addXZ(Vec2d vector) {
        return addXZ(vector.x, vector.y);
    }

    public Vec3i addXZ(Vec2i vector) {
        return addXZ(vector.x, vector.y);
    }

    public Vec3i addYZ(Vec2f vector) {
        return addYZ(vector.x, vector.y);
    }

    public Vec3i addYZ(Vec2d vector) {
        return addYZ(vector.x, vector.y);
    }

    public Vec3i addYZ(Vec2i vector) {
        return addYZ(vector.x, vector.y);
    }


    public Vec3i sub(int xyz) {
        this.x -= xyz;
        this.y -= xyz;
        this.z -= xyz;
        return this;
    }

    public Vec3i sub(float xyz) {
        return this.sub((int) xyz);
    }

    public Vec3i sub(double xyz) {
        return this.sub((int) xyz);
    }

    public Vec3i sub(int x, int y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vec3i sub(float x, float y) {
        return this.sub((int) x, (int) y);
    }

    public Vec3i sub(double x, double y) {
        return this.sub((int) x, (int) y);
    }

    public Vec3i sub(int x, int y, int z) {
        this.x -= x;
        this.y -= y;
        this.z -= z;
        return this;
    }

    public Vec3i sub(float x, float y, float z) {
        return this.sub((int) x, (int) y, (int) z);
    }

    public Vec3i sub(double x, double y, double z) {
        return this.sub((int) x, (int) y, (int) z);
    }

    public Vec3i sub(Vec2f vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec3i sub(Vec2d vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec3i sub(Vec2i vector) {
        return this.sub(vector.x, vector.y);
    }

    public Vec3i sub(Vec3f vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec3i sub(Vec3d vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec3i sub(Vec3i vector) {
        return this.sub(vector.x, vector.y, vector.z);
    }

    public Vec3i subXY(int x, int y) {
        this.x -= x;
        this.y -= y;
        return this;
    }

    public Vec3i subXY(float x, float y) {
        return subXY((int) x, (int) y);
    }

    public Vec3i subXY(double x, double y) {
        return subXY((int) x, (int) y);
    }

    public Vec3i subXZ(int x, int z) {
        this.x -= x;
        this.z -= z;
        return this;
    }

    public Vec3i subXZ(float x, float z) {
        return subXZ((int) x, (int) z);
    }

    public Vec3i subXZ(double x, double z) {
        return subXZ((int) x, (int) z);
    }

    public Vec3i subYZ(int y, int z) {
        this.y -= y;
        this.z -= z;
        return this;
    }

    public Vec3i subYZ(float y, float z) {
        return subYZ((int) y, (int) z);
    }

    public Vec3i subYZ(double y, double z) {
        return subYZ((int) y, (int) z);
    }

    public Vec3i subXY(Vec2f vector) {
        return subXY(vector.x, vector.y);
    }

    public Vec3i subXY(Vec2d vector) {
        return subXY(vector.x, vector.y);
    }

    public Vec3i subXY(Vec2i vector) {
        return subXY(vector.x, vector.y);
    }

    public Vec3i subXZ(Vec2f vector) {
        return subXZ(vector.x, vector.y);
    }

    public Vec3i subXZ(Vec2d vector) {
        return subXZ(vector.x, vector.y);
    }

    public Vec3i subXZ(Vec2i vector) {
        return subXZ(vector.x, vector.y);
    }

    public Vec3i subYZ(Vec2f vector) {
        return subYZ(vector.x, vector.y);
    }

    public Vec3i subYZ(Vec2d vector) {
        return subYZ(vector.x, vector.y);
    }

    public Vec3i subYZ(Vec2i vector) {
        return subYZ(vector.x, vector.y);
    }


    public Vec3i mul(int xyz) {
        this.x *= xyz;
        this.y *= xyz;
        this.z *= xyz;
        return this;
    }

    public Vec3i mul(float xyz) {
        return this.mul((int) xyz);
    }

    public Vec3i mul(double xyz) {
        return this.mul((int) xyz);
    }

    public Vec3i mul(int x, int y) {
        this.x *= x;
        this.y *= y;
        return this;
    }

    public Vec3i mul(float x, float y) {
        return this.mul((int) x, (int) y);
    }

    public Vec3i mul(double x, double y) {
        return this.mul((int) x, (int) y);
    }

    public Vec3i mul(int x, int y, int z) {
        this.x *= x;
        this.y *= y;
        this.z *= z;
        return this;
    }

    public Vec3i mul(float x, float y, float z) {
        return this.mul((int) x, (int) y, (int) z);
    }

    public Vec3i mul(double x, double y, double z) {
        return this.mul((int) x, (int) y, (int) z);
    }

    public Vec3i mul(Vec2f vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec3i mul(Vec2d vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec3i mul(Vec2i vector) {
        return this.mul(vector.x, vector.y);
    }

    public Vec3i mul(Vec3f vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec3i mul(Vec3d vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec3i mul(Vec3i vector) {
        return this.mul(vector.x, vector.y, vector.z);
    }

    public Vec3i mulXY(int x, int y) {
        this.x *= x;
        this.y *= y;
        return this;
    }

    public Vec3i mulXY(float x, float y) {
        return mulXY((int) x, (int) y);
    }

    public Vec3i mulXY(double x, double y) {
        return mulXY((int) x, (int) y);
    }

    public Vec3i mulXZ(int x, int z) {
        this.x *= x;
        this.z *= z;
        return this;
    }

    public Vec3i mulXZ(float x, float z) {
        return mulXZ((int) x, (int) z);
    }

    public Vec3i mulXZ(double x, double z) {
        return mulXZ((int) x, (int) z);
    }

    public Vec3i mulYZ(int y, int z) {
        this.y *= y;
        this.z *= z;
        return this;
    }

    public Vec3i mulYZ(float y, float z) {
        return mulYZ((int) y, (int) z);
    }

    public Vec3i mulYZ(double y, double z) {
        return mulYZ((int) y, (int) z);
    }

    public Vec3i mulXY(Vec2f vector) {
        return mulXY(vector.x, vector.y);
    }

    public Vec3i mulXY(Vec2d vector) {
        return mulXY(vector.x, vector.y);
    }

    public Vec3i mulXY(Vec2i vector) {
        return mulXY(vector.x, vector.y);
    }

    public Vec3i mulXZ(Vec2f vector) {
        return mulXZ(vector.x, vector.y);
    }

    public Vec3i mulXZ(Vec2d vector) {
        return mulXZ(vector.x, vector.y);
    }

    public Vec3i mulXZ(Vec2i vector) {
        return mulXZ(vector.x, vector.y);
    }

    public Vec3i mulYZ(Vec2f vector) {
        return mulYZ(vector.x, vector.y);
    }

    public Vec3i mulYZ(Vec2d vector) {
        return mulYZ(vector.x, vector.y);
    }

    public Vec3i mulYZ(Vec2i vector) {
        return mulYZ(vector.x, vector.y);
    }


    public Vec3i div(int xyz) {
        this.x /= xyz;
        this.y /= xyz;
        this.z /= xyz;
        return this;
    }

    public Vec3i div(float xyz) {
        return this.div((int) xyz);
    }

    public Vec3i div(double xyz) {
        return this.div((int) xyz);
    }

    public Vec3i div(int x, int y) {
        this.x /= x;
        this.y /= y;
        return this;
    }

    public Vec3i div(float x, float y) {
        return this.div((int) x, (int) y);
    }

    public Vec3i div(double x, double y) {
        return this.div((int) x, (int) y);
    }

    public Vec3i div(int x, int y, int z) {
        this.x /= x;
        this.y /= y;
        this.z /= z;
        return this;
    }

    public Vec3i div(float x, float y, float z) {
        return this.div((int) x, (int) y, (int) z);
    }

    public Vec3i div(double x, double y, double z) {
        return this.div((int) x, (int) y, (int) z);
    }

    public Vec3i div(Vec2f vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec3i div(Vec2d vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec3i div(Vec2i vector) {
        return this.div(vector.x, vector.y);
    }

    public Vec3i div(Vec3f vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec3i div(Vec3d vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec3i div(Vec3i vector) {
        return this.div(vector.x, vector.y, vector.z);
    }

    public Vec3i divXY(int x, int y) {
        this.x /= x;
        this.y /= y;
        return this;
    }

    public Vec3i divXY(float x, float y) {
        return divXY((int) x, (int) y);
    }

    public Vec3i divXY(double x, double y) {
        return divXY((int) x, (int) y);
    }

    public Vec3i divXZ(int x, int z) {
        this.x /= x;
        this.z /= z;
        return this;
    }

    public Vec3i divXZ(float x, float z) {
        return divXZ((int) x, (int) z);
    }

    public Vec3i divXZ(double x, double z) {
        return divXZ((int) x, (int) z);
    }

    public Vec3i divYZ(int y, int z) {
        this.y /= y;
        this.z /= z;
        return this;
    }

    public Vec3i divYZ(float y, float z) {
        return divYZ((int) y, (int) z);
    }

    public Vec3i divYZ(double y, double z) {
        return divYZ((int) y, (int) z);
    }

    public Vec3i divXY(Vec2f vector) {
        return divXY(vector.x, vector.y);
    }

    public Vec3i divXY(Vec2d vector) {
        return divXY(vector.x, vector.y);
    }

    public Vec3i divXY(Vec2i vector) {
        return divXY(vector.x, vector.y);
    }

    public Vec3i divXZ(Vec2f vector) {
        return divXZ(vector.x, vector.y);
    }

    public Vec3i divXZ(Vec2d vector) {
        return divXZ(vector.x, vector.y);
    }

    public Vec3i divXZ(Vec2i vector) {
        return divXZ(vector.x, vector.y);
    }

    public Vec3i divYZ(Vec2f vector) {
        return divYZ(vector.x, vector.y);
    }

    public Vec3i divYZ(Vec2d vector) {
        return divYZ(vector.x, vector.y);
    }

    public Vec3i divYZ(Vec2i vector) {
        return divYZ(vector.x, vector.y);
    }


    public static int dst2(int x1, int y1, int z1, int x2, int y2, int z2) {
        final int dx = (x2 - x1);
        final int dy = (y2 - y1);
        final int dz = (z2 - z1);
        return (dx * dx + dy * dy + dz * dz);
    }

    public static int dst2(int x1, int y1, int z1, float x2, float y2, float z2) {
        return dst2(x1, y1, z1, (int) x2, (int) y2, (int) z2);
    }

    public static int dst2(int x1, int y1, int z1, double x2, double y2, double z2) {
        return dst2(x1, y1, z1, (int) x2, (int) y2, (int) z2);
    }

    public static int dst2(int x, int y, int z, Vec3f vector) {
        return dst2(x, y, z, vector.x, vector.y, vector.z);
    }

    public static int dst2(int x, int y, int z, Vec3d vector) {
        return dst2(x, y, z, vector.x, vector.y, vector.z);
    }

    public static int dst2(int x, int y, int z, Vec3i vector) {
        return dst2(x, y, z, vector.x, vector.y, vector.z);
    }

    public static int dst2(Vec3i vector, float x, float y, float z) {
        return dst2(vector.x, vector.y, vector.z, x, y, z);
    }

    public static int dst2(Vec3i vector, double x, double y, double z) {
        return dst2(vector.x, vector.y, vector.z, x, y, z);
    }

    public static int dst2(Vec3i vector, int x, int y, int z) {
        return dst2(vector.x, vector.y, vector.z, x, y, z);
    }

    public static int dst2(Vec3i vector1, Vec3f vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public static int dst2(Vec3i vector1, Vec3d vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public static int dst2(Vec3i vector1, Vec3i vector2) {
        return dst2(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public int dst2(float x, float y, float z) {
        return dst2(this, x, y, z);
    }

    public int dst2(double x, double y, double z) {
        return dst2(this, x, y, z);
    }

    public int dst2(int x, int y, int z) {
        return dst2(this, x, y, z);
    }

    public int dst2(Vec3f vector) {
        return dst2(this, vector);
    }

    public int dst2(Vec3d vector) {
        return dst2(this, vector);
    }

    public int dst2(Vec3i vector) {
        return dst2(this, vector);
    }


    public static float dst(int x1, int y1, int z1, int x2, int y2, int z2) {
        return Mathc.sqrt(dst2(x1, y1, z1, x2, y2, z2));
    }

    public static float dst(int x1, int y1, int z1, float x2, float y2, float z2) {
        return dst(x1, y1, z1, (int) x2, (int) y2, (int) z2);
    }

    public static float dst(int x1, int y1, int z1, double x2, double y2, double z2) {
        return dst(x1, y1, z1, (int) x2, (int) y2, (int) z2);
    }

    public static float dst(int x, int y, int z, Vec3f vector) {
        return dst(x, y, z, vector.x, vector.y, vector.z);
    }

    public static float dst(int x, int y, int z, Vec3d vector) {
        return dst(x, y, z, vector.x, vector.y, vector.z);
    }

    public static float dst(int x, int y, int z, Vec3i vector) {
        return dst(x, y, z, vector.x, vector.y, vector.z);
    }

    public static float dst(Vec3i vector, float x, float y, float z) {
        return dst(vector.x, vector.y, vector.z, x, y, z);
    }

    public static float dst(Vec3i vector, double x, double y, double z) {
        return dst(vector.x, vector.y, vector.z, x, y, z);
    }

    public static float dst(Vec3i vector, int x, int y, int z) {
        return dst(vector.x, vector.y, vector.z, x, y, z);
    }

    public static float dst(Vec3i vector1, Vec3f vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public static float dst(Vec3i vector1, Vec3d vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public static float dst(Vec3i vector1, Vec3i vector2) {
        return dst(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public float dst(float x, float y, float z) {
        return dst(this, x, y, z);
    }

    public float dst(double x, double y, double z) {
        return dst(this, x, y, z);
    }

    public float dst(int x, int y, int z) {
        return dst(this, x, y, z);
    }

    public float dst(Vec3f vector) {
        return dst(this, vector);
    }

    public float dst(Vec3d vector) {
        return dst(this, vector);
    }

    public float dst(Vec3i vector) {
        return dst(this, vector);
    }


    public static Vec3i shorter(Vec3i vector1, Vec3i vector2) {
        return (vector1.len2() < vector2.len2()) ? vector1 : vector2;
    }

    public static Vec3i longer(Vec3i vector1, Vec3i vector2) {
        return (vector1.len2() > vector2.len2()) ? vector1 : vector2;
    }

    public Vec3i setShorter(Vec3i vector1, Vec3i vector2) {
        return this.set(shorter(vector1, vector2));
    }

    public Vec3i setLonger(Vec3i vector1, Vec3i vector2) {
        return this.set(longer(vector1, vector2));
    }


    public int minComp() {
        return Math.min(x, Math.min(y, z));
    }

    public int maxComp() {
        return Math.max(x, Math.max(y, z));
    }


    public static Vec3i minComps(Vec3i dst, int x1, int y1, int z1, int x2, int y2, int z2) {
        return dst.set(Math.min(x1, x2), Math.min(y1, y2), Math.min(z1, z2));
    }

    public static Vec3i minComps(Vec3i dst, int x1, int y1, int z1, Vec3i vector2) {
        return minComps(dst, x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static Vec3i minComps(Vec3i dst, Vec3i vector1, int x2, int y2, int z2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static Vec3i minComps(Vec3i dst, Vec3i vector1, int xyz2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, xyz2, xyz2, xyz2);
    }

    public static Vec3i minComps(Vec3i dst, Vec3i vector1, Vec3i vector2) {
        return minComps(dst, vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public Vec3i setMinComps(int x1, int y1, int z1, int x2, int y2, int z2) {
        return minComps(this, x1, y1, z1, x2, y2, z2);
    }

    public Vec3i setMinComps(int x1, int y1, int z1, Vec3i vector2) {
        return minComps(this, x1, y1, z1, vector2);
    }

    public Vec3i setMinComps(Vec3i vector1, int x2, int y2, int z2) {
        return minComps(this, vector1, x2, y2, z2);
    }

    public Vec3i setMinComps(Vec3i vector1, int xyz2) {
        return minComps(this, vector1, xyz2);
    }

    public Vec3i setMinComps(Vec3i vector1, Vec3i vector2) {
        return minComps(this, vector1, vector2);
    }

    public Vec3i setMinComps(int x2, int y2, int z2) {
        return this.setMinComps(this, x2, y2, z2);
    }

    public Vec3i setMinComps(int xyz2) {
        return this.setMinComps(this, xyz2);
    }

    public Vec3i setMinComps(Vec3i vector2) {
        return this.setMinComps(this, vector2);
    }


    public static Vec3i maxComps(Vec3i dst, int x1, int y1, int z1, int x2, int y2, int z2) {
        return dst.set(Math.max(x1, x2), Math.max(y1, y2), Math.max(z1, z2));
    }

    public static Vec3i maxComps(Vec3i dst, int x1, int y1, int z1, Vec3i vector2) {
        return maxComps(dst, x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static Vec3i maxComps(Vec3i dst, Vec3i vector1, int x2, int y2, int z2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static Vec3i maxComps(Vec3i dst, Vec3i vector1, int xyz2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, xyz2, xyz2, xyz2);
    }

    public static Vec3i maxComps(Vec3i dst, Vec3i vector1, Vec3i vector2) {
        return maxComps(dst, vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public Vec3i setMaxComps(int x1, int y1, int z1, int x2, int y2, int z2) {
        return maxComps(this, x1, y1, z1, x2, y2, z2);
    }

    public Vec3i setMaxComps(int x1, int y1, int z1, Vec3i vector2) {
        return maxComps(this, x1, y1, z1, vector2);
    }

    public Vec3i setMaxComps(Vec3i vector1, int x2, int y2, int z2) {
        return maxComps(this, vector1, x2, y2, z2);
    }

    public Vec3i setMaxComps(Vec3i vector1, int xyz2) {
        return maxComps(this, vector1, xyz2);
    }

    public Vec3i setMaxComps(Vec3i vector1, Vec3i vector2) {
        return maxComps(this, vector1, vector2);
    }

    public Vec3i setMaxComps(int x2, int y2, int z2) {
        return this.setMaxComps(this, x2, y2, z2);
    }

    public Vec3i setMaxComps(int xyz2) {
        return this.setMaxComps(this, xyz2);
    }

    public Vec3i setMaxComps(Vec3i vector2) {
        return this.setMaxComps(this, vector2);
    }


    public boolean isShorter(int comparableX, int comparableY, int comparableZ) {
        return this.len2() < len2(comparableX, comparableY, comparableZ);
    }

    public boolean isShorter(Vec3i comparable) {
        return this.isShorter(comparable.x, comparable.y, comparable.z);
    }

    public boolean isLonger(int comparableX, int comparableY, int comparableZ) {
        return this.len2() > len2(comparableX, comparableY, comparableZ);
    }

    public boolean isLonger(Vec3i comparable) {
        return this.isLonger(comparable.x, comparable.y, comparable.z);
    }


    public boolean isZero() {
        return x == 0 && y == 0 && z == 0;
    }

    public boolean isNotZero() {
        return x != 0 || y != 0 || z != 0;
    }

    public Vec3i zero() {
        return this.set(0);
    }

    public Vec3i zeroCompsThatLess(int x, int y, int z) {
        if(Math.abs(this.x) < Math.abs(x))
            this.x = 0;
        if(Math.abs(this.y) < Math.abs(y))
            this.y = 0;
        if(Math.abs(this.z) < Math.abs(z))
            this.z = 0;
        return this;
    }

    public Vec3i zeroCompsThatLess(float x, float y, float z) {
        return this.zeroCompsThatLess((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatLess(double x, double y, double z) {
        return this.zeroCompsThatLess((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatLess(float xyz) {
        return this.zeroCompsThatLess(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatLess(double xyz) {
        return this.zeroCompsThatLess(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatLess(int xyz) {
        return this.zeroCompsThatLess(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatLess(Vec3f vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatLess(Vec3d vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatLess(Vec3i vector) {
        return this.zeroCompsThatLess(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatZero(int x, int y, int z) {
        if(x == 0)
            this.x = 0;
        if(y == 0)
            this.y = 0;
        if(z == 0)
            this.z = 0;
        return this;
    }

    public Vec3i zeroCompsThatZero(float x, float y, float z) {
        return this.zeroCompsThatZero((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatZero(double x, double y, double z) {
        return this.zeroCompsThatZero((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatZero(float xyz) {
        return this.zeroCompsThatZero(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatZero(double xyz) {
        return this.zeroCompsThatZero(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatZero(int xyz) {
        return this.zeroCompsThatZero(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatZero(Vec3f vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatZero(Vec3d vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatZero(Vec3i vector) {
        return this.zeroCompsThatZero(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatBigger(int x, int y, int z) {
        if(Math.abs(this.x) > Math.abs(x))
            this.x = 0;
        if(Math.abs(this.y) > Math.abs(y))
            this.y = 0;
        if(Math.abs(this.z) > Math.abs(z))
            this.z = 0;
        return this;
    }

    public Vec3i zeroCompsThatBigger(float x, float y, float z) {
        return this.zeroCompsThatBigger((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatBigger(double x, double y, double z) {
        return this.zeroCompsThatBigger((int) x, (int) y, (int) z);
    }

    public Vec3i zeroCompsThatBigger(float xyz) {
        return this.zeroCompsThatBigger(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatBigger(double xyz) {
        return this.zeroCompsThatBigger(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatBigger(int xyz) {
        return this.zeroCompsThatBigger(xyz, xyz, xyz);
    }

    public Vec3i zeroCompsThatBigger(Vec3f vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatBigger(Vec3d vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z);
    }

    public Vec3i zeroCompsThatBigger(Vec3i vector) {
        return this.zeroCompsThatBigger(vector.x, vector.y, vector.z);
    }


    public int volume() {
        return x * y * z;
    }


    public static int len2(int x, int y, int z) {
        return x * x + y * y + z * z;
    }

    public static int len2(Vec3i vector) {
        return len2(vector.x, vector.y, vector.z);
    }

    public static float len(int x, int y, int z) {
        return Mathc.sqrt(len2(x, y, z));
    }

    public static float len(Vec3i vector) {
        return Mathc.sqrt(len2(vector.x, vector.y, vector.z));
    }

    public int len2() {
        return len2(this);
    }

    public float len() {
        return len(this);
    }

    public static int lenh2(Vec3i vector) {
        return vector.x * vector.x + vector.z * vector.z;
    }

    public static float lenh(Vec3i vector) {
        return Mathc.sqrt(lenh2(vector));
    }

    public int lenh2() {
        return lenh2(this);
    }

    public float lenh() {
        return lenh(this);
    }


    public Vec3i abs() {
        if(x < 0) x *= -1;
        if(y < 0) y *= -1;
        if(z < 0) z *= -1;
        return this;
    }


    public static Vec3i lerp(Vec3i dst, int startX, int startY, int startZ, int endX, int endY, int endZ, float t) {
        return dst.set(
            Maths.lerp(startX, endX, t),
            Maths.lerp(startY, endY, t),
            Maths.lerp(startZ, endZ, t)
        );
    }

    public static Vec3i lerp(Vec3i dst, Vec3i start, Vec3i end, float t) {
        return lerp(dst, start.x, start.y, start.z, end.x, end.y, end.z, t);
    }

    public Vec3i lerp(int startX, int startY, int startZ, int endX, int endY, int endZ, float t) {
        return lerp(this, startX, startY, startZ, endX, endY, endZ, t);
    }

    public Vec3i lerp(Vec3i start, Vec3i end, float t) {
        return lerp(this, start, end, t);
    }


    public static int dot(int x1, int y1, int z1, int x2, int y2, int z2) {
        return x1 * x2 + y1 * y2 + z1 * z2;
    }

    public static int dot(Vec3i vector1, int x2, int y2, int z2) {
        return dot(vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static int dot(int x1, int y1, int z1, Vec3i vector2) {
        return dot(x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static int dot(Vec3i vector1, Vec3i vector2) {
        return dot(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public int dot(Vec3i vector) {
        return dot(this, vector);
    }

    public int dot(int x, int y, int z) {
        return dot(this, x, y, z);
    }


    public static Vec3i crs(Vec3i dst, int x1, int y1, int z1, int x2, int y2, int z2) {
        return dst.set((y1 * z2 - z1 * y2), (z1 * x2 - x1 * z2), (x1 * y2 - y1 * x2));
    }

    public static Vec3i crs(Vec3i dst, Vec3i vector1, int x2, int y2, int z2) {
        return crs(dst, vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static Vec3i crs(Vec3i dst, int x1, int y1, int z1, Vec3i vector2) {
        return crs(dst, x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static Vec3i crs(Vec3i dst, Vec3i vector1, Vec3i vector2) {
        return crs(dst, vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public Vec3i crs(Vec3i dst, Vec3i vector) {
        return crs(dst, this, vector);
    }

    public Vec3i crs(Vec3i dst, int x, int y, int z) {
        return crs(dst, this, x, y, z);
    }

    public Vec3i setCrs(int x1, int y1, int z1, int x2, int y2, int z2) {
        return crs(this, x1, y1, z1, x2, y2, z2);
    }

    public Vec3i setCrs(Vec3i vector1, int x2, int y2, int z2) {
        return this.setCrs(vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public Vec3i setCrs(int x1, int y1, int z1, Vec3i vector2) {
        return this.setCrs(x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public Vec3i setCrs(Vec3i vector1, Vec3i vector2) {
        return this.setCrs(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }


    public Vec3i signum(Vec3i dst) {
        return dst.set(Math.signum(x), Math.signum(y), Math.signum(z));
    }


    public static float angleBetweenRad(int x1, int y1, int z1, int x2, int y2, int z2) {
        final float lengthProduct = len(x1, y1, z1) * len(x2, y2, z2);
        if(lengthProduct == 0)
            return 0;
        final float cos = dot(x1, y1, z1, x2, y2, z2) / lengthProduct;
        return Mathc.acos(Maths.clamp(cos, -1, 1));
    }

    public static float angleBetweenRad(Vec3i vector1, int x2, int y2, int z2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static float angleBetweenRad(int x1, int y1, int z1, Vec3i vector2) {
        return angleBetweenRad(x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static float angleBetweenRad(Vec3i vector1, Vec3i vector2) {
        return angleBetweenRad(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public float angleBetweenRad(int x, int y, int z) {
        return angleBetweenRad(this, x, y, z);
    }

    public float angleBetweenRad(Vec3i vector) {
        return angleBetweenRad(this, vector);
    }

    public static float angleBetween(int x1, int y1, int z1, int x2, int y2, int z2) {
        return angleBetweenRad(x1, y1, z1, x2, y2, z2) * Maths.TO_DEG;
    }

    public static float angleBetween(Vec3i vector1, int x2, int y2, int z2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, x2, y2, z2);
    }

    public static float angleBetween(int x1, int y1, int z1, Vec3i vector2) {
        return angleBetween(x1, y1, z1, vector2.x, vector2.y, vector2.z);
    }

    public static float angleBetween(Vec3i vector1, Vec3i vector2) {
        return angleBetween(vector1.x, vector1.y, vector1.z, vector2.x, vector2.y, vector2.z);
    }

    public float angleBetween(int x, int y, int z) {
        return angleBetween(this, x, y, z);
    }

    public float angleBetween(Vec3i vector) {
        return angleBetween(this, vector);
    }


    public Vec3i rotateRadX(double radians) {
        final double cos = Math.cos(radians);
        final double sin = Math.sin(radians);
        return this.setYZ((y * cos + z * sin), (y * -sin + z * cos));
    }

    public Vec3i rotateRadY(double radians) {
        final double cos = Math.cos(radians);
        final double sin = Math.sin(radians);
        return this.setXZ((x * cos - z * sin), (x * sin + z * cos));
    }

    public Vec3i rotateRadZ(double radians) {
        final double cos = Math.cos(radians);
        final double sin = Math.sin(radians);
        return this.setXY((x * cos + y * sin), (x * -sin + y * cos));
    }

    public Vec3i rotateX(double degrees) {
        return this.rotateRadX(degrees * Maths.TO_RAD);
    }

    public Vec3i rotateY(double degrees) {
        return this.rotateRadY(degrees * Maths.TO_RAD);
    }

    public Vec3i rotateZ(double degrees) {
        return this.rotateRadZ(degrees * Maths.TO_RAD);
    }


    public Vec3i mulMat4(float[] matrix) {
        return this.set(
            x * matrix[Matrix4f.M00] + y * matrix[Matrix4f.M10] + z * matrix[Matrix4f.M20] + matrix[Matrix4f.M30],
            x * matrix[Matrix4f.M01] + y * matrix[Matrix4f.M11] + z * matrix[Matrix4f.M21] + matrix[Matrix4f.M31],
            x * matrix[Matrix4f.M02] + y * matrix[Matrix4f.M12] + z * matrix[Matrix4f.M22] + matrix[Matrix4f.M32]
        );
    }

    public Vec3i mulMat3(float[] matrix) {
        return this.set(
            x * matrix[Matrix3f.M00] + y * matrix[Matrix3f.M10] + z * matrix[Matrix3f.M20],
            x * matrix[Matrix3f.M01] + y * matrix[Matrix3f.M11] + z * matrix[Matrix3f.M21],
            x * matrix[Matrix3f.M02] + y * matrix[Matrix3f.M12] + z * matrix[Matrix3f.M22]
        );
    }

    public Vec3i mulMat4(Matrix4f matrix) {
        return this.mulMat4(matrix.values);
    }

    public Vec3i mulMat3(Matrix3f matrix) {
        return this.mulMat3(matrix.values);
    }


    public Vec3f castFloat() {
        return new Vec3f(this);
    }

    public Vec3d castDouble() {
        return new Vec3d(this);
    }


    public Vec2i xy() {
        return new Vec2i(x, y);
    }

    public Vec2i xz() {
        return new Vec2i(x, z);
    }

    public Vec2i yz() {
        return new Vec2i(y, z);
    }


    public Vec3i clamp(int minX, int minY, int minZ, int maxX, int maxY, int maxZ) {
        return this.set(
            Maths.clamp(x, minX, maxX),
            Maths.clamp(y, minY, maxY),
            Maths.clamp(z, minZ, maxZ)
        );
    }

    public Vec3i clamp(int minX, int minY, int minZ, Vec3i max) {
        return this.clamp(minX, minY, minZ, max.x, max.y, max.z);
    }

    public Vec3i clamp(int minXYZ, int maxXYZ) {
        return this.clamp(minXYZ, minXYZ, minXYZ, maxXYZ, maxXYZ, maxXYZ);
    }

    public Vec3i clamp(int minXYZ, Vec3i max) {
        return this.clamp(minXYZ, minXYZ, minXYZ, max.x, max.y, max.z);
    }

    public Vec3i clamp(Vec3i min, int maxX, int maxY, int maxZ) {
        return this.clamp(min.x, min.y, min.z, maxX, maxY, maxZ);
    }

    public Vec3i clamp(Vec3i min, int maxXYZ) {
        return this.clamp(min.x, min.y, min.z, maxXYZ, maxXYZ, maxXYZ);
    }

    public Vec3i clamp(Vec3i min, Vec3i max) {
        return this.clamp(min.x, min.y, min.z, max.x, max.y, max.z);
    }


    public Vec3i copy() {
        return new Vec3i(this);
    }

    public static boolean equals(int x1, int y1, int z1, int x2, int y2, int z2) {
        return x1 == x2 && y1 == y2 && z1 == z2;
    }

    public static boolean notEquals(int x1, int y1, int z1, int x2, int y2, int z2) {
        return x1 != x2 || y1 != y2 || z1 != z2;
    }

    @Override
    public boolean equals(Object object) {
        if(object == null || getClass() != object.getClass())
            return false;
        
        final Vec3i vec = (Vec3i) object;
        return Vec3i.equals(x, y, z, vec.x, vec.y, vec.z);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + ", " + z + "}";
    }

}