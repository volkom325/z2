package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int t = scan.nextInt();
	point first = new point("первая точка",0,0,5);
    point second = new point("вторая точка",1,1,2);
    first.xcord = first.xcord + first.speed*t;
    first.ycord = first.ycord + first.speed*t;
    second.xcord = second.xcord + second.speed*t;
    System.out.println(first.name+" " +first.speed+" "+first.xcord+" "+first.ycord+ " " + t);
    System.out.println(second.name+" " +second.speed+" "+second.xcord+" "+second.ycord+ " " + t);
    System.out.println("\n");
    System.out.println("Расстояние между точками: ("+Math.abs(first.xcord - second.xcord)+";"+Math.abs(first.ycord- second.ycord)+")");
    }
}
class point {
 String name;
  int xcord;
   int ycord;
 int speed;
    point(String q, int x, int y, int v){
        name =  q;
        xcord = x;
        ycord = y;
        speed = v;
    }
}
