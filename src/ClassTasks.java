
import ProgWithClasses.*;
import ProgWithClasses.AirlineTask.AirlineManager;
import ProgWithClasses.BookTask.BookStore;
import ProgWithClasses.CustomerTask.DailyCustomers;

import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class ClassTasks {
    public static void main(String[] args) {
        task3();
    }

    /**Задание 1 без демонстрации работы, так как очень простое (просто создан класс Test1):
     * Создайте класс Test1 c двумя переменными. Добавьте метод вывода на экран и методы изменения этих
     * переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
     * наибольшее значение из этих двух переменных*/


    /**Задание 2 без демонстрации работы, так как очень простое (просто создан класс Test2):
     * Создйте класс Test2 c двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
     * конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
     * класса*/


    /**
     * Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
     * из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
     * номеров групп студентов, имеющих оценки, равные только 9 или 10
     */
    static void task3() {
        Random r = new Random();
        Student[] ss = new Student[10];
        for (int i = 0; i < ss.length; i++) {
            int[] ms = {r.nextInt(2) + 8, r.nextInt(2) + 8, r.nextInt(3) + 8, r.nextInt(2) + 8, r.nextInt(2) + 8};
            ss[i] = new Student("Student" + (i + 1), r.nextInt(10000) + 1000, ms);
        }

        for (int i = 0; i < ss.length; i++) {
            System.out.print("\n" + ss[i].getFIO() + ", группа № " + ss[i].getGroup() + ". Оценки:");
            int[] marks = ss[i].getMarks();
            for (int el : marks)
                System.out.print(el + " ");
        }


        System.out.println("\nОтличники: ");
        for (int i = 0; i < ss.length; i++)
            if (ss[i].checkIfGoodMarks() == true)
                System.out.println(ss[i].getFIO() + ", группа № " + ss[i].getGroup());
    }


    /**
     * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
     * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
     * номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
     * Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
     * назначения должны быть упорядочены по времени отправления
     */
    static void task4() {
        Random r = new Random();
        Train[] trains = new Train[5];
        for (int i = 0; i < trains.length; i++) {
            String s = r.nextInt(14) + 10 + ":" + (r.nextInt(50) + 10);
            trains[i] = new Train("Маршрут" + r.nextInt(5), r.nextInt(10000) + 1000, s);
        }
        for (Train el : trains)
            System.out.print("\nПоезд № " + el.getTrainNumber() + ", идущий в " + el.getDestination() + " отпавлется в " + el.getDepartureTime());
        Scanner s = new Scanner(System.in);
        System.out.println("\nВведите номер поезда для поиска: ");
        int num = s.nextInt();

        for (Train el : trains)
            if (el.getTrainNumber() == num)
                System.out.println("Поезд с номером " + num + " отправляется в " + el.getDestination() + " в " + el.getDepartureTime());

        System.out.println("\nСортированный массив поездов по пункту назначения: ");
        sortDestination(trains);

        for (Train el : trains)
            System.out.print("\nПоезд № " + el.getTrainNumber() + ", идущий в " + el.getDestination() + " отпавлется в " + el.getDepartureTime());
    }

    /**
     * сортировка массива с поездами по направлению/времени отправления
     */
    static private void sortDestination(Train[] trains) {
        for (int i = 0; i < trains.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < trains.length; j++) {
                if (trains[j].getDestination().compareTo(trains[min].getDestination()) < 0)
                    min = j;
                if (trains[j].getDestination().compareTo(trains[min].getDestination()) == 0)
                    if (trains[j].getDepartureTime().compareTo(trains[min].getDepartureTime()) < 0)
                        min = j;
            }
            if (min != i)
                swapTrains(trains, i, min);
        }

    }

    /**
     * свап поездов в массиве поездов, используется в сортировке
     */
    static private void swapTrains(Train[] tr, int a, int b) {
        //Train t=new Train(tr[a].getDestination(),tr[a].getTrainNumber(),tr[a].getDepartureTime());
        Train t = tr[a];
        tr[a] = tr[b];
        tr[b] = t;
    }


    /**
     * Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
     * на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
     * произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
     * позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса
     */
    static void task5() {
        Counter c = new Counter();
        System.out.println("Значения счетчика по умолчанию: \nдиапазон [" + c.getRange()[0] + ";" + c.getRange()[1] + "], значение " + c.getValue());
        c = new Counter(10, 15);
        System.out.println("\nЗначения нового счетчика: \nдиапазон [" + c.getRange()[0] + ";" + c.getRange()[1] + "], значение " + c.getValue());

        System.out.println("\nЦикл увеличения счетчика: ");
        for (int i = 0; i < 10; i++)
            System.out.print(c.increase() + " ");

        System.out.println("\nЦикл уменьшения счетчика: ");
        for (int i = 0; i < 15; i++)
            System.out.print(c.decrease() + " ");
    }


    /**
     * Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
     * изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
     * недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
     * заданное количество часов, минут и секунд
     */
    static void task6() {
        TimeClass d = new TimeClass("23:59:59");
        System.out.println("Время:\t" + d.getTime());
        d.increaseSecond(20);
        System.out.println("Добавили 20 секунд:\t" + d.getTime());
        d.increaseMinute(44);
        System.out.println("Добавили 44 минуты:\t" + d.getTime());
        d.increaseHour(9);
        System.out.println("Добавили 9 часов:\t" + d.getTime());

    }


    /**
     * Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
     * площади, периметра и точки пересечения медиан
     */
    static void task7() {
        Triangle t = new Triangle(new Point(15, 15), new Point(4, 4), new Point(10, 10));
        System.out.println("Площадь треуголника = " + t.getSquare());
        System.out.println("Периметр треугольника = " + t.getPerimeter());
    }


    /**
     * Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
     * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
     * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
     * Найти и вывести:
     * a) список покупателей в алфавитном порядке;
     * b) список покупателей, у которых номер кредитной карточки находится в заданном интер
     */
    static void task8() {
        DailyCustomers dc = new DailyCustomers(5);
        System.out.println(dc.getCustomers());
        Scanner s = new Scanner(System.in);
        System.out.println("\n1-сортировка покупателей в алфавитном порядке\n2-список покупателей, у которых карта находится в интервале [0;50]");
        int i = s.nextInt();
        if (i == 1)
            System.out.println("\n" + dc.getSortCustomers());
        if (i == 2)
            System.out.println("\n" + dc.getCustomersByCard(0, 50));
    }


    /**
     * Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
     * метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
     * методами. Задать критерии выбора данных и вывести эти данные на консоль.
     * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
     * Найти и вывести:
     * a) список книг заданного автора;
     * b) список книг, выпущенных заданным издательством;
     * c) список книг, выпущенных после заданного года.
     */
    static void task9() {
        BookStore bs = new BookStore(5);
        System.out.println(bs.getBooks());
        Scanner s = new Scanner(System.in);
        System.out.println("\n1-список книг заданного автора\n2-список книг заданного издательства\n3-список книг, выпущенных после заданного года ");
        int i = s.nextInt();
        if (i == 1) {
            System.out.println("Введите автора: ");
            String temp = s.next();
            System.out.println(bs.getBooksByAuthor(temp));
        }
        if (i == 2) {
            System.out.println("Введите издательство: ");
            String temp = s.next();
            System.out.println(bs.getBooksByPublishingHouse(temp));
        }
        if (i == 3) {
            System.out.println("Введите год: ");
            i = s.nextInt();
            System.out.println(bs.getBooksAfterYear(i));
        }
    }


    /**
     * Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
     * и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
     * методами. Задать критерии выбора данных и вывести эти данные на консоль.
     * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
     * Найти и вывести:
     * a) список рейсов для заданного пункта назначения;
     * b) список рейсов для заданного дня недели;
     * c) список рейсов для заданного дня недели, время вылета для которых больше заданного
     */
    static void task10() {
        AirlineManager am = new AirlineManager(5);
        System.out.println(am.getAirlines());
        Scanner s = new Scanner(System.in);
        System.out.println("\n1-список рейсов для заданного пункта назначения" +
                "\n2-список рейсов для заданного дня недели" +
                "\n3-список рейсов для заданного дня недели, время вылета которых больше заданного");
        int i = s.nextInt();
        if (i == 1) {
            System.out.println("Введите пункт назначения: ");
            String temp = s.next();
            System.out.println(am.getAirlinesByDestination(temp));
        }
        if (i == 2) {
            System.out.println("Введите день недели: ");
            String temp = s.next();
            System.out.println(am.getAirlinesByDayOfWeek(temp));
        }
        if (i == 3) {
            System.out.println("Введите день недели: ");
            String temp = s.next();
            System.out.println("Введите время вылета: ");
            String temp1 = s.next();
            System.out.println(am.getAirlinesByDayAndTime(temp, temp1));
        }
    }
}
