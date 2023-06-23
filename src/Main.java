/*
 * Задача 19. Коллекции. Отображения HashMap. Поменять ключи и значения в отображении Map
 * Напишите метод, который получает на вход отображение HashMap и возвращает новое отображение HashMap, где ключи и значения обращены местами.
 * Нужно:
 * а. создать отображение initialMap типа HashMap;
 * б. наполнить отображение initialMap 10 элементами с ключами, равными 0...9, и значениями, равными ключу, умноженному на 2;
 * в. вывести на консоль отображение initialMap;
 * г. создать метод inverse, который
 *   принимает в качестве аргумента отображение типа HashMap,
 *   меняет местами ключи и значения, не вычисляя их заново,
 * д. в методе main вывести на консоль отображение, полученное вызовом метода inverse, в которое было передано отображение initialMap.
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(Helper.createMap());
        System.out.println(Helper.inverse(Helper.createMap()));
        System.out.println(Helper.inverseMap(Helper.createMap()));

    }

}