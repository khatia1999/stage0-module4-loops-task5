package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {

        for (int i = 0; i < sideLength; i++) {
            for (int j = 0; j < sideLength; j++) {
                if (i == j || i == sideLength - 1 - j) {
                    System.out.print('8');
                } else {
                   System.out.print(' ');
                }
           }
           System.out.println();}
    }

    }



// Cross. Write a program that will write to console a cross of a given size(it should consist of '8'-s).