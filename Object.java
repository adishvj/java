package com.company;

class Second {
    public static void method(String a, int b) {
        System.out.println("my name is: " + a + "my age is" + b);
    }
}
 class Object
    {

    public static void main(String[] args) {
        Second ob1 = new Second();
        Second ob2 = new Second();
        ob1.method("adish", 19);
        ob2.method("amaya", 17);
    }}