package be.abis.shapes.test;

import be.abis.shapes.model.*;

public class Client {

	public static void main(String[] args)  {
		
		Point p = new Point();

		Circle c = new Circle("red",p,2);
		Rectangle r = new Rectangle("blue",new Point(),2,3);

		Shape[] shapes = {c,r};

		for (Shape sh : shapes){
			System.out.println("The area of the " +sh.getColor() + " " + sh.getClass().getSimpleName() + " is " + sh.area() + " .");
		}


	}

}
