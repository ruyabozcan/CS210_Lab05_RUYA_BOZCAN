public class Stack
{
    int capacity;
    int topOfStack;
    int[] array;

    //capacity
    public Stack(int capacity)
    {
        this.capacity = capacity;
        array = new int[capacity];
        topOfStack = -1;
    }

    //push value
    public void push(int value)
    {
        if (topOfStack == capacity - 1)
        {
            throw new StackOverflowError("Stack is full");
        }
        topOfStack++;
        array[topOfStack] = value;
    }

    //PopStack()
    public int pop()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Stack is empty");
        }
        int value = array[topOfStack];
        topOfStack--;
        return value;
    }

    //Peek()
    public int peek()
    {
        if (isEmpty())
        {
            throw new IllegalStateException("Stack is empty");
        }
        return array[topOfStack];
    }

    //IsEmpty()
    public boolean isEmpty()
    {
        return topOfStack == -1;
    }

    //IsFull()
    public boolean isFull()
    {
        return topOfStack == capacity - 1;
    }

    //CreateStack()
    public static Stack createStack(int capacity)
    {
        return new Stack(capacity);
    }

    //PushStack()
    public void PushStack(int value)
    {
        push(value);
    }
}
