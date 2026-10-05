package ObjectOrientedProgramming.Polymorphism;

public class InformationTechnology extends Department{
    @Override
    public void human(){
        System.out.println("Information Technology");
    }

    public void dataBaseManagement(){ //specialized method
        System.out.println("Database.");
    }
}
