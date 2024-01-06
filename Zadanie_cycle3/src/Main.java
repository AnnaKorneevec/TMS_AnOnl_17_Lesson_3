import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите любое целое положительное число");
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            if (scan.hasnextInt()) {
                num = scan.nextInt();
                if (num >= 1) {
                    int sum = 0;
                    for (int i = 1; i <= num; i++) {
                        sum += i;
                    }
                    System.out.println("Сумма от 1 до" + num + ":" + sum);
    }
}
