import java.util.Scanner;

public class PostfixNotation
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter postfix expression: ");
        String postfix = scanner.nextLine();
        int result = evaluatePostfix(postfix);
        System.out.println(result);
    }

    public static int evaluatePostfix(String postfix)
    {
        Stack stack = Stack.createStack();
        for (int i = 0; i < postfix.length(); i++)
        {
            char ch = postfix.charAt(i);
            if (Character.isDigit(ch))
            {
                int num = ch - '0';
                while (i < postfix.length() - 1 && Character.isDigit(postfix.charAt(i + 1)))
                {
                    num = num * 10 + (postfix.charAt(i + 1) - '0');
                    i++;
                }

                stack.push(num);

            }
            else if (ch == '+' || ch == '-' || ch == '*' || ch == '/')

            {
                int operand2 = stack.pop();
                int operand1 = stack.pop();
                int result = 0;
                if (ch == '+')

                {
                    result = operand1 + operand2;
                }
                else if (ch == '-')

                {
                    result = operand1 - operand2;
                }
                else if (ch == '*')

                {
                    result = operand1 * operand2;
                }
                else

                {
                    result = operand1 / operand2;
                }
                stack.push(result);
            }
        }

        return stack.pop();

    }
}
