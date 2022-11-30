package my;
import java.io.File;
import java.util.Scanner;
public class rWg
{
  public static String Gen() throws Exception
  {
    File file = new File("file location here");
    Scanner sc = new Scanner(file);
    String list[] = {};
    while (sc.hasNextLine()){
        list = add(list,sc.nextLine());
    }
    sc.close();
    int pick = (int)(Math.random() * list.length);
    return list[pick].toLowerCase();
  }
  public static String[] add(String arr[],String n){
    String[] list = new String[arr.length + 1];
    for(int i = 0; i < arr.length; i++)
        list[i] = arr[i];
    list[list.length - 1] = n;
    return list;
  }
}
