package com.company;

import java.util.*;
class cpu{
    int price;
    class Processor{
        int no_of_cores;
        String manufacter;
        Scanner sc=new Scanner(System.in);
        void addProcessor(){
            System.out.print("Enter no.of cores in processor:");
            no_of_cores = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the manufacter name:");
            manufacter = sc.nextLine();
        }
        void display()
        {
            System.out.println("Number of cores in Processor:"+no_of_cores);
            System.out.println("Processor manufacter name:"+manufacter);
        }
    }
    static class RAM{
        Scanner sc=new Scanner(System.in);
        int memory;
        String manufacter;
        void addRAM(){
            System.out.print("Enter memory size of RAM:");
            memory = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter the manufacter name:");
            manufacter = sc.nextLine();
        }
        void display()
        {
            System.out.println("Memory size of RAM:"+memory+"GB");
            System.out.println("RAM manufacter name:"+manufacter);
        }
    }
    void showCPU(int price){
        System.out.println("\nCPU price:"+price);
    }
}
public class CPUMain
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price of cpu:");
        int price=sc.nextInt();
        cpu c = new cpu();
        cpu.Processor p = c.new Processor();
        cpu.RAM r = new cpu.RAM();
        p.addProcessor();
        r.addRAM();
        c.showCPU(price);
        p.display();
        r.display();
    }
}

