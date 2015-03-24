package control;

import entity.Data_Login;
import javax.swing.JOptionPane;

public class Control_Login {
    
    private String username, password, userType;

    // constructor
    public Control_Login() {
            
    }
    

    // constructor for boundary.GUI_Login_Register
    public Control_Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // login method
    public void login() {

        // Data_Login object
        Data_Login db = new Data_Login(username);
        String dbPassword = db.getPassword(username);

        // successful recovery
        if (dbPassword != null) {
            // successful match
            if (dbPassword.equals(password)) {

                // get userType
                userType = db.getUserType(username);

                // create appropriate object 
                if (userType.equals("Guest")) {
                    Control_Guest guestUseCases 
                            = new Control_Guest();
                    
                } else if (userType.equals("Receptionist")) {
                    Control_Receptionist receptionistUseCases 
                            = new Control_Receptionist();
                    
                } else if (userType.equals("Manager")) {
                    Control_Manager managerUseCases 
                            = new Control_Manager();
                }

            }
        } else {
            // failed login
            JOptionPane.showMessageDialog(null, "User not found.", null, 2);
        }
    }

}
