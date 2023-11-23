package be.abis.shapes.test;

import be.abis.shapes.model.*;
import be.abis.shapes.model.Point;
import be.abis.shapes.model.Rectangle;
import be.abis.shapes.model.Shape;

public class Client {

	public static void main(String[] args)  {
		
		Point p = new Point();

		Circle c = new Circle("red",p,2);
		Rectangle r = new Rectangle("blue",new Point(),2,3);
		Square s = new Square("yellow",new Point(),5.6);
		Triangle t = new Triangle("orange",new Point(),5,8);

		Shape[] shapes = {c,r,s,t};

		for (Shape sh : shapes){
			System.out.println(sh);
		}


	}

}
