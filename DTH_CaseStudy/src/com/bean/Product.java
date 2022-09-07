package com.bean;

public class Product {
	private int id;
	private String sbtype;
	private String sbfeature;
	private int height;
	private int width;
	private int length;
	private int price;
	private int ins_charge;
	private int up_charge;
	private int discount;
	private String billtype;
	private int deposit;
	
	
	public Product(int id, String sbtype, String sbfeature, int height, int width, int length, int price, int ins_charge,
			int up_charge, int discount, String billtype, int deposit) {
		super();
		this.id = id;
		this.sbtype = sbtype;
		this.sbfeature = sbfeature;
		this.height = height;
		this.width = width;
		this.length = length;
		this.price = price;
		this.ins_charge = ins_charge;
		this.up_charge = up_charge;
		this.discount = discount;
		this.billtype = billtype;
		this.deposit = deposit;
		
	}

	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id=id;
	}
	
	public String getSbtype() {
		return sbtype;
	}


	public void setSbtype(String sbtype) {
		this.sbtype = sbtype;
	}


	public String getSbfeature() {
		return sbfeature;
	}


	public void setSbfeature(String sbfeature) {
		this.sbfeature = sbfeature;
	}


	public int getHeight() {
		return height;
	}


	public void setHeight(int height) {
		this.height = height;
	}


	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getLength() {
		return length;
	}


	public void setLength(int length) {
		this.length = length;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public int getIns_charge() {
		return ins_charge;
	}


	public void setIns_charge(int ins_charge) {
		this.ins_charge = ins_charge;
	}


	public int getUp_charge() {
		return up_charge;
	}


	public void setUp_charge(int up_charge) {
		this.up_charge = up_charge;
	}


	public int getDiscount() {
		return discount;
	}


	public void setDiscount(int discount) {
		this.discount = discount;
	}


	public String getBilltype() {
		return billtype;
	}


	public void setBilltype(String billtype) {
		this.billtype = billtype;
	}


	public int getDeposit() {
		return deposit;
	}


	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}


		
	
	
	

}
