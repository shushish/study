package singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingle {
    
    boolean lock ;
    
    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }
    
    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestSingle lock = new TestSingle();
        lock.setLock(true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                
                public void run() {
                    while (true) {
                    	System.out.print("11");
                        if (!lock.isLock()) {
                            Single singleton = Single.getInstance();
                            instanceSet.add(singleton.toString());
                            //System.out.print("线程开始..."+singleton);
                            break;
                        }
                    }
                }
            });
        }
        Thread.sleep(500);
        lock.setLock(false);
        Thread.sleep(500);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        executorService.shutdown();
    }
}