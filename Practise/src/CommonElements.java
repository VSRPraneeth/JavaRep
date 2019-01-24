import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            String[] s= line.split(";");
            String[] s1 = s[0].split(",");
            String[] s2 = s[1].split(",");
            Integer[] arr1 = new Integer[s1.length];
            Integer[] arr2 = new Integer[s2.length];

            for(int i=0;i<s1.length;i++)
                arr1[i] = Integer.parseInt(s1[i]);
            for(int i=0;i<s2.length;i++)
                arr2[i] = Integer.parseInt(s2[i]);

            Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
            Set<Integer> set2 = new HashSet<>(Arrays.asList(arr2));
            System.out.println(set2);

            set2.retainAll(set1);
//            Set<Integer> set3 = new HashSet<>();
//
//            for(int i :set1){
//                if(set2.contains(i))
//                    set3.add(i);
//            }
//            System.out.println(set1);
            System.out.println(set2);
//            System.out.print(set3);
            for (int i : set2)
                System.out.print(i);
        }
    }

}
