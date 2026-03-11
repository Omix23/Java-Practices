class Students{
    String name;
    int roll;
    double marks;

    Students(String name, int roll, double marks){
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    void displayInfo(){
        
        System.out.println("--- Student ---"); 
        System.out.println("Name: " +name);
        System.out.println("Roll No.: " +roll);
        System.out.println("Marks : " +marks);
        System.out.println();
    }

    // boolean hasName(String inputName){
    //     return name.equalsIgnoreCase(inputName);
    // }

    boolean hasRoll(int inputRoll){
        return inputRoll == roll;
    }

}

class StudentManagement{
    public static void main(String args[]){
         
        Students[] students = new Students[5];

        students [0] = new Students("Om",101,98.96); //Student 1
        students [1] = new Students("Vedant",102,89.96); // Student 2
        students [2] = new Students("Viraj",103,45.96); // Student 3
        students [3] = new Students("Chirag",104,34.96); // Student 4
        students [4] = new Students("Ron",105,77.96); // Student 5

        //Display All Students

        for (int i = 0; i < students.length; i++){
            students[i].displayInfo();
        }

        //Find by name

        System.out.println("---FIND BY NAME---");
        String inputName = "om";
        for (int i = 0; i < students.length ; i++){
                if (students[i].name.equalsIgnoreCase(inputName)){
                    students[i].displayInfo();
                }
        }


        // //Find by Roll number

        System.out.println("---FIND BY ROLLNO---");
        int inputRoll = 103;
        for (int i = 0; i < students.length ; i++){
                if (students[i].roll == inputRoll){
                    students[i].displayInfo();
                }
        }


        //Topper of the Class
        System.out.println("---Topper---");
        Students topper = students[0];
        for(int i = 1; i < students.length; i++){
            if (topper.marks < students[i].marks){
                topper = students[i];
            }
        }
        topper.displayInfo();
       

        //Average of students

        double total = 0;
        for (int i = 0; i < students.length; i++){
             total += students[i].marks;
        }
        double average =  total / students.length;
        
        System.out.println("Average Marks of Students: " +average);
        System.out.println();

        // //Lowest of the class

        // System.out.println("--Lowest of the class--");
        // Students lowest = s1;
        // if (s2.marks < lowest.marks) lowest = s2;
        // if (s3.marks < lowest.marks) lowest = s3;
        // if (s4.marks < lowest.marks) lowest = s4;
        // if (s5.marks < lowest.marks) lowest = s5;
        // lowest.displayInfo();

        // //Pass/Fails Stats

        // int passingMarks = 35;
        // System.out.println("---Pass/Fails Stats---");
        // System.out.println("Passing marks: " +passingMarks);
        // if (s1.marks > passingMarks){
        //     System.out.println(s1.name+": Passed");
        // }else{
        //     System.out.println(s1.name+ ": Fail");
        // }
         
        // if (s2.marks > passingMarks){
        //     System.out.println(s2.name+": Passed");
        // }else{
        //     System.out.println(s2.name+": Fail");
        // }
        
        // if (s3.marks > passingMarks){
        //     System.out.println(s3.name+": Passed");
        // }else{
        //     System.out.println(s3.name+": Fail");
        // }
         
        // if (s4.marks > passingMarks){
        //     System.out.println(s4.name+": Passed");
        // }else{
        //     System.out.println(s4.name+": Fail");
        // }
         
        // if (s5.marks > passingMarks){
        //     System.out.println(s5.name+": Passed");
        // }else{
        //     System.out.println(s5.name+": Fail");
        // }
        // System.out.println();
        
        // //Grade System (A+, A, B, C)
        // System.out.println("---Grade System---");

        // //Student 1
        // if (s1.marks > 95) {
        //     System.out.println("Grade for "+s1.name + "(" +s1.marks+ "%)" + (": A+ "));
        // }else if ( s1.marks > 90){
        //     System.out.println("Grade for "+s1.name + "(" +s1.marks+ "%)" + (": A "));
        // }else if (s1.marks > 80){
        //     System.out.println("Grade for "+s1.name + "(" +s1.marks+ "%)" + (": B "));
        // }else if (s1.marks > 70){
        //     System.out.println("Grade for "+s1.name + "(" +s1.marks+ "%)" + (": C "));
        // }else{
        //     System.out.println("Fail");
        // }


        // //Student 2
        //  if (s2.marks > 95) {
        //     System.out.println("Grade for "+s2.name + "(" +s2.marks+ "%)" + (": A+ "));
        // }else if ( s2.marks > 90){
        //     System.out.println("Grade for "+s2.name + "(" +s2.marks+ "%)" + (": A "));
        // }else if (s2.marks > 80){
        //     System.out.println("Grade for "+s2.name + "(" +s2.marks+ "%)" + (": B "));
        // }else if (s2.marks > 70){
        //     System.out.println("Grade for "+s2.name + "(" +s2.marks+ "%)" + (": C "));
        // }else{
        //     System.out.println("Fail");
        // }


        //  //Student 3
        //  if (s3.marks > 95) {
        //     System.out.println("Grade for "+s3.name + "(" +s3.marks+ "%)" + (": A+ "));
        // }else if ( s3.marks > 90){
        //     System.out.println("Grade for "+s3.name + "(" +s3.marks+ "%)" + (": A "));
        // }else if (s3.marks > 80){
        //     System.out.println("Grade for "+s3.name + "(" +s3.marks+ "%)" + (": B "));
        // }else if (s3.marks > 70){
        //     System.out.println("Grade for "+s3.name + "(" +s3.marks+ "%)" + (": C "));
        // }else{
        //     System.out.println("Fail");
        // }


        //  //Student 4
        //  if (s4.marks > 95) {
        //     System.out.println("Grade for "+s4.name + "(" +s4.marks+ "%)" + (": A+ "));
        // }else if ( s4.marks > 90){
        //     System.out.println("Grade for "+s4.name + "(" +s4.marks+ "%)" + (": A "));
        // }else if (s4.marks > 80){
        //     System.out.println("Grade for "+s4.name + "(" +s4.marks+ "%)" + (": B "));
        // }else if (s4.marks > 70){
        //     System.out.println("Grade for "+s4.name + "(" +s4.marks+ "%)" + (": C "));
        // }else{
        //     System.out.println("Fail");
        // }


        //  //Student 5
        //  if (s5.marks > 95) {
        //     System.out.println("Grade for "+s5.name + "(" +s5.marks+ "%)" + (": A+ "));
        // }else if (s5.marks > 90){
        //     System.out.println("Grade for "+s5.name + "(" +s5.marks+ "%)" + (": A "));
        // }else if (s5.marks > 80){
        //     System.out.println("Grade for "+s5.name + "(" +s5.marks+ "%)" + (": B "));
        // }else if (s5.marks > 70){
        //     System.out.println("Grade for "+s5.name + "(" +s5.marks+ "%)" + (": C "));
        // }else{
        //     System.out.println("Fail");
        // }



        }
    }

