import java.util.LinkedList;
import java.util.Scanner;

public class Stock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        LinkedList<Integer> shares = new LinkedList<>();
        LinkedList<Integer> prices = new LinkedList<>();

        int total = 0;

        while (true) {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            String line = input.nextLine().trim();

            if (line.isEmpty()) {
                break;
            }

            // "Buy 100 shares at $10 each"
            String[] parts = line.split(" ");
            String action = parts[0];
            int x = Integer.parseInt(parts[1]);
            int y = Integer.parseInt(parts[4].substring(1)); // remove the $

            if (action.equalsIgnoreCase("Buy")) {
                System.out.println("Buying now...");
                shares.add(x);
                prices.add(y);
                printQueues(shares, prices);
            } else if (action.equalsIgnoreCase("Sell")) {
                System.out.println("Selling the shares now...");
                int toSell = x;

                while (toSell > 0 && !shares.isEmpty()) {
                    int lotShares = shares.getFirst();
                    int lotPrice = prices.getFirst();
                    int sold;

                    if (lotShares <= toSell) {
                        // Lot is sold, remove it
                        sold = lotShares;
                        shares.removeFirst();
                        prices.removeFirst();
                    } else {
                        // Only part of the lot is sold, keep the rest at the front
                        sold = toSell;
                        shares.set(0, lotShares - sold);
                    }

                    total += sold * (y - lotPrice);
                    toSell -= sold;
                }

                System.out.println("Total Capital Gain / Loss: " + total);

                if (toSell > 0) {
                    System.out.println("No shares to sell!");
                }
                printQueues(shares, prices);
            } else {
                System.out.println("Invalid query, use Buy or Sell.");
            }
        }
        System.out.println("Final Capital Gain / Loss: " + total);
    }

    public static void printQueues(LinkedList<Integer> shares, LinkedList<Integer> prices) {
        System.out.println("Queue for Share: Queue: " + shares);
        System.out.println("Queue for Price: Queue: " + prices);
    }
}