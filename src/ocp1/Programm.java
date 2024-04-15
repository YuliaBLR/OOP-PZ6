package ocp1;

import java.util.ArrayList;
import java.util.List;

public class Programm {
    public static void main(String[] args) {

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new RightTriangle(2, 3));
        shapes.add(new Square(4));
        shapes.add(new Circle(3));
        AreaService areaService = new AreaService();
        System.out.printf("Сумма площадей фигур равна %f \n", areaService.calcArea(shapes));
    }
}
