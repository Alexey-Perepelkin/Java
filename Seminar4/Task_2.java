// 2 *. Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


import java.util.LinkedList;
import java.util.Random;

public class Task_2 {

    public static void main(String[] args) {

        
       LinkedList <Integer>list= new LinkedList<>();
          
        Random random=new Random();
        System.out.println("зашло");      
        for (int j=1 ;j<11;j++){
            int i=random.nextInt(4,100 );
            System.out.printf(i +", ");
            
            list.add(i);
        }
        System.out.printf("%n");
        MyQueue <Integer> myList = new MyQueue<>(list);
        myList.print();
        myList.enqueue(2);
        myList.print();
        myList.dequeue(0);
        myList.print();
        myList.first(1);
        myList.print();
        
      
    }
}
