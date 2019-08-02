package com.java.practice.comparable.model;

public class Laptops implements Comparable<Laptops> {

	public Laptops(String brand, int ram, int price) {
		super();
		this.brand = brand;
		this.ram = ram;
		this.price = price;
	}

	private String brand;
	private int ram;
	private int price;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Laptops o) {
		if (this.getRam() > o.getRam()) {
			return 1;
		} else if (this.getRam() < o.getRam()) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public String toString() {
		return "Laptops [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
	}

}
