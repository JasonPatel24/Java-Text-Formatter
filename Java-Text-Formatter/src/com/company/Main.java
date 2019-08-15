package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("EnglishLearningWords.txt");

        Scanner scanWord = new Scanner(new FileReader("TempWords.txt"));
        scanWord.useDelimiter(", ");

        while(scanWord.hasNext()) {
            fw.write(scanWord.next() + "\n");
        }

        fw.flush();
        fw.close();
    }
}
