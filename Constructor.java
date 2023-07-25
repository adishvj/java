package com.company;

 class Constructor {
    static int a=5;
    public static void main(String[] args)
    {
        Constructor ob1=new Constructor();
        Constructor ob2=new Constructor();
        ob1.a=6;
        ob2.a=7;
        System.out.println(a);
    }
}
