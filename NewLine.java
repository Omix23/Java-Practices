class NewLine {
    public static void main(String args[]){

        int input = 999999;
        int rev = 0;

        while ( input > 0 ){

            int digit = input % 10;
            rev = rev * 10 + digit;
            input /= 10; // Iteration 1 : input = 12345, rev = 0, input >  0? YES -->  digit = 5, rev = 5, input = 1234;
                         // Iteration 2 : input = 1234, rev = 5, input >  0?  YES --> digit =  4, rev = 54, input = 123;
                         // Iteration 3 : input = 123, rev = 54, input >  0? YES --> digit = 3, rev = 543, input = 12;
                         // Iteration 4 : input = 12, rev = 543, input >  0? YES --> digit = 2, rev = 5432, input = 1;
                         // Iteration 5 : input = 1, rev 5432, input > 0? YES --> digit = 1, rev = 54321, input = 0;
                         // Iteration 6 : input = 0, rev 54321, input > 0? NO --> EXIT

        }
        while(rev > 0){

            int digit = rev % 10;
            System.out.println(digit);
            rev /= 10;   // Iteration 1 : rev = 54321, rev >  0 ? YES -->  digit = 1, print new line : 1 , rev = 5432;
                         // Iteration 2 : rev = 5432, rev >  0 ? YES -->  digit = 2, print new line : 2 , rev = 543;
                         // Iteration 3 : rev = 543, rev >  0 ? YES -->  digit = 3, print new line : 3, rev = 54;
                         // Iteration 4 : rev = 54, rev >  0 ? YES -->  digit = 4, print new line : 4, rev = 5;
                         // Iteration 5 : rev = 5, rev >  0 ? YES -->  digit = 5, print new line : 5, rev = 0;
                         // Iteration 6 : rev = 0, rev > 0 ? NO --> EXIT
        }

        

        

    }
}