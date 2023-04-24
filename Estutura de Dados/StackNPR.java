public class StackNPR {
    private String data[];
    private int top;

    public StackNPR(int size) {
        this.data = new String[size];
        this.top = -1;
    }

    public String topValue() {
        if (!isEmpty())
            return this.data[this.top];
        else
            return "-1";
    }

    boolean isFull() {
        return this.top == this.data.length - 1;
    }

    boolean isEmpty() {
        return this.top < 0;
    }

    public void push(String value) {
        if (!isFull()) {
            this.top++;
            this.data[top] = value;
        }
    }

    public String pop() {
        if (!isEmpty())
            return this.data[top--];
        else
            return "-1";
    }

    public void write() {
        String data = "P: [";

        for (int i = 0; i <= this.top; i++) {
            data += this.data[i] + ", ";
        }

        data += "]";

        System.out.println(data);
    }
}
