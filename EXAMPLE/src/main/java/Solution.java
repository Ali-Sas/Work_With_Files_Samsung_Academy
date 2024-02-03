import java.io.*;
import java.util.Scanner;

public class Solution {
    private static int len_file(Scanner file){
        int sum_number = 0;

        while (file.hasNext()){
            int a = file.nextInt();
            sum_number ++;
        }
        return sum_number;
    }
    
    private static int i = 0;

    public static void main(String[] args) {

        try {
            File input = new File("src/main/java/files/Input.txt");
            File ouput = new File("src/main/java/files/Output.txt");

            File ouput_1 = new File("src/main/java/files/Output_1.txt");
            File ouput_2 = new File("src/main/java/files/Output_2.txt");

            Scanner scanner = new Scanner(input);
            PrintWriter op = new PrintWriter(ouput);

            PrintWriter op_1 = new PrintWriter(ouput_1);
            PrintWriter op_2 = new PrintWriter(ouput_2);

            while (scanner.hasNext()){
                if(i < len_file(new Scanner(new File("src/main/java/files/Input.txt"))) / 2){
                    op_1.print(scanner.nextInt() + " ");
                }else {
                    op_2.print(scanner.nextInt() + " ");
                }
                i+=1;
            }
            scanner.close();
            op_2.close();
            op_1.close();

            Scanner scanner1 = new Scanner(ouput_2);
            Scanner scanner2 = new Scanner(ouput_1);

            while (scanner1.hasNext()) op.print(scanner1.nextInt() + " ");
            scanner1.close();

            while (scanner2.hasNext()) op.print(scanner2.nextInt() + " ");
            scanner2.close();

            op.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
