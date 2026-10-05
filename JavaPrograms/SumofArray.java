class SumofArray{
    public static void main(String args[]){
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        System.out.println("Given Array");
        for ( int elements : arr){
           System.out.print(" " + elements); 
        }
        System.out.println();
        for (int array : arr){
            sum += array;
        }
        System.out.println("Sum of Array: " + sum);
    }
}