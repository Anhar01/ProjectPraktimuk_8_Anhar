package No01;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class No_01 extends JFrame {

    private JPanel panel = null;
    private JComboBox<String> JComboBoxr = null;
    private JTextField JTextfieldInput = null;
    private JButton convert = null;
    private JComboBox<String> JComboBoxs = null;
    private JTextField JTextfieldOutput = null;

    private String[] label = new String[]{
        "KM", "HM", "DAM", "M", "DM", "CM", "MM"
    };

    public No_01() {
        initUI();
    }

    private void initUI() {
        setSize(400, 300);
        setContentPane(getpanel());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private JPanel getpanel() {
        if (panel == null) {
            panel = new JPanel();
            panel.add(getJComboBoxr());
            panel.add(getJTextfieldInput());
            panel.add(getconvert());
            panel.add(getJComboBoxs());
            panel.add(getJTextfieldOutput());

        }
        return panel;
    }

    private JComboBox<String> getJComboBoxr() {
        if (JComboBoxr == null) {
            JComboBoxr = new JComboBox<>(label);
        }
        return JComboBoxr;
    }

    private JComboBox<String> getJComboBoxs() {
        if (JComboBoxs == null) {
             JComboBoxs = new JComboBox<>(label);
        }
        return JComboBoxs;
    }

    private JTextField getJTextfieldInput() {
        if (JTextfieldInput == null) {
            JTextfieldInput = new JTextField();
            JTextfieldInput.setPreferredSize(new Dimension(50, 20));
        }
        return JTextfieldInput;
    }

    private JTextField getJTextfieldOutput() {
        if (JTextfieldOutput == null) {
            JTextfieldOutput = new JTextField();
            JTextfieldOutput.setPreferredSize(new Dimension(50, 20));
        }
        return JTextfieldOutput;
    }

    private JButton getconvert() {
        if (convert == null) {
            convert = new JButton("Convert");
            convert.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int indexin = JComboBoxr.getSelectedIndex();
                    int indexOut = JComboBoxs.getSelectedIndex();
                    
                    String sInput = JTextfieldInput.getText();
                    double input = Double.parseDouble(sInput);
                    double output = convert(indexin, indexOut, input);
                    JTextfieldOutput.setText(""+output);
                }
            });
        }
        return convert;
    }
    private double convert(int dari, int ke,double value){
        double result = value;
        double km = value/Math.pow(10, dari);
        result = km*Math.pow(km, ke);
        
        return result;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                No_01 myWindow = new No_01();
            }

        });
    }

}
