import phonebook.FullName;
import phonebook.PhoneBook;
import product.Product;
import product.ProductList;
import product.Recipe;

import java.util.*;

public class Main {
    public static void main(String[] args) {

// Вам необходимо доработать класс рецептов так, чтобы для каждого продукта мы могли записать необходимое количество.
// Замените HashSet на HashMap, где в качестве ключа — продукт, а в качестве значения — необходимое количество.
// Если количество продукта не было передано, сохраните 1.
// Доработайте подсчет суммарной стоимости рецепта — умножьте стоимость каждого продукта на его количество.

        Product banana = new Product("Банан", 70.0);
        Product meat = new Product("Мясо", 370.0);
        Product fish = new Product("Рыба", 583.0);
        Product eggs = new Product("Яйца", 99.0);
        Product sausage = new Product("Колбаса", 400.0);
        Product polkaDots = new Product("Горошек", 80.0);

        ProductList productList = new ProductList();
        productList.addProduct(banana);
        productList.addProduct(meat);
        productList.addProduct(fish);
        System.out.println(productList);

        Set<Product> products = new HashSet<>();
        products.add(sausage);
        products.add(polkaDots);
        products.add(eggs);
        Recipe salad = new Recipe("Оливье");
        salad.addProduct(sausage, 1);
        salad.addProduct(eggs,5);
        salad.addProduct(polkaDots,1);
        System.out.println(salad);
        System.out.println(salad.getRecipePrice());


//Напишите приложение «Телефонный справочник», используя HashMap:
//В качестве ключа коллекция принимает значение «Имя и Фамилия»,  а в качестве
//значения коллекции — номер телефона.
//Добавьте 20 произвольных значений в мапу, выведите все значения в консоль.

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone(new FullName("Федор", "Иванов"), "89879878511");
        phoneBook.addPhone(new FullName("Петр", "Федоров"), "81111111111");
        phoneBook.addPhone(new FullName("Иван", "Дураков"), "82222222222");
        phoneBook.addPhone(new FullName("Алексей", "Алексеев"), "83333333333");
        phoneBook.addPhone(new FullName("Артур", "Артуров"), "84444444444");
        phoneBook.addPhone(new FullName("Дмитрий", "Дмитриев"), "85555555555");
        phoneBook.addPhone(new FullName("Сергей", "Сергеев"), "76666666666");
        phoneBook.addPhone(new FullName("Лаврентий", "Лаврентьев"), "77777777777");
        phoneBook.addPhone(new FullName("Никита", "Никитов"), "87888888888");
        phoneBook.addPhone(new FullName("Михаил", "Михайлов"), "89999999999");
        phoneBook.addPhone(new FullName("Роман", "Романов"), "81231223555");
        phoneBook.addPhone(new FullName("Артем", "Артемов"), "85589622556");
        phoneBook.addPhone(new FullName("Арсений", "Арсентьев"), "85255545625");
        phoneBook.addPhone(new FullName("Остап", "Бендар"), "81566878969");
        phoneBook.addPhone(new FullName("Александр", "Александров"), "81525999252");
        phoneBook.addPhone(new FullName("Максим", "Максимов"), "84569852215");
        phoneBook.addPhone(new FullName("Антон", "Антонов"), "85669872335");
        phoneBook.addPhone(new FullName("Денис", "Денисов"), "81255489625");
        phoneBook.addPhone(new FullName("Лев", "Львов"), "84123549632");
        phoneBook.addPhone(new FullName("Егор", "Егоров"), "85625265545");


        for (Map.Entry<FullName,String> entry: phoneBook.getEntries()){
            System.out.printf("%s - %s%n", entry.getKey(), entry.getValue());
        }

//Создайте коллекцию Map<String, Integer>. Заполните ее произвольными значениями.
//Напишите метод, который принимает строку (ключ) и целое число (значение) и пытается добавить ее в коллекцию по логике:
//- Если такого ключа нет, то просто добавляет данные в коллекцию.
//- Если такой ключ уже есть и значения совпадают, то необходимо бросить исключение.
//- Если такой ключ уже есть, но значения разные, то обновите целое число в коллекции.

        Task3 task3 = new Task3();
        task3.addToMap("абракадабра", 5);
        task3.addToMap("колесо", 3);
        task3.addToMap("весна", 2023);
        System.out.println(task3);


//Создайте Map<String, List<Integer>>. Заполните ее 5 элементами, где ключ — произвольное значение,
// а значение — список, состоящий из 3 случайных чисел в диапазоне от 0 до 1000.
//Преобразуйте созданную коллекцию в новую — Map<String, Integer>, где ключи взяты из первой коллекции,
// а число — сумма чисел списка. Выведите результат в консоль.

        ListMap listMap = new ListMap();
        listMap.getOriginalMapEntries();
        System.out.println(listMap.getOriginalMapEntries());
        listMap.getTransformedCollection();
        System.out.println(listMap.getTransformedCollection());



//Создайте Map<Integer, String>, заполните ее 10 произвольными значениями.
// Выведите в консоль всё содержимое коллекции в порядке добавления (в формате ”ключ:значение").
        Map< Integer, String> orderedMap = new LinkedHashMap<>();
        orderedMap.put(1,"номер 1");
        orderedMap.put(2,"номер 2");
        orderedMap.put(3,"номер 3");
        orderedMap.put(4,"номер 4");
        orderedMap.put(5,"номер 5");
        orderedMap.put(10,"номер 10");
        orderedMap.put(7,"номер 7");
        orderedMap.put(8,"номер 8");
        orderedMap.put(9,"номер 9");
        orderedMap.put(6,"номер 6");

        for (Map.Entry<Integer, String> entry: orderedMap.entrySet()){
            System.out.printf("%d:%s%n", entry.getKey(), entry.getValue());
        }








    }
}