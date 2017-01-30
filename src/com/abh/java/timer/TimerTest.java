package com.abh.java.timer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer("PruningTimer", true);
        MyTimerTask task = new MyTimerTask();
        timer.scheduleAtFixedRate(task, 1000, 3000);
        Thread.sleep(10000);
    }

}

class MyTimerTask extends TimerTask {

    @Override
    public void run() {
        System.out.println(new Date() + "Running  the pruning job");

    }

}
