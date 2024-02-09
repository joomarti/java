import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class    jooma33 {
    public static void main(String[] args) {


//    Scanner scanner = new Scanner(System.in);
//    scanner.nextInt();
//    int[] a  = new int[10];
//    for (int i = 0; i<a.length; i++){
//        System.out.print(i+" ");
//        System.out.println("");
//
//        int[] w = new int[30];
//        for ( int s = 10; s<w.length; s++) {
//            System.out.println(s+" ");
//        . Напишите класс, который создает 20 случайных чисел диапазона
        /***
         * . Напишите класс, который создает 20 случайных чисел диапазона
         * 1 - 99. Следует вывести в консоль только те числа которые делятся
         * на 1-ое рандомное число без остатка
         */


//       Scanner scanner = new Scanner(System.in);
//     int a =scanner.nextInt();
//    for (int i = 0; i>-a; i--){
//       System.out.print(i+" ");


        /***
         * 2. Напишите класс, который генерирует 20 рандомных целых чисел
         * из диапазона -50 до +50, и определяет наименьшее число и
         * наибольшее число.
         */
//        Random random = new Random();
//        int maxNumber = 0;
//        int minNumber = 0;
//        String numbers = "";
//
//        for (int i = 0; i < 20; i++) {
//            int randomNumber = random.nextInt(-50, 50);
//            numbers += i != 19 ? randomNumber + ", " : randomNumber;
//            if (randomNumber > maxNumber) {
//                maxNumber = randomNumber;
//            }
//            if (randomNumber < minNumber) {
//                minNumber = randomNumber;
//            }
//        }
//        System.out.println("все рандомные число : [" + numbers + "]");
//        System.out.println("Наименшее число: " + minNumber);
//        System.out.println("НаиБОльще число: " + maxNumber);


        /******
         * 3. Напишите класс, который принимает с консоли для переменной X
         * целое положительное число, а затем дополнительно будет
         * спрашивать ещё числа, эти числа будут должны вычитаться из
         * переменной x, вы будете вводить числа до тех пор пока X не будет
         * отрицательным или равен 0.
         * -используйте while loop*/

//        System.out.println("Введите целое положительное число: ");
//        Scanner scanner = new Scanner(System.in);
//
//        int x = scanner.nextInt();
//
//        while (x > 0) {
//            System.out.println("Общая сумма: " + x);
//            System.out.println("Введите число: ");
//            x -= scanner.nextInt();
//        }
//        if (x <= 0) {
//            System.out.println("x <= 0");
//        }

        /****
         * 4. Напишите класс, который принимает с клавиатуры две
         * переменный это два числа, пока не будет введено две одинаковых
         * чисел.
         * Класс должен выводить на экран сумму всех первых чисел и сумму
         * всех вторых чисел (не считая чисел, введенных одинаковыми).
         */
//        Scanner scanner = new Scanner(System.in);
//
//                int firstNumber;
//                int secondNumber;
//
//                int firstNumbersSum = 0;
//               int secondNumbersSum = 0;
//
//               do {
//                  System.out.println("Сумма всех первых чисел: " + firstNumbersSum);
//                   System.out.println("Сумма всех вторых чисел: " + secondNumbersSum);
//
//                    System.out.println("Введите первое число: ");
//                    firstNumber = scanner.nextInt();
//                  System.out.println("Введите второе число: ");
//                               secondNumber = scanner.nextInt();
//
//                    firstNumbersSum += firstNumber;
//                    secondNumbersSum += secondNumber;
//                } while (firstNumber != secondNumber);
//
//               System.out.println("Числа одинаковы!");


        /****5. Напишите класс, который принимает с клавиатуры целое число
         любой длины и выводит на экран:
         ● в первой строке - все четные цифры этого числа, через пробел
         ● во второй строке - все нечетные цифры этого числа, через
         пробел
         Например, для числа 765873 в первой строке будет выведены числа
         6 8, а во второй строке 7 5 7 3
         *
         */

        /***
         * 6. Напишите класс, который принимает с клавиатуры целое
         * положительное число любой длины, а затем выводит его первую
         * цифру
         */

//        public class Exercise6 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Write number: ");
//                int number = scanner.nextInt();
//
//                while (number > 9) {
//                    number /= 10;
//                }
//
//            }}     System.out.println(number);

        /****
         *  7Напишите класс, который принимает с клавиатуры целое число
         *         любой длины и строит из него число с обратным порядком цифр.
         *                 Новое значение следует вывести в консоль.
         */
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Write number: ");
//        long number = scanner.nextLong();
//
//        long reversedNumber = 0;
//
//        while (number != 0) {
//            reversedNumber = reversedNumber * 10 + number % 10;
//            number /= 10;
//        }
//
//        System.out.println("Reversed number: " + reversedNumber);


/***
 * 8. На спектакль в кассу театра было выделено определенное
 * количество билетов, и продажа осуществлялась до тех пор, пока не
 * были проданы все билеты.
 * Напишите класс, который сначала принимает с клавиатуры
 * количество билетов, переданных в кассу. Затем класс принимает с
 * клавиатуры серию чисел, каждое из которых указывает на число
 * билетов, которое желает приобрести покупатель.
 * Если нет возможности продать очередному покупателю требуемое
 * им число билетов, принимается заказ от следующего покупателя.
 * Класс должен вывести в консоль:
 * ● Какое число покупателей приобрели билеты
 * ● Какому числу покупателей было отказано в продаже билетов
 * */

//        public class Exercise8 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//
//                System.out.println("Введите количество билетов: ");
//                int ticketsNumber = scanner.nextInt();
//
//                int number;
//                int buyers = 0;
//                int refusals = 0;
//
//                while (ticketsNumber > 0) {
//                    System.out.println("Сколько билетов вы хотите приобрести?");
//                    number = scanner.nextInt();
//
//                    if (ticketsNumber >= number) {
//                        ticketsNumber -= number;
//                        buyers++;
//                    } else {
//                        refusals++;
//                    }
//                }
//                System.out.println("Количество приобретших билеты: " + buyers);
//                System.out.println("Количество получивших отказ: " + refusals);
/***
 * 9. Напишите класс, который заполняет случайными
 * четырехзначными числами массив, размер которого вводится с
 * клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива в одной строке, начиная с конца массива ( с последнего
 * индекса).
 * */

//        public class Exercise9 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                Random random = new Random();
//
//                System.out.println("Введите размер массива: ");
//                int arrayLength = scanner.nextInt();
//
//                int[] numbers = new int[arrayLength];
//
//                for (int i = 0; i < arrayLength; i++) {
//                    numbers[i] = random.nextInt(1000, 10000);
//                }
//
//                System.out.println(Arrays.toString(numbers));
//
//                System.out.println("Перевернутый массив: ");
//
//                int[] reversedNumber = new int[arrayLength];
//
//                for (int i = 0; i < arrayLength; i++) {
//                    reversedNumber[i] = numbers[numbers.length - 1 - i];
//                }
//                System.out.println(Arrays.toString(reversedNumber));
//            }
//        }


//
/***
 * 10. Напишите класс, который заполняет случайными двузначными
 * числами массив, размер которого вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива следующим образом:
 * ● в первой строке - первую половину массива
 * ● во второй строке - вторую половину массива
 * */

//        public class Exercise10 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                Random random = new Random();
//
//                System.out.println("Введите размер массива: ");
//                int arrayLength = scanner.nextInt();
//
//                int[] numbers = new int[arrayLength];
//
//                for (int i = 0; i < arrayLength; i++) {
//                    numbers[i] = random.nextInt(10, 100);
//                }
//
//                int[] firstArray = new int[arrayLength / 2];
//                int[] secondArray = new int[arrayLength / 2 + arrayLength % 2];
//
//                for (int i = 0; i < arrayLength / 2; i++) {
//                    firstArray[i] = numbers[i];
//                }
//                for (int i = 0; i < arrayLength / 2 + arrayLength % 2; i++) {
//                    secondArray[i] = numbers[i + arrayLength / 2];
//                }
//
//                System.out.println(Arrays.toString(numbers));
//                System.out.println("First array: " + Arrays.toString(firstArray));
//                System.out.println("Second array: " + Arrays.toString(secondArray));
//            }
//        }
/***
 * 11. Напишите класс, который заполняет случайными двузначными
 * числами массив, размер которого вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения
 * массива следующим образом:
 * ● в первой строке – четные значения, содержащиеся в массиве
 * ● во второй строке – нечетные значения, содержащиеся в
 * массиве
 * */

//        public class Exercise11 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                Random random = new Random();
//
//                System.out.println("Введите размер массива: ");
//                int arrayLength = scanner.nextInt();
//
//                int[] numbers = new int[arrayLength];
//
//                for (int i = 0; i < arrayLength; i++) {
//                    numbers[i] = random.nextInt(10, 100);
//                }
//
//                int[] evenNumbers = new int[arrayLength];
//                int[] oddNumbers = new int[arrayLength];
//
//                int evenIndex = 0;
//                int oddIndex = 0;
//
//                for (int i = 0; i < arrayLength; i++) {
//                    if (numbers[i] % 2 == 0) {
//                        evenNumbers[evenIndex++] = numbers[i];
//                    } else {
//                        oddNumbers[oddIndex++] = numbers[i];
//
/***
 * 12. Создайте не возвращающий метод в параметры которого, вы
 * даете массив из целых чисел и еще целое число n.
 * Метод должен проверить есть ли в массиве число большее или
 * равное n.
 * Если есть такое число вывести в консоль true, в другом случае false!
 * */

//        public class Exercise12 {
//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                Random random = new Random();
//
//                System.out.println("Write array length: ");
//                int arrayLength = scanner.nextInt();
//
//                int[] numbers = new int[arrayLength];
//
//                for (int i = 0; i < arrayLength; i++) {
//                    numbers[i] = random.nextInt(1, 100);
//                }
//
//                System.out.println("Write n number: ");
//                int n = scanner.nextInt();
//
//                getBoolean(numbers, n);
//            }
//
//            public static void getBoolean(int[] numbers, int n) {
//                int value = 0;
//                for (int i = 0; i < numbers.length; i++) {
//                    if (numbers[i] >= n) {
//                        value++;
//                    }
//                }
//                System.out.println(Arrays.toString(numbers));
//                System.out.println(value > 0);
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
///***
// * 13. Напишите не возвращающий метод, который берет в параметры
// * массив из boolean типа, и выводит в консоль количество true
// * элементов массива.
// * */
//
//public class Exercise13 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        System.out.println("Write array length: ");
//        int arrayLength = scanner.nextInt();
//
//        boolean[] booleansArray = new boolean[arrayLength];
//
//        for (int i = 0; i < arrayLength; i++) {
//            booleansArray[i] = random.nextBoolean();
//        }
//
//        getTrueLength(booleansArray);
//    }
//
//    public static void getTrueLength(boolean[] array) {
//        int trues = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            if (array[i]) {
//                trues++;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//        System.out.println("Количество true: " + trues);


        System.out.println(Math.pow(3,2));
}}

























