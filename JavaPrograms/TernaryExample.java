class TernaryExample {
    public static void main(String args[]){

        int a = 120;

        int score = 0;

        int result = (a > 100) ? ( score += 10) : (score -= 10);
        System.out.println("Score: " +result);
        
    }
}