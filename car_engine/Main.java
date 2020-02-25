package car_engine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));

        int countOfEngines = Integer.parseInt(reader.readLine());
        Map<String, Engine> engineMap = new LinkedHashMap<>();


        while (countOfEngines-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            Engine engine = null;
            switch (tokens.length) {
                case 2:
                    engine = new Engine(tokens[0], Integer.parseInt(tokens[1]));
                    break;
                case 3:
                    if (tokens[2].matches("\\d+")) {
                        engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), Integer.parseInt(tokens[2]));
                    } else {
                        engine = new Engine(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    }
                    break;
                case 4:
                    engine = new Engine(tokens[0], Integer.parseInt(tokens[1])
                            , Integer.parseInt(tokens[2]), tokens[3]);
                    break;
            }
            engineMap.putIfAbsent(tokens[0], engine);
        }

        List<Car> cars = new ArrayList<>();
        int countOfCars = Integer.parseInt(reader.readLine());
        while (countOfCars-- > 0) {
            String[] tokens = reader.readLine().split("\\s+");

            Car car = null;
            switch (tokens.length) {
                case 2:
                    car = new Car(tokens[0], engineMap.get(tokens[1]));
                    break;
                case 3:
                    if (tokens[2].matches("\\d+")) {
                        car = new Car(tokens[0], engineMap.get(tokens[1]), Integer.parseInt(tokens[2]));
                    } else {
                        car = new Car(tokens[0], engineMap.get(tokens[1]), tokens[2]);
                    }
                    break;
                case 4:
                    car = new Car(tokens[0], engineMap.get(tokens[1]), Integer.parseInt(tokens[2]), tokens[3]);
                    break;
            }
            cars.add(car);
        }

        cars.forEach(System.out::println);

    }
}
