package fibonaccifactorial;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Frame extends JFrame {
//Inicialización de variables J';
    String[] items = {"Factorial", "Fibonacci"};
    JLabel label1 = new JLabel("Escriba un numero");
    JTextField num = new JTextField();
    JButton Resultado = new JButton("Resultado");
    JLabel label2 = new JLabel("Escoga un tipo de operacion");
    JComboBox opcion = new JComboBox(items);
    JLabel label3 = new JLabel("Resultado");
    JTextField res = new JTextField();
    Numero numi = new Numero();

    public Frame() {

        super();
        setSize(350, 400);
        setTitle("Java");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	setResizable(false);
        ConfigVentanaa();
        setLayout(null);
    }

    public void ConfigVentanaa() {
        //Configura los componentes dentro de la ventana
        label1.setBounds(10, 10, 150, 10);
        label1.setVisible(true);
        add(label1);

       
        num.setBounds(160, 8, 150, 20);
        num.setVisible(true);
        add(num);

        label2.setBounds(10, 40, 160, 30);
        label2.setVisible(true);
        add(label2);

        opcion.setBounds(10, 70, 100, 30);
        opcion.setVisible(true);
        add(opcion);

        Resultado.setBounds(10, 120, 100, 30);
        Resultado.setVisible(true);
        add(Resultado);

        res.setBounds(100, 160, 200, 50);
        res.setEditable(false);
        res.setVisible(true);
        add(res);
        //Acciones para los botones
        Resultado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String s = opcion.getSelectedItem().toString();
                //Verifica que opción del JComboBox eligió, y realizar las acciones respectivamente.
                if (s.equals("Factorial")) {
                    try {
                        //Valida que lo que escriba el usuario, sea estrictamente un numero valido
                        numi.setNum(Integer.parseInt(String.valueOf(num.getText())));
                        if (numi.getNum() >= 0) {
                            //Ejecuta el método factorial para sacar el factorial del numero ingresado
                            res.setText(String.valueOf(numi.Factorial(numi.getNum())));
                        } else {
                            //Regresa una pantalla de error
                            JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                             res.setText("Error");
                        }
                    } catch (Exception a) {
                        JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                         res.setText("Error");
                    }
                } else if (s.equals("Fibonacci")) {
                    try {
                        //Valida que lo que escriba el usuario, sea estrictamente un numero válido.
                        numi.setNum(Integer.parseInt(String.valueOf(num.getText())));
                        if (numi.getNum() > 1) {
                            //Ejecuta el metodo Fibonacci para obtener la serie fibonnaci.
                            res.setText(String.valueOf(numi.fibonacci(numi.getNum())));
                        } else {
                            //Regresa una pantalla de error
                            JOptionPane.showMessageDialog(null, "Ingrese un numero mayor a 1");
                            res.setText("Error");
                        }

                    } catch (Exception a) {
                        //Regresa una patanlla de error si no es un número lo ingresado.
                        JOptionPane.showMessageDialog(null, "Ingrese un numero valido");
                        res.setText("Error");
                    }

                }
            }
        });
    }

}
