import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        System.out.print("Внесите номер месяца - ");
        Scanner num = new Scanner(System.in);
        int monthNumber = num.nextInt();
        String month = switch (monthNumber) {
            case 1 -> "Январь";
            case 2 -> "Февраль";
            case 3 -> "Март";
            case 4 -> "Апрель";
            case 5 -> "Май";
            case 6 -> "Июнь";
            case 7 -> "Июль";
            case 8 -> "Август";
            case 9 -> "Сентябрь";
            case 10 -> "Октябрь";
            case 11 -> "Ноябрь";
            case 12 -> "Декабрь";
            default -> null;
        };
        if (month != null) {
            System.out.println(month + "месяц номер" + monthNumber);
        }
    }
}
