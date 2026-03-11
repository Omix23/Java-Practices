class BmiCalc {
    public static void main(String args[]){
        double weight = 56.70;
        double height = 1.683;
          System.out.println("Weight of person: " +weight);
          System.out.println("Height of person: " +height);
        
        double bmi = weight / (height * height);

        if (bmi <= 18.5)
            System.out.println("Underweight");
        else if (bmi <= 24.9)
            System.out.println("Normal");
        else if (bmi <= 29.9)
            System.out.println("Overweight");
        else
            System.out.println("Obese");

    }
}