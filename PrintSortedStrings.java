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
// The number of possible strings of length K to be made from C choices equals
// to:

// C^K (number of character choices to the number of possible positions)

// For 26 letters in an alphabet, for 5-letter strings, there will be 11881376
// possible combinations

// This happens because every time a new letter is added to a string, there are
// C choices for what the next letter can be

// Time complexity of this operation is O(C^K) - this is permutation with
// repetition

// It checks each string is sorted - if yes, prints the strig, if not, does not
// print it

// Time complexity for this operation is O(K), where K is the length of the
// string because at code will need to loop over each char in str to compare to
// know

// if it's sorted or not

// Code uses recursion function to generate the possible strings

// Since each generated string needs to be checked for being sorted - the time
// complexity of the whole operation will be O(K*C^K)

// Another way to think about C^K - it is the number of nodes in the recursion
// tree that generates all possible combinations
// Example:

// C (number of possible characters) is 2
// K (length of desired strings) is 3

// Recursion tree for generating combinations looks like this:

// Level 1: 2^1 'a' 'b'
// Level 2: 2^2 'aa' 'ab' 'ba' 'bb'
// Level 3: 2^3 'aaa' 'aab''aba' 'abb' 'baa' 'bab' 'bba' 'bbb'

// The cost to add a next letter to the string in sequence is linear because we
// copy old chars to new str (in java) and then append a new letter to a string
// that's already generated, we don't regenerate at each level
// Cost at each level multiplied by number of strings at each level
// For level 1, the cost is 1, because this depends on the length of string
// that's being copied and appended

// (2^1)*1 - number of strings in 2^1, the cost to generate letter is 1
// (2^2)*2 - number of strings is 2^2, the cost is 2 (copy 1 character from last
// string and append one letter)
// (2^3)*3 - number of strings is 2^3, the cost is 3 (copy 2 characters from
// last string and append one letter)

// The total cost for the tree: (2^1)*1 + (2^2)*2 + (2^3)*3

// The only care for the term at the lowet level since that's were the most work
// is done, other terms are not significant for big O

// Applying general pattern of C and K, we get

// C^K nodes plus K work to check if each string is sorted

// This gives Big O (K * C^K)
