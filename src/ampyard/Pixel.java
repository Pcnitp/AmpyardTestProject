package ampyard;

public class Pixel {
    /**
     * x and y representing coordinates of the pixel
     */
    private int x;
    private int y;

    /**
     * constructor
     * @param x x coordinate of the pixel
     * @param y y coordinate of the pixel
     */
    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * getter method for x coordinate
     * @return x coordinate
     */
    public int getX() {
        return x;
    }
    /**
     * getter method for y coordinate
     * @return y coordinate
     */
    public int getY() {
        return y;
    }

    /**
     * method to move pixel one unit left
     */
    public void moveLeft() {
        // pixel coordinate cannot be negative
        if (x == 0){
            System.out.println("cannot move left anymore");
            return;
        }
        x = x - 1;
    }

    /**
     * method to move pixel one unit right
     */
    public void moveRight() {
        x = x + 1;
    }

    /**
     * method to move pixel one unit up
     */
    public void moveUp() {
        y = y + 1;
    }

    /**
     * method to move pixel one unit down
     */
    public void moveDown() {
        // pixel coordinate cannot be negative
        if (y == 0){
            System.out.println("cannot move down anymore");
            return;
        }
        y = y - 1;
    }
}
