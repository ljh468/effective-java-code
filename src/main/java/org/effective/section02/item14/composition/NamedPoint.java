package org.effective.section02.item14.composition;

public class NamedPoint implements Comparable<NamedPoint> {

    // equals 규약이 깨지지 않도록 컴포지션을 사용하는 것처럼 compareTo도 컴포지션을 통해 재정의
    private final Point point;
    private final String name;

    public NamedPoint(Point point, String name) {
        this.point = point;
        this.name = name;
    }

    // Point view를 제공
    public Point getPoint() {
        return this.point;
    }

    @Override
    public int compareTo(NamedPoint namedPoint) {
        int result = this.point.compareTo(namedPoint.point);
        if (result == 0) {
            result = this.name.compareTo(namedPoint.name);
        }
        return result;
    }
}
