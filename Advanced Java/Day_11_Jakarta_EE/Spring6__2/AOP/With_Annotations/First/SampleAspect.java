package mypack;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SampleAspect 
{
	 // to decid the pointcut
	 @Pointcut("execution(* Sample.*(..))")   // aspect on All methods of sample class
	 public void beforepointcut(){}//pointcut name  
	      
	   //This is Adviser
	    @Before("beforepointcut()") //applying pointcut on before advice  
	    public void myadvice(JoinPoint jp)//it is advice (before advice)  
	    {  
	        System.out.println("additional concern");  
	        System.out.println("Method Signature: "  + jp.getSignature());  
	    }  

		// Jp point to the target (display) method of the Sample class
}
