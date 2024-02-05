package Shape;

import Interface.Transform;
import Point.Point2d;

import java.util.*;
import java.util.stream.Collectors;

public class BaseShape extends Transform implements Cloneable {
    private final Collection<Point2d> coords;

//helper function to clone a list of points 
  public Collection<Point2d> cloneCoords(Collection<Point2d> coords) {
        return coords.stream().map(Point2d::clone).collect(Collectors.toList());
    }

    /** TODO
     * Create a BaseShape with empty coordinades
     */
    public BaseShape() {
        this.coords = new ArrayList<Point2d>();
    }

    /** TODO
     * Create a BaseShape from a collection of 2D points
     * @param coords The collection of 2D points
     */
     public BaseShape(Collection<Point2d> coords) {
         this.coords = cloneCoords(coords);
    }

    /** TODO
     * Add a deep copy of the 2D point to the Shape
     * @param coord 2D point to add
     * @return Updated BaseShape
     */
     public BaseShape add(Point2d coord) {
         this.coords.add(coord.clone());
         return this;
    }

    /** TODO
     * Add a deep copy of the 2D points of the shape to the current shape
     * @param shape Shape to add to the current shape
     * @return Updated BaseShape
     */
    public BaseShape add(BaseShape shape) {
         for (Point2d point: shape.coords) {
             this.add(point.clone());
         }
         return this;
    }

    /** TODO
     * Add a deep copy of the points in the collection to the shape
     * @param coords Collections of point to add
     * @return Updated BaseShape
     */
    public BaseShape addAll(Collection<Point2d> coords) {
        this.coords.addAll(cloneCoords(coords));
        return this;
    }

    /** TODO
     * Remove the 2D point from the shape
     * @param coord Point to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(Point2d coord) {
        coords.remove(coord);
        return this;
    }

    /** TODO
     * Remove the 2D points in the shape from the current shape
     * @param shape Shape containing the points to remove
     * @return Updated BaseShape
     */
    public BaseShape remove(BaseShape shape) {

        for(Point2d point : shape.getCoords()){
            if(coords.contains(point)){
                coords.remove(point);
            }
        }

        return  this;
    }

    /** TODO
     * Remove the 2D points in the collection from the current shape
     * @param coords Collection of 2D points to remove
     * @return Updated BaseShape
     */
    public BaseShape removeAll(Collection<Point2d> coords) {
        this.remove(new BaseShape(coords));
        return this;
    }

    /** TODO
     *  Replace all the coords in a shape with new ones
     * @param newCoords new coords to replace the old one
     * @return Updated BaseShape
     * */
    public BaseShape replaceAll(Collection<Point2d> newCoords) {
        this.removeAll(coords);
        this.addAll(newCoords);
        return this; }

    /** TODO
     * Return a shallow copy of the coordinates of the shape
     * @return Shallow copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> getCoords() {
        Collection<Point2d> copy = new ArrayList<Point2d>();
        for (Point2d point: coords) {
            copy.add(point);
        }
        return copy;
    }

    /** TODO
     * Create and return a deep copy of the coordinates of the shape
     * @return Deep copy of all coordinates contained by this BaseShape
     */
    public Collection<Point2d> cloneCoords() {
        return  this.coords.stream()
                .map(Point2d::clone)
                .collect(Collectors.toList());
    }

    /** TODO
     * @return Maximum X coordinate of the shape
     */
    public Double getMaxX() {
        if (coords.isEmpty()) {
            return -1.7976931348623157E308;
        }

        Double max = coords.iterator().next().X();

        for (Point2d point: coords) {
            if (point.X() > max) {
                max = point.X();
            }
        }
        return max;
    }

    /** TODO
     * @return Maximum Y coordinate of the shape
     */
    public Double getMaxY() {
        if (coords.isEmpty()) {
            return -1.7976931348623157E308;
        }

        Double max = coords.iterator().next().Y();

        for (Point2d point: coords) {
            if (point.Y() > max) {
                max = point.Y();
            }
        }
        return max;
    }

    /** TODO
     * @return 2D Point containing the maximum X and Y coordinates of the shape
     */
    public Point2d getMaxCoord() {
        return new Point2d(this.getMaxX(), this.getMaxY());
    }

    /** TODO
     * @return Minimum X coordinate of the shape
     */
    public Double getMinX() {
        if (coords.isEmpty()) {
            return 1.7976931348623157E308;
        }

        Double min = coords.iterator().next().X();

        for (Point2d point: coords) {
            if (point.X() < min) {
                min = point.X();
            }
        }
        return min;
    }

    /** TODO
     * @return Minimum Y coordinate of the shape
     */
    public Double getMinY() {
        if (coords.isEmpty()) {
            return 1.7976931348623157E308;
        }

        Double min = coords.iterator().next().Y();

        for (Point2d point: coords) {
            if (point.Y() < min) {
                min = point.Y();
            }
        }
        return min;
    }

    /** TODO
     * @return 2D point containing the minimum X and Y coordinate of the shape
     */
    public Point2d getMinCoord() {
        return new Point2d(this.getMinX(), this.getMinY());
    }

    /** TODO
     * @return Deep copy of the current shape
     */
    public BaseShape clone() {

        BaseShape copie = new BaseShape();

        copie.addAll(this.getCoords());

        return copie;
    }
}
