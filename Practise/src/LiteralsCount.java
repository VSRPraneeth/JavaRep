import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class LiteralsCount {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            HashMap<Character, Integer> map = new HashMap<>();
            for(char c : line.toCharArray()){
                if(!map.containsKey(c))
                    map.put(c,1);
                else
                    map.put(c,map.get(c)+1);
            }
            System.out.println(map);
            for(Character c : map.keySet())
                System.out.print(c +""+ map.get(c));
        }
    }

}
