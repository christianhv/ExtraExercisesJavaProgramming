package be.abis.shapes.test;

import be.abis.shapes.model.Circle;
import be.abis.shapes.model.Point;
import be.abis.shapes.model.Rectangle;
import be.abis.shapes.model.Shape;

public class Client {

	public static void main(String[] args)  {
		
		Point p = new Point();

		Circle c = new Circle("red",p,2);
		Rectangle r = new Rectangle("blue",new Point(),2,3);

		Shape[] shapes = {c,r};

		for (Shape sh : shapes){
			System.out.println(sh);
		}


	}

}
