class SwitchCalc{
    public static void main(String args[]){
         int $num1 = 30;
         int $num2 = 15;

         System.out.println("Input Number 1: "+$num1);
         System.out.println("Input Number 2: "+$num2);

         System.out.println("***MENU***");
         System.out.println("1 - Addtion");
         System.out.println("2 - Subtraction");
         System.out.println("3 - Multiplication");
         System.out.println("4 - Division");
         System.out.println("5 - Modulous");


        int $operation = 4;
            
            switch($operation)
            {
                case 1 -> System.out.println("User Choose Addition.");
                case 2 -> System.out.println("User Choose Subtraction.");
                case 3 -> System.out.println("User Choose Multiplication.");
                case 4 -> System.out.println("User Choose Division.");
                case 5 -> System.out.println("User Choose Modulus");
                default -> System.out.println("Invalid Choice.");
            }

        

        switch($operation)
        {
            case 1 -> System.out.println("Sum of " +$num1+ " and " +$num2+ " is: " +($num1+$num2));
             case 2 -> System.out.println("Diffrence of " +$num1+ " and " +$num2+ " is: " +($num1-$num2));
              case 3 -> System.out.println("Product of " +$num1+ " and " +$num2+ " is: " +($num1*$num2));
               case 4 -> System.out.println("Quotient of " +$num1+ " and " +$num2+ " is: " +($num1/$num2));
                case 5 -> System.out.println("Remainder of " +$num1+ " and " +$num2+ " is: " +($num1%$num2));
        }
    }
}