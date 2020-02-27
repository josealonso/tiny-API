package com.tinyApi.utils;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutePeriodically implements Runnable {
 
    public void run() {
        System.out.print("\007");
    }
 
    public static void main(String[] args) {
        ScheduledExecutorService scheduler
                            = Executors.newSingleThreadScheduledExecutor();
 
        Runnable task = new ExecutePeriodically();
        int initialDelay = 0;
        int periodicDelay = 30;
 
        scheduler.scheduleAtFixedRate(task, initialDelay, periodicDelay,
                                                        TimeUnit.SECONDS);
    }
}
