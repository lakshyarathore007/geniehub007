import java.util.*;

public class MapEx {

    public static void main(String[] args) {
        
        HashMap<String,Integer> courses = new HashMap<>();

        courses.put("MCA", 57000);
        courses.put("BCA", 37000);
        courses.put("Mtech", 89000);
        courses.put("MBA", 570000);
        courses.put("12th", 7000);

        System.out.println(courses);

        courses.forEach((e1,e2)->{

            System.out.println(e1+" => "+e2);
        });



    }
}