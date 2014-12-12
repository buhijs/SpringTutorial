package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	
	
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJointPoint){
		Object returnValue=null;
		
		try{
			System.out.println("Before advice");
			returnValue=proceedingJointPoint.proceed();
			System.out.println("After advice");
			
		}
		catch(Throwable e){
			System.out.println("After throwing");
		}
		System.out.println("After finally");
		return returnValue;
	}
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	public void loggingAdvice(){
		System.out.println("Logging from the advice");
	}
}
