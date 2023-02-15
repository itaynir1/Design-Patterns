package ShapesProject1;

import java.util.Scanner;
/**
 *
 */

/**
 * @authors Itay Nir and Lior Hagag
 *
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Shape Name: ");
        Scanner Obj = new Scanner(System.in);
        String choosen = Obj.next();
        shape s;
        shapeFactory c;

        if (choosen.equals("rectangle")) {
            try {
                Scanner size = new Scanner(System.in);
                System.out.println("Enter the Size: ");
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    s = new rectangle(choosensize, choosensize);
                    s.drow();
                } else {
                    s = new rectangle();
                    s.drow();
                }
            } catch (Exception e) {
                rectangle a1 = new rectangle();
                a1.drow();
            }
        } else if (choosen.equals("square")) {
            try {
                System.out.println("Enter the  Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    s = new square(choosensize);
                    s.drow();
                } else {
                    s = new square();
                    s.drow();
                }
            } catch (Exception e) {
                s = new square();
                s.drow();
            }
        } else if (choosen.equals("triangle")) {
            try {
                System.out.println("Enter the Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    s = new triangle(choosensize);
                    s.drow();
                } else {
                    s = new triangle();
                    s.drow();
                }
            } catch (Exception e) {
                s = new triangle();
                s.drow();
            }
        } else if (choosen.equals("star")) {
            try {
                System.out.println("Enter the Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    c = new Star(choosensize);
                    c.drow();
                } else {
                    c = new Star();
                    c.createAndDrawShape(choosen);
                }
            } catch (Exception e) {
                c = new Star();
                c.drow();
            }

        } else if (choosen.equals("arrow")) {
            try {
                System.out.println("Enter the Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    c = new leftRightArrow(choosensize);
                    c.drow();
                } else {
                    c = new leftRightArrow();
                    c.createAndDrawShape(choosen);
                }
            } catch (Exception e) {
                c = new leftRightArrow();
                c.drow();
            }
        } else if (choosen.equals("trapeze")) {
            try {
                System.out.println("Enter Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    trapeze c1 = new trapeze(choosensize);
                    c1.drow();
                } else {
                    c = new trapeze(choosensize);
                    c.createAndDrawShape(choosen);
                }
            } catch (Exception e) {
                c = new trapeze();
                c.drow();
            }
        }
        System.out.println();
        System.out.format("\033[1;91;102mShapes-Styling:\033[0m%n");
        DrawingBuilder view = new DrawingBuilder("Itay and Lior", "This piece is published by expensive", 500000.55, 50, 35);
        DrawingBuilder view1 = new DrawingBuilder("Leonardo and Rafael", "The UML's story", 19295000.5, 50, 35);
        DrawingBuilder view2 = new DrawingBuilder(7000.55);
        DrawingBuilder view3 = new DrawingBuilder("timor the artist", "simple piece ", 90.99);
        DrawingBuilder view4 = new DrawingBuilder("", "Itayangelo and Refalov");
        DrawingBuilder view5 = new DrawingBuilder(50, 35);
        DrawingBuilder view6 = new DrawingBuilder("amigoTriangle");
        DrawingBuilder view7 = new DrawingBuilder(20);
        DrawingBuilder view8 = new DrawingBuilder();

        System.out.println();
        System.out.format("\033[1;93;104mThis is our collection:\033[0m%n");
        view.build();
        view1.build();
        view2.build();
        view3.build();
        view4.build();
        view5.build();
        view6.build();
        view7.build();
        view8.build();

        System.out.format("\033[1;4;34;103mShapes Generator:\033[0m%n");
        System.out.println();
        shape x1 = new triangle();
        shape x2 = new rectangle();
        shape x3 = new square();
        shapeFactory x4 = new Star();
        shapeFactory x5 = new leftRightArrow();
        shapeFactory x6 = new trapeze();

        shape[] shapeArray = {x1, x2, x3, x4, x5, x6};
        for (int i = 0; i < shapeArray.length; i++) {
            shapeArray[i].clone(shapeArray[i]);
            System.out.println();
        }
    }
}
