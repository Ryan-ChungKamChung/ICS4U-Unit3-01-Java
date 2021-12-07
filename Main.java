/*
 * This program pushes and prints a stack.
 *
 * @author  Ryan Chung
 * @version 1.0
 * @since   2021-12-07
 */

/** This program demonstrates a stack. */
final class Main {

    /**
     * Prevents instantiation.
     * Throw an exception IllegalStateException when called.
     *
     * @throws IllegalStateException
     *
     */
    private Main() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Creates an instance of MrCoxallStack and uses its methods.
     *
     * @param args No args will be used.
     */
    public static void main(String[] args) {
        final MrCoxallStack aStack = new MrCoxallStack();
        final int number = 7;
        aStack.push(number);
        aStack.showStack();
    }
}
