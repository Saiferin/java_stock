
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму пополнения:");
        int accountReplenishment = sc.nextInt();
        sc.close();
        int balance = 100;
        int stock = 1000;
        int newBalance = balance + accountReplenishment;
        int stockPay = newBalance/100;
        int balanceStock = (newBalance/100) + newBalance ;
        if (newBalance > stock) {
            System.out.println("Вы пополнили свой счет на сумму от 1000 рублей и получаете бонус в размере"+
                    " " + stockPay + " " + "И Ваш итоговый баланс составляет" + " "+ balanceStock);
        }
            else
        {
            System.out.println("Пополнение меньше 1000 рублей, Ваш баланс составляет" + " " + newBalance);
        }

    }
}
