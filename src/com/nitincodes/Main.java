package com.nitincodes;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	/* Write a program to print the area of a rectangle by creating a class
         named 'Area' having two methods. First method named as 'setDim'
         takes length and breadth of rectangle as parameters and the second
         method named as 'getArea' returns the area of the rectangle.
         Length and breadth of rectangle are entered through keyboard.
                                                  _nitin_dailyprob2
	 */
        Scanner sc = new Scanner(System.in);
        Area a1 = new Area();
        a1.setDim(sc.nextInt(), sc.nextInt());
        System.out.println(a1.getArea());
    }
}
class Area{
    int length;
    int breadth;
    int Area;
    void setDim(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    int getArea(){
        Area = (length*breadth);
        return Area;
    }
}
