package copybytestexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author oracle
 */
public class Copybytestexto {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        String orig = "/home/oracle/NetBeansProjects/Copybytestexto/texto1.txt";
        String dest = "/home/oracle/NetBeansProjects/Copybytestexto/texto2.txt";
        
        File origen = new File(orig);
        File destino = new File(dest);
        
        FileInputStream leer = new FileInputStream(origen);
        FileOutputStream escribir = new FileOutputStream(destino,true);
        
        int i = 0;
        int c;
        System.out.println("Copiando...");
        while((c = leer.read()) != -1){
            escribir.write(c);
            i++;
        }
        
        leer.close();
        escribir.close();
        System.out.println("Caracteres copiados: "+i);
    }
    
}
