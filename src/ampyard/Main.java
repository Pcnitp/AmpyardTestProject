package ampyard;

import java.util.Scanner;

public class Main {

    /**
     * method to show menu to the user
     */
    public static void menu() {
        System.out.println("\nChoose options from 1 to 5");
        System.out.println("1. Move Left");
        System.out.println("2. Move Right");
        System.out.println("3. Move Up");
        System.out.println("4. Move Down");
        System.out.println("5. Exit");
    }

    /**
     * method to perform action on pixel
     * @param pixel provided pixel object
     * @param option option chosen by user
     */
    public static void action(Pixel pixel, int option) {
        switch (option){
            case 1:
                pixel.moveLeft();
                break;
            case 2:
                pixel.moveRight();
                break;
            case 3:
                pixel.moveUp();
                break;
            case 4:
                pixel.moveDown();
                break;
            case 5:
                System.exit(1);
            default:
                System.out.println("Please Enter a valid option");
        }
    }

    public static void main(String[] args) {
        Pixel pixel = new Pixel(5,25);
        Scanner sc = new Scanner(System.in);

        while (true){
            menu();
            int option = sc.nextInt();
            action(pixel, option);
            System.out.println("X coordinate: "+ pixel.getX());
            System.out.println("Y coordinate: "+ pixel.getY());
        }
    }
}
