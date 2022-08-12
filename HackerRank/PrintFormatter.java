
import java.util.*;

public class PrintFormatter {

    public static void main(String[] args){

        Scanner inputTaker = new Scanner(System.in);

            String line1Str = inputTaker.nextLine();
;
            String numbers1 = line1Str.replaceAll("[^0-9]", "");
            String words1 = line1Str.replaceAll("[^a-zA-Z].*", "");
            int numbers1F = Integer.parseInt(numbers1);

            String line2Str = inputTaker.nextLine();

            String numbers2 = line2Str.replaceAll("[^0-9]", "");
            String words2 = line2Str.replaceAll("[^a-zA-Z].*", "");
            int numbers2F = Integer.parseInt(numbers2);

            String line3Str = inputTaker.nextLine();

            String numbers3 = line3Str.replaceAll("[^0-9]", "");
            String words3 = line3Str.replaceAll("[^a-zA-Z].*", "");
            int numbers3F = Integer.parseInt(numbers3);

        System.out.println("================================");
        System.out.printf("%-13s  %03d\n", words1, numbers1F);
        System.out.printf("%-13s  %03d\n", words2, numbers2F);
        System.out.printf("%-13s  %03d\n", words3, numbers3F);
        System.out.println("================================");

    inputTaker.close();

    }
    
}

             
           