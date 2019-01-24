import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Distance {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            line = line.replaceAll(" ", "");
//            String patternString = "^\\(([-\\d]+),([-\\d]+)\\)\\(([-\\d]+),([-\\d]+)\\)$";
            Pattern pattern = Pattern.compile("^\\((-?\\d+),(-?\\d+)\\)\\((-?\\d+),(-?\\d+)\\)$");
            Matcher m = pattern.matcher(line);
            if(m.matches()){
                int x1 = Integer.parseInt(m.group(1));
                int y1 = Integer.parseInt(m.group(2));
                int x2 = Integer.parseInt(m.group(3));
                int y2 = Integer.parseInt(m.group(4));
                System.out.println(Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2)));
            }
        }
    }
}
