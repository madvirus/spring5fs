package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import config.AppCtx;

public class MainForConfigurationType {

	public static void main(String[] args) throws Exception {
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);

		AppCtx appCtx = ctx.getBean(AppCtx.class);
		System.out.println(appCtx.getClass().getName());

		ctx.close();
	}

}