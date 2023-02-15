package ShapesProject1;

import java.util.Scanner;

public class trapeze extends shapeFactory implements Prototype {
    int width;
    int rows;
    public trapeze (int width){
        this.width = width;
        this.rows = width;
}
    public trapeze () {
        width = 4;
        rows = 4;
    }
    @Override
    public void drow() {
        System.out.println();
        System.out.print("\u001b[36;1m");
        System.out.println("print trapeze:");
        System.out.println();
        int height = width;
        int topWidth =  2*height;
        int bottomWidth = 2*topWidth;

        for (int row = 0; row < height; row++) {
            for (int col = 0; col < topWidth + (bottomWidth - topWidth) * row / height; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }




    @Override
    shape createAndDrawShape(String choosen) {
        shape tr = new trapeze();
        if (choosen.equals("trapeze")) {
            try {
                System.out.println("Enter Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize = size.nextInt();
                if (choosensize > 0) {
                    tr = new trapeze(choosensize);
                    tr.drow();
                } else {
                    tr = new trapeze();
                    tr.drow();
                }
        } catch(Exception e){
            tr = new trapeze();
            tr.drow();
        }
    }
    return tr;
}
}
