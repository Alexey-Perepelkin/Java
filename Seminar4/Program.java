

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        Person p = new Person();
        p.age = 22;
        p.name = "Person1";
        p.printInfo();

        Employee person = new Employee();
        person.age = 30;
        person.name = "User";
        person.salary = 1000.12;
        person.printInfo();

        ArrayList arrayList1 = new ArrayList(100);
        arrayList1.add(12);
        arrayList1.add("hello");
        arrayList1.add(p);
        arrayList1.add(person);
        processCollection(arrayList1);

        MyArrayList<String> myArrayList1 = new MyArrayList<>(new String[50]);
        myArrayList1.add("asdasd");
        myArrayList1.add("asdas");
        myArrayList1.add("asdasd");
        System.out.println("Кол-во элементов коллекции: " + myArrayList1.size());


    }

    static void processCollection(ArrayList list){
        for (Object element : list) {
            if (element instanceof Person){
                Person p = (Person)element;
                System.out.println(p.name + " " + p.age);
            }
        }
    }

}





class MyArrayList<E>{

    E[] array;
    int topIndex = -1;

    public MyArrayList(E[] initialArray){
        array = initialArray;
    }

    public int size(){
        return topIndex + 1;
    }

    public void add(E e){
        topIndex++;
        array[topIndex] = e;
    }


}

class Employee extends Person{

    double salary;

    @Override
    public void printInfo() {
        System.out.println(name + " " + age + " " + salary);
    }
}

class Person{

    String name;
    int age;

    public void printInfo(){
        System.out.println(name + " " + age);
    }



}