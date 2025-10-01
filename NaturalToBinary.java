
public class NaturalToBinary {
    /**
     * TODO:
     * Write a program which asks the user to input a natural number (this is the mathematical term
     * we use for positive integers).
     * The program should output this number in binary representation
     * (base 2).
     * The following is an algorithm converting a number from decimal to any other base.
     * a) Let n be the decimal number.
     * b) Let m be the string representing the number, initially empty, in the target base that we
     * are converting to. We'll be composing it right to left.
     * c) Let b be the base of the number we are converting to (this would be the value 2 for binary).
     * d) Repeat until n becomes 0:
     *      (i) Divide n by b using integer division, letting the result be d and the remainder be r.
     *      (ii) Write the remainder, r, as the leftmost digit of m.
     *      (iii) Let d be the new value of n.
     */
    private String binaryNumber = "";

    public Integer convertDecimalToBinary(Integer decimalNumber) {

    }

    public static void main(String[] args) {
        NaturalToBinary n = new NaturalToBinary();
        System.out.println(n.convertDecimalToBinary(1));
        System.out.println(n.convertDecimalToBinary(128));
        System.out.println(n.convertDecimalToBinary(1024));
    }
}
