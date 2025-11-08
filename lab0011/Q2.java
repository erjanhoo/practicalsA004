import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("How many numbers you want to add?");
        int n = sc.nextInt();

        System.out.println("Enter numbers:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted array: " + arr);

        System.out.println("What number's index you want to get?");
        int target = sc.nextInt();


        int left = 0;
        int right = arr.size() - 1;
        int position = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) == target) {
                position = mid;
                break;
            }
            if (arr.get(mid) < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (position != -1) {
            System.out.println("Found at index: " + position + " (value = " + arr.get(position) + ")");
        } else {
            System.out.println("No such number");
        }
    }
}
