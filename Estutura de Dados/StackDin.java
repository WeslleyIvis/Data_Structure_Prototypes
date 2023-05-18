public class StackDin {
    private Node topo;

    public StackDin() {
        this.topo = null;
    }

    public boolean isEmpty() {
        return this.topo == null;
    }

    public Object top() {
        if (!isEmpty())
            return this.topo.getData();
        else
            return null;
    }

    public Object pop() {
        Object temp = null;
        if (!isEmpty()) {
            temp = topo.getData();
            topo = topo.getProx();
        }
        return temp;
    }

    public void push(Object data) {
        this.topo = new Node(data, this.topo);
    }

    public String toString() {
        String resp = "P[";
        Node temp = this.topo;

        while (temp != null) {
            resp += temp.getData().toString() + ", ";
            temp = temp.getProx();
        }

        return resp + "]";
    }
}
