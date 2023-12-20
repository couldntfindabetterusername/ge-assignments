class Point {
    public int x;
    public int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Point otherPoint) {
        if (this == otherPoint) {
            return true;
        }

        return this.x == otherPoint.x && this.y == otherPoint.y;
    }
}