package Example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		var car1 = new Cars("CRV","Honda",35000.0,"Black",2019,"5");
		var car2 = new Cars("X5", "BMW", 40000.0, "Red", 2020,"5");
		var car3 = new Cars("Audi", "Q5", 45000.0, "Black", 2015,"7");
		var car4 = new Cars("Infinity", "qx60", 50000.0, "Blue", 2021,"7");
		var car5 = new Cars("Nissan", "rogue", 32000.0, "Gray", 2023,"5");


		System.out.println("ModelName:" + car1.getModelName() + "," + "Brand:" + car1.getBrand()+ "," + "Price:" + car1.getPrice()+ "," + "Color:" + car1.getColor()+ "," + "Year:" + car1.getYear()+ "," + "NoOfSeats:" + car1.getNoOfSeats());


	}

}
