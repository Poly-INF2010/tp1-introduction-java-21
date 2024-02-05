package Shape;

import Point.Point2d;

import java.util.Collection;

public class Rectangle extends BaseShape {

    private Double width;
    private Double height;


    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param width Width of the rectangle
     * @param height Height of the rectangle
     */
    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;


        for (double hauteur = -height/2; hauteur < height/2; hauteur += 0.5){

            for (double largueur = -width/2; largueur < width/2; largueur += 0.5){
                this.add( new Point2d(largueur, hauteur));
            }
        }

    }

    /** TODO
     * Create a filled rectangle centered on (0, 0)
     * @param dimensions 2D point containing the width and height of the rectangle
     */
    public Rectangle(Point2d dimensions) {

        width = dimensions.X();
        height = dimensions.Y();

        for (double hauteur = -height/2; hauteur < height/2; hauteur += 0.5){

            for (double largueur = -width/2; largueur < width/2; largueur += 0.5){
                this.add( new Point2d(largueur, hauteur));
            }
        }
    }

    /**
     * Create a rectangle from a given collection of Points
     * @param coords The collection of 2D points
     */
    private Rectangle(Collection<Point2d> coords) {
        super(coords);

        height = super.getMaxY() - super.getMinY();
        width = super.getMaxX() - super.getMinX();
    }

    /** TODO
     * @return Deep copy of the rectangle
     */
    @Override
    public Rectangle clone() {

        return new Rectangle(width, height);
    }
}
