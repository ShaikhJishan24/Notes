package customtags;

import jakarta.servlet.jsp.JspException;
import jakarta.servlet.jsp.JspWriter;
import jakarta.servlet.jsp.tagext.TagSupport;

public class MyHandler extends TagSupport{

	private static final long serialVersionUID = 1L;

	@Override
	public int doStartTag() throws JspException {
		
		JspWriter out = pageContext.getOut();
		
		try {
			out.print("My custom tag example");
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		return SKIP_BODY;
	}
	
	

}
