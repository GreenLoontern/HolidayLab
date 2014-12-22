/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package holidayprojectlab;

import java.io.IOException;

/**
 *
 * @author Gabe Selzer
 */
public class HolidayProjectLab {

    public static void main(String[] args) throws IOException {
        
        IdentityTheft BlackHat = new IdentityTheft();
        
        //Do BlackHatStuff
        BlackHat.AskQuestions();
        BlackHat.writeDownAnswers();
        
        //Print out stuff
        Display beretGuy = new Display();
    }
    
}
