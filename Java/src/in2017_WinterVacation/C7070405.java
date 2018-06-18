package in2017_WinterVacation;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class C7070405 {
    public static void main(String[] args) {
        HashMap<String, String> h = new HashMap<>();
        h.put("범죄", "112");
        h.put("화재", "119");
        h.put("전화번호", "114");
        Vector<String> v = HV.hastToVector(h);

        for (String vE : v)
            System.out.println(vE);
    }
}

class HV {
    public static Vector<String> hastToVector(HashMap<String, String> h) {
        Set<String> keySet = h.keySet();
        Iterator<String> iterator = keySet.iterator();

        Vector<String> v = new Vector<>();

        while (iterator.hasNext())
            v.add(h.get(iterator.next()));

        return v;
    }
}