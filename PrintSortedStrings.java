public class PrintSortedStrings {

    public static int numChars = 26;

    public static void printSortedStrings(int remaining) {
        printSortedStrings(remaining, "");
    }

    public static void printSortedStrings(int remaining, String prefix) {
        if (remaining == 0) {
            if (isInOrder(prefix)) { // checking if string is sorted using isInOrder function - 2) O(K) to check if
                                     // str is sorted
                System.out.println(prefix);
            }
        } else {
            for (int i = 0; i < numChars; i++) { // code that uses function ithLetter to generate each string - O()C^K
                char c = ithLetter(i);
                printSortedStrings(remaining - 1, prefix + c); // calling recursively to generate next letter, or if
                                                               // remaining is 0, no more letters needed in string, can
                                                               // check if is sorted and print if it is
            }
        }
    }

    public static boolean isInOrder(String s) { // function to check each string
        for (int i = 1; i < s.length(); i++) { // O(K) where K is length of string
            int previous = ithLetter(s.charAt(i - 1));
            int current = ithLetter(s.charAt(i));
            if (previous > current) {
                return false; // str not sorted
            }
        }
        return true;
    }

    public static char ithLetter(int i) { // function to generate a letter for a string
        return (char) (((int) 'a') + i);
    }

    public static void main(String[] args) {
        printSortedStrings(5);
    }
}

// What does this code do?
// It takes the number of characters in the alphabet (denoted as C)
// It generates all possible permutations of the string of desired length
// (denoted as K)
// The number of possible strings of length k to be made from c choices equals
// to

// C^K (number of character choices to the number of possible positions)
// For 26 letters in an alphabet, for 5-letter strings, there will be 11881376
// possible combinations
// This happens because every time a new letter is added to a string, there are
// C choices for what the next letter can be
// Time complexity of this operation is O(C^K)

// It checks each string is sorted - if yes, prints the strig, if not, does not
// print it
// Time complexity for this operation is O(K), where K is the length of the
// string because at code will need to loop over each char in str to compare to
// know
// if it's sorted or not

// Code uses recursion function to generate the possible strings

// Since each generated string needs to be checked for being sorted - the time
// complexity of the whole operation will be O(K*C^K)
