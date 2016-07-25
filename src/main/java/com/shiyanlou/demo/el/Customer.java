package com.shiyanlou.demo.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("customerBean")
public class Customer {
//	@Value("#{itemBean}")
//	private Item item;
//	
//	@Value("#{itemBean.name}")
//	private String itemName;
////	private Item item;
////	private String itemName;
////	
//	@Override
//	public  String toString(){
//		return "itemName=" +this.itemName +"  "+"Item.total="+this.item.getTotal();
//	}
//
//	public Item getItem() {
//		return item;
//	}
//
//	public void setItem(Item item) {
//		this.item = item;
//	}
//
//	public String getItemName() {
//		return itemName;
//	}
//
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}
	/**
	 * test1
	 */
//	@Value("#{'123'.toUpperCase()}")
//	private String name;
//	@Value("#{priceBean.getSpecialPrice()}")
//	private double amount;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public double getAmount() {
//		return amount;
//	}
//	public void setAmount(double amount) {
//		this.amount = amount;
//	}
//	@Override
//	public String toString(){
//		return "Customer [name=" + name + ", amount=" + amount + "]";
//	}
	@Value("#{testBean.map['MapA']}")
	private String mapA;
	@Value("#{testBean.list[0]}")
	private String list;
	public String getMapA() {
		return mapA;
	}
	public void setMapA(String mapA) {
		this.mapA = mapA;
	}
	public String getList() {
		return list;
	}
	public void setList(String list) {
		this.list = list;
	}
	@Override
	public String toString(){
		return "Customer [mapA = " + mapA + ", list=" + list + "]";
	}
}
