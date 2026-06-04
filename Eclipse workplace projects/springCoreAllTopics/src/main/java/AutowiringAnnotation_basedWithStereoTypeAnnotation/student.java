package AutowiringAnnotation_basedWithStereoTypeAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class student {
    
//	@Autowired    //1) Autowired on field
	private Address ad;
    
	public Address getAd() {
		return ad;
	}
    
	@Autowired  // 2) autowired on setter
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
//	@Autowired   // 3) Autowired on constructor
//	public student(Address ad) {
//		super();
//		this.ad = ad;
//	}

	@Override
	public String toString() {
		return "student [ad=" + ad + "]";
	}

}
