import java.io.*;

public class Uzduotis2 {
    public static void main(String args[]) {
        System.out.println("Read from file and write to another");
        try (FileReader fr = new FileReader("res//isFailo.txt");
             FileWriter fw = new FileWriter("res//iFaila.txt")) {
            int c = fr.read();
            while(c!=-1) {
                fw.write(c);
                c = fr.read();
            }
        } catch(IOException e) {
            e.printStackTrace();
        }

    }
}

