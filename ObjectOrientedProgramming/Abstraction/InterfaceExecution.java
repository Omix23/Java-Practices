package ObjectOrientedProgramming.Abstraction;

public class InterfaceExecution implements Itr1,Itr2 {
    @Override
    public void show() {
        System.out.println("Interface 1");
    }

    @Override
    public void show1() {
        System.out.println("Interface 2");
    }
}
