import java.util.ArrayList; 
import java.util.List;
public class EgUncheckedException {
    public static void main(String[] args) { 
        List<String> lst = new ArrayList<>(); 
        lst.add("item-1");
        lst.add("item-2");
        lst.add("item-3");
        String result = lst.get(lst.size()); 
    }
}


/* output


java EgUncheckedException
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index: 3, Size: 3
        at java.util.ArrayList.rangeCheck(Unknown Source)
        at java.util.ArrayList.get(Unknown Source)
        at EgUncheckedException.main(EgUncheckedException.java:9)
*/