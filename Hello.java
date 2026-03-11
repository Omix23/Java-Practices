public class Hello {
    public static void main(String[] args) throws InterruptedException {
        String[] words = {"i", "miss", "you", "vaishnavi"};
        
        for (String word : words) {
            System.out.print(word + " ");
            Thread.sleep(1000);
        }
        System.out.println();
    }
}