public class Marine extends Solider implements Punch,Kick {
    public Marine(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "OohRAH!";
    }

    @Override
    public String kickFace() {
        return "SadeTe";
    }

    @Override
    public String landedPunch() {
        return "MyDamie";
    }
}
