import java.util.Scanner;

public class SpudYouLove {
    /**
     * TODO: Spud You Love is a small eatery which specialises in Jacket Potatoes and toppings. They have
     * asked you to write a Java program which will calculate the cost of a customer's order.
     * A customer can order either a medium or large jacket potato. They can then choose any number
     * of toppings, however, they get a bulk discount if they order 3 or more toppings.
     * The total price is calculated according to the following table:
     * up to 2 toppings:
     * Medium Jacket Potato £2.50 + 50p per topping
     * Large Jacket Potato £3.50 + 55p per topping
     * 3 or more toppings:
     * Medium Jacket Potato   £2.50 + 40p per topping
     * Large Jacket Potato   £3.50 + 45p per topping
     * Write a Java program that asks the user what size jacket potato they want. The user should
     * type M for medium or L for large. The user should then be asked how many toppings they
     * want (ignore what exact toppings they order). The code should then print the total cost of
     * their order. An example run might be:
     * Spud You Love
     * =============
     * Medium(M) or large(L) jacket potato: L
     * Number of toppings: 3
     * Total cost: 4.85 pounds
     * The cost is 3:50 + (0:45 *3) = 4.85.
     * Note: Loops are not needed for this program, but nested if statements are.
     */


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Spud You Love");
        System.out.println("==============");
        System.out.print("Medium(M) or Large(L) jacket potato: ");
        String size = in.next();
        System.out.print("Number of toppings = ");
        int num = in.nextInt();
        SpudYouLove s = new SpudYouLove();
        double totalCost = s.calculateTotalCost(size, num);
        System.out.println("Total Cost = " + totalCost);


    }


}
