class MaxNumArray{
    static int findMax(int[] arr){
        int max = arr[0];
        for (int array : arr){
            if (array > max){
                max = array;
            }
        }
        return max;
    }

    static int findMin(int[] arr){
        int min = arr[0];
        for (int array : arr){
            if (array < min){
                min = array;
            }
        }
        return min;
    }

    public static void main(String args[]){

        int[] arr = {44,92,33,78,56};
        System.out.println("Given array: ");
        for (int elements : arr){
            System.out.print(" " + elements);
        }
        
        System.out.println();
        System.out.println();


        int resultMax = findMax(arr);

        System.out.println("->Maximum Element of the array: " + resultMax);

        System.out.println();

        int resultMin = findMin(arr);

        System.out.println("->Maximum Element of the array: " + resultMin);

    }
}