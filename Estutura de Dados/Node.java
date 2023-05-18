class Node {
    private Object data;
    private Node prox;

    public Node(Object data, Node prox) {
        this.data = data;
        this.prox = prox;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }

    public void setProximo(Node prox) {
        this.prox = prox;
    }

    public Node getProx() {
        return this.prox;
    }
}