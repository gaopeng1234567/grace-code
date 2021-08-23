package com.patrick.patterns.creational.prototype;

import java.text.MessageFormat;

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
 * @date: Created in 2021/8/21 2:58 下午
 * @desc:
 * @motto: Keep It Simple and Stupid, KISS
 */
public class MailUtils {
	public static void sendMail(PatrickMail patrickMail) {
		String outputContent = "想{0}搭打底裤，邮件地址{1},邮件呢绒{2},发送邮件";
		System.out.println(MessageFormat.format(outputContent, patrickMail.getName(), patrickMail.getEmailAddress(), patrickMail.getContent()));
	}

	public static void saveOriginMail(PatrickMail patrickMail){
		System.out.println("存储原始内容:"+ patrickMail.toString());

	}
}
