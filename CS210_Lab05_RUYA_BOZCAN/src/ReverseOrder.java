import java.util.Scanner;

public class ReverseOrder
{
    public static void main(String[] args)
    {
        Stack stack = Stack.createStack();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integers (press -1 to stop):");
        int input;
        do

        {
            input = scanner.nextInt();

            if (input != -1)
            {
                stack.push(input);
            }
        }

        while (input != -1);
        System.out.println("Numbers in reverse order:");

        while (!stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
    }
}
