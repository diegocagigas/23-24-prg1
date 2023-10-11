class CalculoVuelta 
{
	public static void main (String [] args) 
{
		int dinero;
		int precio;
		int cambio;
		int dineropendiente;
		int billete100;
		int billete50;
		int billete20;
		int billete10;
		int billete5;
		int moneda2;
		int moneda1;

		precio = 766;
		dinero = 4995;
		cambio = dinero - precio;

		billete100 = cambio/100;
		dineropendiente = cambio%100;
		System.out.println("Se te devuelven " + billete100 + " billetes de 100 euros");
		billete50 = dineropendiente/50;
		dineropendiente = dineropendiente%50;
		System.out.println("Se te devuelven " + billete50 + " billetes de 50 euros");
		billete20 = dineropendiente/20;
		dineropendiente = dineropendiente%20;
		System.out.println("Se te devuelven " + billete20 + " billetes de 20 euros");
		billete10 = dineropendiente/10;
		dineropendiente = dineropendiente%10;
		System.out.println("Se te devuelven " + billete10 + " billetes de 10 euros");
		billete5 = dineropendiente/5;
		dineropendiente =dineropendiente%5;
		System.out.println("Se te devuelven " + billete5 + " billetes de 5 euros");
		moneda2 = dineropendiente/2;
		dineropendiente = dineropendiente%2;
		System.out.println("Se te devuelven " + moneda2 + " monedas de 2 euros");
		moneda1 = dineropendiente/1;
		dineropendiente = dineropendiente%1;
		System.out.println("Se te devuelven " + moneda1 + " monedas de 1 euros");
		
}
}
