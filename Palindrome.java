

public class Palindrome {
    /**
     * TODO:
     * A palindrome is a word that is spelt the same forwards and backwards.
     * Example of palindromes are noon, madam, and racecar.
     * Write a program that allows the user to input a word
     * and outputs whether it is a palindrome or not.
     *
     * A naive solution would be to reverse the string and compare it with the original.
     * However, this approach uses O(n) extra space for the reversed string, which is not optimal.
     * Try the naive solution first and check if it works.
     *
     * Once that works, try the following optimised solution:
     * Initialize two pointers, i at the start (0) and j at the end (n-1) of the string.
     * While i < j:
     *      Check if s[i] != s[j]. If true, return false.
     *      Increment i and decrement j.
     * If the loop completes without returning false, return true.
     *
     * The time complexity of this algorithm is O(n) because we traverse the string once.
     * The space complexity is O(1) as we only use a constant amount of extra space for the pointers.
     *
     */
}
