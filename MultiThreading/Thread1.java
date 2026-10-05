package MultiThreading;

public class Thread1 extends Thread{
       int counter = 10;
       public void run(){
           for(int i = 1; i < 10; i++ ) {
               System.out.println("Thread1 is Currently at " + i);
                  if(i == 5){
                      System.out.println("Checkpoint");
                  }
           }

       }


}
