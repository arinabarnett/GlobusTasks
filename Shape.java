
public class Figure {
    public static void main (String args[]);
    int radius, side1, side2, side3;
    double area;
}

abstract class Circle extends Figure {
    public abstract void main (String args[]) {
        int radius = 6;
        double area = Math.PI * ( radius * radius );
        System.out.println("Площадь круга равна: " + area );
    }
}

abstract class RightTraingle extends Figure {
    public abstract void main (String args[]) {
        int side1 = 2;
        int side2 = 4;
        double area = ( side1 * side2 / 2 );
        System.out.println("Площадь прямоугольного треугольника равна: " + area );
    }
}

abstract class Square extends Figure {
    public abstract void main (String args[]) {
    int side3 = 5;
    double area = (side3 * 2);
    System.out.println("Площадь квадрата: " + area);
    }
}
