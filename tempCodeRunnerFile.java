import java.lang.*;

class StringOperations {
    public static void main(String args[]){

        String txt = "           Hello om welcome to the party.   ";
        String txt1 = "Om";
        String txt2 = "Om";

        //Removing whitespace beginning to end in txt String
        System.out.println( "[" + txt + "]");
        System.out.println( "[" + txt.trim() + "]");

        //convert txt to upperCase
        System.out.println( txt.toUpperCase()); 

        //index of to
        System.out.println(txt.indexOf("p"));

        //compare strings
        System.out.println(txt1.equals(txt2));


        String txt3 = "Hello \nWorld";
         System.out.println(txt3); 


        
    }
}