import java.util.LinkedList;
import java.util.Random;

public class Task_1 {
    
public static void main(String[] args) {

        
       LinkedList <Integer>list= new LinkedList<>();
          
        Random random=new Random();
        System.out.println("зашло");      
        for (int j=1 ;j<11;j++){
            int i=random.nextInt(4,100 );
            System.out.printf(i +", ");
            
            list.push(i);
        }
        System.out.printf("%n");
        System.out.printf("%n");
        System.out.println("вышло");  
        for (Object o : list){
            System.out.printf(o+", ");
        }
      
    }
}