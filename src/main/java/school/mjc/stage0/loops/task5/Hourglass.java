package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {

        int width = 2 * height - 1;

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < width - i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < width - i; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    }


//Hourglass. Write a program write to console filled Hourglass of a given length(it should consist of '8'-s).
