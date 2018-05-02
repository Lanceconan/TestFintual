package default;

public class StockVO{
	
	private Long priceSale;
	private Integer quantitySale;
	private Long valueTax;
	private LocalDate priceDate;

	/*
	 * Constructor vacío de la clase
	 */
	public StockVO(){

	}

	/*
	 * Contructor con datos predefinidos
	 */
	public StockVO(
		Long priceSale,
		Integer quantitySale,
		Long valueTax,
		LocalDate priceDate

	){
		this.priceSale = priceSale;
		this.quantitySale = quantitySale;
		this.valueTax = valueTax;
		this.priceDate = priceDate;
	}

	/*
	 * Obtiene el precio de Venta del stock
	 */
	private Long getPriceSale(){
		return priceSale;
	}

	/*
	 * Setea el precio de Venta del stock
	 */
	private void setPriceSale(Long priceSale){
		return this.priceSale = priceSale;
	}

	/*
	 * Obtiene la cantidad de Venta del stock
	 */
	private Integer getQuantitySale(){
		return quantitySale;
	}

	/*
	 * Setea la cantidad de Venta del stock
	 */
	private void setQuantitySale(Integer quantitySale){
		return this.quantitySale = quantitySale;
	}

	/*
	 * Obtiene el valor en Impuestos de Venta del stock
	 */
	private Long getvalueTax(){
		return valueTax;
	}

	/*
	 * Setea el valor en Impuestos de Venta del stock
	 */
	private void setValueTax(Long valueTax){
		return this.valueTax = valueTax;
	}

	/*
	 * Obtiene la fecha de Venta del stock
	 */
	private LocalDate getPriceDate(){
		return priceSale;
	}

	/*
	 * Setea la fecha de Venta del stock
	 */
	private void setPriceDate(LocalDate priceDate){
		return this.priceDate = priceDate;
	}

}