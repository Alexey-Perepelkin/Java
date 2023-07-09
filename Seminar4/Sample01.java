

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Sample01 {

    public static void main(String[] args) {


        task1();

        Node e2 = new Node();
        e2.value = 10;

        Node e1 = new Node();
        e1.value = 40;
        e1.next = e2;

        e2.prev = e1;

        LinkedList<Integer> list = new LinkedList<>();



    }

    static Scanner scanner = new Scanner(System.in);

    /**
     * Задача:
     * Реализовать консольное приложение, которое:
     * 1. Принимает от пользователя и “запоминает” строки.
     * 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
     * 3. Если введено revert, удаляет предыдущую введенную строку из памяти.
     */
    public static void task1(){
        Deque <String>deque = new ArrayDeque<>();
        while (true){
            System.out.println("Введите строку: ");
            String str = scanner.nextLine();
            if (str.isEmpty()){
                System.out.println("Завершение работы подпрограммы.");
                break;
            }
            if (str.equals("print")){
                for (Object o : deque){
                    System.out.println(o);
                }
            }
            else if (str.equals("revert")){
                System.out.println("Удаление элемента: " + deque.pollFirst());

            }
            else {
                deque.push(str);
            }

        }
    }

}

class Node{

    Node next;
    Node prev;
    int value;

}
