package generaloss.spatialmath.axisaligned;

import generaloss.spatialmath.geometry.Intersector;
import generaloss.spatialmath.vector.Vec2f;

import java.util.Collection;

public class AARectCollider {

    public static boolean intersects(Vec2f movement, AARectBody body1, AARectBody... otherBodies) {
        body1 = body1.copy();
        body1.position().add(movement);

        for(AARectBody body2: otherBodies)
            if(body1.overlaps(body2))
                return true;

        return false;
    }

    public static boolean intersects(Vec2f movement, AARectBody body1, Collection<AARectBody> otherBodies) {
        body1 = body1.copy();
        body1.position().add(movement);

        for(AARectBody body2: otherBodies)
            if(body1.overlaps(body2))
                return true;

        return false;
    }


    public static Vec2f clipMovement(Vec2f clipDst, Vec2f movement, AARectBody body1, AARectBody... otherBodies) {
        // If movement == 0, return 0
        if(movement.isZero() || otherBodies == null)
            return movement;

        // Copy body for safe addition to body.position.X for correct calculation movementY
        body1 = body1.copy();

        // Calculate
        final float movementX = minClipX(movement.x, body1, otherBodies);
        body1.position().x += movementX;
        final float movementY = minClipY(movement.y, body1, otherBodies);

        // Return calculated movement
        return clipDst.set(movementX, movementY);
    }

    public static Vec2f clipMovement(Vec2f movement, AARectBody body1, AARectBody... otherBodies) {
        return clipMovement(new Vec2f(), movement, body1, otherBodies);
    }


    private static float minClipX(float movementX, AARectBody body1, AARectBody[] otherBodies) {
        // Iterate other bodies
        for(AARectBody body2: otherBodies){
            if(movementX == 0)
                break;

            // Minimize movement
            movementX = clipX(movementX, body1, body2);
        }
        return movementX;
    }

    private static float minClipY(float movementY, AARectBody body1, AARectBody[] otherBodies) {
        for(AARectBody body2: otherBodies){
            if(movementY == 0)
                break;

            movementY = clipY(movementY, body1, body2);
        }
        return movementY;
    }


    public static Vec2f clipMovement(Vec2f clipDst, Vec2f movement, AARectBody body1, Collection<AARectBody> otherBodies) {
        // If movement == 0, return 0
        if(movement.isZero() || otherBodies == null)
            return movement;

        // Copy body for safe addition to body.position.X for correct calculation movementY
        body1 = body1.copy();

        // Calculate
        final float movementX = minClipX(movement.x, body1, otherBodies);
        body1.position().x += movementX;
        final float movementY = minClipY(movement.y, body1, otherBodies);

        // Return calculated movement
        return clipDst.set(movementX, movementY);
    }

    public static Vec2f clipMovement(Vec2f movement, AARectBody body1, Collection<AARectBody> otherBodies) {
        return clipMovement(new Vec2f(), movement, body1, otherBodies);
    }


    private static float minClipX(float movementX, AARectBody body1, Collection<AARectBody> otherBodies) {
        // Iterate other bodies
        for(AARectBody body2: otherBodies){
            if(movementX == 0)
                break;

            // Minimize movement
            movementX = clipX(movementX, body1, body2);
        }
        return movementX;
    }

    private static float minClipY(float movementY, AARectBody body1, Collection<AARectBody> otherBodies) {
        for(AARectBody body2: otherBodies){
            if(movementY == 0)
                break;

            movementY = clipY(movementY, body1, body2);
        }
        return movementY;
    }


    private static float clipX(float movementX, AARectBody body1, AARectBody body2) {
        // Ensure that the bodies intersect on the other axis and that collision is possible
        if(Intersector.isRangesOverlapping(body1.min().y, body1.max().y, body2.min().y, body2.max().y)){

            // When moving positively:
            if(movementX > 0){
                // Find body1 and body2 sides between which the distance to the collision is calculated
                final float body1Side = Math.max(body1.min().x, body1.max().x);
                final float body2Side = Math.min(body2.min().x, body2.max().x);
                final float distance = (body2Side - body1Side);

                // If the collision distance is less than planned to move them
                if(distance >= 0 && distance < movementX)
                    // Return the distance as a move
                    return distance;

                // When moving negatively:
            }else{
                // Find body1 and body2 sides between which the distance to the collision is calculated
                final float body1Side = Math.min(body1.min().x, body1.max().x);
                final float body2Side = Math.max(body2.min().x, body2.max().x);
                final float distance = (body2Side - body1Side);

                // If the collision distance is less than planned to move them (-distance < -movementX  =  distance > movementX)
                if(distance <= 0 && movementX < distance)
                    // Return the distance as a move
                    return distance;
            }
        }

        // If the movementX is less than the collision distance - do nothing
        return movementX;
    }

    private static float clipY(float movementY, AARectBody body1, AARectBody body2) {
        if(Intersector.isRangesOverlapping(body1.min().x, body1.max().x, body2.min().x, body2.max().x)){

            if(movementY > 0){
                final float body1Side = Math.max(body1.min().y, body1.max().y);
                final float body2Side = Math.min(body2.min().y, body2.max().y);
                final float distance = (body2Side - body1Side);

                if(distance >= 0 && movementY > distance)
                    return distance;

            }else{
                final float body1Side = Math.min(body1.min().y, body1.max().y);
                final float body2Side = Math.max(body2.min().y, body2.max().y);
                final float distance = (body2Side - body1Side);

                if(distance <= 0 && movementY < distance)
                    return distance;
            }
        }

        return movementY;
    }

}
