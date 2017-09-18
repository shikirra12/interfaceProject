public class Navy extends Solider implements Punch,Kick {
    public Navy(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak(){
        return "HooYAH!";
    }

    @Override
    public String kickFace() {
        return "WooTAH!";
    }

    @Override
    public String landedPunch() {
        return "WallLAA!";
    }
}
