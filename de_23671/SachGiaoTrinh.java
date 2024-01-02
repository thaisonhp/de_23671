package de_23671;

public class SachGiaoTrinh extends Sach{
	private String year ; 
	private double price ;
	

	public SachGiaoTrinh() {
		
	}


	public SachGiaoTrinh(String title, String author, String year, double price) {
		super(title, author);
		this.year = year;
		try {
			if(price > 0) {
				this.price = price;
			}else {
				throw new  Exception("Yeu cau gia phai la so duong");
			}
		}catch(Exception ex) {
			System.out.print("Loi" + ex.getMessage());
		}
	}
	
	public String getYear() {
		return year;
	}


	public double getPrice() {
		return price;
	}


	public void setYear(String year) {
		this.year = year;
	}


	public void setPrice(double price) {
		try {
			if(price > 0) {
				this.price = price;
			}else {
				throw new  Exception("Yeu cau gia phai la so duong");
			}
		}catch(Exception ex) {
			System.out.print("Loi" + ex.getMessage());
		}
	}
	
	


	@Override
	public String toString() {
		return "SachGiaoTrinh ["+super.toString()+"year=" + year + ", price=" + price + "]";
	}


	@Override
	public boolean getInfor() {
		// TODO Auto-generated method stub
		this.toString();
		return true;
	} 
	
	
	
	
}
