class NumberGuess{
    public static void main(String args[]){
        int $secNum = 10;

        int $userInput = 7;

        if ($userInput > $secNum)
            System.out.println("Too high.");
        else if ($userInput < $secNum)
            System.out.println("Too Low.");
        else
            System.out.println("Correct");
    }
}