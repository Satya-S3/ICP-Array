import java.util.*;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Initialize Array
        System.out.println("Enter Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        // Putting Element in Array
        System.out.println("Enter " + size + " element:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(
                "Enter 0:Quit , 1:Display , 2:Delete , 3:Search , 4:Reverse , 5:Sorting , 6:Find Max , 7:Find 2nd Max , 8:Largest Prime");
        int z = 1;
        while (z == 1) {
            switch (sc.nextInt()) {
                case 0:
                    z = 2;
                    break;

                case 1:
                    arrayPrint(arr, size);
                    break;
                case 2:
                    System.out.print("Enter Number to Delete :");
                    int a = sc.nextInt();
                    arrayDelete(arr, size, a);
                    break;

                case 3:
                    System.out.print("Enter Number Search :");
                    int b = sc.nextInt();
                    arraySearch(arr, size, b);
                    break;

                case 4:
                    arrayReverse(arr, size);
                    break;

                case 5:
                    arraySort(arr, size);
                    break;

                case 6:
                    arrayMax(arr, size);
                    break;

                case 7:
                    array2Max(arr, size);
                    break;

                case 8:
                    arrayLargePrime(arr, size);
                    break;

                default:
                    System.out.println("Invalid Error");
                    break;

            }
        }

    }

    public static void arrayPrint(int[] arr, int size) {
        System.out.print("Entered Array Are : ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayDelete(int[] arr, int size, int a) {
        for (int i = 0; i < size; i++) {

            if (a == arr[i]) {
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = 0;
            }
        }

    }

    public static void arraySearch(int[] arr, int size, int b) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == b)
                System.out.println("Element at : " + i + " Index");
            else if (i > size)
                System.out.println("Element not Found");
        }
    }

    public static void arrayReverse(int[] arr, int size) {
        int start = 0;
        int end = size - 1;
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void arraySort(int[] arr, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorting Done");
    }

    public static void arrayMax(int[] arr, int size) {
        int max = arr[0];
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max Value in array is : " + max);

    }

    public static void array2Max(int[] arr, int size) {
        int max = arr[0];
        int max2 = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];

            }
        }
        System.out.println("2nd Max Value in array is : " + max2);
    }

    public static void arrayLargePrime(int[] arr, int size) {
        int prime = 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            if (isPrime(arr[i])) {
                prime = arr[i];
            }
            if (prime >= max) {
                max = prime;
            }

        }
        System.out.println("Largest Prime is :" + max);
    }

    public static boolean isPrime(int a) {
        int count = 0;
        for (int i = 2; i < a / 2; i++) {
            if (a % i == 0) {
                count++;
            }
        }
        if (count == 0)
            return true;
        return false;
    }

}
