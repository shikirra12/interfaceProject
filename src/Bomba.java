public interface Bomba extends BombStrategist {
    String hitTarget();
}

class Bomb{

    public Bomb(){

    }
    @Override
    public String toString() {
        return "I am the bomb!";
    }
}