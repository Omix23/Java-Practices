package ObjectOrientedProgramming;

class Employee{ //POJO Class, JavaBean

    private int id ;
    private String name ;
    private int accPassword;

    public  Employee(int id, String name, int accPassword){
        this.id = id;
        this.name = name;
        this.accPassword = accPassword;

        System.out.println(id);
        System.out.println(name);
        System.out.println(accPassword);
        System.out.println();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getPassword(){
        return accPassword;
    }

    public void setPassword(int accPassword){
        this.accPassword = accPassword;
    }
}
public class  Encapsulation {//Breaking IT standards Creating another class in same class

    public static void main(String a[]) {
        Employee e = new Employee(1,"om",232323);

        e.setId(2);
        e.setPassword(45345);
        e.setName("VedaNT");

        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getPassword());

    }
}
