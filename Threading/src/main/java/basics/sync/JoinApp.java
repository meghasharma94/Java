package basics.sync;

/***
 * This class shows inter thread synchronization mechanism ; usage of Join
 *
 * */
public class JoinApp {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the process");
        XPrinter p = new XPrinter();

        // multiple threads working on same Printer Object
        Thread1 t1 = new Thread1(p);
        Thread2 t2 = new Thread2(p);

        t1.start();
        t1.join(); // synchronization comes into play. It says wait for this thread to complete
        t2.start();

        System.out.println("Finishing the process");


    }
}

class Thread1 extends Thread {

    XPrinter pRef;

    Thread1(XPrinter p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "MeghaProfile.pdf");
    }
}


class Thread2 extends Thread {

    XPrinter pRef;

    Thread2(XPrinter p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "SunnyProfile.pdf");
    }
}


class XPrinter {

    void printDocument(int numberOfCopies, String docName) {
        for (int i = 0; i <= numberOfCopies; i++) {
            System.out.println(">> Printing " + docName + " " + i);
        }
    }

}