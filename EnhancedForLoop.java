public class EnhancedForLoop {
    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 }; // total is 15
        int total = 0;

        // takes only two things:
        // first is thw type of data and itentifir, int is type, x is identifer
        // x stores values of the array as it's looping through the array - in this
        // example it will store 1, then 2, then 3, etc.
        // second the name of the array

        for (int x : array) {
            total += x;
        }

        System.out.println(total); // should print 15
    }
}
