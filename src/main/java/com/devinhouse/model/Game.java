package com.devinhouse.model;

public class Game {
	private String title;
	private String distributor;
	private Double price;
	
	public Game(String title, String distributor, Double price) {
		this.title = title;
		this.distributor = distributor;
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDistributor() {
		return distributor;
	}
	public void setDistributor(String distributor) {
		this.distributor = distributor;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Game [title=" + title + ", distributor=" + distributor + ", price=" + price + "]";
	}
	
	
	
}
