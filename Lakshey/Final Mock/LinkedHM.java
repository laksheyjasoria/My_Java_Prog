import java.util.LinkedHashMap;
class LinkedHM{

public static void main(String [] args){
LinkedHashMap lhm = new LinkedHashMap();
lhm.put(1, "Lucky");
lhm.put(2, "Nikku");
lhm.put(3, "Lakshey");
Set s = lhm.keySet();
System.out.println(s);
}
}