package com.example;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Juan", "Alejandro", "Ruben", "Omar", "Romano"};

        System.out.println(getNames(names, true));
    }

    public static String getNames(String[] names, boolean spaces) {
        String result = "";
        if (spaces) {
            for (String name : names) {
                result += name + " ";
            }
        } else {
            for (String name : names) {
                result += name;
            }
        }
        return result;
    }
}
