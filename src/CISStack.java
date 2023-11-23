import java.util.Arrays;

public class CISStack {
    // Array property.
    private Integer[] stack;



    // Size property.
    private int size;
    // Pointer property
    private int pointer;

    // Constructor.
    public CISStack(int maxSize) {
        this.stack = new Integer[maxSize];
        this.size = 0;
        this.pointer = -1;
    }


    public void push(int s)
    {
            pointer++;
            stack[pointer] = s;
            size++;
    }

    public int pop()
    {
        int poppedValue = stack[pointer];
            pointer--;
            size--;
            return poppedValue;


    }

    public boolean isEmpty()
    {
        return pointer==-1;
    }

    public int size()
    {
        return size;
    }

    @Override
    public String toString() {
        return "CISStack{" +
                "stack=" + Arrays.toString(stack) +
                ", size=" + size +
                ", pointer=" + pointer +
                '}';
    }











    // Constructor.

    // Push. This method pushes a value onto the top of the stack.

    // Pop. This method pops a value from the top of the stack.

    // isEmpty. Returns a boolean indicating whether the linked list is empty.

    // size. Returns the size of the queue.

    // toString. Returns a description of the queue in, for example, the following format:
    // CISStack{stack=[7, 11], size=2, pointer=1}

}
