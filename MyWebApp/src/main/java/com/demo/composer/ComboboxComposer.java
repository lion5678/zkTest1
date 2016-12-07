package com.demo.composer;

import java.util.Arrays;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.SimpleListModel;

public class ComboboxComposer extends SelectorComposer<Component> {

	
	public ListModelList<String> getListModel(){
		String[] data = {"a", "b", "c"};
		return new ListModelList<>(Arrays.asList(data));
	}
}
