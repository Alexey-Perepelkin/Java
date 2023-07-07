import java.util.ArrayList;


public class myList {
    private ArrayList<Integer> list= new   ArrayList<>(); 
    
    public myList(ArrayList<Integer> list){
        this. list=list;

    }
    public void DelEvNum (){
        for (int i=0 ;i<this.list.size();i++){
            if (this.list.get(i)%2==0){
                this.list.remove(i);
            }
        }
    }
    public void MinNum(){
        int min = this.list.get(0);
        for (int i=0 ;i<this.list.size();i++){
            if (this.list.get(i)< min){
                min=this.list.get(i);
            }
        }
        System.out.printf("%n минимальное число в списке = %d",min);
    }
    public void MaxNum(){
        int max = this.list.get(0);
        for (int i=0 ;i<this.list.size();i++){
            if (this.list.get(i)> max){
                max=this.list.get(i);
            }
        }
        System.out.printf("%n максимальное число в списке = %d",max);
    }
    public void MedNum(){
        int med = 0;
        for (int i=0 ;i<this.list.size();i++){
            med +=this.list.get(i);
             }
        med=med/this.list.size();
        System.out.printf("%n среднее значение = %d",med);
    }
    public void PrintList(){
        System.out.print(this.list);
}
    
}
