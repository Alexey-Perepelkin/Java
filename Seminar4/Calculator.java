//3. В калькулятор (урок 1 и 2) добавьте возможность отменить последнюю операцию.
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        try {
            while (true) {
                System.out.println("Для вычисдения нажмите 1 ");
                System.out.println("Вернуться на операция назад введите <");
                System.out.println("Для выхода нажмите 0");
                Scanner input = new Scanner(System.in);
                char menuNum = input.nextLine().charAt(0);

                File file = new File("log.txt");
                FileWriter fileWriter = new FileWriter(file, true);
                
                if (menuNum == '1') {
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Введите первое число: ");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.print("Введите операцию (+ - * /): ");
                    char op = scanner.nextLine().charAt(0);
                    System.out.print("Введите второе число: ");
                    int b = Integer.parseInt(scanner.nextLine());
                    String rezult = "";
                    switch (op) {
                        case '+':
                            rezult = a + " + " + b + " = " + add(a, b);
                            System.out.println(rezult);
                            fileWriter.write(rezult + '\n');
                            break;
                        case '-':
                            rezult = a + " - " + b + " = " + minus(a, b);
                            System.out.println(rezult);
                            fileWriter.write(rezult + '\n');
                            break;
                        case '*':
                            rezult = a + " * " + b + " = " + multi(a, b);
                            System.out.println(rezult);
                            fileWriter.write(rezult + '\n');
                            break;
                        case '/':
                            rezult = a + " / " + b + " = " + divide(a, b);
                            System.out.println(rezult);
                            fileWriter.write(rezult + '\n');
                            break;
                        default:
                            System.out.println("Wrong operation!");
                            break;
                        
                    }
                    list.push(rezult);
                } 
                else if (menuNum == '<') {
                    
                    System.out.println("Предыдущее вычисление " + list.pollFirst());
                } 
                else if (menuNum == '0') {
                    break;
                }

                fileWriter.flush();
                fileWriter.close();
            }
        }

        catch (Exception e) {
            System.out.println("Исключение при работе с файлом.");
        }

    }

    private static int divide(int a, int b) {
        if (b != 0)
            return a / b;
        return -1;
    }

    private static int multi(int a, int b) {
        return a * b;
    }

    private static int minus(int a, int b) {
        return a - b;
    }

    private static int add(int a, int b) {
        return a + b;
    }

}
