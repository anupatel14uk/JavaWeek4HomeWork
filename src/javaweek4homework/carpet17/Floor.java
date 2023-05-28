package javaweek4homework.carpet17;

/**
 *
 */
public class Floor {
    double width;
    double length;

    Floor(double width, double length){
        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }

        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;
        }

    }

    public double getArea(){
        return this.width * this.length;
    }

}