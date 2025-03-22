package linkedList.doublyLinkedList;

public class Main {
    public static  void main(String[] args){
        DLL doublyLinkedList = new DLL();
        doublyLinkedList.insertFirst(10);
        doublyLinkedList.insertFirst(12);
        doublyLinkedList.insertFirst(13);
        doublyLinkedList.insertFirst(14);
        doublyLinkedList.insertFirst(15);
        doublyLinkedList.insertLast(99);

        doublyLinkedList.display();
    }
}
