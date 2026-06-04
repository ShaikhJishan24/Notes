package com.AutowiringXML_based;

public class student {
    
	private String Area;
	private Address ad; // same 
    
	public Address getAd() {
		return ad;
	}

	public void setAd(Address ad) {
		this.ad = ad;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}
	
	@Override
	public String toString() {
		return "student [Area=" + Area + ", ad=" + ad + "]";
	}

}
