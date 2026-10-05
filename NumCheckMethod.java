class NumCheckMethod{

     //Method for Even or Odd Number
     static boolean isEven(int n){
        int num = n;
        return num % 2 == 0;
       
    }
     //Armstrong method
     static boolean isArmstrong(int n){
        int num = n;
        int original = n;
        int sum = 0;
        while (num > 0){
            int digit = num % 10;
            int cube = digit * digit * digit;
            sum += cube;
            num /= 10;
        }
         return sum == original;
    }

    //Prime mehtod
    static boolean isPrime(int n){
        int num = n;

        if (num <= 1) return false;

        for (int i = 2; i < num; i++){
            if (num % i == 0)
            return false;
        }
        return true;
    }

    // Palindrome Method
    static boolean isPalindrome(int n) {
    int original = n;
    int reversed = 0;
    
    while (n > 0) {
        reversed = reversed * 10 + n % 10;
        n /= 10;
    }
    
    return original == reversed;
    }

    // Main Method
    public static void main(String args[]){

        int Number = 153;

        boolean input = isEven(Number);
        if (input == true){
            System.out.println(+Number+ " is Even");
        }else{
            System.out.println(+Number+ " is Odd");
        }

        boolean input1 = isArmstrong(Number);
        if (input1 == true){
            System.out.println(+Number+ " is ArmStrong");
        }else{
            System.out.println(+Number+ " is Not Armstrong");
        }

        boolean input2 = isPrime(Number);
        if (input2 == true){
            System.out.println(+Number+ " is Prime");
        }else{
            System.out.println(+Number+ " is Not Prime");
        }

        boolean input3 = isPalindrome(Number);
        if (input3 == true){
            System.out.println(+Number+ " is Palindrome");
        }else{
            System.out.println(+Number+ " is Not Palindrome");
        }
        
        
        
    }
    
    
}