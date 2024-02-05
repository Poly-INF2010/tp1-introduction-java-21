package Shape;

import Point.Point2d;

import java.util.Collection;

public class Triangle extends BaseShape {

    public Triangle(Double base, Double hauteur, int typeTriangle) {


        for (double y = -hauteur/2; y < hauteur/2; y += 0.5){

            for (double x = -base/2; x < base/2; x += 0.5){
                if(typeTriangle == 1){
                    if( y >= (hauteur/base)*x ) {
                        this.add( new Point2d(x, y));
                    }
                }
                if(typeTriangle == 2){
                    if( y <= (hauteur/base)*x ) {
                        this.add( new Point2d(x, y));
                    }
                }
                if(typeTriangle == 3){
                    if( y >= -(hauteur/base)*x ) {
                        this.add( new Point2d(x, y));
                    }
                }
                if(typeTriangle == 4){
                    if( y <= -(hauteur/base)*x ) {
                        this.add( new Point2d(x, y));
                    }
                }

            }
        }

    }


}
