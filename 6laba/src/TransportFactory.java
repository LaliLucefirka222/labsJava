public class TransportFactory {

    public Factory createFactory(String typeFactory) {
        switch (typeFactory) {
            case "PassengerFactory" : return new PassengerCarFactory();
            case "CargoFactory" : return new CargoTruckFactory();
            case "AirFactory" : return new AirTransportFactory();
        }
        return null;
    }
}
