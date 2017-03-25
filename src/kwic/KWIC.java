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
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author msf1013
 */
public class KWIC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Common data
        String strFileName = "input.txt";
        String strSeparator = " ";
        
        // Pipes
        InputReader ir = new KWICInputReader();
        LineProcessor lp = new KWICLineProcessor();
        
        // Results
        List<List<String>> arlLines;
        List<String> arlProcessedLines;
        
        // Pipe 1: Input 
        arlLines = ir.read(strFileName, strSeparator);
        
        // Pipe 2: Process lines
        arlProcessedLines = lp.processLines(arlLines, strSeparator);
        
        for(String line : arlProcessedLines) {
            System.out.println(line);
        }
    }
}
