import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Directions {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while((line = in.readLine())!= null){
            int O = Integer.parseInt(line.split(" ")[0]);
            int P = Integer.parseInt(line.split(" ")[1]);
            int Q = Integer.parseInt(line.split(" ")[2]);
            int R = Integer.parseInt(line.split(" ")[3]);
            String result;

            if(Q> O){
                if(R>P)
                    result = "NE";
                else if(R<P)
                    result = "SE";
                else
                    result = "E";
            }
            else if(Q < O){
                if(R>P)
                    result = "NW";
                else if(R<P)
                    result = "SW";
                else
                    result = "W";
            }
            else {
                if(R>P)
                    result = "N";
                else if(R<P)
                    result = "S";
                else
                    result = "You are at your destination!!";
            }
            System.out.println(result);
        }
    }

}
