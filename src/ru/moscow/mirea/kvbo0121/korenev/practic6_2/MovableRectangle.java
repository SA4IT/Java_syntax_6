package ru.moscow.mirea.kvbo0121.korenev.practic6_2;

public class MovableRectangle extends Movable.MovablePoint {
    private Movable.MovablePoint topLeft;
    private Movable.MovablePoint bottomRight;


    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed, Movable.MovablePoint topLeft, Movable.MovablePoint bottomRight) {
        super(x1, y1, x2, y2, xSpeed, ySpeed);
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }
    void moveUp1(){
        System.out.println("method moveUp()");};
    void moveDown1(){
        System.out.println("method moveDown()");};
    void moveLeft1(){
        System.out.println("method moveLeft()");
    };
    void moveRight1(){
        System.out.println("method moveRight()");
    };

}
