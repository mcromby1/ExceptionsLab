package lab2Student;

import javax.swing.JOptionPane;

/**
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    
    private final NameService nameService;
    private static final String NAME_PROMPT = "Enter full name:";
    private static final String LAST_NAME_MSG = "Your last name is: ";
    private static final String ERROR_MSG = "The name entered need to have 2 names"
            + "seperated by a space.";

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        try{
        String fullName = JOptionPane.showInputDialog(NAME_PROMPT);
        String lastName = "";
        lastName = nameService.extractLastName(fullName);
  
        String msg = LAST_NAME_MSG + lastName;
        JOptionPane.showMessageDialog(null, msg);
        }
        catch(NullPointerException | IllegalArgumentException e){
           JOptionPane.showMessageDialog(null, ERROR_MSG); 
        }
    }
     
}
