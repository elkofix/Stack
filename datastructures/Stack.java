package datastructures;
public class Stack<K>{
    public K top;
    public Node<K> list;

    public K pop(){
        K result = top;
        if(list!=null) {
            top = list.current;
            list = list.next;
        }
        return result;
    }

    public K peek(){
        return top;
    }

    public void push(K obj){
        list = new Node<>(list, top);
        top  = obj;
    }

    public void clear(){
        top = null;
        list = null;
    }

    class Node<K>{

        K current;
        Node<K> next;
        public Node(Node<K> next, K current){
            this.next = next;
            this.current = current;
        }
    }
}
