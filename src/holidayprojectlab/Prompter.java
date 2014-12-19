/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holidayprojectlab;

import javax.swing.JOptionPane;

/**
 *
 * @author 13804
 */
public class Prompter extends JOptionPane{
    
    IdentityTheft thing = new IdentityTheft();
    
    public Prompter(String displayMessage, int i){
        thing.secretStuff[i] = Prompter.showInputDialog(displayMessage);
        
        
    }
    
}
