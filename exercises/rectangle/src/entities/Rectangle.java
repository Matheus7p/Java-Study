package entities;

public class Rectangle {

    public double width;
    public double heigth;

    public double area(){
        return this.width * this.heigth;
    }

    public double perimeter(){
        return 2 *(this.width + this.heigth);
    }

    public double diagonal(){
        return  Math.sqrt((this.width * this.width) + (this.heigth * this.heigth));
    }

    public String toString(){
        String areaFormat = String.format("%.2f", area());
        String perimeterFormat = String.format("%.2f", perimeter());
        String diagonalFormat = String.format("%.2f", diagonal());
        return "AREA = " + areaFormat + "\nPerimeter = " + perimeterFormat + "\nDiagonal = " + diagonalFormat;
    }

}
