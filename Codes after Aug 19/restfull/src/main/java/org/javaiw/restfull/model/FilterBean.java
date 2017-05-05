package org.javaiw.restfull.model;

import javax.ws.rs.MatrixParam;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

public class FilterBean {
	
	@MatrixParam("pname")
	String pname;
	
	@QueryParam("maxp")
	int maxp;

	@PathParam("ProductId")
	int ProductId;
	
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getMaxp() {
		return maxp;
	}
	public void setMaxp(int maxp) {
		this.maxp = maxp;
	}
	
}
