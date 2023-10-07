package org.effective.section02.item14;

import java.math.BigDecimal;

public class CompareToConvention {

    public static void main(String[] args) {
        BigDecimal n1 = BigDecimal.valueOf(23134134);
        BigDecimal n2 = BigDecimal.valueOf(11231230);
        BigDecimal n3 = BigDecimal.valueOf(53534552);
        BigDecimal n4 = BigDecimal.valueOf(11231230);

        // p88, 반사성
        // A.equals(A) = A.equals(A)
        System.out.println(n1.compareTo(n1)); // n1 == n1 = 0

        // p88, 대칭성
        // A.equals(B) = B.equals(A)
        System.out.println(n1.compareTo(n2)); // n1 > n2 = 양수 (+1)
        System.out.println(n2.compareTo(n1)); // n2 < n1 = 음수 (-1)

        // p89, 추이성
        // A.equals(B), B.equals(C) = A.equals(C)
        System.out.println(n3.compareTo(n1) > 0); // true
        System.out.println(n1.compareTo(n2) > 0); // true
        System.out.println(n3.compareTo(n2) > 0); // true

        // p89, 일관성
        // A, B가 같을때 A > C 라면, B > C
        System.out.println(n4.compareTo(n2)); // 0
        System.out.println(n2.compareTo(n1)); // -1
        System.out.println(n4.compareTo(n1)); // -1

        // p89, compareTo가 0이라면 equals는 true여야 한다. (아닐 수도 있고..)
        // equals는 .0과 .00을 같다고 보지 않음
        BigDecimal oneZero = new BigDecimal("1.0");
        BigDecimal oneZeroZero = new BigDecimal("1.00");
        System.out.println(oneZero.compareTo(oneZeroZero)); // ture, Tree, TreeMap
        System.out.println(oneZero.equals(oneZeroZero)); // false, 순서가 없는 콜렉션
    }
}
