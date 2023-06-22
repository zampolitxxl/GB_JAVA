import java.io.FileNotFoundException;
import java.util.*;

public class HomeworkLesson4 {
    /**
     Реализовать консольное приложение, которое:
     1. Принимает от пользователя и “запоминает” строки.
     2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     3. Если введено revert, удаляет предыдущую введенную строку из памяти. ок
     4. Если введено exit, то программа завершается ок

     > - ввод в консоль (stdin), < - вывод на консоль (stdout)
     > java
     > python
     > c#
     > print
     < [c#, python, java]
     > revert
     > print
     < [python, java]
     > revert
     > revert
     > print
     < []
     > revert -> throw new NoSuchElementException
     */

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // List<String> -> List<List<String>> -> List<Pair>
        Deque<String> storage = new ArrayDeque<>(); //new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();


            if ("exit".equals(input)) {
                break;
            }
            if ("revert".equals(input)) {
                storage.removeFirst();
                continue;

            }


            if ("print".equals(input)) {
                System.out.println(storage);  // печатаем с последнего




                continue;
            }
            else{

                storage.addFirst(input);  //добавляем последний элемент

            }








    }
        System.exit(0);

    }
}

