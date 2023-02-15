package ShapesProject1;

public class triangle extends shape implements Prototype{
	int high;
	triangle(int high){
		this.high=high;
	}

	triangle(){
		this.high=4;
	}


	@Override
	public void drow() {
		System.out.println();
		System.out.print("\u001b[33;1m");
		System.out.println("Printing Triangle: \n");
		int rows = high;

		for(int i=0; i<rows; i++)   
		{   
		//inner loop for columns  
		for(int j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}
    }
		

}


