//Thread Using Thread class
class MyThread extends Thread{
    public void run(){
        for (int i = 0; i <= 10 ; i++) {
            System.out.println("Value of i: "+i);
        try {
Thread.sleep(300);
        } catch (java.lang.Exception e) {
            System.out.println("Caught exception "+e);
        }
        }
    }
}

//Thread Using Runnable interface
class MyThread1 implements Runnable{
    public void run(){
        for (int j = 0; j <=10 ; j++) {
                System.out.println("Value of j:\t\t "+j);
        try {
            Thread.sleep(1000);
        } catch (java.lang.Exception e) {
            System.out.println("Caught exception "+e);
            }

        }
    }
}


public class MultiThreadApp {
    public static void main(String[] args) {

        MyThread t1=new MyThread();
        MyThread1 t2=new MyThread1();
        Thread thread=new Thread(t2);

        t1.start();
        thread.start();
    }
}
