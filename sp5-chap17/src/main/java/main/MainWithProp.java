package main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DsConfigWithProp;
import config.InfoConfig;
import config.MemberConfig;
import config.PropertyConfig;
import spring.Info;
import spring.Member;
import spring.MemberDao;

public class MainWithProp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(PropertyConfig.class, InfoConfig.class, MemberConfig.class, DsConfigWithProp.class);
		context.refresh();

		MemberDao dao = context.getBean(MemberDao.class);
		List<Member> members = dao.selectAll();
		members.forEach(m -> System.out.println(m.getEmail()));

		Info info = context.getBean(Info.class);
		info.printInfo();
		
		context.close();
	}
}
