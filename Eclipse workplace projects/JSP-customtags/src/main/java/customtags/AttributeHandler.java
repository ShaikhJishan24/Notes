package customtags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class AttributeHandler extends TagSupport{

	private static final long serialVersionUID = 1L;
    
	public int number ;
	
	public void setnumber(int number){
		this.number = number;
	}
  
	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		
		try {
			out.print("square of number : " + number*number);
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		return SKIP_BODY;
	}
    
}
