package main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.DsDevConfig;
import config.DsRealConfig;
import config.MemberConfig;
import spring.Member;
import spring.MemberDao;

public class MainSystemProperty {

	public static void main(String[] args) {
		System.setProperty("spring.profiles.active", "dev");
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				MemberConfig.class, DsDevConfig.class, DsRealConfig.class);

		MemberDao dao = context.getBean(MemberDao.class);
		List<Member> members = dao.selectAll();
		members.forEach(m -> System.out.println(m.getEmail()));

		context.close();
	}
}
