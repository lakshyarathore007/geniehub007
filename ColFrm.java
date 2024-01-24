import java.util.*; //all classes

public class ColFrm{

    public static void main(String[] args) {
       
        /*
         creating collections
         1. Type safe : Same type of elements(objects) are added to collection
         2. Un type safe : different types of elements can be added to collections
         */

         //type safe 
         ArrayList<String> name = new ArrayList<String>();

        name.add("Lakshya");
        name.add("Akshya");
        name.add("Saksham");
        name.add("Abd");
        name.add("World");
        name.add("Lakshya"); //duplicate

        System.out.println(name);
        System.out.println(".................");
        //Traversingg

        //for each loop
        for(String str:name)
        {
            System.out.print(str+"\t"+str.length());
            StringBuffer br = new StringBuffer(str);
            System.out.println("  "+br.reverse());
        }

        //Traversing using Iterator : forward traversing
        System.out.println(".................");
        Iterator<String> itr = name.iterator();
        
        while(itr.hasNext()){
           System.out.println(itr.next());
        }

        //ListItrator : Backword Traversal
        System.out.println(".................");
        ListIterator<String> sst = name.listIterator(name.size());
        while(sst.hasPrevious())
        {
            System.out.println(sst.previous());
        }


        //For each method
        System.out.println(".................");
        name.forEach(e->{
            System.out.println(e);
        });



        /* Vector<String> vector = new Vector<>();
        vector.addAll(name);
        System.out.println("Vectorrr : "+vector); 

        //untype
        LinkedList list = new LinkedList();
        list.add("msd");
        list.add("776");
        list.add("34354.54");
        list.add(true);
        System.out.println(list);  

        HashSet<Double> lak = new HashSet<>();
        lak.add(12123.23);
        lak.add(23.7686);
        lak.add(767676.766);
        lak.add(7.7);
        System.out.println("HashSet order : "+lak);

        TreeSet<Double> tset = new TreeSet<>();
        tset.addAll(lak);
        System.out.println("TreeSet Order : "+tset); */

        System.out.println("............Sorting of elements...........");
        TreeSet<String> set = new TreeSet<>();
        set.addAll(name);
        set.forEach(e->{
            System.out.println(e);
        });

        
        
    }
}