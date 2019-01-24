import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

public class ChainInspection {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            String[] values = line.split(";");
            HashMap<String,String> map= new HashMap<String, String>();

            for(String s : values){
                String[] nodes = s.split("-");
                map.put(nodes[0], nodes[1]);
            }

//            String result = map.get("BEGIN");
//
//            while(!result.equals("END")){
//                System.out.println(result);
//                result = map.get(result);
//            }

            int count=0;
            String key = "BEGIN";
            while (!key.equals("END")){
                key = map.get(key);
                count++;
                if(count>values.length)
                    break;
            }

            System.out.print((count == values.length)? "GOOD" : "BAD");

        }
    }

}
