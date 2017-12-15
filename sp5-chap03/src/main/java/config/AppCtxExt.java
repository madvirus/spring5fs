package config;

import java.util.HashMap;
import java.util.Map;

import spring.ChangePasswordService;
import spring.MemberDao;
import spring.MemberRegisterService;

public class AppCtxExt extends AppCtx {
	private MemberDao memberDaoBean;

	@Override
	public MemberDao memberDao() {
		if (memberDaoBean == null)
			memberDaoBean = super.memberDao();
		return memberDaoBean;
	}

}
