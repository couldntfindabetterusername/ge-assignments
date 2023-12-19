public class Line {
    private int x1, y1, x2, y2;
    public double length;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

        this.length = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Line otherLine = (Line) obj;

        return this.x1 == otherLine.x1 && this.y1 == otherLine.y1 && this.x2 == otherLine.x2 && this.y2 == otherLine.y2;
    }
}
