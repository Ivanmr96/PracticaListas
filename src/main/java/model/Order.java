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
	
	//Métodos a completar
	//PRIMERA PARTE
	public void addOrderLine(OrderLine orderLine) {
		//TODO Añadir artículo
		
	}
	
	public void removeOrderLine(OrderLine orderLine) {
		//TODO Eliminar artículo
		
	}
	
	public OrderLine getOrderLine(int position) {
		//TODO Coger artículo
		
		return null;
	}
	
	//SEGUNDA PARTE
	public void addLinkedOrderLine(OrderLine orderLine) {
		//TODO Añadir artículo
		
	}
	
	public void removeLinkedOrderLine(OrderLine orderLine) {
		//TODO Eliminar artículo
		
	}
	
	public OrderLine getLinkedOrderLine(int position) {
		//TODO Coger artículo
		
		return null;
	}
	
	public OrderLine getLastOrderLine() {
		//TODO Coger último artículo
		
		return null;
	}
	
	//TERCERA PARTE
	public Double getTotalPrice() {
		//TODO Calcular el total del pedido
		
		return 0.0;
	}

}
