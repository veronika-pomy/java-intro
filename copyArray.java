// copy array using a for loop

public class copyArray {
    public static void main(String[] args) {
        int[] array = { 4, 5, 6, };
        int[] copy = new int[5];

        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }

        for (int i = 0; i < copy.length; i++) {
            System.out.println(copy[i]);
        }
    }
}
