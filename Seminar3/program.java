
// Урок 3. Коллекции JAVA: Введение
// Задание
// Пусть дан произвольный список целых чисел.
// 1) Нужно удалить из него чётные числа
// 2) Найти минимальное значение
// 3) Найти максимальное значение
// 4) Найти среднее значение

import java.util.ArrayList;
import java.util.Random;

public class program {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<Integer>();  
        Random random=new Random();
        
      
        for (int j=1 ;j<11;j++){
            list.add(random.nextInt(4,100 ));
        }
        
        myList myList = new myList(list);
        // r.DelEvNum();
        myList.PrintList();
        myList.MinNum();
        myList.MaxNum();
        myList.MedNum();
}
}
