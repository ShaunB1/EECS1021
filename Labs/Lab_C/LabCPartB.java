package Lab_C;

import java.util.Timer;
import java.util.TimerTask;

public class LabCPartB {
    public static void main(String[] args){
        Timer myTimer = new Timer();
        TimerTask myTask = new TimerTask(){
            int counter = 0;
            @Override
            public void run(){
                counter++;
                System.out.println("Current Time (ms) " + System.currentTimeMillis() + "\tNumber of Iterations: " + counter);
            }
        };
        myTimer.schedule(myTask, 1000, 1000);
    }
}
