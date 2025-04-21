package Generics;

class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}

public class ArrayAlg {
    public static <T extends Comparable<T>> Pair<T> getMinMax(T[] a) {
        if (a == null || a.length == 0) {
            return null;
        }
        T minValue = a[0];
        T maxValue = a[0];
        for (int i = 1; i < a.length; i++) {
            if (minValue.compareTo(a[i]) > 0) {
                minValue = a[i];
            }
            if (maxValue.compareTo(a[i]) < 0) {
                maxValue = a[i];
            }
        }
        return new Pair<>(minValue, maxValue);
    }

    public static void main(String[] args) {
        String[] words = {"Mary", "had", "a", "little", "lamb"};
        Pair<String> result = ArrayAlg.getMinMax(words);
        System.out.println("min = " + result.getFirst());
        System.out.println("max = " + result.getSecond());
    }
}
