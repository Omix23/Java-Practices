class MathOperations{

    static int square(int n){
        int result = n * n;
        return result;
    }

    static int cube(int n){
        int result = n * n * n;
        return result;
    }

    static int power(int base, int exp) // base = 2, exp = 5;
    {
        int original = base;

        while (1 < exp)
        {
            base *= original;
            exp--;
        }// I1 : 1 < exp ? YES --> base = 2 * 2 = 4, exp-- = 4;
         // I2 : 1 < exp ? YES --> base = 4 * 2 = 8, exp-- = 3;
         // I3 : 1 < exp ? YES --> base = 8 * 2 = 16, exp-- = 2; 
         // I4 : 1 < exp ? YES --> base = 16 * 2 = 32, exp-- = 1;
         // I1 : 1 < exp ? NO --> EXIT;
        return base;
    }

    static int factorial(int n){
        int fact = 1;
        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }
        return fact;
    }

    static int sum(int n){
        int digit = 0;
        int sum = 0;

        while (n > 0){
            digit = n % 10; // 5
            sum = sum + digit; //5
            n /= 10; //1234
        }//I1 = n > 0 : 12345 > 0 ? YES --> digit = 5, sum = 0 + 5, sum = 5, n /= 10, n = 1234;
         //I2 = n > 0 : 1234 > 0 ? YES --> digit = 4, sum = 5 + 4, sum = 9, n /= 10, n = 123;
         //I3 = n > 0 : 123 > 0 ? YES --> digit = 3, sum = 9 + 3, sum = 12, n /= 10, n = 12;
         //I4 = n > 0 : 12 > 0 ? YES --> digit = 2, sum = 12 + 2, sum = 14, n /= 10, n = 1;
         //I5 = n > 0 : 1 > 0 ? YES --> digit = 1, sum = 14 + 1, sum = 15, n /= 10, n = 0;
         //I6 = n > 0 : 0 > 0 NO --> EXIT
        return sum;
    }

    public static void main(String args[]){

        int number = 5;
        int number1 = 12345;
        int base = 2 , exp = 5;

        int input = square(number);
        System.out.println("Square of " +number+ " is " +input);

        int input2 = cube(number);
        System.out.println("Cube of " +number+ " is " +input2);

        int input3 = power(base,exp);
        System.out.println(+base+ " Power of "+exp+ " is " +input3);

        int input4 = factorial(number);
        System.out.println("Factorial of " +number+ " is " +input4);

        int input5 = sum(number1);
        System.out.println("Sum of digits " +number1+ " is " +input5);


    } 
}