package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
       int cathetusSize = 5;

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= i && j <= cathetusSize; j++) {
                System.out.print('8');
            }
            System.out.println();
        }

    }
}

//Triangle. Write a program will write to console a rectangular
// triangle(cathetus should be of a given size) of a given length(it should consist of '8'-s).