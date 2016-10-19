package com.xxx.modelcomposer;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zul.SimpleListModel;

import com.model.UserVO;

public class ListModelEx1 extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public SimpleListModel<UserVO> getUsers(){
		List<UserVO> users = new ArrayList<>();
		for(int i=1;i<10;i++){
			UserVO user = new UserVO();
			user.setId(Integer.toString(i));
			user.setPwd(Integer.toString(i)+"pwd");
			users.add(user);
		}
		System.out.println(users.get(3).getId());
		return new SimpleListModel<>(users);
	}
}
