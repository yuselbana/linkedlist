public class Runner {
    public static void main(String []args) {
        
    LinkedList list = new LinkedList();
    list.insert(2);
    list.insert(3);
    list.insert(4);
    list.insertAtStart(1);
    list.insertAt(14,3);
    list.delete(2);
    list.show();
    }
}
