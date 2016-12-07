package com.gnnt.sshlink;


import com.gnnt.model.PropertiesModel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SSHTunnel {

	private PropertiesModel pm = new PropertiesModel();

	public void connect() {
		try {
			JSch jsch = new JSch();
			Session session = jsch.getSession(pm.getUserTunnel(),
					pm.getHostTunnel(), pm.getPortTunnel());
			session.setPassword(pm.getPasswordTunnel());
			session.setConfig("StrictHostKeyChecking", "no");
			session.connect();
			int assinged_port = session.setPortForwardingL(pm.getLocalport(),
					pm.getRemotehost(), pm.getRemoteport());
			System.out.println("本地端口:" + assinged_port + "映射到》》》》》》 "
					+ pm.getRemotehost() + ":" + pm.getRemoteport());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		SSHTunnel tunnel = new SSHTunnel();
		ReadProperties rp = new ReadProperties();
		tunnel.setPm(rp.read()); // 给model赋值。连接属性
		tunnel.connect();// 执行连接
	}

	/****** get set 方法 ************/
	public PropertiesModel getPm() {
		return pm;
	}

	public void setPm(PropertiesModel pm) {
		this.pm = pm;
	}

}

