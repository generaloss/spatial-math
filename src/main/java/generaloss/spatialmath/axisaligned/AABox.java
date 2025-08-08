package generaloss.spatialmath.axisaligned;

import generaloss.spatialmath.vector.Vec3f;

public class AABox {

    private final Vec3f min, max;

    public AABox(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        this.min = new Vec3f(minX, minY, minZ);
        this.max = new Vec3f(maxX, maxY, maxZ);
    }

    public AABox(Vec3f min, Vec3f max) {
        this.min = min;
        this.max = max;
    }

    public AABox(AABox box) {
        this.min = box.min.copy();
        this.max = box.max.copy();
    }


    public void resize(double minX, double minY, double minZ, double maxX, double maxY, double maxZ) {
        this.min.set(minX, minY, minZ);
        this.max.set(maxX, maxY, maxZ);
    }

    public void resize(Vec3f min, Vec3f max) {
        this.min.set(min);
        this.max.set(max);
    }

    public void resize(AABox box) {
        this.resize(box.min, box.max);
    }


    public void expand(double negativeX, double negativeY, double negativeZ, double positiveX, double positiveY, double positiveZ) {
        this.resize(
            min.x - negativeX, min.y - negativeY, min.z - negativeZ,
            max.x + positiveX, max.y + positiveY, max.z + positiveZ
        );
    }

    public void expand(Vec3f negative, Vec3f positive) {
        this.expand(negative.x, negative.y, negative.z, positive.x, positive.y, positive.z);
    }

    public void expand(double expandX, double expandY, double expandZ) {
        this.expand(expandX, expandY, expandZ, expandX, expandY, expandZ);
    }

    public void expand(double expand) {
        this.expand(expand, expand, expand);
    }


    public void shift(double shiftX, double shiftY, double shiftZ) {
        this.resize(
            min.x + shiftX, min.y + shiftY, min.z + shiftZ,
            max.x + shiftX, max.y + shiftY, max.z + shiftZ
        );
    }

    public void shift(Vec3f shift) {
        this.shift(shift.x, shift.y, shift.z);
    }


    public Vec3f min() {
        return min;
    }

    public Vec3f max() {
        return max;
    }


    public float getSizeX() {
        return max.x - min.x;
    }

    public float getSizeY() {
        return max.y - min.y;
    }

    public float getSizeZ() {
        return max.z - min.z;
    }


    public float getVolume() {
        return getSizeY() * getSizeX() * getSizeZ();
    }

    public float getCenterX() {
        return (min.x + getSizeX() * 0.5F);
    }

    public float getCenterY() {
        return (min.y + getSizeY() * 0.5F);
    }

    public float getCenterZ() {
        return (min.z + getSizeZ() * 0.5F);
    }

    public Vec3f getCenter(Vec3f dst) {
        return dst.set(this.getCenterX(), this.getCenterY(), this.getCenterZ());
    }


    public AABox copy() {
        return new AABox(this);
    }

}
