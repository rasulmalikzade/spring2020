package Methods_VariableScope_Conditionals_Loops;
public class VariableScope {
    // any methods can access x, bcs outside of any methods;
    static int x; // declaring the variable x

    public static void main(String[] args) {
        x = 5; // assigning a value to x
        System.out.println(x);
        doSomething();
        System.out.println(x);

        int y = dosomething2();

        System.out.println(y);
    }
    static void doSomething() {
        x=10;
    }
    static int dosomething2() {
  // bcs y is declared inside of this method, no other method has access to y.
        int y = 100; // declaring and initializing value
        return y;
    }
}
