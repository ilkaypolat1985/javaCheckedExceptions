import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = null;
        int totalNumber = 0;
        try {
            reader = new BufferedReader(new FileReader("C:\\udemy\\javaCheckedExceptions\\src\\numbers.txt"));
            String line = null;
            while((line = reader.readLine()) != null){
                totalNumber += Integer.valueOf(line);
            }
            System.out.println("Total number is " + totalNumber);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
