package com.patrick.patterns.creational.prototype;

import java.nio.file.Path;

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
 * @date: Created in 2021/8/21 2:56 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class PatrickMail {

	private String name;
	private String emailAddress;
	private String content;

	public PatrickMail() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "PatrickMail{" +
				"name='" + name + '\'' +
				", emailAddress='" + emailAddress + '\'' +
				", content='" + content + '\'' +
				'}';
	}
}
