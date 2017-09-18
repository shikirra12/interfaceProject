public class Army extends Solider implements Punch, Kick {
    public Army(String name, int rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        return "HooAH!";
    }

    public String kickFace() {
        return "WooPah";
    }

    public String landedPunch() {
        return "HiYAH!";
    }
}
