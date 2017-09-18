public interface Kick {
    String kickFace();
    default String kickBody(){
        return "OMG that Hurts";
    }
}
