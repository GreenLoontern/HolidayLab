package holidayprojectlab;

import java.awt.Canvas;
import javax.swing.JFrame;

/**
 *
 * @author Gabe Selzer
 */
public class Display extends JFrame{
    
    public Display(){
        
        super("Non-denominational Traditional Winter Holiday Lab");

		setSize(1200, 1000);
                
                setLocationRelativeTo(null);

		getContentPane().add(new Fun()); //Displays the Fun class

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        
    }
    
}
