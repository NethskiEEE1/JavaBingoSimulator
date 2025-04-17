package com.BingoSimulator;

import java.util.Random;

public class BingoSimulator {

    private final static Random random = new Random();

    public static void main(String[] args) {
        bingoSimulator();
    }

    private static void bingoSimulator() {
        // ANSI escape codes for colors and styles
        String reset = "\033[0m";  // Reset color
        String red = "\033[31m";    // Red color
        String blue = "\033[34m";   // Blue color
        String violet = "\033[35m";   // Violet color
        String black = "\033[37m";   // Black color
        String green = "\033[40m";   // green color
        String bold = "\u001B[1m"; // Bold text
        String yellow = "\033[33m"; // Yellow color
        
        /* BINGO Generator
        B: 1 - 15
        I: 16 - 30
        N: 31 - 45
        G: 46 - 60
        O: 61 - 75
         */
        
        System.out.println("********************************" + reset);
        System.out.println("*\t" + bold + red + "B" + yellow + "I" + blue+ "N" + green + "G" + violet + "O" + black + " SIMULATOR" + reset + "\t       *" );
        System.out.println("********************************");

        int roll = (int) (random.nextInt(75) + 1);
        String letter;

        if (roll < 15) {
            letter = "B";
        } else if (roll < 30) {
            letter = "I";
        } else if (roll < 45) {
            letter = "N";
        } else if (roll < 60) {
            letter = "G";
        } else {
            letter = "O";
        }
        System.out.println(red + "\nSa letrang " + bold + letter + " : " + blue  + roll + reset);
    }
}
