package com.gb.health.commend;
/**
 * 请求头 head 
 * @author lx
 *
 */
public class Head {

	private String dvdid;
	private String DVDNUMBER = "dvdnumber";
	private String VAECODE = "vercode";

	public String getDvdid() {
		return dvdid;
	}

	public void setDvdid(String dvdid) {
		this.dvdid = dvdid;
	}

	public String getDVDNUMBER() {
		return DVDNUMBER;
	}

	public void setDVDNUMBER(String dVDNUMBER) {
		DVDNUMBER = dVDNUMBER;
	}

	public String getVAECODE() {
		return VAECODE;
	}

	public void setVAECODE(String vAECODE) {
		VAECODE = vAECODE;
	}

	

}
