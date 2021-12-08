package ATM;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int amount = scanner.nextInt();
        System.out.println(amount);
        ATM atm = new ATM();

        atm.process(120);
    }

}
