package com.gnnt.sshlink;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gnnt.model.PropertiesModel;

public class ReadProperties {
	// xml�ļ�����
		private static ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		public PropertiesModel read() {
			// ��ȡbean��
			PropertiesModel pm = (PropertiesModel) context
					.getBean("propertiesModel");
			System.out.println(pm.toString());
			return pm;
		}
}
