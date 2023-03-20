package Ventana;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import Clases.OperacionesMatematicas;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textInput1;
	private JTextField textInput2;
	JButton buttonSuma, buttonResta,buttonMultiplicacion, buttonDividir;
	OperacionesMatematicas operacioenes = new OperacionesMatematicas();
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOperaciones frame = new VentanaOperaciones();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		iniciarComponentes();
		
		setLocationRelativeTo(null);
		setTitle("PanelPrincipal");
		setResizable(false);	
		
	}

	private void iniciarComponentes() {

		
		setBounds(100, 100, 367, 480);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Operaciones matematicas");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(10, 37, 341, 14);
		contentPane.add(lblTitulo);
		
		buttonSuma = new JButton("Suma");
		buttonSuma.addActionListener(this);
		buttonSuma.setBounds(27, 219, 89, 53);
		contentPane.add(buttonSuma);
		
		buttonResta = new JButton("Resta");
		buttonResta.addActionListener(this);
		buttonResta.setBounds(138, 219, 89, 53);
		contentPane.add(buttonResta);
		
		buttonMultiplicacion = new JButton("Multiplicaion");
		buttonMultiplicacion.addActionListener(this);
		buttonMultiplicacion.setBounds(252, 219, 89, 53);
		contentPane.add(buttonMultiplicacion);
		
		buttonDividir = new JButton("Dividir");
		buttonDividir.addActionListener(this);
		buttonDividir.setBounds(138, 302, 89, 53);
		contentPane.add(buttonDividir);
		
		textInput1 = new JTextField();
		textInput1.setBounds(138, 108, 89, 20);
		contentPane.add(textInput1);
		textInput1.setColumns(10);
		
		textInput2 = new JTextField();
		textInput2.setColumns(10);
		textInput2.setBounds(138, 179, 89, 20);
		contentPane.add(textInput2);
		
		JLabel lblnum2 = new JLabel("Numero 2");
		lblnum2.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum2.setBounds(138, 154, 89, 14);
		contentPane.add(lblnum2);
		
		JLabel lblnum1 = new JLabel("Numero 1");
		lblnum1.setHorizontalAlignment(SwingConstants.CENTER);
		lblnum1.setBounds(138, 83, 89, 14);
		contentPane.add(lblnum1);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(10, 383, 331, 28);
		contentPane.add(lblResultado);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (buttonSuma==e.getSource()) {
			int num1 = Integer.parseInt(textInput1.getText());
			int num2 = Integer.parseInt(textInput2.getText());
			int resp=operacioenes.sumar(num1, num2);
			
			lblResultado.setText("La Suma es: "+resp);
		}
		
		if (buttonResta==e.getSource()) {
			int num1 = Integer.parseInt(textInput1.getText());
			int num2 = Integer.parseInt(textInput2.getText());
			int resp=operacioenes.restar(num1, num2);

			lblResultado.setText("La resta es: "+resp);
		}
		
		if (buttonMultiplicacion==e.getSource()) {
			int num1 = Integer.parseInt(textInput1.getText());
			int num2 = Integer.parseInt(textInput2.getText());
			int resp=operacioenes.multiplicar(num1, num2);

			lblResultado.setText("La multiplicacion es: "+resp);
		}
		
		if (buttonDividir==e.getSource()) {
			int num1 = Integer.parseInt(textInput1.getText());
			int num2 = Integer.parseInt(textInput2.getText());
			String resp=operacioenes.dividir(num1, num2);

			lblResultado.setText("La division es: "+resp);
		}
		
	}

	public void asignarOperaciones(OperacionesMatematicas operacioenes) {
		this.operacioenes = operacioenes;
	}

}
