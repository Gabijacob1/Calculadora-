import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    private JTextField txtNum1;
    private JTextField txtNum2;
    private JButton btnSomar;
    private JLabel lblResultado;
    public JPanel panel;
    private JButton btnDividir;
    private JButton btnSubtrair;
    private JButton btnMultiplicar;

    public Calculadora() {
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());

                int resultado = n1+n2;
                lblResultado.setText(String.valueOf(resultado));


            }
        });
        btnDividir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float n1 = Float.parseFloat(txtNum1.getText());
                float n2 = Float.parseFloat(txtNum2.getText());

                float resultado = n2/n1;
                lblResultado.setText(String.valueOf(resultado));
            }
        });
        btnMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                float n1 = Float.parseFloat(txtNum1.getText());
                float n2 = Float.parseFloat(txtNum2.getText());

                float resultado = n1*n2;
                lblResultado.setText(String.valueOf(resultado));
            }
        });
        btnSubtrair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(txtNum1.getText());
                int n2 = Integer.parseInt(txtNum2.getText());

                int subtrair = n2-n1;
                lblResultado.setText(String.valueOf(subtrair));
            }
        });
    }
}
