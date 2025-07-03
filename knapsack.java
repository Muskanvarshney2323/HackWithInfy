package ActivitySelection;
import java.util.*;

public class knapsack {

    static class Item {
        double value, weight;

        Item(double value, double weight) {
            this.value = value;
            this.weight = weight;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: n and W
        int n = sc.nextInt();
        double W = sc.nextDouble();

        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            double value = sc.nextDouble();
            double weight = sc.nextDouble();
            items[i] = new Item(value, weight);
        }
        Arrays.sort(items, (a, b) -> Double.compare(b.value / b.weight, a.value / a.weight));

        double maxValue = 0.0;

        for (Item item : items) {
            if (W == 0) break;
            double take = Math.min(item.weight, W);

            maxValue += take * (item.value / item.weight);

            W -= take;
        }

        System.out.printf("%.2f\n", maxValue);
    }
}

