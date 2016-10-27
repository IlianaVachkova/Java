import java.util.Scanner;

public class CollectResources {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] items = console.nextLine().split(" ");
        boolean[] itemsFlags = new boolean[items.length];
        int tests = console.nextInt();
        console.nextLine();
        long maxQuantity = 0;
        long currentQuantity;
        int currentPosition;

        for (int test = 0; test < tests; test++) {
            currentQuantity = 0;
            itemsFlags = new boolean[items.length];
            String[] input = console.nextLine().trim().split("\\s+");
            int start = Integer.parseInt(input[0]);
            int step = Integer.parseInt(input[1]);
            currentPosition = start;
            step %= items.length;

            while (!itemsFlags[currentPosition]) {
                String[] resourceData = items[currentPosition].split("_");
                String resourceType = resourceData[0];
                int quantity;
                if (resourceData.length == 1){
                    quantity = 1;
                }else  {
                    quantity = Integer.parseInt(resourceData[1]);
                }
                switch (resourceType){
                    case "stone":
                    case "gold":
                    case "wood":
                    case "food":
                        currentQuantity += quantity;
                        itemsFlags[currentPosition] = true;
                }
                currentPosition += step;
                currentPosition %= items.length;
            }

            if (currentQuantity > maxQuantity){
                maxQuantity = currentQuantity;
            }
        }

        System.out.println(maxQuantity);
    }
}
