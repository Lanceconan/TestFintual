package default;

import java.util.Scanner;
import default.StockDAO;

/*
 * Clase principal del proyecto
 */
public class PortFolio{

	StockDAO stockDAO;
	int quantityRandomStock;

	/*
		Método Constructor, recibe como parámetro la cantidad de stock a generar de manera aleatoria
	*/
	PortFolio(int quantityRandomStock){
		this.quantityRandomStock = quantityRandomStock;
		stockDAO  = new StockDAO(quantityRandomStock);
	} 

	/*
	 *	Este metodo retorna el precio de los stock entre fechas
	 */
	private Long getProfitBetweenDate(LocalDate startDate,  LocalDate endDate){
		Long profit = 0;

		for(int i = 0; i < quantityRandomStock; i++){
			
			if(stockDAO.getListaStockVO().get(i).getPriceDate.isBefore(endDate) && stockDAO.getListaStockVO().get(i).getPriceDate.isAfter(startDate))
				profit = profit + stockDAO.getListaStockVO().get(i).getPriceSale();
		}

		return profit;
	}

	/*
	 *	Este metodo retorna el precio de los stock anualizados
	 */
	private Long getProfitAnnualizedBetweenDate(LocalDate startDate,  LocalDate endDate){
		Long profit = 0;

		for(int i = 0; i < quantityRandomStock; i++){
			
			if(stockDAO.getListaStockVO().get(i).getPriceDate.isBefore(endDate) && stockDAO.getListaStockVO().get(i).getPriceDate.isAfter(startDate))
				profit = profit + stockDAO.getListaStockVO().get(i).getPriceSale();
		}

		return profit;
	}

	/*
	 * Metodo auxiliar para validar numero de entrada, si el numero ingresado no es válido, retornará 10
	 */
	private int validarNumero(String sTexto){
		try {
		
			return Integer.parseInt(sTexto);
		} catch (NumberFormatException nfe){
			return 10;
		}
	}

	/*
	 *	Metodo de ejecución del código
	 */
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.print("Introduce número de stock a generar de manera aleatoria: ");
		String sTexto = reader.next();
		PortFolio portFolio =  new PortFolio(validarNumero(sTexto));

		/*De aquí en más usar las clases y metodos a conveniencia*/
	}
}