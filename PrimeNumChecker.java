class PrimeNumChecker {
    public static void main(String args[]) {
        
        int input = 58;
        boolean isPrime = true;  
        
        for (int i = 2; i < input; i++) {
            if (input % i == 0) {  
                isPrime = false;   
                break;             
            }
        }
        
        // ✅ Check the flag AFTER the loop
        if (isPrime) {
            System.out.println(input + " is Prime");
        } else {
            System.out.println(input + " is Not Prime");
        }
    }
}