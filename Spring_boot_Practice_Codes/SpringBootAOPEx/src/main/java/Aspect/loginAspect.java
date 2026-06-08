package Aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loginAspect {
        
		// in below method joinPoint is used to to access the createUser method of userservice to access this method information
		@Before("execution(* Service.Userservice.createUser(..))")
	    public void logBeforeMethod(JoinPoint joinPoint){ 
	        System.out.println("Logging BEFORE method: " + joinPoint.getSignature().getName());
	    }
	
	    // used to add link here instead of adding to Aspect method
		@Pointcut("execution(* Service.Userservice.*())")
		private void selectmakepayment(){};
	
// 		Run advice before the method execution.
		@Before("selectmakepayment()")
		public void AspectmethodBefore(){
			System.out.println("Before method");
		}
		
//		Run advice after the method execution, regardless of its outcome.
//		@After("execution(* Service.Userservice.*())")
//		public void AspectmethodAfter(){
//			System.out.println("After method");
//		}
		
//      Run advice after the method execution, only if the method completes successfully.
//		@AfterReturning("execution(* Service.Userservice.*())")
//		public void AspectmethodAfterReturning(){
//			System.out.println("After-Returning method");
//		}
		
//		Run advice after the method execution, only if the method exits by throwing an exception.
//		@AfterThrowing("execution(* Service.Userservice.*())")
//		public void AspectmethodBeforeReturning(){
//			System.out.println("After-Throwing method");
//		}
		
//		Run advice before and after the advised method is invoked.
//		@Around("execution(* Service.Userservice.*())")
//		public void AspectmethodAround(){
//			System.out.println("Around method");
//		}
}
