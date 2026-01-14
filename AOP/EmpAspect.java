package SB.AOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmpAspect {
	
	
	@Before("execution(* SB.AOP.Empdata.*(..))")
	public void beforeme() {
		System.out.println("before method");
	}
	
	@After("within(SB.AOP.Empdata)")
	public void aftermethod() {
		System.out.println("After the method");
	}

}
