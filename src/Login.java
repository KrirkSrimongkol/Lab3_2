import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUserLogin;
    private JPasswordField pwdUserPassword;
    private JButton btnsutmit;
    private JButton btnclear;
    private JPanel mainPanel;

    public Login() {
        btnsutmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(null, textUserLogin.getText()
                + " "+new String(pwdUserPassword.getPassword()));
            }
        });
        btnclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textUserLogin.setText(" ");
                pwdUserPassword.setText(" ");
            }
        });
    }

    public  JPanel getMainPanel() {
        return mainPanel;
    }
}
