import java.lang.*;

class StringOperations {
    public static void main(String args[]){

        String txt = "           Hello om welcome to the party.   ";
        String txt1 = "Om";
        String txt2 = "Om";

        //Removing whitespace beginning to end in txt String
        System.out.println( "[" + txt + "]");
        System.out.println( "[" + txt.trim() + "]");

        System.out.println();

        //convert txt to upperCase
        System.out.println( txt.toUpperCase()); 

        System.out.println();

        //index of starting specific charatcer & ^abc
        System.out.println(txt.indexOf("lcome"));

        System.out.println();

        //compare strings
        System.out.println(txt1.equals(txt2));
        
        System.out.println();

        //\n used for New line
        String txt3 = "Hello \nWorld";
        System.out.println(txt3);

        System.out.println();

        //\t uded for Tab
        String txt4 = "Hello\tWorld";
        System.out.println(txt4);

        System.out.println();

        //\b used for backspace
        String txt5 = "Hello\b World";
        System.out.println(txt5);

    }
}