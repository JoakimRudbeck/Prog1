package kapitel14_Samlingar;

import java.util.Stack;

public class Samlingar_Stack {

    public static void main(String[] args) {
        stackExempel();
    }

    private static void stackExempel() {

        // En stack är en samling som fungerar som en myrstack:
        // Man lägger på ett element i taget överst i stacken med metoden push()
        // Man kan ta bort ett element från stacken med metoden pop()
        // Man kan titta på det översta elementet i stacken med metoden peek()

        System.out.println("STACK EXEMPEL");
        Stack<String> minStack = new Stack(); // Skapar en ny top stack som ska innehålla strängar
        minStack.push("Vaknade"); // push lägger till ett nytt värde överst på stacken
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        // peek kollar på översta värdet i stacken
        minStack.push("Gick till skolan");
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        minStack.push("Är i skolan");
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        System.out.println();
        System.out.println(minStack);
        minStack.pop(); // pop tar bort översta värden från stacken
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());
        minStack.pop();
        System.out.println("Nuvarande översta värde i stacken: " + minStack.peek());

        System.out.println(minStack);

    }
}
