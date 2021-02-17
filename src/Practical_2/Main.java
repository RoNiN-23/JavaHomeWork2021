package Practical_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Human> input = new ArrayList<>();
        input.add( new Human(19, "Egor", "Smirnov", LocalDate.of(2001,10,16), 67));
        input.add( new Human(20, "Alexandr", "Filippov", LocalDate.of(2001,1,25), 70));
        input.add( new Human(18, "Vladimir", "Samsonov", LocalDate.of(2002,6,21), 75));
        input.add( new Human(19, "Kamil", "Ishakov", LocalDate.of(2001,5,4), 80));
        input.add( new Human(20, "Kirill", "Sechin", LocalDate.of(2000,5,3), 60));
        input.add( new Human(18, "Alexandr", "Tolstov", LocalDate.of(2002,7,11), 62));
        input.add( new Human(19, "Daria", "Smirnova", LocalDate.of(2001,10,16), 50));
        Scanner scanner = new Scanner(System.in);
        int a = 1;
        while (a != 0){
            System.out.println("1.Вывести первые 5 элементов списка\n2.Отсортировать по дате\n3.Отфильтровать по весу меньше 60кг\n4.Вывести имя и фамилию\n0.Завершить работу");
            a = scanner.nextInt();
            System.out.println("========================================================================");
            switch (a){
                case 1: {
                    Stream <Human> firstFive = input.stream();
                    firstFive.limit(5).forEach(System.out::println);
                    System.out.println("========================================================================");
                }
                break;
                case 2:{
                    Stream <Human> sortByDate = input.stream();

                    sortByDate.sorted(new HumanComparator()).forEach(System.out::println);
                    System.out.println("========================================================================");
                }
                break;
                case 3:{
                    Stream <Human> sortByWeight = input.stream();
                    sortByWeight.filter(x -> x.getWeight() < 60).forEach(System.out::println);
                    System.out.println("========================================================================");
                }
                break;
                case 4:{
                    Stream <Human> showNames = input.stream();
                    showNames.forEach(x-> System.out.println(x.getFirstName() + " " + x.getLastName()));
                    System.out.println("========================================================================");
                }
                break;
            }
        }

    }
}
