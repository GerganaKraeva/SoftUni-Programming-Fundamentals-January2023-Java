package AssociativeArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class wordFilter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] array= Arrays.stream(scanner.nextLine().split(" "))
                .filter(word->word.length()%2==0)
                .toArray(String[]::new);
        System.out.println(String.join(System.lineSeparator(),array));
    }
}
