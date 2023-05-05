import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        boolean result = true;

        for (int i = 0; i < len - 1; i++) {
            if ((array[i] == n && (array[i + 1] == m) || (array[i] == m && (array[i + 1] == n)))) result = false;

        }
        System.out.println(result);
    }

}
