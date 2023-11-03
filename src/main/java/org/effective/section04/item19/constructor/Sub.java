package org.effective.section04.item19.constructor;

import java.time.Instant;

// 생성자에서 호출하는 메서드를 재정의했을 때의 문제를 보여준다. (126쪽)
public final class Sub extends Super {
    // 초기화되지 않은 final 필드. 생성자에서 초기화한다.
    private final Instant instant;

    Sub() {
        // 상위객체의 생성자를 호출하게 됨
        // 상위객체에서 overrideMe 메서드가 호출된다면, instant는 null
        super();
        instant = Instant.now();
    }

    // 재정의 가능 메서드. 상위 클래스의 생성자가 호출한다.
    @Override public void overrideMe() {
        System.out.println(instant);
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
