package default;

import default.StockVO;
import java.util.Random;

/*
 * Clase DATA ACCESS OBJECT para el modelo de Stock
 */
public Class StockDAO{
	
	private ArrayList<StockVO> listaStockVO;
	private quantityRandomStock;

	/*
	 * Contructor de DAO de Stock, genera aleatoriamente stock para el posterior procesamiento
	 */
	StockDAO (int quantityRandomStock){
		this.quantityRandomStock = quantityRandomStock;
		this.listaStockVO = new ArrayList<>();

		generateRandomStockVO(quantityRandomStock);
	}

	/*
	 * Obtener la lista de Stock disponibles para trabajar
	 */
	public ArrayList<StockVO> getListaStockVO() {
        return this.listaStockVO;
    }

    /*
     * Metodo que genera aleatoriamente los stock
     */
	private void generateRandomStockVO(int quantityRandomStock){
		Stock stockVO;
		Random rnd = new Random(50000);
		
		for(i = 1; i <= quantityRandomStock; i++){
			
			stockVO = new StockVO(
				rnd.nextLong();
				rnd.nextInt();
				rnd.nextLong();
				nextLocalDate();
			);

			listaStockVO.add(stockVO);

		}
	}

	/*
     * Metodo auxiliar para obtener una fecha al azar
     */
	private LocalDate nextLocalDate(){
		
		try{

			Random rndDay = new Random(31);
			Random rndMonth = new Random(12);		
	        return LocalDate.of(rndDay.nextInt(), rndMonth.nextInt(), 2018);

	    } catch (Exception ex){
	    	return LocalDate.now();
	    }
	}

	/*
	 * Metodo de requerimiento: Obtiene el precio de un stock de acuerdo a la fecha de entrada, 
	 * asumiendo que pueden haber más de un stock asociado a la fecha de entrada, estos se suman.
	 */
	public Long getPriceByDate(LocalDate inputDate){
		long price;

		for(int i = 0; i < quantityRandomStock; i++){
			
			if(stockDAO.getListaStockVO().get(i).getPriceDate.isEqual(inputDate))
				price = price + stockDAO.getListaStockVO().get(i).getPriceSale();
		}
	}

    
}