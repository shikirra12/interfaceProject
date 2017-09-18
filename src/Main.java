public class Main {
    public static void main(String[] args){
        Marine marineSolider = new Marine("Jim", 3, 7558);
        Army armySolider = new Army("Kasey", 1, 5342);
        Navy navySolider = new Navy("Mariah", 6, 3247);
        BombStrategist bombStrategist = new BombGuy();

        marineSolider.kickFace();
        System.out.println(marineSolider.name);
        System.out.println(marineSolider.rank);
        System.out.println(marineSolider.serialNumber);
        System.out.println(marineSolider.landedPunch());
        System.out.println(marineSolider.speak());
        System.out.println(marineSolider.eat());
        System.out.println(marineSolider.sleep());
        System.out.println(marineSolider.walk());
        System.out.println(marineSolider.kickFace());

        bombStrategist.bombAccuracy();
        System.out.println("This the the bomb: " + bombStrategist.bombAccuracy());


        armySolider.kickBody();
        System.out.println("I just got kicked " + armySolider.kickBody());
    }
}
