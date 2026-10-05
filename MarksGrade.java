class MarksGrade{
    public static void main(String args[]){

        double $marks = 89;

        if ($marks >= 90 && $marks < 100)
            System.out.println("Grade A.");
        else if ($marks <= 89 && $marks >= 75)
            System.out.println("Grade B.");
        else if ($marks <= 74 && $marks >= 60)
            System.out.println("Grade C.");
        else if ($marks <= 59 && $marks >= 40)
            System.out.println("Grade D.");
        else if ($marks <= 40)
            System.out.println("Failed, Better luck next time.");
        else 
            System.out.println("Enter Valid Marks.");

        
    }
}