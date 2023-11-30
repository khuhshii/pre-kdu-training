import java.util.*;
import java.io.*;
public class Pre_kdu_java_3 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str;
        
        try 
        {
            File myFile=new File("kdu3.csv");
            myFile.createNewFile();

            FileWriter fileWriter=new FileWriter("kdu3.csv");
            //fileWriter.write("Hello World Kickdrum Hello Blue World Blue Kickdrum");

            System.out.print("Enter the number of words/lines : ");
            int n=sc.nextInt();
            System.out.println("\nEnter the words/lines separated by comma, space or newline");
            sc.nextLine();
            for(int i=0;i<n;i++)
            {
                //sc.skip("\n");
                str=sc.nextLine();
                fileWriter.write(str);
                fileWriter.write("\n"); 
            }
            
            fileWriter.close();

            // storing each word separately in a list
            List<String> list = new ArrayList<>();
            Scanner fileScanner = new Scanner(myFile);
            while (fileScanner.hasNext()) 
            {
                String[] words = fileScanner.nextLine().split("\\s*,\\s*|\\s+");
                for (String word : words) 
                    list.add(word);
                
            }
 
            // storing the frequency of each word using map
            Map<String, Integer> wordmap = new HashMap<>();
            for (String word : list) 
                wordmap.put(word, wordmap.getOrDefault(word, 0) + 1);
            
 
            // print the top 3 repeated words
            System.out.println("\nTop 3 Repeated Words:");
            wordmap.entrySet().stream()
                    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                    .limit(3)
                    .forEach(entry -> System.out.println(entry.getKey()));

            fileScanner.close();
 
        } 
        catch (Exception e) 
        {
            System.out.println("Error!!");
            e.printStackTrace();
        }
        sc.close();
    }
}
