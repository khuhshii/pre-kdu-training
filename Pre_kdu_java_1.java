import java.util.*;
class Pre_kdu_java_1
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String s1,s2;
        s1=sc.next();
        s2=sc.next();

        System.out.println("\nkThe length of the first string is "+s1.length()+"\n\nThe length of the first string is "+s2.length());
        
        if(s1.length()==s2.length())
            System.out.println("\nThe length of the two strings are same");
        else
            System.out.println("\nThe length of the two strings are not same");

        if(s1.compareToIgnoreCase(s2)==0)
            System.out.println("\nTwo strings are equal");
        else
            System.out.println("\nTwo strings are not equal\n");

        sc.close();
    }
}