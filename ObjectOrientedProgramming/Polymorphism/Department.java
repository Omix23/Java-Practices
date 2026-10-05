package ObjectOrientedProgramming.Polymorphism;

public class Department {

    public void human(){
        System.out.println("Department");
    };

    public static void main(String[] args) {
        Department d = new Department();
        d.human();
        d = new InformationTechnology(); // Upcasting - Parent ref pointing to child object
        ((InformationTechnology)(d)).dataBaseManagement(); // Downcasting - To access specialized method in child class.
        d.human();
        d = new Civil();
        d.human();
        d = new ComputerScience();
        d.human();
        
    }
}
