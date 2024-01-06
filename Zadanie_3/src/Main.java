import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите число - ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        if (number%2 == 0){
            System.out.println(number + " - четное число");
        }else System.out.println(number + " - нечетное число");

    }
}