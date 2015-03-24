package entity;

import javax.swing.JOptionPane;


// inherits Data_Guest and  Data_Receptionist 
public class Data_Manager extends Data_Receptionist {

    private String action, menuInput;
    
    public Data_Manager(String action, String menuInput) {
        this.action = action;
        this.menuInput = menuInput;      
        setMenuSelection();
    }

    private void setMenuSelection() {
        if(action.equals("deleteUser")) {
            // TODO
             JOptionPane.showMessageDialog(null, "TODO - Delete User", null, 2);   
        } 
   }
    
}
