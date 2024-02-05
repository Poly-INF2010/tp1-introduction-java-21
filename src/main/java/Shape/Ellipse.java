package Shape;

import Point.Point2d;

import java.util.Collection;

public class Ellipse extends BaseShape {
    /** TODO
     * Create a filled Ellipse that is centered on (0, 0)
     * @param widthDiameter Width of the Ellipse
     * @param heightDiameter Height of the Ellipse
     */

    private Double widthDiameter;
    private Double heightDiameter;
    public Ellipse(Double widthDiameter, Double heightDiameter) {
        this.heightDiameter = heightDiameter;
        this.widthDiameter = widthDiameter;

        for (double hauteur = -heightDiameter/2; hauteur < heightDiameter/2; hauteur += 0.5){

            for (double largueur = -widthDiameter/2; largueur < widthDiameter/2; largueur += 0.5){
                //verifier l'equation de l'ellipse
                if( (4*hauteur*hauteur/(heightDiameter*heightDiameter) + 4*largueur*largueur/(widthDiameter*widthDiameter) ) <= 1 ){
                    this.add( new Point2d(largueur, hauteur));
                }
            }
        }
    }

    /** TODO
     * Create a filled Ellipse that is centered on (0,0)
     * @param dimensions 2D point containing the width and height of the Ellipse
     */
    public Ellipse(Point2d dimensions) {
        this.heightDiameter = dimensions.X();
        this.widthDiameter = dimensions.Y();

        for (double hauteur = -heightDiameter/2; hauteur < heightDiameter/2; hauteur += 0.5){

            for (double largueur = -widthDiameter/2; largueur < widthDiameter/2; largueur += 0.5){
                //verifier l'equation de l'ellipse
                if( (4*hauteur*hauteur/(heightDiameter*heightDiameter) + 4*largueur*largueur/(widthDiameter*widthDiameter) ) <= 1 ){
                    this.add( new Point2d(largueur, hauteur));
                }
            }
        }
    }

    /**
     * Create an Ellipse from a given collection of 2D points
     * @param coords Collection of 2D points
     */
    private Ellipse(Collection<Point2d> coords) {
        this.addAll(coords);
        widthDiameter = this.getMaxX() - this.getMinX();
        heightDiameter = this.getMaxY() - this.getMinY();

    }

    /** TODO
     * @return Deep Copy of the Ellipse
     */
    @Override
    public Ellipse clone() {

        return new Ellipse(widthDiameter, heightDiameter);
    }
}
