class MultiArray{
    public static void main(String args[]){
        int [][] _2darray = {
          //  j0   j1   j2   j3   j4
            { 20 , 60 , 70 , 80 , 56 },//i0
            { 55 , 84 , 93 , 23 , 63 },//i1
            { 78 , 12 , 33 , 20 , 44 } //i2
        };

        //Printing all elements matrix form
        System.out.println("=====ARRAY ELEMENTS=====");
        for (int i = 0; i < _2darray.length; i++)//Rows
        {
                for (int j = 0; j < _2darray[i].length; j++)//Columns
                {
                   System.out.print(_2darray[i][j] + " ");  
                }
            System.out.println();
            
        }

        System.out.println();
         
        // Finding Maximum element
         System.out.println("=====MAXIMUM ELEMENT=====");
        int maxElement = _2darray[0][0];

        for (int i = 0; i < _2darray.length; i++)//Rows
            
        {
                for (int j = 0; j < _2darray[i].length; j++)//Columns

                {

                    if (maxElement < _2darray[i][j]){
                        maxElement = _2darray[i][j];
                    }
                    
                }

            
        }
        System.out.println("Max: " + maxElement);

        System.out.println();

        //SUM
        System.out.println("=====SUM OF ALL ELEMENTs=====");
        int sum = 0;

        for (int i = 0; i < _2darray.length; i++)//Rows
            
        {
                for (int j = 0; j < _2darray[i].length; j++)//Columns

                {

                   sum += _2darray[i][j];
                    
                }

            
        }
        System.out.println("Sum: "+sum);

        System.out.println();


        //Sum of Rows
        System.out.println("=====SUM OF ROWS=====");


        for (int i = 0; i < _2darray.length; i++)//Rows
            
        {
            int rowSum = 0;

                for (int j = 0; j < _2darray[i].length; j++)//Columns

                {

                    rowSum += _2darray[i][j];
                    
                }

           System.out.println("Row "+i+" Sum: " + rowSum); 
        }
        
        


    }
}