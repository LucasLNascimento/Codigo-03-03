package programainicial4;

import java.io.DataInputStream;
import java.io.IOException;

public class ProgramaInicial4 {

    public static void main(String[] args) throws IOException{
        String s = "";
        float nota1 = 0; float nota2 = 0; float media = 0;
        
        DataInputStream dado;
        
        System.out.println("Entre com a nota 1: ");
        dado = new DataInputStream(System.in);
        
        s = dado.readLine();
        nota1 = Float.parseFloat(s);
        System.out.println("Entre com a nota 2: ");
        dado = new DataInputStream(System.in);
        s = dado.readLine();
        nota2 = Float.parseFloat(s);
        
        media = (nota1 + nota2)/2;
        System.out.println(media);
       
    } 
}