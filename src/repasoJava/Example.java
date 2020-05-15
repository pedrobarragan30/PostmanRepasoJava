package repasoJava;

public class Example {
    public static void main (String[] args){
        String mensaje1 = "Hola Mundo";
        String mensaje2 = "Este mensaje es de mayor tamaño que el de arriba, y no hay pedo al imprimirlo";
        boolean bBanderaT = true;
        boolean bBanderaF = false;
        int contador = 5;
        int num1 = 1;
        int num2 = 5;
        int result;

        if(bBanderaT)
        {
            System.out.println(mensaje1);
            System.out.println("Varaible " + contador);
        }
        else
        {
            System.out.println(mensaje2);
        }

        for(int i = 0; i < contador; i++)
        {
            System.out.println(mensaje1);
        }

        for(int i = 0; i < contador; i++)
        {
            result = num1 + num2;
            System.out.println(result);
            num1 = num1 + i;
            num2++;
        }

        while( contador < 7)
        {
            System.out.println("while");
            contador++;
        }
    }
}