package test1;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.Execution;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.Sessions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;

import com.model.LoginModel;
import com.model.UserVO;

public class LoginComposer extends SelectorComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Wire()  // ()可使用 css selector 指定DOM物件
	private Textbox userID,userPwd;
	@Wire()
	private Label mesg;

	private String aaa = Executions.getCurrent().getContextPath().replace("/","").trim();
	
	public String getAaa() {
		return aaa;
	}

	@Listen("onClick = #loginBtn")
	public void login(){
		System.out.println("LoginComposer");

		String id = userID.getValue(), pwd = userPwd.getValue();
		System.out.println(id +","+pwd);
		LoginModel model = new LoginModel();
		if(model.login(id , pwd)){
			UserVO user = new UserVO();
			user.setId(id);
			user.setPwd(pwd);
			Sessions.getCurrent().setAttribute("LoginForm", user);  //Sessions.getCurrent() 取得session??
			Executions.getCurrent().sendRedirect("/index.zul");  //跳轉頁面
		}else{
			alert("帳號或密碼不正確!!");
			mesg.setValue("error!!");
		}
	}
}
