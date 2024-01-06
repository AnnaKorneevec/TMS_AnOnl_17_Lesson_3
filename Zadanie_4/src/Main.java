import Scanner.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Внесите температуру на улице - ");
        Scanner scan = new Scanner(System.in);
                int t = scan.nextInt();
        if(t <= -20) {
            System.out.println("Холодно");
        } else if (t > -20 && t <= -5) {
            System.out.println("Нормально");
        } else if (t > -5) }
    System.out.println("Тепло");
         }
    }
}