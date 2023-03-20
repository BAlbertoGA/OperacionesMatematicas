package Principal;
import javax.swing.JOptionPane;

import Clases.OperacionesMatematicas;
import Ventana.VentanaOperaciones;

public class Aplicacion {
	
	OperacionesMatematicas operacioenes;
	
	public Aplicacion() {
		operacioenes = new OperacionesMatematicas();
		//presentarMenu();
		presentarVentana();
	}
	
	private void presentarVentana() {
		VentanaOperaciones miVentana = new VentanaOperaciones();
		miVentana.asignarOperaciones(operacioenes);
		miVentana.setVisible(true);
	}
	
	private void presentarMenu() {
		String menu = "Operaciones Matematicas\n";
		menu += "1. Sumar\n";
		menu += "2. Restar\n";
		menu += "3. Multiplicar\n";
		menu += "4. Dividir\n";
		menu += "5. Salir\n";
		menu += "Ingrese una opcion\n";
		int cod=0;
		
		do {
			int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
			int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
			
			cod = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (cod) {
			case 1: {
				int resp=operacioenes.sumar(num1, num2);
				JOptionPane.showMessageDialog(null, "La suma es: " + resp);
				break;
			}
			case 2: {
				int resp=operacioenes.restar(num1, num2);
				JOptionPane.showMessageDialog(null, "La resta es: " + resp);
				break;
			}
			case 3: {
				int resp=operacioenes.multiplicar(num1, num2);
				JOptionPane.showMessageDialog(null, "La multiplicacion es: " + resp);
				break;
			}
			case 4: {
				String resp=operacioenes.dividir(num1, num2);
				JOptionPane.showMessageDialog(null, "La divicion es: " + resp);
				break;
			}
			case 5: {
				JOptionPane.showMessageDialog(null, "Salir");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + cod);
			}
		} while (cod !=5);

	}
}
