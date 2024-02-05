package Letter;

import Point.Point2d;
import Shape.*;
import org.w3c.dom.css.Rect;

import java.security.cert.Certificate;

import static java.lang.Math.PI;
import static java.lang.Math.toRadians;

public final class LetterFactory {
    final static Double maxHeight = 150.0;
    final static Double maxWidth = maxHeight / 2.5;
    final static Double halfMaxHeight = maxHeight / 2;
    final static Double halfMaxWidth = maxWidth / 2;
    final static Double stripeThickness = maxHeight / 8;
    final static Double halfStripeThickness = stripeThickness / 2;


    /** TODO
     * Create the letter A graphically
     * @return BaseShape containing the letter A
     */
    public static BaseShape create_A()  {

        BaseShape lettreA = new BaseShape();

        Rectangle total = new Rectangle(maxWidth, maxHeight);

        Triangle triangleRemoveBasDroit = new Triangle( 25.0, maxHeight, 1);
        triangleRemoveBasDroit.translate(triangleRemoveBasDroit.getCoords(), new Point2d(10.0, 10.0 ));
        total.removeAll(triangleRemoveBasDroit.getCoords());

        Triangle triangleRemoveBasGauche = new Triangle( 25.0, maxHeight, 3);
        triangleRemoveBasGauche.translate(triangleRemoveBasGauche.getCoords(), new Point2d(-10.0, 10.0 ));
        total.removeAll(triangleRemoveBasGauche.getCoords());

        Rectangle rectangleMilieu = new Rectangle(maxWidth, 20.0);
        total.addAll(rectangleMilieu.getCoords());

        Triangle triangleRemoveHautGauche = new Triangle( 30.0, maxHeight, 4);
        triangleRemoveHautGauche.translate(triangleRemoveHautGauche.getCoords(), new Point2d(-15.0, 0.0 ));
        total.removeAll(triangleRemoveHautGauche.getCoords());
        total.removeAll(triangleRemoveHautGauche.getCoords());

        Triangle triangleRemoveHautDroit = new Triangle( 30.0, maxHeight, 2);
        triangleRemoveHautDroit.translate(triangleRemoveHautDroit.getCoords(), new Point2d(15.0, 0.0 ));
        total.removeAll(triangleRemoveHautDroit.getCoords());
        total.removeAll(triangleRemoveHautDroit.getCoords());

        lettreA.addAll(total.getCoords());

        return lettreA;
    }

    /** TODO
     * Create the letter B graphically
     * @return BaseShape containing the letter B
     */
    public static BaseShape create_B() {
        BaseShape letterB = new BaseShape();

        Circle cercleToAdd = new Circle(halfMaxHeight);
        Circle cercleToRemove = new Circle(maxWidth);
        cercleToAdd.removeAll(cercleToRemove.getCoords());
        cercleToAdd.translate(cercleToAdd.getCoords(), new Point2d(0.0, -halfMaxHeight/2));
        letterB.addAll(cercleToAdd.getCoords());

        cercleToAdd.translate(cercleToAdd.getCoords(), new Point2d(0.0, halfMaxHeight));
        letterB.addAll(cercleToAdd.getCoords());

        Rectangle rectangleToAdd = new Rectangle( 2*halfMaxWidth/3 ,maxHeight);
        rectangleToAdd.translate(rectangleToAdd.getCoords(), new Point2d( -halfMaxWidth,0.0));
        letterB.addAll(rectangleToAdd.getCoords());

        return letterB;
    }

    /** TODO
     * Create the letter C graphically
     * @return BaseShape containing the letter C
     */
    public static BaseShape create_C() {
        BaseShape letterC = new BaseShape();

        Ellipse ellipseC = new Ellipse(maxWidth, maxHeight);
        ellipseC.translate(ellipseC.getCoords(), new Point2d(0.0,70.0));

        Ellipse ellipseVideAuCentre= new Ellipse(maxWidth/1.2, maxHeight/1.2);
        ellipseVideAuCentre.translate(ellipseVideAuCentre.getCoords(), new Point2d(0.0, 70.0));
        ellipseC.removeAll(ellipseVideAuCentre.getCoords());

        letterC.addAll(ellipseC.getCoords());

        Rectangle rectangleToRemove = new Rectangle(20.0, 2*maxHeight/1.2);
        rectangleToRemove.translate(rectangleToRemove.getCoords(), new Point2d(30.0, 0.0));
        letterC.removeAll(rectangleToRemove.getCoords());


        return letterC;
    }

    /** TODO
     * Create the letter E graphically
     * @return BaseShape containing the letter E
     */
    public static BaseShape create_E() {
        BaseShape lettreE = new BaseShape();

        Rectangle BaselettreE = new Rectangle(maxWidth,maxHeight);
        lettreE.addAll(BaselettreE.getCoords());


        Rectangle rectangleAEnlever = new Rectangle(60.0, 45.0);
        rectangleAEnlever.translate(rectangleAEnlever.getCoords(), new Point2d(20.0, -35.0));
        lettreE.removeAll(rectangleAEnlever.getCoords());

        rectangleAEnlever.translate(rectangleAEnlever.getCoords(), new Point2d(0.0, 70.0));
        lettreE.removeAll(rectangleAEnlever.getCoords());
        return lettreE;
    }

    /** TODO
     * Create the letter H graphically
     * @return BaseShape containing the letter H
     */
    public static BaseShape create_H() {

        BaseShape letterH = new BaseShape();

        Rectangle rectangleDroit = new Rectangle(20.0,maxHeight);
        rectangleDroit.translate(rectangleDroit.getCoords(), new Point2d( -30.0,0.0));
        letterH.addAll(rectangleDroit.getCoords());

        Rectangle rectangGauche = new Rectangle(20.0,maxHeight);
        rectangGauche.translate(rectangGauche.getCoords(), new Point2d( 30.0,0.0));
        letterH.addAll(rectangGauche.getCoords());

        Rectangle rectangleCenntre = new Rectangle(maxWidth,20.0);
        letterH.addAll(rectangleCenntre.getCoords());

        /*Rectangle rectangleToRemove = new Rectangle(halfMaxWidth,halfMaxHeight);
        rectangleToRemove.translate(rectangleToRemove.getCoords(), new Point2d(0.0, 2* stripeThickness));
        letterH.removeAll(rectangleToRemove.getCoords());

        rectangleToRemove.translate(rectangleToRemove.getCoords(), new Point2d(0.0, -4* stripeThickness-10));
        letterH.removeAll(rectangleToRemove.getCoords());*/

        return letterH;
    }

    /** TODO
     * Create the letter N graphically
     * @return BaseShape containing the letter N
     */
    public static BaseShape create_N() {
        BaseShape letterN = new BaseShape();

        Rectangle rectangleBase = new Rectangle(maxWidth,maxHeight);
        letterN.addAll(rectangleBase.getCoords());

        Triangle triangleToRemove = new Triangle(40.0, 140.0, 1);
        triangleToRemove.translate(triangleToRemove.getCoords(), new Point2d(0.0, 5.0 ));
        letterN.removeAll(triangleToRemove.getCoords());

        Triangle triangleToRemoveDroit = new Triangle(40.0, 140.0, 2);
        triangleToRemoveDroit.translate(triangleToRemoveDroit.getCoords(), new Point2d(0.0, -5.0 ));
        letterN.removeAll(triangleToRemoveDroit.getCoords());

        return letterN;
    }

    /** TODO
     * Create the letter O graphically
     * @return BaseShape containing the letter O
     */
    public static BaseShape create_O() {
        BaseShape letterO = new BaseShape();


        Ellipse ellipseO = new Ellipse(maxWidth, maxHeight);
        ellipseO.translate(ellipseO.getCoords(), new Point2d(0.0,70.0));

        Ellipse ellipseVideAuCentre= new Ellipse(maxWidth/1.2, maxHeight/1.2);
        ellipseVideAuCentre.translate(ellipseVideAuCentre.getCoords(), new Point2d(0.0, 70.0));
        ellipseO.removeAll(ellipseVideAuCentre.getCoords());



        letterO.addAll(ellipseO.getCoords());

        return letterO;
    }

}
