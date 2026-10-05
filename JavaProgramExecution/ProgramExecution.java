package JavaProgramExecution;

/*------------- 1 -> CLASS LOADS FIRST  ------------*/

public class ProgramExecution {

/*------------- 2 -> All STATIC MEMBERS GOES TO META-SPACE ----------*/
/*
*  static int a = 20
*  static void myStaticMethod()
*
* */

/*------------ 3 -> STATIC BLOCK EXECUTES --------------*/

    static {
        System.out.println("Static block");
    }

/*------------ 4 -> Main() EXECUTES -------------------*/

/*------------ 5 -> OBJECT CREATION (OPTIONAL) --------*/

/*------------ 6 -> NON STATIC BLOCK EXECUTES PER OBJECT CREATION------ */

    {
        System.out.println("Non Static block");
    }

/*------------- 7 -> CONSTRUCTOR EXECUTES PER OBJECT CREATION -------*/

     ProgramExecution(){
         System.out.println("Constructor");
     }

/*--------- ALL NON STATIC MEMBERS READILY ACCESSIBLE ---------*/
     static int a = 20;
     int b = 10;

     static void myStaticMethod(){
         System.out.println("In Static Method");
         System.out.println(a); // can access static data directly in static
         System.out.println(new ProgramExecution().b);// need to create an object bcuz memory is not allocated yet
     }

     void myNonStaticMethod(){
         System.out.println("In Non-Static Method");
         System.out.println(a);
         System.out.println(b);
         // non static allow static & non static both
     }

    public static void main(String a[]) {

         new ProgramExecution();
         ProgramExecution p = new ProgramExecution();
         ProgramExecution.myStaticMethod(); //can access method directly using class name
         p.myNonStaticMethod();
    }
}
