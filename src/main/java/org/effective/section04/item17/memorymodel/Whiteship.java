package org.effective.section04.item17.memorymodel;

public class Whiteship {

    private final int x;

    private final int y;

    public Whiteship() {
        this.x = 1;
        this.y = 2;
    }

    public static void main(String[] args) {
        // JMM은 메모리 할당이 한쓰레드 안에서 유효한지 아닌지만 보장한다. (이론적인 이야기)
        // 1. Object w = new Whiteship()
        // 2. whiteship = w
        // 3. w.x = 1
        // 4. w.y = 2

        // JMM final 규칙 -> final이 붙은 필드는 초기화가 된 이후에만 다른 쓰레드가 접근할 수 있다.
        Whiteship whiteship = new Whiteship();
    }
}