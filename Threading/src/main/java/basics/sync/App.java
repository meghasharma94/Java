package basics.sync;

/***
 * This class depits what happens when we have multiple thread working on same object
 * and the result is the asynchronization in  output
 *
 * */
public class App {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting the process");
        Printer p = new Printer();

        // multiple threads working on same Printer Object
        ThreadOne tOne = new ThreadOne(p);
        ThreadTwo tTwo = new ThreadTwo(p);

        tOne.start();
        tTwo.start();

        System.out.println("Finishing the process");


    }
}

class ThreadOne extends Thread {

    Printer pRef;

    ThreadOne(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "ThreadOneProfile.pdf");
    }
}


class ThreadTwo extends Thread {

    Printer pRef;

    ThreadTwo(Printer p) {
        pRef = p;
    }

    @Override
    public void run() {
        pRef.printDocument(10, "ThreadTwoProfile.pdf");
    }
}


class Printer {

    void printDocument(int numberOfCopies, String docName) {
        for (int i = 0; i <= numberOfCopies; i++) {
            System.out.println(">> Printing " + docName + " " + i);
        }
    }

}