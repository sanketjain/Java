package org.javaiw.model;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HWAccountsTag extends SimpleTagSupport {

	String accountno, amount;
	int acctno = Integer.parseInt(accountno);
	int amt = Integer.parseInt(amount);
	
	int principal=0;

	public int getAccountno() {
		return acctno;
	}

	public void setAccountno(int acctno) {
		this.acctno = acctno;
	}

	public int getAmount() {
		return amt;
	}

	public void setAmount(int amt) {
		this.amt = amt;
	}

	public int getPrincipal() {
		return principal;
	}

	public void setPrincipal(int principal) {
		this.principal = principal;
	}

	@Override
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut(); 
	//	principal = principal+amt;
		out.println("Account number " + acctno + " has amt " + principal);
		out.flush();
	}

}
