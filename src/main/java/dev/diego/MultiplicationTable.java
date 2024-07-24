package dev.diego;

public class MultiplicationTable {

    public static String[] generateTable(int n) {
        String[] results = new String[10];
        for (int i = 1; i <= 10; i++) {
            results[i - 1] = n + " x " + i + " = " + (n * i);
        }
        return results;
    }

    public static void main(String[] args) {
        int n = 5; // Ejemplo
        String[] table = generateTable(n);
        for (String line : table) {
            System.out.println(line);
        }
    }
}
