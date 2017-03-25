/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kwic;

import java.util.List;

/**
 *
 * @author msf1013
 */
public abstract class LineProcessor {

    /**
     *
     * @param lisTokenizedLines
     * @return
     */
    public abstract List<String> processLines(List<List<String>> lisTokenizedLines, String strSeparator);
}
