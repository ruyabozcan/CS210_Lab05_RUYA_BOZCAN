import java.util.Scanner;

public class ParenthesesMatchOrNot
{
    public static void main(String[] args)
    {
        Stack stack = Stack.createStack();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter parentheses: ");
        String parentheses = scanner.nextLine();
        boolean match = true;

        for (int i = 0; i < parentheses.length(); i++)
        {
            char ch = parentheses.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{')

            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == ']' || ch == '}')

            {
                if (stack.isEmpty())

                {
                    match = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{'))

                {
                    match = false;
                    break;
                }
            }
        }

        if (match && stack.isEmpty())

        {
            System.out.println("Parentheses match");
        }
        else

        {
            System.out.println("Parentheses doesn't match");
        }
    }
}
