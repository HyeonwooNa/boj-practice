package p3052;
//Comment: HashSet, 자료구조 공부 필요
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] modulars = new int[10];

        int counter = 0;

        for(int i = 0; i < modulars.length; i++) {
            modulars[i] = Integer.parseInt(br.readLine()) % 42;
            boolean isSame = false;
            for (int j = 0; j < i; j++) {

                if (modulars[i] == modulars[j]) {
                    isSame = true;
                    break;
                }
            }
            if (isSame == false){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
