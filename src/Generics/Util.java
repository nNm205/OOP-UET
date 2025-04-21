package Generics;

public class Util {
    public static <T extends Comparable<T>> T min(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }

        T smallest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (smallest.compareTo(a[i]) > 0) {
                smallest = a[i];
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 9};
        Integer minInt = min(intArray);
        System.out.println("Phần tử nhỏ nhất trong mảng Integer: " + minInt);

        String[] strArray = {"apple", "banana", "orange", "grape"};
        String minStr = min(strArray);
        System.out.println("Phần tử nhỏ nhất trong mảng String: " + minStr);

        Double[] doubleArray = {5.0, 2.0, 3.0, 4.0};
        Double minDouble = min(doubleArray);
        System.out.println("Phần tử nhỏ nhất trong mảng Double: " + minDouble);
    }
}