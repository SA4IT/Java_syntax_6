package ru.moscow.mirea.kvbo0121.korenev.practic6_2;

public interface Movable {
    class MovablePoint{
        protected int x1;
        protected int y1;
        protected int x2;
        protected int y2;
        protected int xSpeed;
        protected int ySpeed;

        public MovablePoint(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }
    }
}
