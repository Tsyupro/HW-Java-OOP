package org.example;

import org.example.Task1.Builder;
import org.example.Task1.Human;
import org.example.Task1.Pilot;
import org.example.Task1.Sailor;
import org.example.Task2.Crocodile;
import org.example.Task2.Kangaroo;
import org.example.Task2.Tiger;
import org.example.Task3.Money;
import org.example.Task3.Product;
import org.example.Task4.Car;
import org.example.Task4.Kettle;
import org.example.Task4.Microwave;
import org.example.Task4.Steamer;
import org.example.Task5.Cello;
import org.example.Task5.Trombone;
import org.example.Task5.Ukulele;
import org.example.Task5.Violin;
import org.example.Task6.Array;

public class Main {
    public static void main(String[] args) {
      // Task 1
        Human human = new Human("Vasyl", 18, "Male");
        Builder builder = new Builder("Anton", 19, "Male", "штукатур");
        Sailor sailor = new Sailor("Oksana", 27, "Female", "Sea Voyager");
        Pilot pilot = new Pilot("John", 36, "Male", "Boeing 747");

        human.Show();
        builder.Show();
        sailor.Show();
        pilot.Show();
        // Task 2
        System.out.println("\n\n Task 2 \n\n");
        Tiger tiger = new Tiger("Antonio","Carnivore", "Striped", 2.5, 1.2, 200, "Solitary", "Jungle", "Nocturnal", "Large territory", "Viviparous", "Good");
        tiger.Show();
        Crocodile crocodile = new Crocodile("Bymchik","Freshwater", "Green", 4.2, 300, "Carnivore", "Rivers", "Large territory", "High", "Good");
        crocodile.Show();
        Kangaroo kangaroo = new Kangaroo("Koks","Red Kangaroo", 1, "Large", "Australia", "Active", "Herbivore", "Seasonal", "Good");
        kangaroo.Show();

        System.out.println("\n\n Task 3 \n\n");

        Money money = new Money(50, 25);
        money.display();

        // Створюємо об'єкт Product
        Product product = new Product("Apple", new Money(1, 99));
        product.display();

        // Зменшуємо ціну продукту
        product.reducePrice(99);
        product.display();

        System.out.println("\n\n Task 4 \n\n");

        Kettle kettle = new Kettle("Morning Glory","Цей чайник має елегантний дизайн з нержавіючої сталі, об'ємністью 1,7 літра. Він оснащений потужним нагрівальним елементом, який швидко піднімає температуру води до кипіння. Крім того, чайник має автоматичне відключення та захист від перегріву для безпечного використання.", "Під час нагрівання вода в чайнику \"Morning Glory\" починає бурхливо кипіти, супроводжуючись шипінням та шумом, що створюється від випарівання.");
        kettle.PlayAll();
        Microwave microwave = new Microwave("Сучасний Кулінар", "Ця мікрохвильова піч має стильний сучасний дизайн з електронними кнопками та LED-дисплеєм. Вона має різні режими приготування, включаючи розморожування, підігрів та приготування різних страв. Завдяки своїм функціям, ця мікрохвильова піч дозволяє легко та швидко готувати різноманітні страви.","Під час роботи мікрохвильова піч Сучасний Кулінар випромінює тихі мікрохвильові сигнали, що свідчать про її роботу.");
        microwave.PlayAll();
        Car car = new Car("Volkswagen Golf 6", " \"Volkswagen Golf 6\" - це компактний хетчбек, який відомий своєю надійністю та динамікою. Він має стильний та ергономічний дизайн, комфортний салон та різноманітні функції, що роблять керування автомобілем приємним і зручним. Завдяки ефективному двигуну та добре налаштованій підвісці, \"Volkswagen Golf 6\" забезпечує плавну їзду та відмінні динамічні характеристики на дорозі.", "Під час роботи двигуна автомобіля \"Volkswagen Golf 6\" можна почути тихий і рівномірний рокочущий звук, який свідчить про його ефективну роботу та динамічні характеристики.");
        car.PlayAll();
        Steamer steamer = new Steamer("Ocean Voyager", " \"Ocean Voyager\" - це великий океанський пароплав, призначений для подорожей на великі відстані. Він має вражаючу вантажопідйомність і забезпечує комфортне пересування через води навіть у найважчих умовах. Цей пароплав оснащений сучасними системами навігації та безпеки, що робить подорожі безпечними та надійними.","Під час руху \"Ocean Voyager\" можна почути міцний рокот парового двигуна, який створює неповторний атмосферний звук та свідчить про могутність цього судна.");
         steamer.PlayAll();

        System.out.println("\n\n Task 5 \n\n");

        Cello cello = new Cello("Test1");
        Trombone trombone = new Trombone("Test2");
        Ukulele ukulele = new Ukulele("Test3");
        Violin violin = new Violin("Test4");
        cello.PlayAll();
        trombone.PlayAll();
        ukulele.PlayAll();
        violin.PlayAll();

        System.out.println("\n\n Task 6 && Task 7 \n\n");
        int[] arr ={4,5,6,7,56,5,7,67,78,7,9,89,80,0,100};
        Array array = new Array(arr);
        System.out.println(array.Max());
        System.out.println(array.Min());
        System.out.println(array.Avg());

        array.ShowArray();
        array.SortAsc();
        array.ShowArray();
        array.SortDesc();
        array.ShowArray();


    }
}