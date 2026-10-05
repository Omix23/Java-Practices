package ObjectOrientedProgramming;

import java.util.Scanner;

class A
{
    A()
    {
        System.out.println("This is constructor.");
    }
    A(int x){
        System.out.println(x);
    }

    private int x,y;
//     abstract void show();
     public int add(int x,int y){

         this.x = x;
         this.y = y;
         int sum = x + y;
         return sum;
     }
     void show1(){
         System.out.println("Used by super in A");
     }

     void overrideExample(){
         System.out.println("Overriden Method in A");
     }

//     void show3(){
//         System.out.println(this.add(10,50));
//     }

}

 class B extends A //Single Inheritance (B is a Parent class for C and Child class for A)
{

    private int x,y;
    void show2(){
        System.out.println("Used by this.");
    }

    void show(){
//       System.out.println(super.add(this.x,this.y));

        System.out.println("in abstract");
        super.show1();
        this.show2();
    }

    void getterValues(int x,int y){
         super.add(this.x,this.y);
    }

    void overrideExample(){
        super.overrideExample();
        System.out.println("overriden method in B");
    }

}

class C extends B //Multilevel Inheritance
{

}


public class InheritanceExample {
    public static void main(String a[]){
        int x, y;
        Scanner sc = new Scanner(System.in);
        B obj = new B();
        System.out.println("Enter Two Elements: ");
        int sum = obj.add(x = sc.nextInt(), y = sc.nextInt());
        System.out.println("Sum of Elements : " + sum);
        obj.show();
        obj.overrideExample();



    }
}
