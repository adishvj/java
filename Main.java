package com.company;
class sum
{
    int c;
   void calculatesum(int a,int b)
    {

        c=a+b;
    }
     void display()
    {

        System.out.println("sum is"+c);
    }
}
public class Main
{
    public static void main(String[] args)
    {
        sum ob1=new sum();
        sum ob2=new sum();

        ob1.calculatesum(5,6);
        ob1.display();
        ob2.calculatesum(6,4);
        ob2.display();


    }
}