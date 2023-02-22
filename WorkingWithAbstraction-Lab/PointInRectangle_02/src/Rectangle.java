public class Rectangle {
    private Point bottomLeft;
    private Point topRight;

    public Rectangle(Point bottomLeft, Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean contains(Point point) {
        if (bottomLeft.getCoordinatesX() <= point.getCoordinatesX() && point.getCoordinatesX() <= this.topRight.getCoordinatesX()) {
            if (bottomLeft.getCoordinatesY() <= point.getCoordinatesY() && point.getCoordinatesY() <= this.topRight.getCoordinatesY()) {
                return true;
            }
        }
        return false;
    }
}
