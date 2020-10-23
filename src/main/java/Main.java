import scala.math.Ordering;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Double.parseDouble;

public class Main {

    private static int staticInt = 1;

    public static void sout1(Cat cat) {
        System.out.println("Way2" + cat);
    }

    public static Consumer<Cat> createConsumer(int x) {
        return cat -> {
            System.out.println("Way" + x + cat);
        };
    }

    public static void main(String...args) throws IOException {
        Cat cat1 = new Cat(1, "Cat1");
        Cat cat2 = new Cat(2, "Cat2");
        Cat cat3 = new Cat(3, "Cat3");
        Cat cat4 = new Cat(3, "Cat4");
        List<Cat> cats = Arrays.asList(cat1, cat2,  cat4, cat3);

        Int1 int1 = new Int1() {
            @Override
            public void fuu() {
                System.out.println("foo1");
            }
        };
        int1.bla();
        int1.fuu();

        Int2 int2 = new Int2() {
            @Override
            public void fuu() {
                System.out.println("foo2");
            }
        };

        int2.bla();
        int2.fuu();

        Int3 int3 = new Int3() {
            @Override
            public void fuu() {
                System.out.println("foo3");
            }
        };



////        cats.stream().filter(cat -> cat.getAge() == 3).findFirst().ifPresent(System.out::println);
//        cats.stream();
//        int[] array = {1, 2, 3};
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//
//        list.stream().limit(2).forEach(System.out::println);
////        System.out.println(list.stream().reduce(5, (element1, element2) -> element1+element2));
//
//        list.stream().map(e -> String.format("\"%d\"", e)).toArray(String[]::new);
//
//        Function function = new Function<Integer, Integer>() {
//            @Override
//            public Integer apply(Integer integer) {
//                return integer * 3;
//            }
//        };
//
////        Object[] toArray = list.stream().map(function).map(e -> String.format("\"%d\"", e)).toArray();
//
//
//        System.out.println(list);

//        Arrays.stream(array).map(new IntUnaryOperator() {
//            @Override
//            public int applyAsInt(int operand) {
//                return 0;
//            }
//        });


//        Stream.of(array);


//
//        cats.stream().filter(cat -> {
//            return cat.getAge() == 3 && cat.getName().equals("Cat3");
//        }).forEach(Main::sout1);
//
//
//        cats.forEach(x -> System.out.println("Way1" + x));
//        cats.forEach(x -> sout1(x));
//        cats.forEach(new Consumer<Cat>() {
//            @Override
//            public void accept(Cat cat) {
//                System.out.println("Way3" +cat);
//            }
//        });
//        Consumer<Cat> customConsumer = x -> System.out.println("Way4" + x);
//        cats.forEach(customConsumer);
//        cats.forEach(createConsumer(5));
//
//        final int const1;
//        const1 = 2;
//
//        int const2 = 6;
////        const2 = new Scanner(System.in).nextInt();
////        cats.forEach(createConsumer(const2));
////        int finalConst = const2;
////        finalConst = new Scanner(System.in).nextInt();
////        int finalConst1 = finalConst;
//        cats.forEach(new Consumer<Cat>() {
//            @Override
//            public void accept(Cat cat) {
//                System.out.println("Way" + const2 + cat);
//            }
//        });
//        staticInt = new Scanner(System.in).nextInt();
//        cats.forEach(new Consumer<Cat>() {
//            @Override
//            public void accept(Cat cat) {
//                System.out.println("Way" + staticInt + cat);
//            }
//        });
//        cats.forEach(Main::sout1);

    }

    public static void printDate() {
        System.out.println(LocalDate.now());

        Map<String, String> zoneIds = ZoneId.SHORT_IDS;
        List<Map.Entry<String, String>> list = new ArrayList(zoneIds.entrySet());

        for (Map.Entry<String, String> zoneID :
                list) {
            System.out.printf("%s - %s\n", zoneID, LocalDate.now(ZoneId.of(zoneID.getValue())));
        }
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
    }

    public static Map<Character, Integer> calculateFrequencyOfLetters(String string) {
        Map<Character, Integer> result = new TreeMap<>();
        char[] chars = string.toCharArray();

        for (char c : chars) {
            if (result.containsKey(Character.valueOf(c))) {
                Integer counter = result.get(Character.valueOf(c));
                result.put(Character.valueOf(c), (counter + 1));
            } else {
                result.put(Character.valueOf(c), 1);
            }
        }


        return result;
    }

    public static void charMax() {
        char c = 0;
        Scanner scanner = new Scanner(System.in);
//        boolean exit = scanner.nextBoolean();
        while (true) {
            c += 1;
            System.out.println(c);
        }
    }

}
