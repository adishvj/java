package com.company;
public class product{
    int pcode;
    String pname;
    double price;
    void data(int c, String n, double p){
        this.pcode=c;
        this.pname=n;
        this.price=p;
    }
    void display(){
        System.out.println(this.pcode+"\t\t"+this.pname+"\t\t"+this.price);

    }
    static void findLowest(double price1, double price2, double price3){
        if(price1<=price2 && price1<=price3){
            System.out.println("\nProduct1 is the lowest price");

        }
        else if(price2<=price1 && price2<=price3){
            System.out.println("\nProduct2 is the lowest price");
        }
        else{
            System.out.println("\nProduct3 is the lowest price");
        }
    }
    public static void main(String[] args){
        product obj1 = new product();
        product obj2 = new product();
        product obj3 = new product();
        obj1.data(001,"Product1",1000.50);
        obj2.data(002,"Product2",300.75);
        obj3.data(003,"Product3",4800.50);
        System.out.println("Product Information:\nProduct Code\tProduct Name\tProduct Price");
                obj1.display();
        obj2.display();
        obj3.display();
        findLowest(obj1.price,obj2.price,obj3.price);
    }
}
