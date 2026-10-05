class Student {
    String name;
    int age;
    double marks;

     public void displayInfo(){
        System.out.println("Name of Student: " +name);
        System.out.println("Age of student: " +age);
        System.out.println("Makrs of student: " +marks+ " %");
        System.out.println();
    }

    public static void main(String args[]){

        Student s1 = new Student();
        s1.name = "Om";
        s1.age = 20;
        s1.marks = 90.31;

        Student s2 = new Student();
        s2.name = "Vedant";
        s2.age = 23;
        s2.marks = 92.31;

        

        s1.displayInfo();
        s2.displayInfo(); 

    }

    boolean equalsIgnoreCase(String searchName) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}