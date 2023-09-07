package org.effective.section02.item06;

// 코드 6-3 끔찍이 느리다! 객체가 만들어지는 위치를 찾았는가? (34쪽)
public class Sum {
  private static long sum() {
    Long sum = 0L;
    for (long i = 0L; i <= Integer.MAX_VALUE; i++)
      sum += i;
    return sum;
  }

  public static void main(String[] args) {
    long start = System.nanoTime();
    long x = sum();
    long end = System.nanoTime();
    System.out.println((end - start) / 1_000_000. + " ms.");
    System.out.println(x);
  }
}