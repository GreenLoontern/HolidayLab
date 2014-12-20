package holidayprojectlab;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabe Selzer
 */
public class Prompter{
    
    JOptionPane pane = new JOptionPane();
    
    public void getData(String displayMessage, int i) throws IOException{
       
        if(i == 0){
            pane.showMessageDialog(null, displayMessage, displayMessage, JOptionPane.PLAIN_MESSAGE);
        }else{
            IdentityTheft.secretStuff[i] = pane.showInputDialog(displayMessage);
        }
        
    }
    
}
