import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class FileReader{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        ArrayList<String> list = new ArrayList<String>();

        System.out.println("Type '1' to terminate input");

        while(!(str = sc.nextLine()).equals("1")) {
            list.add(str);
        }
        sc.close();

        File fd = new File("NewFiles.txt");
        if(!fd.exists())
            fd.createNewFile();

        PrintWriter pw = new PrintWriter(fd);
        for(String val: list)
            pw.append(val + "\n");
        pw.flush();

        System.out.println("Content of file " + fd.getName());

        list.clear();
        Scanner fw = new Scanner(fd);
        while(fw.hasNextLine()) {
            list.add(fw.nextLine());
        }
        fw.close();

        for(String val: list)
            System.out.println(val);
    }
}
