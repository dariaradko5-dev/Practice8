import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List firstList = new ArrayList();
        firstList.add("aaaaaaaaaaaaaaaaa");
        firstList.add(1);
try {
    String str = (String) firstList.get(0);
    System.out.println(str);
    String str2 = (String) firstList.get(1);
    System.out.println(str2);
}catch (Exception e){
    System.out.println("Помилка: " + e.getMessage());
}


List <String> secondList = new ArrayList<>();
secondList.add("aaaaaaaaaa");
secondList.add("bbbbbbbbbbb");
String str3 =secondList.get(0);
System.out.println(str3);
String str4 =secondList.get(1);
System.out.println(str4);
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

    }
}