package Seminar1.Class_Work;
import org.json.simple.JSONObject;
import java.io.*;
public class Main {
    public static void main(String[] args) {
        //считывание файла посимвольно
        
        // try(FileInputStream fin= new FileInputStream("Seminar1/Class_Work/note.txt");
        //     FileOutputStream fos =new FileOutputStream("Seminar1/Class_Work/notes_new.txt")){
        //     byte[] buffer = new byte[256];
        //     int i =0;
        //     while(( i=fin.read(buffer))!=-1){
        //         //System.out.print((char)i);
        //         fos.write(buffer,0,i);
        //     }
        //     System.out.print((char)buffer[3]);
        // }
        // catch (Exception e) {
        //     System.out.println(e.getMessage());
        // }
        JSONObject resultJson = new JSONObject();    
        resultJson.put("name","foo");
        resultJson.put("num",100);
        resultJson.put("is_vip",true);
        resultJson.put("nickname",null);
        System.out.print(resultJson.toString());
    }
    
}