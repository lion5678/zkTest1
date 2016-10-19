package foo;

import org.zkoss.zk.ui.Component;
import org.zkoss.zul.ListModelArray;

public class FruitProvider extends org.zkoss.zk.ui.select.SelectorComposer<Component> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//	private ListModelArray<?> fruits = new ListModelArray<>(
//			new String[][] { { "Apple", "10kg" }, { "Orange", "20kg" }, { "Mango", "12kg" } });

	public ListModelArray<?> getFruits() {
		
		return new ListModelArray<>(
				new String[][] { { "Apple", "10kg" }, { "Orange", "20kg" }, { "Mango", "12kg" } });
	}
	
	public static void main(String[] args){
		String[][] aaa = {{"aa","bb","cc"},{"aa1","bb1","cc1"}};
		FruitProvider aa = new FruitProvider();
		System.out.println(aaa[0][0]);
		System.out.println(aa.getFruits().getSize()+", "+(((String[])aa.getFruits().get(0))[1]));

//		List<String[][]> list = new ArrayList<>();
//		list.add(aaa);
//		
	}
}
