public class SportsArena {
    IndoorGames i;
    OutdoorGames o;
    SportsArena(IndoorGames i,OutdoorGames g){
        this.i=i; this.o=g;
    }
    public void play(){
        System.out.println(i.playIndoor()+" "+o.playOutdoor());
    }
}
