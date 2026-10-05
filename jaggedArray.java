class jaggedArray{
    public static void main(String args[]){

        int[][] jagged = {
            {22,44},
            {23,56,44,34},
            {88,57,35,},
            {56}
        };//Array Created

        for (int i = 0; i < jagged.length; i++){

            System.out.print("Row " + i + " : ");

            for (int j = 0; j < jagged[i].length; j++){
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }

        //Print Specific Element
        System.out.println(jagged[1][2]);
    }
}