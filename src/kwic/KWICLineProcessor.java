/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author msf1013
 */
public class KWICLineProcessor extends LineProcessor {

    @Override
    public List<String> processLines(List<List<String>> lisTokenizedLines, String strSeparator) {
        List<String> lisResult = new ArrayList<String>();
        
        for (List<String> line : lisTokenizedLines) {
            lisResult.addAll(shift(line, strSeparator));
        }
        
        return lisResult;
    }
    
    private List<String> shift(List<String> line, String strSeparator) {
        List<String> lisShifts = new ArrayList<String>();
        lisShifts.add(stringify(line, strSeparator));
        
        String strFirst;
        for (int iI = 0; iI < line.size() - 1; iI ++) {
            strFirst = line.remove(0);
            line.add(strFirst);
            lisShifts.add(stringify(line, strSeparator));
        }
        
        return lisShifts;
    }
    
    private String stringify(List<String> line, String strSeparator) {
        return String.join(strSeparator, line);
    }
    
}
