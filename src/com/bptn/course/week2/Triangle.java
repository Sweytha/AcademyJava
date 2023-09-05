package com.bptn.course.week2;


public class Triangle{

	int perimeterCalculator (int a, int b, int c)	{ 
		int perimeter = a + b + c; 
		return perimeter;

	}

	int areaCalculator (int base, int height)	{

		int area = (base * height)/2; 
		return area;

	}

	public static void main (String[]args){

		Triangle object = new Triangle ();

        int a = 7;
        int b = 10;
        int c = 35;

        int perimeter = object.perimeterCalculator(a,b,c);
        int area = object.areaCalculator(7,10);

        System.out.println("Perimeter of the triangle is: " + perimeter + "\nThe Area of the Triangle is: " + area);
    }
}