package com.sp.pattern;

public class BirthdayOrganizer {
	private DateUtil dateUtil;

	public void showBirthday(int id) throws ClassNotFoundException {
		Class.forName("com.sp.pattern.DateUtil");
		if (id > 0) {
			dateUtil = DateUtil.getInstance();
		}
	}
}
