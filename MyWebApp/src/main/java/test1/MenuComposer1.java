package test1;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.util.GenericAutowireComposer;
import org.zkoss.zul.Tree;

public class MenuComposer1 extends GenericAutowireComposer<Component> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Tree tree;

	@Override
	public void doAfterCompose(Component comp) throws Exception {
		super.doAfterCompose(comp);
		
//		tree.set
	}
	
}
