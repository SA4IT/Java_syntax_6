package ru.moscow.mirea.kvbo0121.korenev.practic6_1;

public interface Movable {
    abstract public void moveUp();
    abstract public void moveDown();
    abstract public void moveLeft();
    abstract public void moveRight();


    class MovablePoint implements Movable{
        protected int x;
        protected int y;
        protected int xSpeed;
        protected int ySpeed;


        public MovablePoint(int temp_x, int temp_y, int temp_xSpeed , int temp_ySpeed ){
            this.x = temp_x;
            this.y = temp_y;
            this.xSpeed = temp_xSpeed;
            this.ySpeed = temp_ySpeed;

        }

        @Override
        public void moveUp() {
            System.out.println("Overridde method moveUp() in MovablePoint");
        }
        @Override
        public void moveDown() {
            System.out.println("Overridde method moveDown() in MovablePoint");
        }
        @Override
        public void moveLeft() {
            System.out.println("Overridde method moveLeft() in MovablePoint");
        }
        @Override
        public void moveRight() {
            System.out.println("Overridde method moveRight() in MovablePoint");
        }
    }



    class MovableCircle implements Movable{


        @Override
        public void moveUp() {
            System.out.println("Overridde method moveUp() in MovableCircle");
        }
        @Override
        public void moveDown() {
            System.out.println("Overridde method moveDown() in MovableCircle");
        }
        @Override
        public void moveLeft() {
            System.out.println("Overridde method moveLeft() in MovableCircle");
        }
        @Override
        public void moveRight() {
            System.out.println("Overridde method moveRight() in MovableCircle");
        }
    }

}
