package ru.moscow.mirea.kvbo0121.korenev.practic6_1;

public class MovableCircle extends Movable.MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int temp_x, int temp_y, int temp_xSpeed, int temp_ySpeed, int radius) {
        super(temp_x, temp_y, temp_xSpeed, temp_ySpeed);
        this.radius = radius;
    }
}
