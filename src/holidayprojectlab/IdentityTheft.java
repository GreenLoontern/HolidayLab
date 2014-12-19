package holidayprojectlab;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Erich Vrany
 */
public class IdentityTheft {
    
    int fields = 14;
    String[] secretStuff = new String[fields];
    String[] secretStuffQuestionaire = new String[fields];
    
    public IdentityTheft() throws IOException{
       
        
        //Fill the arrays with stuff
        secretStuffQuestionaire[0] = "Welcome to the Non-Denominational Traditional Winter Holiday Lab!";
        secretStuffQuestionaire[1] = "Please enter your first name";
        secretStuffQuestionaire[2] = "Please enter your last name";
        secretStuffQuestionaire[3] = "Please enter your middle initial";
        secretStuffQuestionaire[5] = "Please enter your date of birth (e.g. YYYY/MM/DD)";
        secretStuffQuestionaire[6] = "Please enter your Mother's maiden name";
        secretStuffQuestionaire[7] = "Please enter your mobile phone number (e.g. (***)***-****)";
        secretStuffQuestionaire[9] = "Please enter your email";
        secretStuffQuestionaire[10] = "Please enter your credit card number";
        secretStuffQuestionaire[11] = "Please enter your three digit CSC (on the back of your credit card)";
        secretStuffQuestionaire[12] = "Please enter your credit card's expiration date";
        secretStuffQuestionaire[4] = "Please enter the last four digits of your SSN";
        secretStuffQuestionaire[8] = "Please enter the first three digits of your SSN";
        secretStuffQuestionaire[13] = "Please enter the middle two digits of your SSN";
        
        for(int i = 0; i < fields; i++){
            
            Prompter WhiteHat = new Prompter(secretStuffQuestionaire[i], i);
            
        }
        
        //Make a file output system
        
        FileWriter fw = new FileWriter(new File("SecretStuff.txt"));
        PrintWriter pw = new PrintWriter(fw);
        
    }
    
}
