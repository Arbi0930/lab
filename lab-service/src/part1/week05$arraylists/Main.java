package part1.week05$arraylists;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" \t \t  R  E  V  E  R  S  E    F  I  L  E    T  E  S  T");
        System.out.println(" \t \t      T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("========================================================");
        System.out.println();
        System.out.println();
    }

    public static void read(String inputLocation, List<String> list) throws FileNotFoundException{
        File file = new File(inputLocation);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            list.add(line);
        }

        scanner.close();
    }

    public static void write(String outputLocation, List<String> list) throws FileNotFoundException{
        PrintStream writer = new PrintStream(outputLocation);

        for (int i = list.size() - 1; i >= 0; i--) {
            String line = list.get(i);
            writer.println(reverseWords(line));
        }

        writer.close();
    }

    private static String reverseWords(String line) {
        String[] words = line.split(" ");
        StringBuilder reversedLine = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedLine.append(words[i]);
            if (i > 0) {
                reversedLine.append(" ");
            }
        }
        return reversedLine.toString();
    }

    public static void main(String[] args) throws FileNotFoundException {
        String inputLocation = "C:\\Users\\mbsav\\IdeaProjects\\lab\\lab-service\\src\\part1\\data\\words.txt";
        String outputLocation = "C:\\Users\\mbsav\\IdeaProjects\\lab\\lab-service\\src\\part1\\result\\reverse_words.txt";

        List<String> lines = new ArrayList<>();

        read(inputLocation, lines);
        Collections.reverse(lines);
        write(outputLocation, lines);
    }
}
