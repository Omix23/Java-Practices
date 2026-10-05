// Assignment 7: Armstrong Number
// Check if a number is Armstrong number.

// Armstrong: Sum of cubes of digits = number itself
// Example: 153 = 1³ + 5³ + 3³ = 1 + 125 + 27 = 153
// Input: num = 153
// Output: 153 is an Armstrong number

class ArmstrongNum{
    public static void main(String args[]){        
            int n = 153;
            int original = n;
            int sum = 0;
            while (n > 0)
            {
                int digit  = n % 10;
                int cube = digit * digit * digit;
                sum = sum + cube;
                n /= 10;
            }
            if (sum == original){
                System.out.println("Number is armstrong.");
            }else{
                System.out.println("Number is not armstrong.");
            }
            

    }

}