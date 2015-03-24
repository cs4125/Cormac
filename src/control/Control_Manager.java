package control;

// Manager has unique methods
// Manager has methods inherited from Receptionist
// Receptionist has methods inherited from Guest

import boundary.GUI_Manager;
import entity.Data_Manager;


public class Control_Manager extends Control_Receptionist {

    private static GUI_Manager showManagerMenu;
    
    // constructor for boundary
    public Control_Manager() {
        showManagerMenu = new GUI_Manager();
        showManagerMenu.displayGUI();
    }

    // constructor for entity
    public Control_Manager(String action, String menuInput) {
       switch (action) {
           case "deleteUser": {
               Data_Manager deletion = new Data_Manager(action, menuInput);
           }
       }
    }
}
