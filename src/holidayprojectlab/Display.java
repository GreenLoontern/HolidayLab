package holidayprojectlab;

import javax.swing.JFrame;

/**
 *
 * @author Gabe Selzer
 */
public class Display extends JFrame{
    
    public Display(){
        
        super("Non-denominational Traditional Winter Holiday Lab");

		setSize(1000, 800);
                
                setLocationRelativeTo(null);

		getContentPane().add(new Fun()); //Displays the Fun class

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
        
    }
    
}
