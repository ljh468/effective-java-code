package org.effective.section02.item14.decimal;

import java.math.BigDecimal;

public class DecimalIsNotCorrect {

    public static void main(String[] args) {
        int i = 1;
        double d = 0.1;
        // double 계산법
        System.out.println(i - d * 9); // 0.1이 나올 것 같지만 -> 0.09999999999999998

        // 정확한 계산이 필요하다면? BigDecimal 써야함
        // BigDecimal 계산법
        BigDecimal bd = BigDecimal.valueOf(0.1);
        System.out.println(BigDecimal.valueOf(1).min(bd.multiply(BigDecimal.valueOf(9)))); // 0.9
    }
}
