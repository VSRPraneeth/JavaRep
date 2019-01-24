import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

class MaximumContiguousSum{
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
        BufferedReader in = new BufferedReader(reader);
        String line;
        while ((line = in.readLine()) != null) {

            String[] arr = line.split(" ");
            int[] intarray = new int[arr.length - 1];
            int range = Integer.parseInt(arr[0]);
            int maxsum = Integer.MIN_VALUE;

            for (int i = 0; i < intarray.length; i++) {
                intarray[i] = Integer.parseInt(arr[i + 1]);
            }
            if(range<1)
                System.out.println("The first value cannot be less than 1");
            else if(range>intarray.length)
                System.out.println("Number of Values entered are less than the first value");
            else {

                for (int i = 0; i < intarray.length - range + 1; i++) {
                    int sum = 0;

                    for (int j = i; j < i + range; j++) {
                        sum = sum + intarray[j];
                    }
                    if (sum > maxsum) {
                        maxsum = sum;
                    }
//                    System.out.println(sum);

                }
                System.out.println(maxsum);
            }
        }
    }
}