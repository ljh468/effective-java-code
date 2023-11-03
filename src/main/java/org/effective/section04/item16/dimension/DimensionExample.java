package org.effective.section04.item16.dimension;

import java.awt.*;

public class DimensionExample {

    public static void main(String[] args) {
        Button button = new Button("hello button");
        button.setBounds(0, 0, 20, 10);

        Dimension dimension = button.getSize();
        System.out.println(dimension.height);
        System.out.println(dimension.width);

        Dimension copyDimension = dimensionCopy(dimension);
    }

    // 재사용시 copy (불필요한 성능문제를 야기)
    private static Dimension dimensionCopy(Dimension size) {
        Dimension dimension = new Dimension();
        dimension.height = size.height;
        dimension.width = size.width;
        return dimension;
    }
}

