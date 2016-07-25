package com.shiyanlou.demo.aop.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



public class AdviceMethode implements MethodInterceptor {

	public Object invoke(MethodInvocation methodInvocation) throws Throwable {
		// TODO Auto-generated method stub
//		System.out.println("Method name : "+ methodInvocation.getMethod().getName());
//		System.out.println("Method arguments : "+ Arrays.toString(methodInvocation.getArguments()));
		System.out.println("AdviceMethod : Before method Advice!");
		
		try{
			Object result = methodInvocation.proceed();
			System.out.println("AdviceMethod : After method Advice!");
			return result;
		}
		catch(IllegalArgumentException e){
			System.out.println("AdviceMethod : Throw exception advice!");
			throw e;
			
		}
	}

}
