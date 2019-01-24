import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.TreeMap;

public class LowestUniqueNumber {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            String[] s1 = line.split(" ");
            int[] arr = new int[s1.length];
            for (int i =0;i<arr.length;i++){
                arr[i] = Integer.parseInt(s1[i]);
            }
            TreeMap<Integer, Integer> map = new TreeMap<>();
            int unique = 0, pos =0;

            for(int i : arr){
                if(map.containsKey(i))
                   map.put(i, map.get(i)+1);
                else
                    map.put(i, 1);
            }

            for(int i : map.keySet()){
                if(map.get(i) == 1) {
                    unique = i;
                    break;
                }
            }

            for(int i=0;i<arr.length;i++){
                if(arr[i] == unique)
                    pos = i;
            }

            System.out.println(pos + 1);
        }
    }
}
