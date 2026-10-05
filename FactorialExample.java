class FactorialExample {
    public static void main(String args[]){

        int n = 5;
        int fact = 1;

        for (int i = n ; i >= 1; i--)
        { 
            fact *= i; // Iteration 1 : fact = fact * i, fact = 1 * 5, fact = 5; now fact = 5 & i = 4;
                        // Iteration 2 : fact = fact * i, fact = 5 * 4, fact = 20; now fact = 20  & i = 3;
                        // Iteration 3 : fact = fact * i, fact = 20 * 3, fact = 5; now fact = 60 & i = 2;
                        // Iteration 4 : fact = fact * i, fact = 60 * 2, fact = 5; now fact = 120 & i = 1;
                        // Iteration 5 : fact = fact * i, fact = 120 * 1, fact = 5; now fact = 120 & i = 0; // i >= 1 ? false EXIT
        }
             System.out.println("Factorial of " +n+ " : " +fact);  
    }
}