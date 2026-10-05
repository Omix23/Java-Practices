class NeonNum {
    public static void main(String args[]){

        int n = 10;
        int square = n * n;
        int sum = 0;
        System.out.println(square);

        while (square > 0){
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        if (sum == n){
            System.out.println("Num is Neon");
        }else{
            System.out.println("NOT neon");
        }
    }
}