class VueltaMejorado
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
		String mensajeBillete100 = (billete100 > 0) ? "Se devolverán " + billete100 + " billetes de 100 euros \n":"";
		
        billete50 = cambio / 50;
        dineropendiente = dineropendiente%50;
		String mensajeBillete50 = (billete50 > 0) ?"Se devolverán " + billete50 + " billetes de 50 euros \n" :"";
		
        billete20 = dineropendiente/20;
		dineropendiente = dineropendiente%20;
		String mensajeBillete20 = (billete20 > 0) ? "Se devolverán " + billete20 + " billetes de 20 euros \n" :"";
		billete10 = dineropendiente/10;
		
        dineropendiente = dineropendiente%10;
		String mensajeBillete10 = (billete10 > 0) ? "Se devolverán " + billete10 + " billetes de 10 euros \n" :"";
		billete5 = dineropendiente/5;
		
        dineropendiente =dineropendiente%5;
        String mensajeBillete5 = (billete5 > 0) ? "Se devolverán " + billete5 + " billetes de 5 euros \n" :"";
		moneda2 = dineropendiente/2;
		
        dineropendiente = dineropendiente%2;
		String mensajeMoneda2 = (moneda2 > 0) ? "Se devolverán " + moneda2 + " monedas de 2 euros" :"";
		moneda1 = dineropendiente/1;
		
        dineropendiente = dineropendiente%1;
		String mensajeMoneda1 = (moneda1 > 0) ? "Se devolverán " + moneda1 + " monedas de 1 euro" :"";
		

        System.out.println(mensajeBillete100 + mensajeBillete50 + mensajeBillete20 + mensajeBillete10 + mensajeBillete5 + mensajeMoneda2 + mensajeMoneda1);
    }
}
