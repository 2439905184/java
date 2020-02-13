import java.io.FileReader;
import java.text.FieldPosition;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.util.*;
import com.m.io.*;
import java.io.*;

public class Main {
  public static String addon_describe = "一个测试插件";
  public static String addon_version = "1.0";
  public static String addon_owner = "128hh";
  public static String addon_name = "Toast调用";

  public static void main(String[] args) throws FileNotFoundException, IOException {
    // System.out.println("Hello World!");
    String type;
    File file = new File("/storage/emulated/0/test.txt");
    FileReader fileReader = new FileReader(file);
    BufferedReader bufferReader = new BufferedReader(fileReader);
    EasyFileReader d = new EasyFileReader(file);

    String pre_line = bufferReader.readLine();
    // char c= pre_line.charAt(0);
    int len = pre_line.length();
    // 循环5次读取type:的文字

    System.out.println("第一行字数" + len);
    // 检查type:后面的字<
    if (len > 5) {
      // 剩下的字符长度
      int left_length = len - 5;
String sjsgsjsg="12345678910111";
      // type属性的string的第四个字符
      Character type_5 = pre_line.charAt(5);
      Character type_6 = pre_line.charAt(6);
      Character type_7 = pre_line.charAt(7);
      Character type_8 = pre_line.charAt(8);
      Character type_9 = pre_line.charAt(9);

      String type_5_str = type_5.toString();
      String type_6_str = type_6.toString();
      String type_7_str = type_7.toString();
      String type_8_str = type_8.toString();
      String type_9_str = type_9.toString();

      String final_type_str = type_5_str + type_6_str + type_7_str + type_8_str + type_9_str;

      System.out.println("开始检查插件类型");
      System.out.println("属性" + type_5 + type_6 + type_7 + type_8 + type_9);
      System.out.println("剩下的长度" + left_length);
      System.out.println(final_type_str);
      if (final_type_str.equals("addon")) {
        System.out.println("插件类型:" + final_type_str);
      } else {
        System.out.println("不支持的插件类型");
      }

      // ---c-c-
      System.out.println("插件名称:" + addon_name);
      System.out.println("插件作者:" + addon_owner);
      System.out.println("插件版本:" + addon_version);
      System.out.println("插件描述:" + addon_describe);
      // 开始测试插件功能
      // 第二行 method:toast
      
      // 从第八个字符开始定义方法
      pre_line = bufferReader.readLine();
      Character method_7=pre_line.charAt(7);
      Character method_8=pre_line.charAt(8);
      //Character method_8 = pre_line.charAt(8);
      Character method_9 = pre_line.charAt(9);
      Character method_10 = pre_line.charAt(10);
      Character method_11 = pre_line.charAt(11);
      
     String method_7_str=method_7.toString();
     String method_8_str= method_8.toString();
     String method_9_str=  method_9.toString();
     String method_10_str=  method_10.toString();
     String method_11_str=  method_11.toString();
     //String method_12_str=  method_12.toString();
       
       String final_method_str= method_7_str+method_8_str+method_9_str+method_10_str+method_11_str;
   
    //第三行定义方法对应的参数
    //第9个开始
    //paramer:hello_from_test.txt
   pre_line= bufferReader.readLine();
   Character paramer_8=pre_line.charAt(8);
   int paramer_len=pre_line.length();
  // System.out.println(paramer_8);
  String[] paramer_final_str_array=new String[30];
  String paramer_final_str="";
   for(int index=8;index<paramer_len;index++)
   {
     //System.out.println(index);
     Character paramer_pre=pre_line.charAt(index);
    //每个参数的字符转换的str 参数"aaa"变成 a a a,
     String paramer_pre_str=paramer_pre.toString();
     paramer_final_str+=paramer_pre_str;
    // paramer_final_str_array[index]=paramer_pre_str;
   }
   
  
   System.out.println(paramer_final_str);
  // System.out.println(Arrays.toString(paramer_final_str_array));
    
    if(final_method_str.equals("toast"))
     {
     new mytoast().toast(paramer_final_str);
     }
      // Toast.makeText(,"hhh",1000).show();
    }

    /*while(bufferReader.readLine()!=null)
    {
      String perLine=bufferReader.readLine();
      //如果前几个字是type:aaa

      String In_String_Array[]={};
      //In_String_Array.add();
    }*/
    bufferReader.close();
    fileReader.close();
  }
}
