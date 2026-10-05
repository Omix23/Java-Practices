package ExceptionHandling;

public class ExceptionHandlingMain {
    static void main(String[] args) {

        System.out.println("Main start");
        try {
            System.out.println(10 / 0); // created new ArithmeticException();
        }
        catch(ArithmeticException e){ // Specific Exception
            System.out.println(e.getMessage());
        }
        catch(StackOverflowError e){ // Specific Exception
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e ){ // Specific Exception
            System.out.println(e.getMessage());
        }
        catch (Exception e) {// Assigning ref - Exception e = new ArithmeticException(); (upcasted)
            System.out.println(e.getMessage());
        }
        finally{ //finally will executed only if try block is executed

            System.out.println("Finally executed");
        }
        System.out.println("Main end");

    }
}
