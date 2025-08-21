import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        FastScanner fs = new FastScanner(System.in);
        // local tests if needed
    }

    // Core Idea: <1 line>
    // Brute: <1 line>
    // Optimal: <1 line>
    // TC: <..>  SC: <..>  Pattern: <..>

    static class FastScanner {
        BufferedReader br; StringTokenizer st;
        FastScanner(InputStream is){ br=new BufferedReader(new InputStreamReader(is)); }
        String next() throws IOException {
            while (st==null || !st.hasMoreElements()) st=new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        int nextInt() throws IOException { return Integer.parseInt(next()); }
        long nextLong() throws IOException { return Long.parseLong(next()); }
    }
}
