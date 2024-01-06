import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("Введите номер - ");
        Scanner scan = new Scanner(System.in);
        int colorNumber = scan.nextInt();
        String color = switch(colorNumber) {
            case 1 -> "Красный";
            case 2 -> "Оранжевый";
            case 3 -> "Желтый";
            case 4 -> "Зеленый";
            case 5 -> "Голубой";
            case 6 -> "Синий";
            case 7 -> "Фиолетовый";
            default -> null;
        };
        if(color != null) {
            System.out.println(color + "Номер цвета" + colorNumber);

}
}