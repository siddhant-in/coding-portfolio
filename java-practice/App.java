// Java Program to Illustrate volatile keyword

// import java.util.*;

// // Class 1
// class Geeks extends Thread {
//     boolean running = true;

//     @Override
//     public void run() {
//         while (running) {
//             System.out.println("GeeksforGeeks");
//         }
//     }

//     public void shutDown() {
//         running = false;
//     }
// }

// // Class 2
// class App {

//     // Main driver method
//     public static void main(String[] args) {
//         // Creating object of above class
//         // which is extending Thread class
//         Geeks obj = new Geeks();

//         // start() method invoke run() method
//         obj.start();

//         Scanner input = new Scanner(System.in);

//         input.nextLine();
//         obj.shutDown();
//     }
// }

class MyThread extends Thread {
    volatile boolean running = true;

    public void run() {
        while (running) {
        }
        System.out.println("Stopped!");
    }
}

public class App {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread();
        t.start();

        Thread.sleep(5000);
        t.running = false; // request thread to stop
    }
}
