package control;

import javax.swing.JOptionPane;


// a Guest has Control_Guest common to all userTypes
public class Control_Guest {
    
    private void browseRooms() {
         JOptionPane.showMessageDialog(null, "All : Browse Rooms", null, 1);
    }

    private void makeReservation() {
        JOptionPane.showMessageDialog(null, "All : makeReservation", null, 1);
    }

    private void editReservation() {
        JOptionPane.showMessageDialog(null, "All : editReservation", null, 1);
    }

    private void deleteReservation() {
        JOptionPane.showMessageDialog(null, "All : deleteReservation", null, 1);
    }

}
