package run.second;

public class RaceCondition {
    public static void main(String[] args) throws InterruptedException {

        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable runnable = () -> {

            for (int i = 0; i < 1_000; i++) {
                longWrapper.incrementValue();
            }
        };

//        Thread t = new Thread(runnable);
        Thread[] threads = new Thread[1_000];

        for(int i = 0 ; i < threads.length;i++){
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

//        t.start();
//        t.join();

        for(int i =0; i<threads.length;i++){
            threads[i].join();
        }

        System.out.println("Value = " + longWrapper.getL());


    }
}
