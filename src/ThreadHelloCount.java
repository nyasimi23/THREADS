// Listing 2: Using two surbodinate classes that inherit from the Threadshold 


public class ThreadHelloCount {
    public static void main(String [] args){

        HelloThread hello = new HelloThread();
        CountThread count = new CountThread();

        hello.start();
        count.start();

    }
    
}

class HelloThread extends Thread {
    public void run() {
        int pause; // Declare the pause variable here

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Hello!");

                // Initialize and assign a random value to the pause variable
                pause = (int)(Math.random() * 3000);
                sleep(pause);
            } catch (InterruptedException interEx) {
                System.out.println(interEx);
            }
        }
    }
}

class CountThread extends Thread{

    public void run(){
        int pause;

        for(int i = 0; i < 5 ; i++){
            try{
                System.out.println(i);

                // Again, introduce an element of randomness
                pause = (int)(Math.random() * 3000);
                sleep(pause);
            } catch(InterruptedException interEx){
                System.out.println(interEx);
            }
        }
    }
}