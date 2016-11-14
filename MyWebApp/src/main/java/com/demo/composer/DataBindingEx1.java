package com.demo.composer;

import org.zkoss.bind.annotation.Command;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zkplus.databind.AnnotateDataBinder;
import org.zkoss.zul.Button;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.model.Person;

public class DataBindingEx1 {
	private static final long serialVersionUID = 1L;
	Window win;
    Textbox txt_firstname,txt_lastname,txt_tel;
    Datebox dat_birthday;
    Label lbl_info;
    Button btn_Submit;


	private Person person = new Person();
    
    public DataBindingEx1() {
		super();
		System.out.println("DataBindingEx1()");
	}

	public Person getPerson() {
		System.out.println("getPerson");
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
		System.out.println("setPerson");
	}

	@Command
    public void setValue(){
    	System.out.println("setValue");
    }
	
	@Command
    public void getValue(){
    	System.out.println("getValue");
    }
}
