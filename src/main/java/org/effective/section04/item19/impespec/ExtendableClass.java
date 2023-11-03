package org.effective.section04.item19.impespec;

/**
 * Example class for java documentation for extendable class
 */
public class ExtendableClass {

    /**
     * This method can be overridden to print any message.
     *
     * @implSpec
     * Please use System.out.println().
     */
    protected void doSomething() {
        // 동작 중간에 끼어들 수 있는 훅
        System.out.println("hello");
    }
}
