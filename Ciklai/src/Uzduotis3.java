import java.io.*;

public class Uzduotis3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Count average");
        try {
            String filePath = "res//AverageIN.txt";
            File file = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(file));
            int sum = 0;
            int count = 0;
            String line = br.readLine();
            while (line != null) {
                sum += Integer.parseInt(line);
                count++;
                line = br.readLine();
            }
            br.close();
            double average = (double) sum / count;
            PrintWriter answer = new PrintWriter("res//AverageOUT.txt");
            answer.print(average);
            answer.println();
            answer.close();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
