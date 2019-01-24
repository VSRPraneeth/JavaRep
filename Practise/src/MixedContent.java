import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class MixedContent {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            String[] arr = line.split(",");
            List<String> strings = new ArrayList<String>();
            List<String> integers = new ArrayList<String>();
            for(int i=0; i<arr.length;i++){
                if(!isANumber(arr[i])){
                    strings.add(arr[i]);
                }
                else
                    integers.add(arr[i]);
            }
            if(integers.size()>0)
                System.out.println(integers.toString().replaceAll("[\\[\\]]", ""));
            if(strings.size()>0)
                System.out.println(strings.toString().replaceAll("[\\[\\]]", ""));

        }
    }

    private static boolean isANumber(String value){
        for(int i=0;i<value.length();i++){
            if(!Character.isDigit(value.charAt(i)))
                return false;
        }
        return true;
    }

}
