public class QueueCircular {
    private int total;
    private int start;
    private int end;
    private Integer data[];

    public QueueCircular(int max) {
        this.data = new Integer[max];
        this.total = 0;
        this.start = 0;
        this.end = 0;
    }

    public boolean isEmpty() {
        return this.total == 0;
    }

    public boolean isFull() {
        return this.total == data.length;
    }

    public void enqueue(int value) {
        if (!isFull()) {
            this.data[end] = value;
            this.total++;
            this.end++;
            this.end %= data.length;
        } else
            System.out.println("fila cheia");

    }

    public Integer dequeue() {
        if (!isEmpty()) {
            Integer value = this.data[this.end];
            System.out.println(this.data[this.start]);
            this.data[this.start] = null;
            this.total--;
            this.start++;
            this.start %= this.data.length;
            return value;
        }

        return -1;
    }

    public void write() {
        String value = "F: [";
        for (int i = 0; i < this.data.length; i++) {
            if (!(this.data[i] == null)) {
                value += this.data[i] + ", ";
            }
        }

        value += "]";

        System.out.println(value);
    }
}
