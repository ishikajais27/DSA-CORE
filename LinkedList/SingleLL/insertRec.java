public void insertRec(int val, int index) {
    head = insertRec(val, index, head);
}

private Node insertRec(int val, int index, Node node) {
    if (index == 0) {
        size++;
        return new Node(val, node);
    }

    if (node == null) {
        System.out.println("Index out of bounds");
        return null;
    }

    node.next = insertRec(val, index - 1, node.next);
    return node;
}