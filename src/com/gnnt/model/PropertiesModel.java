package com.gnnt.model;

public class PropertiesModel {
	private int localport;   //���ض˿� 1521 1520 1519 ��
	private String remotehost; // //Զ��oracle������ ip
	private int remoteport;  ////Զ��oracle����˿�
	private String userTunnel; ///SSH�����û���(���)
	private String passwordTunnel; ////SSH��������(���)
	private String hostTunnel;//SSH������(���)ip
	private int portTunnel; //SSH���ʶ˿�(���)
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
