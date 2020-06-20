package com.company;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    private static FileWriter fileWriter;

    static {
        try {
            fileWriter = new FileWriter("D:\\Alphabet.txt", false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) throws IOException {
        System.out.println("Начинаю....");
        long start = System.currentTimeMillis();

        for (char alphabet = 'A'; alphabet <= 'z'; alphabet++) {
            if (alphabet == '[' || alphabet == ']' || alphabet == '^' || alphabet == '_' || alphabet == '`' || alphabet == '\\')
                continue;
            for (char alphabet2 = 'A'; alphabet2 <= 'z'; alphabet2++) {
                if (alphabet2 == '[' || alphabet2 == ']' || alphabet2 == '^' || alphabet2 == '_' || alphabet2 == '`' || alphabet2 == '\\')
                    continue;
                for (char alphabet3 = 'A'; alphabet3 <= 'z'; alphabet3++) {
                    if (alphabet3 == '[' || alphabet3 == ']' || alphabet3 == '^' || alphabet3 == '_' || alphabet3 == '`' || alphabet3 == '\\')
                        continue;
                    for (char alphabet4 = 'A'; alphabet4 <= 'z'; alphabet4++) {
                        if (alphabet4 == '[' || alphabet4 == ']' || alphabet4 == '^' || alphabet4 == '_' || alphabet4 == '`' || alphabet4 == '\\')
                            continue;
                        for (char alphabet5 = 'A'; alphabet5 <= 'z'; alphabet5++) {
                            if (alphabet5 == '[' || alphabet5 == ']' || alphabet5 == '^' || alphabet5 == '_' || alphabet5 == '`' || alphabet5 == '\\')
                                continue;
                            for (char alphabet6 = 'A'; alphabet6 <= 'z'; alphabet6++) {
                                if (alphabet6 == '[' || alphabet6 == ']' || alphabet6 == '^' || alphabet6 == '_' || alphabet6 == '`' || alphabet6 == '\\')
                                    continue;
                                fileWriter.write(alphabet);
                                fileWriter.write(alphabet2);
                                fileWriter.write(alphabet3);
                                fileWriter.write(alphabet4);
                                fileWriter.write(alphabet5);
                                fileWriter.write(alphabet6 + "\n");
                            }
                        }
                    }
                }
            }
        }
        fileWriter.close();
        System.out.println("Выполнено за: " + ((double) System.currentTimeMillis() - start) / 1000 + " сек.");
        System.out.println("Или за: " + ((double) System.currentTimeMillis() - start) / 1000 / 60 + " мин.");
    }
}

