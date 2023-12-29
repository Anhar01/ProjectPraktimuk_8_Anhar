package No01;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {

    private JPanel basePanel = null;
    private JLabel labelinformatika = null;
    private JTextField fieldInformatika = null;
    private JLabel labelUnsulbar = null;
    private JTextField fieldUnsulbar = null;
    private JButton buttonOk = null;
    private JButton buttonClose = null;

    public Window() {
        initUI();
    }

    private void initUI() {
        setSize(400, 300);
        setContentPane(getbasePanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel getbasePanel() {
        if (basePanel == null) {
            basePanel = new JPanel();
            basePanel.add(getlabelinformatika());
            basePanel.add(getlabelUnsulbar());
            basePanel.add(getfieldInformatika());
            basePanel.add(getfieldUnsulbar());
            basePanel.add(getbuttonOK());
            basePanel.add(getbuttonClose());
        }
        return basePanel;
    }

    private JLabel getlabelinformatika() {
        if (labelinformatika == null) {
            labelinformatika = new JLabel("Informatika");
        }
        return labelinformatika;
    }

    private JLabel getlabelUnsulbar() {
        if (labelUnsulbar == null) {
            labelUnsulbar = new JLabel("Unsulbar");
        }
        return labelUnsulbar;
    }

    private JTextField getfieldInformatika() {
        if (fieldInformatika == null) {
            fieldInformatika = new JTextField();
            fieldInformatika.setPreferredSize(new Dimension(260, 20));
        }
        return fieldInformatika;
    }

    private JTextField getfieldUnsulbar() {
        if (fieldUnsulbar == null) {
            fieldUnsulbar = new JTextField();
            fieldUnsulbar.setPreferredSize(new Dimension(260, 20));
        }
        return fieldUnsulbar;
    }

    private JButton getbuttonOK() {
        if (buttonOk == null) {
            buttonOk = new JButton("Ok");
        }
        return buttonOk;
    }

    private JButton getbuttonClose() {
        if (buttonClose == null) {
            buttonClose = new JButton("Close");
            buttonClose.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            
            });
        
        }
        return buttonClose;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window myWindow = new Window();
            }

        });
    }
}
