package main.java.model;

import java.util.ArrayList;
import java.util.List;

import main.java.util.ListaArticulos;

public class Order {
	
	public Order(Integer code, String consumer, Supermarket supermarket) {
		this.code = code;
		this.consumer = consumer;
		this.supermarket = supermarket;
		this.orderLines = new ArrayList<OrderLine>();
	}

	private Integer code;
	private String consumer;
	
	private Supermarket supermarket;
	private List<OrderLine> orderLines;
	
	//SEGUNDA PARTE
	private ListaArticulos linkedOrderLines;
	
	public Integer getCode() {
		return code;
	}
	public void setCode(Integer code) {
		this.code = code;
	}
	public String getConsumer() {
		return consumer;
	}
	public void setConsumer(String consumer) {
		this.consumer = consumer;
	}
	public Supermarket getSupermarket() {
		return supermarket;
	}
	public void setSupermarket(Supermarket supermarket) {
		this.supermarket = supermarket;
	}
	public List<OrderLine> getOrderLines() {
		return orderLines;
	}
	public void setOrderLines(List<OrderLine> orderLines) {
		this.orderLines = orderLines;
	}	
	public ListaArticulos getListaPedidos() {
		return linkedOrderLines;
	}
	public void setListaPedidos(ListaArticulos linkedOrderLines) {
		this.linkedOrderLines = linkedOrderLines;
	}
	
	public String toString() {
		return String.format("%o - %s   Supermarket: %s", this.code, this.consumer, this.supermarket.getName());
	}
	
	//M√©todos a completar
	//PRIMERA PARTE
	
	/* INTERFAZ
	 * Comentario: AÒade una linea de pedido de la lista
	 * Prototipo: public void addOrderLine(OrderLine orderLine)
	 * Entrada: Un OrderLine que representa la linea de pedido a aÒadir
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: Se aÒade una linea de pedido
	 */
	public void addOrderLine(OrderLine orderLine) {
		orderLines.add(orderLine);
	}
	
	/* INTERFAZ
	 * Comentario: Borra una linea de pedido de la lista
	 * Prototipo: public void removeOrderLine(OrderLine orderLine) 
	 * Entrada: Un OrderLine que ser· la linea de pedido que se borrar·
	 * Precondiciones: No hay
	 * Salida: No hay
	 * Postcondiciones: Borra la linea de pedido especificada, si la misma
	 * 					lista de pedido est· repetida, borra la primera ocurrencia.
	 * 					Si la linea de pedido no existe en la lista, no borra ninguna.
	 */
	public void removeOrderLine(OrderLine orderLine) {
		orderLines.remove(orderLine);
	}
	
	/* INTERFAZ
	 * Comentario: Obtiene una linea de pedido de la lista
	 * Prototipo: public OrderLine getOrderLine(int position)
	 * Entrada: la posicion en la que se encuentra la linea de pedido dentro de la lista
	 * Precondiciones: La posicion debe ser una posicion existente.
	 * Salida: un OrderLine con la linea de pedido
	 * Postcondiciones: Asociado al nombre devuelve un objeto OrderLine con la linea de pedido.
	 */
	public OrderLine getOrderLine(int position) {
		return orderLines.get(position);
	}
	
	//SEGUNDA PARTE
	public void addLinkedOrderLine(OrderLine orderLine) {
		//TODO A√±adir art√≠culo
		
	}
	
	public void removeLinkedOrderLine(OrderLine orderLine) {
		//TODO Eliminar art√≠culo
		
	}
	
	public OrderLine getLinkedOrderLine(int position) {
		//TODO Coger art√≠culo
		
		return null;
	}
	
	public OrderLine getLastOrderLine() {
		//TODO Coger √∫ltimo art√≠culo
		
		return null;
	}
	
	//TERCERA PARTE
	public Double getTotalPrice() {
		//TODO Calcular el total del pedido
		
		return 0.0;
	}

}
