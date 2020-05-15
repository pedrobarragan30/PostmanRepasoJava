package repasoJava;

import java.util.*;

public class threeCompany {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        System.out.println("Resultado final: " + three(input));
    }

    private static String three(String input)
    {
        System.out.println("La cadena Original es: " + input);
        String output = "";

        int N = input.length();

        for (int i = 0; i < N ; i++)
        {
            char letra = input.charAt(i);
            output += new String(new char [3]).replace( '\0', letra);
        }
        return output;
    }
}