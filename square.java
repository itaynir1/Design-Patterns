package ShapesProject1;

public class square extends shape implements Prototype {

	int num;

	square(int num){
		this.num=num;

	}	
	

	square(){
		this.num=4;

	}	








	@Override
	public void drow() {
		System.out.println();
		System.out.print("\u001b[35m");
		System.out.println("Printing square: \n");
	
		  int i, j, my_input;
	      my_input =num;
	    
	      for (int w = 1; w <= my_input; w++)
          {
              for (int h = 1; h <= my_input; h++)
              {
                  System.out.print("* ");
              }
              System.out.println();
          }
    }
}
