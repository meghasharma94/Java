package basics.sync;

/***
 * This class shows inter thread synchronization mechanism
 *
 * */
public class SyncApp {

    public static void main(String[] args) {
        System.out.println("Starting the process");
        YPrinter p = new YPrinter();

        // multiple threads working on same Printer Object
        Thread11 t1 = new Thread11(p);
        Thread12 t2 = new Thread12(p);

        t1.start();
        t2.start();

        System.out.println("Finishing the process");


    }
}

class Thread11 extends Thread {

    YPrinter pRef;

    Thread11(YPrinter p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "Thread11Profile.pdf");
    }
}


class Thread12 extends Thread {

    YPrinter pRef;

    Thread12(YPrinter p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "Thread12Profile.pdf");
    }
}


class YPrinter {

     synchronized void printDocument(int numberOfCopies, String docName) {
        for (int i = 0; i <= numberOfCopies; i++) {
            System.out.println(">> Printing " + docName + " " + i);
        }
    }

}