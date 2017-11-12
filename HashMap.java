import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;

public class Figures {

    public static void main(String args[]) {

        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        hmap.put(36, "Circle");
        hmap.put(12, "Square");
        hmap.put(24, "Rectangle");
        hmap.put(49, "Rhombus");
        hmap.put(67, "Triangle");
        hmap.put(25, "Cube");
        hmap.put(37, "Cone");
        hmap.put(72, "Parallelepiped");
        hmap.put(11, "Cylinder");
        hmap.put(28, "Trapezium");
    }

    Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        System.out.println("Figures sorted by the area:");
    Set set = map.entrySet();
    Iterator iterator1 = set.iterator();
        while(iterator1.hasNext()) {
        Map.Entry me2 = (Map.Entry)iterator1.next();
        System.out.print(me2.getKey() + ": ");
        System.out.println(me2.getValue());
    }
}
