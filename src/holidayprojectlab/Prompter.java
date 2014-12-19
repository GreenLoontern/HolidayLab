/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holidayprojectlab;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author 13804
 */
public class Prompter{
    
    public Prompter(String displayMessage, int i) throws IOException{
        
        IdentityTheft thing = new IdentityTheft();
        
        JOptionPane pane = new JOptionPane();
        
        thing.secretStuff[i] = pane.showInputDialog(displayMessage);
        
        
    }
    
}
