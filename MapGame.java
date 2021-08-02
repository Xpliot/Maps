import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.io.*;
import java.util.Random;

public class MapGame {
    public static void main(String[] args) {
        // Pick a random BaseColor for 10 times.
        for (int i = 0; i < 10; i++) {
            System.out.printf("color[%d] = %s%n", i,
                    BaseColor.getRandomColor());
        }
    }


    private enum BaseColor {
        Red,
        Green,
        Blue;

        /**
         * Pick a random value of the BaseColor enum.
         * @return a random BaseColor.
         */
        public static BaseColor getRandomColor() {
            Random random = new Random();
            return values()[random.nextInt(values().length)];
        }
    }
}
