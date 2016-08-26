package org.javaiw.model;

public class Vendor {
	
	String vemail, vname;

	public Vendor(String vemail, String vname) {
		super();
		this.vemail = vemail;
		this.vname = vname;
	}

	public Vendor() {
		super();
	}

	public String getVemail() {
		return vemail;
	}
	public void setVemail(String vemail) {
		this.vemail = vemail;
	}
	public String getVname() {
		return vname;
	}
	public void setVname(String vname) {
		this.vname = vname;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return vname + " = " + vemail;
	}

}

