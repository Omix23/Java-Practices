class GradeCalc {
    public static void main(String args[]){

        int $temp = 6;
      
        if ($temp > 40)
            System.out.println("Heat Warning");
        else if ($temp < 5) 
            System.out.println("Cold Warning");
        else if ($temp >= 20 && $temp <= 30)
            System.out.println("The weather is good");
        else if ($temp > 30 && $temp <= 40)
            System.out.println("The weather is hot");
        else if ($temp >= 5 && $temp < 20)
            System.out.println("The weather is cold");
    }
}
