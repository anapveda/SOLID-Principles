public class Main {
    public static void main(String []ak){
        IndoorGames i=new Badminton();
        OutdoorGames o=new SwimmingPool();
        SportsArena s=new SportsArena(i,o);
        s.play();

    }
}
