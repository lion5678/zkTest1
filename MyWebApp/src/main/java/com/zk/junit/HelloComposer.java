package com.zk.junit;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;

public class HelloComposer extends SelectorComposer<Component>{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Wire("label")
	Label label;

	@Listen("onClick = button")
	public void hello() {
		label.setValue("Hello Mimic");
	}
}
