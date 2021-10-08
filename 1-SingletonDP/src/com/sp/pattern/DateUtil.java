package com.sp.pattern;

import java.io.Serializable;

abstract public class DateUtil extends BaseDateUtil implements Cloneable,
		Serializable {
	private static final long serialVersionUID = 6488148163144293060L;
	private static volatile DateUtil instance;

	private DateUtil() {
		System.out.println("instance created : " + this.hashCode());
	}

	/**
	 * Lazy Instantiation
	 * 
	 * @return
	 */
	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				System.out.println("aquired lock");
				if (instance == null) {
					instance = new DateUtil() {
					};
				}
				System.out.println("released lock");
			}
		}
		return instance;
	}

	public Object readResolve() {
		System.out.println("readResolve()");
		return getInstance();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
