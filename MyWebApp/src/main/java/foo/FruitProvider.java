package foo;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;

import org.zkoss.zul.ListModelArray;

public class FruitProvider extends org.zkoss.zk.ui.select.SelectorComposer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ListModelArray fruits = new ListModelArray(
			new String[][] { { "Apple", "10kg" }, { "Orange", "20kg" }, { "Mango", "12kg" } });

	public ListModelArray getFruits() {
		return fruits;
	}
	
	public static void main(String[] args){
		String[][] aaa = {{"aa","bb","cc"},{"aa1","bb1","cc1"}};
		FruitProvider aa = new FruitProvider();
//		System.out.println(aa.getFruits().getSize()+","+(((String[][])aa.getFruits())[0][1]));

		List<String[][]> list = new ArrayList<>();
		list.add(aaa);
		
	}
}
