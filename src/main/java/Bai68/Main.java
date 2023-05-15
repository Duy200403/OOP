package Bai68;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(1, 2, 3, 4);
        point.moveUp();
        point.moveLeft();
        System.out.println(point);

        MovableCircle circle = new MovableCircle(0, 0, 1, 1, 5);
        circle.moveRight();
        circle.moveDown();
        System.out.println(circle);
    }
}
