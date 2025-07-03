import java.util.Scanner;

public class buyTwoChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: array size
        System.out.println("Enter number of chocolates:");
        int n = sc.nextInt();

        int[] prices = new int[n];
        System.out.println("Enter chocolate prices:");
        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        System.out.println("Enter money you have:");
        int money = sc.nextInt();

        // Find two smallest prices
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {
            if (price < min1) {
                min2 = min1;
                min1 = price;
            } else if (price < min2) {
                min2 = price;
            }
        }

        int total = min1 + min2;
        if (total > money) {
            System.out.println("You can't buy: Money left = " + money);
        } else {
            System.out.println("You can buy: Money left = " + (money - total));
        }
    }
}
