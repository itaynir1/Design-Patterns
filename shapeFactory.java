package ShapesProject1;

import java.util.Scanner;

public abstract class shapeFactory extends shape {
	String choosen;
	shapeFactory(String choosen){
		this.choosen=choosen;
	}
	shapeFactory(){

	}

	abstract  shape createAndDrawShape(String choosen);


	void pannel() {
		if(choosen.equals( "rectangle")) {

			System.out.println("Enter Size: ");

			try {
				Scanner size = new Scanner(System.in);
				int choosensize=size.nextInt();
				if(choosensize>0) {
					rectangle a = new rectangle(choosensize,choosensize);
					a.drow();
				}else {
					rectangle a = new rectangle();
					a.drow();
				}

			}
			catch (Exception e){
				rectangle a1 = new rectangle();
				a1.drow();
			}
		}if( choosen.equals("square")) {
			System.out.println("Enter Size: ");
			try {
				Scanner size = new Scanner(System.in);
				int choosensize=size.nextInt();
				if(choosensize>0) {
					square b = new square(choosensize);
					b.drow();
				}else {
					square b = new square();
					b.drow();
				}

			}
			catch (Exception e){
				square b = new square();
				b.drow();
			}

		}if(choosen.equals("triangle")) {
			System.out.println("Enter Size: ");

			try {
				Scanner size = new Scanner(System.in);
				int choosensize=size.nextInt();
				if(choosensize>0) {
					triangle c = new triangle(choosensize)	;
					c.drow();
				}else {
					triangle c = new triangle()	;
					c.drow();
				}

			}
			catch (Exception e){
				triangle c = new triangle()	;
				c.drow();
			}
		}

	}

	shape Case(String choosen) {
		if(choosen.equals("trapeze")) {
			System.out.println("Enter Size: ");
			shape tr ;
			try {
				Scanner size = new Scanner(System.in);
				int choosensize=size.nextInt();
				if(choosensize>0) {
					shape c = new triangle(choosensize)	;
					c.drow();
				}else {
					shape c = new triangle()	;
					c.drow();
				}

			}
			catch (Exception e){
				shape c = new triangle()	;
				c.drow();
			}
		}
		return null;

	}
}







