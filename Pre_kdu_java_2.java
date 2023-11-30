
import java.util.*;
public class Pre_kdu_java_2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        ArrayList<String> l1 = new ArrayList<>();
        HashSet<String> s1 = new HashSet<>();
        HashMap<String, Integer> map = new HashMap<>();

        System.out.print("Enter the number of strings : ");
        int n=sc.nextInt();

        String str;
        System.out.println("\n\nEnter the strings : ");
        for(int i=0;i<n;i++)
        {
            str=sc.next();
            l1.add(str);
        }
        
        s1.addAll(l1);

        
        for (String str2 : l1) 
            map.put(str2, map.getOrDefault(str2, 0) + 1);

        System.out.println("\nList Contains:");
        for (String str3 : l1) 
            System.out.println(str3);

        System.out.println("\nSet Contains:");
        for (String str4 : s1) 
            System.out.println(str4);

        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) 
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());

        sc.close();
    }
}
