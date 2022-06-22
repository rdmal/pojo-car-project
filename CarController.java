package Example.Controller;

import Example.Cars;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CarController {
    //@RequestMapping(value = "/hello", method = RequestMethod.GET)
    @RequestMapping(value = "/motor", method = RequestMethod.GET)
    public List<Cars> getCars(Model model) {
        List<Cars> carsList = new ArrayList<Cars>();
        carsList.add(new Cars("GLA-350","Mercedes-Benz",45000.0, "Red",2020,"5"));
        carsList.add(new Cars("Wrangler","Jeep",50000.0, "Gray",2023,"2"));
        System.out.println("The controller " + carsList);
        return carsList;
        
    }

}

