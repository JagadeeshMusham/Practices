package com.musham.practices.ThreadDemo;

class NumberPrinter implements Runnable {
    private final int limit;
    private final boolean isEvenNumber;
    private static int number = 1;
    private static final Object lock = new Object();

    public NumberPrinter(int limit, boolean isEvenNumber) {
        this.limit = limit;
        this.isEvenNumber = isEvenNumber;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                // Check if the current number is within the limit
                if (number <= limit) {
                    // Print the number if it matches the required parity
//                    if ((number % 2 == 0 && isEvenNumber) || (number % 2 != 0 && !isEvenNumber)) {
                        System.out.println(Thread.currentThread().getName() + ": " + number);
                        number++;
                        lock.notify(); // Notify the other thread
//                    } else {
                        try {
                            lock.wait(); // Wait for the other thread to print its number
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
//                    }
                } else {
                    break; // Exit the loop if the number exceeds the limit
                }
            }
        }
    }
}

public class PrintSerialNumbers {
    public static void main(String[] args) {
        NumberPrinter oddPrinter = new NumberPrinter(10, false);
        NumberPrinter evenPrinter = new NumberPrinter(10, true);

        Thread oddThread = new Thread(oddPrinter, "OddThread");
        Thread evenThread = new Thread(evenPrinter, "EvenThread");

        oddThread.start();
        evenThread.start();
    }
}

