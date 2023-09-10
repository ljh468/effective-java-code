package org.effective.section02.item07.executor;

import java.util.concurrent.*;

public class ExecutorsExample {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    // CPU를 많이 쓰는 작업이라면, CPU 개수만큼 쓰레드를 만듬
    // IO를 많이 쓰는 작업이라면, CPU 개수와 상관없이 많은 쓰레드가 필요
    int numberOfCpu = Runtime.getRuntime().availableProcessors();
    System.out.println("numberOfCpu = " + numberOfCpu);

    // 비동기적으로 별도의 쓰레드로 처리할 수 있음 (ThreadPool 생성)
    // ExecutorService service = Executors.newCachedThreadPool(); // 자동 쓰레드 생성 (동시성 가능)
    // ExecutorService service = Executors.newFixedThreadPool(10);
    ScheduledExecutorService service = Executors.newScheduledThreadPool(10);

    Future<String> submit = service.submit(new Task());
    System.out.println(Thread.currentThread() + " hello");
    System.out.println(submit.get());

    service.shutdown();
  }

  // Runnable은 리턴값이 없음, 결과를 받고 싶다면 Callable을 사용 (Future를 받음)
  static class Task implements Callable<String> {

    @Override
    public String call() throws Exception {
      Thread.sleep(2000L);
      return Thread.currentThread() + " world";
    }
  }
}