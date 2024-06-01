package gt.com.tarea;

/**
 *
 * @author Hp Omen
 */

import gt.com.tarea.vistas.Login;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Login().setVisible(true));
    }
}
