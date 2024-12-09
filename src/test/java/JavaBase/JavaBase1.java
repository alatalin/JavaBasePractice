package JavaBase;

public class JavaBase1 {

    public static void main(String... args) {

        int a = 10;
        int b = 20;
        double c = 2.05;
        double d = 2.5;
        //Операции с целыми числами
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("a++   = " +  (a++));
        System.out.println("b--   = " +  (a--));

        // Проверьте разницу в a++ и ++a
        System.out.println("a++   = " +  (a++));
        System.out.println("++a   = " +  (++a));

        //Операции с числами с плавающей запятой
        System.out.println("c + d = " + (c + d));
        System.out.println("d - c = " + (d - c));
        System.out.println("d * a = " + (d * a));
        System.out.println("b / d = " + (b / d));
        System.out.println("c % a = " + (c % a));
        System.out.println("c + a * b = " + (c + a * b));

        //Сравнение
        System.out.println("(a + b) >= (a * 3) = " + ((a + b) >= (a * 3)));
        System.out.println("(a != b) & (c < d) = " + ((a != b) & (c < d)));
        System.out.println("(a < b) || (c > d) = " + ((a < b) || (c > d)));
        System.out.println("(a < b) && (c > d) = " + ((a < b) && (c > d)));
        System.out.println("(a + b) == (b + a) = " + ((a + b) == (b + a)));

        // Управляющая конструкция if
        if (a > b) {
            System.out.println("Первое число больше второго");
        }
        else if (a < b) {
            System.out.println("Первое число меньше второго");
        }
        else {
            System.out.println("Числа равны");
        }

        //Переполнение
        int x = Integer.MAX_VALUE;
        System.out.println("x = " + (x));
        System.out.println("x * 2 = " + (x * 2));
    }
}
