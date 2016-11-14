package mvvm;

import java.util.List;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

import com.model.CarServiceImpl;
import com.model.CarServiceInterface;
import com.model.CarVO;

public class OrderVM {
	private String keyword;
    private List<CarVO> carList;
    private CarVO selectedCar;
     
    private CarServiceInterface carService = new CarServiceImpl();
     
    public void setKeyword(String keyword) {
    	System.out.println(keyword);
        this.keyword = keyword;
    }
    public String getKeyword() {
        return keyword;
    }
 
    public List<CarVO> getCarList(){
        return carList;
    }
         
    public void setSelectedCar(CarVO selectedCar) {
    	System.out.println(selectedCar);
        this.selectedCar = selectedCar;
    }
    public CarVO getSelectedCar() {
        return selectedCar;
    }
 
    @Command
    @NotifyChange(value="carList")
    public void search(){
    	System.out.println("keyword: "+keyword);
        carList = carService.search(keyword);
    }
}
