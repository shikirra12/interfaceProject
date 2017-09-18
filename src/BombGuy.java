public class BombGuy extends Solider implements BombStrategist {
    @Override
    public String bombAccuracy() {
        return "You're right on the money";
    }

    @Override
    public String speak() {
        return "I bombed you!";
    }
}
