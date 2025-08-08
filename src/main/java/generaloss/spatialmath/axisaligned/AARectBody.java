package generaloss.spatialmath.axisaligned;

import generaloss.spatialmath.geometry.Intersector;
import generaloss.spatialmath.vector.Vec2f;

public class AARectBody {

    private final AARect rect;
    private final Vec2f position, min, max;

    public AARectBody(AARect rect, Vec2f position) {
        this.rect = rect;
        this.position = position;
        this.min = new Vec2f();
        this.max = new Vec2f();
    }

    public AARectBody(AARectBody body) {
        this(body.rect.copy(), body.position.copy());
    }

    public AARectBody(AARect rect) {
        this(rect, new Vec2f());
    }

    public AARectBody(Vec2f position) {
        this(new AARect(0, 0, 0, 0), position);
    }

    public AARectBody() {
        this(new AARect(0, 0, 0, 0), new Vec2f());
    }


    public Vec2f min() {
        return min.set(rect.min()).add(position);
    }

    public Vec2f max() {
        return max.set(rect.max()).add(position);
    }


    public AARect rect() {
        return rect;
    }

    public Vec2f position() {
        return position;
    }


    public AARectBody copy() {
        return new AARectBody(this);
    }


    public static boolean overlaps(double min1X, double min1Y,
                                   double max1X, double max1Y,
                                   double min2X, double min2Y,
                                   double max2X, double max2Y) {
        return (
                Intersector.isRangesOverlapping(min1X, max1X, min2X, max2X) &&
                Intersector.isRangesOverlapping(min1Y, max1Y, min2Y, max2Y)
        );
    }

    public static boolean overlaps(AARectBody a, AARectBody b) {
        final Vec2f min1 = a.min();
        final Vec2f max1 = a.max();
        final Vec2f min2 = b.min();
        final Vec2f max2 = b.max();

        return overlaps(
                min1.x, min1.y,
                max1.x, max1.y,
                min2.x, min2.y,
                max2.x, max2.y
        );
    }

    public boolean overlaps(AARectBody other) {
        return AARectBody.overlaps(this, other);
    }


    public static boolean isPointIn(double pointX, double pointY, double minX, double minY, double maxX, double maxY) {
        return (pointX > minX && pointY > minY && pointX < maxX && pointY < maxY);
    }

    public static boolean isPointIn(double pointX, double pointY, AARectBody body) {
        final Vec2f min = body.min();
        final Vec2f max = body.max();
        return isPointIn(pointX, pointY, min.x, min.y, max.x, max.y);
    }

    public static boolean isPointIn(Vec2f point, double minX, double minY, double maxX, double maxY) {
        return isPointIn(point.x, point.y, minX, minY, maxX, maxY);
    }

    public static boolean isPointIn(Vec2f point, AARectBody body) {
        return isPointIn(point.x, point.y, body);
    }

    public boolean isPointIn(double pointX, double pointY) {
        return isPointIn(pointX, pointY, this);
    }

    public boolean isPointIn(Vec2f point) {
        return isPointIn(point, this);
    }


    public static boolean isPointOn(double pointX, double pointY, double minX, double minY, double maxX, double maxY) {
        return (pointX >= minX && pointY >= minY && pointX <= maxX && pointY <= maxY);
    }

    public static boolean isPointOn(double pointX, double pointY, AARectBody body) {
        final Vec2f min = body.min();
        final Vec2f max = body.max();
        return isPointOn(pointX, pointY, min.x, min.y, max.x, max.y);
    }

    public static boolean isPointOn(Vec2f point, double minX, double minY, double maxX, double maxY) {
        return isPointOn(point.x, point.y, minX, minY, maxX, maxY);
    }

    public static boolean isPointOn(Vec2f point, AARectBody body) {
        return isPointOn(point.x, point.y, body);
    }

    public boolean isPointOn(double pointX, double pointY) {
        return isPointOn(pointX, pointY, this);
    }

    public boolean isPointOn(Vec2f point) {
        return isPointOn(point, this);
    }

}
