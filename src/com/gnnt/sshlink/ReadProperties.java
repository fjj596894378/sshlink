package com.gnnt.sshlink;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gnnt.model.PropertiesModel;

public class ReadProperties {
	// xml文件名。
		private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		public PropertiesModel read() {
			// 读取bean。
			PropertiesModel pm = (PropertiesModel) context
					.getBean("propertiesModel");
			System.out.println(pm.toString());
			return pm;
		}
}
