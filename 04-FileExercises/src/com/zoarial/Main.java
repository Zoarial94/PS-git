package com.zoarial;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

public class Main {

    public static <T> void println(T var) {
        System.out.println(var);
    }
    public static <T> void print(T var) {
        System.out.print(var);
    }
    public static void println() {
        System.out.println();
    }

    public static void main(String[] args) {
        println("\nProblem 1:");
        problem1();
        println("\nProblem 2:");
        problem2();
        println("\nProblem 2:");
        problem2a();
        println("\nProblem 3:");
        problem3();
        println("\nProblem 4:");
        problem4();
        println("\nProblem 5:");
        problem5();
        println("\nProblem 6:");
        problem6();
        println("\nProblem 7:");
        problem7();
        println("\nProblem 8:");
        problem8();
        println("\nProblem 9:");
        problem9();
        println("\nProblem 10:");
        problem10();
        println("\nProblem 11:");
        problem11();
        println("\nProblem 12:");
        problem12();
        println("\nProblem 13:");
        problem13();
        println("\nProblem 14:");
        problem14();
        println("\nProblem 15:");
        problem15();
        println("\nProblem 16:");
        problem16();
        println("\nProblem 17:");
        problem17();
        println("\nProblem 18:");
        problem18();
        println();
    }

    static void problem1() {
        File dir = new File("./files");
        String[] fileList = dir.list();
        if(fileList != null) {
            for (String str : fileList) {
                println("File Found: " + str);
            }
        }
    }

    static void problem2() {
        File dir = new File("./files");
        String[] fileList = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".py");
            }
        });
        if (fileList != null) {
            for(String str : fileList) {
                println(str);
            }
        }
    }

    static void problem2a() {
        File dir = new File("./files");
        String[] fileList = dir.list();
        if(fileList != null) {
            for (String str : fileList) {
                if (str.endsWith(".py")) {
                    println(str);
                }
            }
        }

    }

    static void problem3() {
        String fileName1 = "./files/doIExist.txt";
        String fileName2 = "./files/TestFile.txt";
        File file1 = new File(fileName1);
        File file2 = new File(fileName2);
        try {
            if (file1.exists()) {
                println("File exists: " + file1.getCanonicalPath());
            } else {
                println("File does not exist: " + file1.getCanonicalPath());
            }

            if (file2.exists()) {
                println("File exists: " + file2.getCanonicalPath());
            } else {
                println("File does not exist: " + file2.getCanonicalPath());
            }
        } catch (IOException e) {
            println("Something happened");
        }
    }

    static void problem4() {
        File file1 = new File("./files/TestFile.txt");
        try {
            println("File: " + file1.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file1.canWrite()) {
            println("I can write this file");
        } else {
            println("I can't write this file");
        }
        if(file1.canRead()) {
            println("I can read this file");
        } else {
            println("I can't read this file");
        }
        if(file1.canExecute()) {
            println("I can execute this file");
        } else {
            println("I can't execute this file");
        }

        File file2 = new File("./files/noPermissions.txt");
        try {
            println("File: " + file2.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(file2.canWrite()) {
            println("I can write this file");
        } else {
            println("I can't write this file");
        }
        if(file2.canRead()) {
            println("I can read this file");
        } else {
            println("I can't read this file");
        }
        if(file2.canExecute()) {
            println("I can execute this file");
        } else {
            println("I can't execute this file");
        }
    }

    static void problem5() {
        File file1 = new File("./files/dir");
        File file2 = new File("./files/TestFile.txt");
        try {
            print(file1.getCanonicalPath());
            if (file1.isDirectory()) {
                println(" is a directory.")  ;
            } else {
                println(" is not a directory");
            }

            print(file2.getCanonicalPath());
            if(file2.isDirectory()) {
                println(" is a directory.");
            } else {
                println(" is not a directory.");
            }
        } catch (IOException e) {
            println("Something went wrong");
        }

    }

    static void problem6() {
        File dir = new File("./files");
        String[] fileList = dir.list();
        List<String> sortedList;
        if (fileList != null) {
            sortedList = Arrays.asList(fileList);
        } else {
            println("Something went wrong.");
            return;
        }
        Collections.sort(sortedList);
        println("Sorted Files:");
        for (String str : sortedList) {
            println(" - " + str);
        }
    }

    static void problem7() {
        File file = new File("./files/script.py");
        try {
            println(file.getCanonicalPath() + " was last modified at " + new Date(file.lastModified()));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void problem8() {
        println("Skipping 8 since we've done that already.");
    }

    static void problem9() {
        File file = new File("./files/smallFile.txt");
        try {
            println("File size of " + file.getCanonicalPath() + ": ");
            long len = file.length();
            println(len + " bytes");
            println(len/1024 + " kilobytes");
            println(len/1024/1024 + " megabytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
        File file2 = new File("./files/largeFile.txt");
        try {
            println("File size of " + file2.getCanonicalPath() + ": ");
            long len = file2.length();
            println(len + " bytes");
            println("~" + (int)(len/1024.0) + " kilobytes");
            println("~" + (int)(len/1024.0/1024.0) + " megabytes");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void problem10() {
        File file = new File("./files/smallFile.txt");
        try {

            InputStream fileStream = new FileInputStream(file);
            byte[] buf = new byte[1024];
            int read_count = fileStream.read(buf);
            println("===Start File===");
            while(read_count > 0) {

                print(new String(buf, 0, read_count));

                read_count = fileStream.read(buf);
            }
            println("\n====End File====");
        } catch (IOException e) {
            println("Something went wrong.");
        }

    }

    static void problem11() {

        File file = new File("./files/smallFile.txt");
        try {

            Scanner input = new Scanner(file);
            int i = 1;
            println("===Start File===");
            while(input.hasNextLine()) {
                println("Line " + i + ": " + input.nextLine());
                i++;
            }
            println("\n====End File====");
        } catch (IOException e) {
            println("Something went wrong.");
        }


    }

    static void problem12() {

        println("I've been doing this stuff already.");

    }

    static void problem13() {

        File file = new File("./files/smallFile.txt");
        ArrayList<String> fileList = new ArrayList<>(10);
        try {

            Scanner input = new Scanner(file);
            while(input.hasNextLine()) {
                fileList.add(input.nextLine());
            }
        } catch (IOException e) {
            println("Something went wrong.");
        }

        println("File has " + fileList.size() + " lines.");

    }

    static void problem14() {

        println("See problem 13");

    }

    static void problem15() {



    }

    static void problem16() {

    }

    static void problem17() {

    }

    static void problem18() {

    }





}
