import java.util.Scanner;
public class StackTest
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the stack: ");
        int capacity = scanner.nextInt();
        Stack stack = Stack.createStack(capacity);
        while (true)
        {

            System.out.println("1. Push an element to the stack");
            System.out.println("2. Pop an element from the stack");
            System.out.println("3. Peek at the top element of the stack");
            System.out.println("4. Check if the stack is empty");
            System.out.println("5. Check if the stack is full");
            System.out.println("6. Exit");

            System.out.print("Enter: ");

            int choice = scanner.nextInt();
            if (choice == 1)

            {
                System.out.print("Enter the element to push: ");
                int value = scanner.nextInt();
                stack.push(value);
                System.out.println("Element pushed to the stack");
            }
            else if (choice == 2)

            {
                try
                {
                    int poppedValue = stack.pop();
                    System.out.println("Popped element from the stack: " + poppedValue);
                }

                catch (IllegalStateException e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
            }
            else if (choice == 3)

            {
                try
                {
                    int topValue = stack.peek();
                    System.out.println("Top element of the stack: " + topValue);
                }

                catch (IllegalStateException e)
                {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            else if (choice == 4)
            {
                System.out.println("Stack is empty: " + stack.isEmpty());
            }

            else if (choice == 5)
            {
                System.out.println("Stack is full: " + stack.isFull());
            }

            else if (choice == 6)
            {
                System.exit(0);
            }

            else
            {
                System.out.println("Invalid choice");
            }
        }
    }
}

