package form;

public class FormCommand {
	private String loginType;
	private String jobCode;
	private String[] favoriteOs;
	private boolean allowNoti;

	public String getLoginType() {
		return loginType;
	}

	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String[] getFavoriteOs() {
		return favoriteOs;
	}

	public void setFavoriteOs(String[] favoriteOs) {
		this.favoriteOs = favoriteOs;
	}

	public boolean isAllowNoti() {
		return allowNoti;
	}

	public void setAllowNoti(boolean allowNoti) {
		this.allowNoti = allowNoti;
	}

}
