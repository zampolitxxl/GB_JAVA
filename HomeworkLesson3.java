package ru.gb.lesson3;

import java.util.ArrayList;

public class HomeworkLesson3 {
    public static void main(String[] args) {

    /**
     * Пусть дан произвольный список целых чисел.
     *
     * 1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
     * 2) Найти минимальное значение         (Integer findMin(ArrayList<Integer> list))
     * 3) Найти максимальное значение
     * 4) Найти среднее значение
     *
     * То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
     */

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(17);


        System.out.println("начальный список: "+list); // [1]
        System.out.println("среднее  значение: "+ averageListValue((list))); // [1]


        //1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))

        removeEven(list); // [1]

        System.out.println("без четных значений список: "+list); // [1]


        System.out.println("минимальное значение: "+ minListValue((list))); // [1]

        System.out.println("максимальное  значение: "+ maxListValue((list))); // [1]






    }
public  static  int  minListValue(ArrayList<Integer>  list) {


    int min = list.get(0);

    for (Integer i : list) {
        if (i < min)
            min = i;

    }

    return min;
}


    public  static  int  maxListValue(ArrayList<Integer>  list) {


        int max = list.get(0);

        for (Integer i : list) {

            if (i > max)
                max = i;
        }

        return max;

    }

    public static void removeEven(ArrayList<Integer> list) {

        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer m : list) { // foreach
            if (m%2 !=0) {
                unique.add(m);
            }
        }
        list.clear();
        list.addAll(unique);


    }
    public  static  float  averageListValue(ArrayList<Integer>  list) {

        int size = list.size();
        System.out.println("количество перменных  "+size); // [1]

        int sum=0;
        for (Integer m : list) {
            sum=m+sum;


        }
        System.out.println("сумма чисел  "+sum); // [1]
        float a=sum;
        float b=size;

        float average=a/b;
        return  average;
    }

}