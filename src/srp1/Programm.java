package srp1;

public class Programm {
    public static void main(String[] args) {
        Square square = new Square(new Point(1,1), 5);
        SquareDrawer squareDrawer = new SquareDrawer(square, 2);
        System.out.printf("Площадь фигуры: %d\n", square.getArea());
        squareDrawer.draw();
    }
}
