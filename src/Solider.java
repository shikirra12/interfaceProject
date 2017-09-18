public abstract class Solider {
    String name;
    int rank;
    int serialNumber;

    public Solider() {
    }

    public Solider(String name, int rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public String sleep(){
        return "snore";
    }
    public String eat(){
        return "chew";
    }
    public String walk(){
        return "trudge";
    }
    public abstract String speak();
}
