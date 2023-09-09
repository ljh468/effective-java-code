package org.effective.section02.item07.stack;

import java.util.Arrays;
import java.util.EmptyStackException;

// 코드 7-1 메모리 누수가 일어나는 위치는 어디인가? (36쪽)
public class Stack {
  private Object[] elements;
  private int size = 0;
  private static final int DEFAULT_INITIAL_CAPACITY = 16;

  public Stack() {
    elements = new Object[DEFAULT_INITIAL_CAPACITY];
  }

  public void push(Object object) {
    ensureCapacity();
    elements[size++] = object;
  }

  // 해당 위치의 배열을 꺼내기만 한다면 메모리 누수가 발생 할 수 있다.
  // public Object pop() {
  //   if (size == 0) {
  //     throw new EmptyStackException();
  //   }
  //   return elements[--size];
  // }

  // 코드 7-2 제대로 구현한 pop 메서드 (37쪽)
  public Object pop() {
    if (size == 0) {
      throw new EmptyStackException();
    }
    Object result = elements[--size];
    elements[size] = null; // 다 쓴 객체 참조 해제 (더이상 참조 X)
    return result;
  }

  /**
   * 원소를 위한 공간을 적어도 하나 이상 확보한다.
   * 배열 크기를 늘려야 할 때마다 대략 두배씩 늘린다.
   */
  private void ensureCapacity() {
    if (elements.length == size) {
      elements = Arrays.copyOf(elements, 2 * size + 1);
    }
  }

  public static void main(String[] args) {
    Stack stack = new Stack();
    for (String arg : args) {
      stack.push(arg);
    }

    while (true) {
      System.err.println(stack.pop());
    }
  }
}
