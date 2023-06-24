package ru.gb.lesson2;


import java.io.FileNotFoundException;
import java.util.*;

/**
 * Реализовать консольное приложение - телефонный справочник.
 * У одной фамилии может быть несколько номеров.
 * Пользователь может вводить команды:
 * 1. ADD Ivanov 88005553535 - добавить в справочник новое значение.      // готово вроде)
 * Первый аргумент - фамилия, второй - номер телефона
 * 2. GET Ivanov - получить список всех номеров по фамилии
 * 3. REMOVE Ivanov - удалить все номера по фамилии
 * 4. LIST - Посмотреть все записи
 * 5. EXIT - Завершить программу //Готово
 * Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом
 *
 * Пример взаимодействия (=> - это вывод на консоль):
 * ADD Ivanov 8 800 555 35 35
 * ADD Ivanov 8 800 100 10 10
 * GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
 * ADD Petrov 8 555 12 34
 * LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
 * REMOVE Ivanov
 * LIST => Petrov = [8 555 12 34]
 * GET NoName => Не найдена запись с фамилией "NoName"
 * REMOVE NoName => Не найдена запись с фамилией "NoName"
 *
 * Как будем решать?
 * Делаем сканер
 * Потом сплитим скорее всего. Проверяем первое слово после сплита если он равно ADD запускаем блок добавления
 *
 * Если remove-удаление
 * если гет - отображение пары
 * Создаем хешмеп формата Стринг Интеджер, ключ будет фамилия?
 * Если да , тогда что будет если будет добавлена пара где такой же ключ?
 * тогда . тогда делаем ИФ ключ равен , то достаем значение по ключу и добавлем новое значение (телефон)
 */
public class HomeworkLesson5 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);

        // создать хеш мап
        HashMap<String,ArrayList<String>> storage = new HashMap<>();


        //разбить по словам и проверить первое слово
        while (true) {
            String input = scanner.nextLine(); //в переменную помещаем информацию со сканера
            String[] words = input.split("\\s"); //   для индексации сплитим введеную строку
            String command = words[0].toUpperCase();  //команду достаем





            if ("EXIT".equals(command)) {
                break;
            }
            //команда добавления GET
            if ("ADD".equals(command)) {
                String name = words[1];
                String phone = words[2];

                //проверку  что такой "Ключ есть"
                if (storage.containsKey(name)) {
                    ArrayList<String> valueByKey = storage.get(name); //достаем "старое" значение ЛИСТ
                    //в него докидываем новый телефон


                    //потио ист помещаем в хеш меп обратно
                    //создаем  пусто список с двумя значениями  старым и новым

                    valueByKey.add(phone);//добавляем в  лист значение
                    //заменяем старую пару строка строка на новую Строка и лист
                    storage.put(name, valueByKey);
                    //все тут
                } else {
                    //если таког значения нет из Words[]   мы добавляем по 1 и 2 индексу строки в хешмап
                    //делаем новый лист телефонов
                    ArrayList<String> phonefirst = new ArrayList<>();
                    phonefirst.add(phone);


                    storage.put(name, phonefirst);
                    continue;

                }


            }

            //полчучение списка номеров по фамлии
            if ("GET".equals(command)) {
                String name = words[1];

                if (storage.containsKey(name)) {
                    //если такая фпамилия ест просто печатаем
                    ArrayList<String> valueByKey = storage.get(name); //достаем "старое" значение ЛИСТ
                    System.out.println(valueByKey); // "value"
                } else {
                    System.out.println("Извините такой фамилии нет"); // "value"

                }
            }
            if ("REMOVE".equals(command)) {
                String name = words[1];

                if (storage.containsKey(name)) {
                    //если такая фпамилия ест просто печатаем
                    storage.remove(name);
                } else {
                    System.out.println("Извините такой фамилии нет"); // "value"

                }
            }


            if ("LIST".equals(command)) {
                System.out.println(storage);  // печатаем с последнего
/**
                Set<Map.Entry<String, ArrayList<Integer>>> entries = storage.entrySet();
                for (Map.Entry<String, ArrayList<Integer>> entry : entries) {
                    String key = entry.getKey();
                    ArrayList<Integer> value = entry.getValue();
                    System.out.println(key+value );  // печатаем с последнего

 */                    continue;
                }


            }


        System.exit(0);

    }
}
