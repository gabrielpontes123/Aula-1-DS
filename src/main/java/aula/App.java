package aula;

import javax.swing.JOptionPane;

public class App 
{
    public static int somar(int x, int y) {
    	return x + y;
    }
    public static int subtrair(int x, int y) { 
    	return x - y;
    }
    public static int multiplicar(int x, int y) {
    	return x * y;
    }
    public static int dividir(int x, int y) {
    	return x / y;
    }
    		    	
    public static void main (String[] args) {
    	int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    	int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    	JOptionPane.showMessageDialog(null, "Total Soma:" + somar(a,b) + "\nTotal Subtração:" + subtrair(a,b) + "\nTotal Multiplicação " + multiplicar(a,b) + "\nTotal Divisão:" + dividir(a,b)) ;
		
    }
    
    		
}

