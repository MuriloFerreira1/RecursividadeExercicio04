package controller;

public class Controller {
	public int conta(int valor1, int valor2) {
		if(valor1==0) {
			//finaliza quando o valor inserido � 0;
			return 0;
		}else {
			if(valor1%10==valor2) {
				//caso a ultima casa do primeiro valor seja igual ao segundo valor, adiciona 1 e compara a pr�xima casa
				return 1+conta(valor1/10, valor2);
			}else {
				//caso a ultima casa do primeiro valor n�o seja igual ao segundo valor, adiciona 0 e compara a pr�xima casa
				return 0+conta(valor1/10, valor2);
			}
		}
	}
}
