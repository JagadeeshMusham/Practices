package com.musham.practices.ThreadDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {
    public static void main(String[] args) {
        // Create an ExecutorService with fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the ExecutorService
        for (int i = 1; i <= 5; i++) {
            Runnable task = new MyTask("Task " + i);
            executor.submit(task);
        }

        // Shutdown the ExecutorService when no longer needed
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private final String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Executing " + name + " on thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000); // Simulate some task execution time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " completed.");
    }
}
