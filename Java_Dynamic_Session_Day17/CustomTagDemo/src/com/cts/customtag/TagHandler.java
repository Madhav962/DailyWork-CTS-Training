package com.cts.customtag;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

public class TagHandler  extends TagSupport{
	@Override
	public int doStartTag() throws JspException {
		System.out.println("From doStartTag()");
		return super.doStartTag();
	}
	@Override
	public int doEndTag() throws JspException {
		System.out.println("From doEndTag()");
		return super.doEndTag();
	}

}
