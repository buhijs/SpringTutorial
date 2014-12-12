package aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	@Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice(){
		System.out.println("Advice run. Get Method called");
	}
	@Before("allGetters()")
	public void seconfAdvice(JoinPoint joinPoint){
		System.out.println(joinPoint.toString());
		System.out.println(joinPoint.getTarget());
	}
	
	@Before ("args(name)")
	public void stringArgumenMethods(String name){
		System.out.println("A method with String arguments has been called: " + name );
	}
	
	@Pointcut("execution(* get*())")
	public void allGetters(){}
	
	/*@Pointcut("execution(* * Service.model.Circle.*(..))")
	public void allCircleMethods(){}
	 									A possible way*/
	
	@Pointcut("within(Service.model.Circle)")
	public void allCircleMethods(){}
}
