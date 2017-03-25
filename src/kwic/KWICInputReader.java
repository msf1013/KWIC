/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author msf1013
 */
public class KWICInputReader extends InputReader {

    @Override
    public List<List<String>> read(String strFileName, String strSeparator) throws IOException{
        List<List<String>> arrLines = new ArrayList<List<String>>();

        // Leer archivo
        File filFile;     
        BufferedReader breReader;
        String strLinea;
        
        // Inicializar archivos
        filFile = new File(strFileName);
        breReader = new BufferedReader(new FileReader(filFile));

        // Lectura de archivo linea por linea          
        strLinea = breReader.readLine();
        
        String [] arrTokens;
        
        while (strLinea != null) {
            arrTokens = strLinea.split(strSeparator);
            arrLines.add(new ArrayList<String>(Arrays.asList(arrTokens)));
            strLinea = breReader.readLine();
        }
        
        return arrLines;
    }
}
