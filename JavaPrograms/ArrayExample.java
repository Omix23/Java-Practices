class ArrayExample{
    public static void main(String args[]){

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        //Manually Printing
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        System.out.println();
        
        System.out.println("Length of Numbers: " + numbers.length);

        System.out.println();


        //Print with loops
        for (int i = 0; i < numbers.length; i++){
            System.out.println("INDEX " +i+ ": " + numbers[i]);
        }

        // Sum of elements
        int[] arrayInput = {10,20,30,40,50};
        int sum = 0;

        for (int i = 0; i < arrayInput.length; i++){
            sum += arrayInput[i];
        }

        System.out.println(sum);

        //Maximum Number
        int[] arrayInput1 = {10,20,30,60,50};
        int max = arrayInput1[0];
        System.out.println("--Max Number--");
        for (int i = 0; i < arrayInput1.length; i++){
                if (max < arrayInput1[i]){
                    max = arrayInput1[i];
                }
                
        }
        System.out.println(max);
        //Even Numbers
        int[] arrayNumbers = {12, 7, 18, 5, 20, 9};

        int evenNums = 0;

        System.out.println("Array Elements");
        for (int i = 0; i < arrayNumbers.length; i++){
                System.out.println(arrayNumbers[i]);
        }

        System.out.println("Even Numbers of array");

        for (int i = 0; i < arrayNumbers.length; i++){
            if (arrayNumbers[i] %2 == 0){
                evenNums = arrayNumbers[i];
                System.out.println(evenNums);
            }
        }


    }
}