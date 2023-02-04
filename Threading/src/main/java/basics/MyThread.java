package basics;

public class MyThread extends Thread{

    @Override
    public void run(){
        System.out.println("Hello , Here I am!! - Thread");
    }

    public static void main (String[] args){
        MyThread object = new MyThread();
        object.start();
    }
}