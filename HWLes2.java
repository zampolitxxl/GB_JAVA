package ru.gb;

import java.util.Arrays;

public class HWLes2 {
    public static void main(String[] args) {

        /**
         * 1. Реализовать метод isPalindrome
         * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
         */

        /**
         * Проверить, является ли строка палиндромом.
         * Палиндром - это строка, которая читается одинаково слева и справа
         * abcdedcba -> true
         * a -> true
         * abc -> false
         * abcd -> false
         * abba -> true
         */


        // зададим строку
        String s1 = "abcde";
        //проеверем по методу палиндром ли она
        System.out.println(isPalindrome(s1)); // true

        //создадим метол првоерки isPalindrome

        private static boolean isPalindrome (String source){
            //создаем цикли проверки первого и последнего элемента
            int count = 0;
            for (int i = 0; i < source.length() / 2; i++) {
                //сравниваем первый и последний элемент на НЕравенство

                if (source.charAt(i) != source.charAt(source.length() - i)) {
                    count++;
                }
            }
            if (count > 0) {
                return false;
            } else {
                return true;
            }

        }
    }
}