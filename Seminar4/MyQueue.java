// 2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class MyQueue <E> {
    private LinkedList <E> elements = new LinkedList<E>();

    //Конструктор
    public MyQueue() { }

    public MyQueue(LinkedList<E> linkedList) {
        this.elements = linkedList;
   
    }
//******************
// Добавляет елемент в конец очереди
    public void enqueue (E e){
        int i =elements.size();
        elements.add(i, e);
    }
// Возвращает первый элемент из очереди и удаляет его
    public void dequeue(int i){
        System.out.printf("Удаление %d элемента, значение %d %n",i, elements.pollFirst() );
        // elements.remove(i);
        
    }
//  Возвращает первый элемент из очереди, не удаляя   
    public void first(int i){
        System.out.printf("Элемент %d, значение %d %n",i,elements.get(i));
    }
    public void print(){
        System.out.printf(elements+"%n");
    }
}
