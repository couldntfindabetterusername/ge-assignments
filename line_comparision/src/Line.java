public class Line {
    private Point start, end;
    public double length;

    Line(Point point1, Point point2) {
        this.start = point1;
        this.end = point2;

        this.length = Math
                .sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    public boolean equals(Line otherLine) {
        if (this == otherLine) {
            return true;
        }

        return this.start.equals(otherLine.start) && this.end.equals(otherLine.end);
    }

    public int compareTo(Line otherLine) {

        return Double.compare(this.length, otherLine.length);
    }
}
