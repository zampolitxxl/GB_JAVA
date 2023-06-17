package ru.gb;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
        System.out.println(isSumBetween10And20(5, 10)); // true
        System.out.println(isSumBetween10And20(5, 15)); // true
        System.out.println(isSumBetween10And20(7, 15)); // false
        System.out.println(isSumBetween10And20(2, 6)); // false

        System.out.println(isPositive(5)); // true
        System.out.println(isPositive(0)); // false
        System.out.println(isPositive(-3)); // false

        System.out.println(isLeapYear(2003)); // true



        printString("abcd", 5); // abcdabcdabcdabcdabcd

        int[] arr = createArray(5, 10);
        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
        //1 задача (замена нолей и едениц)
        int[] marks = new int[] {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        change(marks);
        System.out.println(Arrays.toString(marks)); //
        //2 задача
        int[] marks2 = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        powed(marks2);
        System.out.println(Arrays.toString(marks2)); //
        //3 задача
        //задать массив
        int [][] twoDimArray = {{0,1,0,1}, {0,0,1,0}, {1,0,1,1},{0,1,0,1}};//объявили массив и заполнили его элементами
        //  печать 2 д массива
        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }
        //задаем метод
        changeDiag(twoDimArray, 0);
        //  печать 2 д массива с изминениями
        System.out.println();//перенос строки

        for (int i = 0; i < 4; i++) {  //идём по строкам
            for (int j = 0; j < 4; j++) {//идём по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранения табличной формы
        }

        //вызвать метод который по диагаонали анные меняет




        int[][] array = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        int x = array[2][3];
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        int summa = a+b;
        if (summa < 21 && summa > 9){
            return  true;
        }
        else {
            return false;
        }
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0){
            return  true;
        }
        else {
            return false;
        }
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз

        String str = source;
        String repeated = str.repeat(repeat);
        System.out.println(repeated);

        }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        // 1. Делится на 4  и не делится на 100 .
        // 2. Делится на 4 и делится на 400
        if ((year % 400 ==0 )||(year % 4 ==0 && year%100 !=0)) {
            return  true;
        }


        else {
            return false;
        }
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[]myarrk = new int[len];
        for (int i = 0; i < len; i++) {
            myarrk[i] =initialValue;
        }
        return myarrk;
    }
    private static void change(int[] array) {
        // Задать целочисленный массив, состоящий из элементов 0 и 1.
        // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }


        }
    }
    private static void powed(int[] array){
            // Задать целочисленный массив, состоящий из элементов 0 и 1.
            // * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 6) {
                    array[i] =array[i]*2 ;
                }


            }
        }

    static void changeDiag(int[][] arr, int num) {
        for (int i = 0; i < 4; i++) {
            arr[i][i]=num;
                }
            }



    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     *
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     *
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
     * * Также заполнить элементы побочной диагонали
     *
     * 4. Подготовить вопросы к следующему уроку.
     */

}
