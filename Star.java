package ShapesProject1;

import java.util.Scanner;

public class Star extends shapeFactory implements Prototype {

    int row;
    public Star(int row){
        this.row=row;
    }

    public Star() {
        this.row=10;
    }

    @Override
    public void drow() {
        System.out.println();
        System.out.printf("\u001B[38;2;51;153;255mPrinting star:\n");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < row; j++) {
                    if (i == j || i + j == row - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }

        @Override
    shape createAndDrawShape(String choosen) {
        shape st= new Star();

        if(choosen.equals("star")) {
            try {
                System.out.println("Enter Size: ");
                Scanner size = new Scanner(System.in);
                int choosensize=size.nextInt();
                if(choosensize>0) {
                    st= new Star(choosensize);
                    st.drow();

                }else {
                    st= new Star();
                    st.drow();

                }
            }
            catch (Exception e){
                st= new Star();
                st.drow();

            }

        }
        return st;

    }

}
