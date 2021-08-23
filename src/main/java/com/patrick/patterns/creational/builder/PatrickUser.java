package com.patrick.patterns.creational.builder;

/**
 * ｜                 ,;,,;;
 * ｜               ,;;'()     风
 * ｜     __      ,;;' ' \     流
 * ｜  /'  '\'~~'~' \ /'\.)    堪
 * ｜ ,;(      )    /  |.      比
 * ｜,;' \    /-.,,(   ) \     丶
 * ｜    ) /       ) / )|      城
 * ｜    ||        ||  \)      管
 * ｜   (_\       (_\          希
 * @author: 城管丶希
 * @date: Created in 2021/7/1 9:02 下午
 * @desc: 当创建一个对象，但是属性很多，那句很麻烦，如果参数位置错了也不好整
 * 所以通过静态内部类，构造一个建造者，可以链式调用生产目标对象
 * 那么他和工厂方法有什么区别呢
 * 1、工厂方法适合创建简单的对象，建造者适合创建属性较多的对象
 * @motto: Keep It Simple and Stupid, KISS
 */
public class PatrickUser {
	private String userName;
	private String userAge;
	private String userSex;

	public PatrickUser(PatrickUserBuilder patrickUserBuilder) {
		this.userAge = patrickUserBuilder.userAge;
		this.userName = patrickUserBuilder.userName;
		this.userSex = patrickUserBuilder.userSex;
	}

	public static PatrickUserBuilder newBuilder() {
		return new PatrickUserBuilder();
	}

	public static class PatrickUserBuilder {
		private String userName;
		private String userAge;
		private String userSex;

		public PatrickUserBuilder() {

		}

		public PatrickUserBuilder buildUserName(String userName) {
			this.userName = userName;
			return this;
		}

		public PatrickUserBuilder buildUserAge(String userAge) {
			this.userAge = userAge;
			return this;
		}

		public PatrickUserBuilder buildUserSex(String userSex) {
			this.userSex = userSex;
			return this;
		}

		public PatrickUser build() {
			return new PatrickUser(this);
		}
	}


	@Override
	public String toString() {
		return "PatrickUser{" +
				"userName='" + userName + '\'' +
				", userAge='" + userAge + '\'' +
				", userSex='" + userSex + '\'' +
				'}';
	}
}
