package control;

// Receptionist has Control_Guest 

import javax.swing.JOptionPane;

// a Receptionist has unique Control_Receptionist
public class Control_Receptionist extends Control_Guest {

    private void issueInvoice()
    {
        JOptionPane.showMessageDialog(null, "Receptionist & Manager: Issue Invoice", null, 1);
    }
}
