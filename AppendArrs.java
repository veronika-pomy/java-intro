public class AppendArrs {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, };
        int[] array2 = { 4, 5, 6, };

        int[] arrCopy = append(array1, array2);

        for (int i = 0; i < arrCopy.length; i++) {
            System.out.println(arrCopy[i]);
        }

    }

    public static int[] append(int array1[], int array2[]) {

        // make the new array
        int[] arrayNew = new int[array1.length + array2.length];

        // counter for the second for loop
        int counter = 0;

        // add array1 to the new array
        for (int a = 0; a < array1.length; a++) {
            arrayNew[a] = array1[a];
            counter++;
        }

        // add array2 to the new array
        for (int b = 0; b < array2.length; b++) {
            arrayNew[counter] = array2[b];
            counter++;
        }

        return arrayNew;
    }
}
