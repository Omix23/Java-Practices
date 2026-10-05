package ExceptionHandling;

public class Customer {


    public void male(String name, int age) {

        if (age > 21) {
            System.out.println(name + " is Eligible for marriage.");
        } else {
            try {
                throw new IneligibleForMarriageException(name +" is Not eligible for marriage");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public void female(String name, int age) {
        if (age > 18) {
            System.out.println(name + " is Eligible for marriage.");
        } else {
            try {
                throw new IneligibleForMarriageException(name + " is Not eligible for marriage");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}