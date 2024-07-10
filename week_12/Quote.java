public class Quote{
    private Node start;
    private class Node {
        private String word; // the word associated w/ node
        private Node next;

        public Node(String word){
            this.word = word;
            this.next = null;
        }
    }
    public Quote(){
        start = null;
    }
    public void addWord(String word){
        Node newNode = new Node(word);
        if (start == null) start= newNode;
        // traverse linked list until x points to the last node
        else{
            Node x = start;
            if (x.next != null) x = x.next;
            x.next = newNode;
        }
    }
    // insert word to be at index i
    public void insertWord(int i, String word){
        Node newNode = new Node(word);
        Node x = start;
        for (int j = 1; j< i;j++) x = x.next;
        newNode.next = x.next;
        x.next = newNode;
    }
    // get word at index i
    public String get(int i){
        Node x = start;
        for (int j = 1; j<i; j++) x = x.next;
        return x.word;

    }
    // number of words in the quote
    public int count(){

        int count = 0;
        for (Node x = start;x!= null; x= x.next) {
            count++;
        }
        return count;

    }
    // quote into string
    public String toString(){
        String s = "";
        for (Node x = start; x != null; x = x.next) s = s + x.word + " ";
        return s;

    }

}