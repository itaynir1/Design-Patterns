package ShapesProject1;

public class rectangle  extends shape  implements Prototype{
	int length, width;
	rectangle(int length, int width){
		this.length=length;
		this.width=width;
		
	}

rectangle(){
this.length=4;
this.width=4;
		
	}

	@Override
	public void drow() {
		System.out.println();
		System.out.print("\u001b[31;1m");
		System.out.println("Printing rectangle: \n");
			for (int a = 0; a < length; a++)
			{
				for (int b = 0; b < width; b++)
				{
					System.out.print("*");
				}
				System.out.println(); //ending line
			}

		}
	}



