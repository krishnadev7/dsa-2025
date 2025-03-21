package linkedList;

public class Main {
    public static void main(String[] args){
        Linkedlist  list = new Linkedlist();
        list.insertFirst(10);
        list.insertFirst(12);
        list.insertFirst(13);
        list.insertFirst(14);
        list.insertFirst(15);
        list.insertFirst(16);
        list.insertLast(30);
        list.insert(100,4);
        list.insertFirst(17);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());

        list.display();
    }
}
