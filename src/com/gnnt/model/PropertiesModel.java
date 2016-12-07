package com.gnnt.model;

public class PropertiesModel {
	private int localport;   //本地端口 1521 1520 1519 等
	private String remotehost; // //远程oracle服务器 ip
	private int remoteport;  ////远程oracle服务端口
	private String userTunnel; ///SSH连接用户名(隧道)
	private String passwordTunnel; ////SSH连接密码(隧道)
	private String hostTunnel;//SSH服务器(隧道)ip
	private int portTunnel; //SSH访问端口(隧道)
	public int getLocalport() {
		return localport;
	}
	public void setLocalport(int localport) {
		this.localport = localport;
	}
	public String getRemotehost() {
		return remotehost;
	}
	public void setRemotehost(String remotehost) {
		this.remotehost = remotehost;
	}
	public int getRemoteport() {
		return remoteport;
	}
	public void setRemoteport(int remoteport) {
		this.remoteport = remoteport;
	}
	public String getUserTunnel() {
		return userTunnel;
	}
	public void setUserTunnel(String userTunnel) {
		this.userTunnel = userTunnel;
	}
	public String getPasswordTunnel() {
		return passwordTunnel;
	}
	public void setPasswordTunnel(String passwordTunnel) {
		this.passwordTunnel = passwordTunnel;
	}
	public String getHostTunnel() {
		return hostTunnel;
	}
	public void setHostTunnel(String hostTunnel) {
		this.hostTunnel = hostTunnel;
	}
	public int getPortTunnel() {
		return portTunnel;
	}
	public void setPortTunnel(int portTunnel) {
		this.portTunnel = portTunnel;
	}
	@Override
	public String toString() {
		return "PropertiesModel [localport=" + localport + ", remotehost="
				+ remotehost + ", remoteport=" + remoteport + ", userTunnel="
				+ userTunnel + ", passwordTunnel=" + passwordTunnel
				+ ", hostTunnel=" + hostTunnel + ", portTunnel=" + portTunnel
				+ "]";
	}
	
}
