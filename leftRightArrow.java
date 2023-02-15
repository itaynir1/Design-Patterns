package ShapesProject1;

import java.util.Scanner;

public class leftRightArrow extends shapeFactory implements Prototype {
    int arrow_one_rows; // left arrow
    int arrow_two_rows; // right arrow

    public leftRightArrow(int arrow_one_rows) {
        this.arrow_one_rows = arrow_one_rows; // left arrow
        this.arrow_two_rows = arrow_one_rows;// left arrow = right arrow
    }

    public leftRightArrow() {
        arrow_one_rows = 4;  // left arrow
        arrow_two_rows = 4; // right arrow
    }

    @Override
    public void drow() {
        System.out.println();
        System.out.print("\u001B[38;5;214m");
        System.out.println("Enter size for Right and Left Arrow:");
        int n = arrow_one_rows;
        System.out.println("printing the Right Arrow:");
        int num1 = n / 2 * 3;
        for (arrow_one_rows = 0; arrow_one_rows < n; arrow_one_rows++) {
            for (arrow_two_rows = 0; arrow_two_rows < n; arrow_two_rows++) {
                if (arrow_one_rows == n / 2 || arrow_two_rows - arrow_one_rows == n / 2 || arrow_one_rows + arrow_two_rows == num1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
// left arrow
        System.out.println("Printing the Left Arrow");
        for (arrow_one_rows = 0; arrow_one_rows < n; arrow_one_rows++) {
            for (arrow_two_rows = 0; arrow_two_rows < n; arrow_two_rows++) {
                if (arrow_one_rows == n / 2 || arrow_one_rows - arrow_two_rows == n / 2 || arrow_one_rows + arrow_two_rows == n / 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println( "\u001B[0m");
    }



    @Override
    shape createAndDrawShape(String choosen) {
        shape lr = new leftRightArrow();
        if (choosen.equals("arrow")) {
            try {
                System.out.println("Enter Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    lr = new leftRightArrow(choosensize);
                    lr.drow();
                } else {
                    lr = new leftRightArrow();
                    lr.drow();
                }
            } catch (Exception e) {
                lr = new leftRightArrow();
                lr.drow();
            }
        }
        return lr;
    }
}












