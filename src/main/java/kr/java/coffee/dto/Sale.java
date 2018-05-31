package kr.java.coffee.dto;

public class Sale {
	private int no;
	private Product product; // 제품
	private int saleCnt; // 판매수량
	private int marginRate; // 마진율

	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Sale(int no) {
		this.no = no;
	}

	public Sale(int no, Product product, int saleCnt, int marginRate) {
		this.no = no;
		this.product = product;
		this.saleCnt = saleCnt;
		this.marginRate = marginRate;
	}


	

	@Override
	public String toString() {
		return String.format("Sale [%s, %s, %s, %s]", no, product, saleCnt, marginRate);
	}

	public String getCode() {
		return product.getCode();
	}

	public void setCode(String code) {
		product.setCode(code);
	}

	public String getName() {
		return product.getName();
	}

	public void setName(String name) {
		product.setName(name);
	}

	public int getPrice() {
		return product.getPrice();
	}

	public void setPrice(int price) {
		product.setPrice(price);
	}

	public int hashCode() {
		return product.hashCode();
	}

	public boolean equals(Object obj) {
		return product.equals(obj);
	}

	
}
