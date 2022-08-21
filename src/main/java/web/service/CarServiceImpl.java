package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService{

        private List<Car> cars;

        {
            cars = new ArrayList<>();
            cars.add(new Car(1,"Ford","Trasit"));
            cars.add(new Car(2,"VAZ","2107"));
            cars.add(new Car(3,"Mersedes", "W140"));
            cars.add(new Car(4,"Lada","Granta"));
            cars.add(new Car(5,"UAZ","Patriot"));
        }

        public List <Car> getCarList(){
            return cars;
        }
}
