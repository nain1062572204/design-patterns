package com.wang;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * @author 王念
 * @create 2019-11-08 15:05
 */
public class CallableTest {
    static class TaskWithResult implements Callable<String> {
        private int id;

        public TaskWithResult(int id) {
            this.id = id;
        }

        public String call() throws Exception {
            System.out.println(Thread.currentThread().getPriority());
            return "result of task " + id;
        }
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<String>> results = new ArrayList<Future<String>>();
        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(new TaskWithResult(i)));
        }
        for (Future<String> result : results) {
            System.out.println(result.get());
        }
        executorService.shutdown();
        executorService.shutdown();
    }
}
