class CountDigits{
    public static void main(String args[]){
        int num = 12345;
        int lastDigit = 0;
        int Reversed = 0;

        while (num > 0){
            lastDigit = num % 10;
            Reversed = Reversed * 10 + lastDigit;
            num /= 10;
        }
          
          System.out.println(Reversed);
        }
    }

