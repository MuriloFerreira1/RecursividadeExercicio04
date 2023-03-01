package view;
import javax.swing.JOptionPane;

import controller.Controller;
public class View {

	public static void main(String[] args) {
		int v1=10;
		int v2=0;
		
		do {
			v1=Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor:"));
		}while(v1<10||v1>999999);
		do {
			v2=Integer.parseInt(JOptionPane.showInputDialog("Segundo valor:"));
		}while(v2<0||v2>9);
		Controller c = new Controller();
		
		
		System.out.println(c.conta(v1, v2));
	}

}
