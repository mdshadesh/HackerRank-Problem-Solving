import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Solution {
    static BufferedReader in = new BufferedReader(new InputStreamReader(
            System.in));
    static StringBuilder out = new StringBuilder();

    public static void main(String[] args) throws IOException {
        int[] stickAmts = new int[1001];
        int numSticks = Integer.parseInt(in.readLine());
        String line = in.readLine();
        String[] data = line.split("\\s+");
        for(int i = 0; i < numSticks; i ++)
        {
            stickAmts[Integer.parseInt(data[i])]++;
        }
        for(int i = 1; i <= 1000; i ++)
        {
            if(stickAmts[i] != 0)
            {
                System.out.println(numSticks);
                numSticks -= stickAmts[i];
            }
        }
    }
}