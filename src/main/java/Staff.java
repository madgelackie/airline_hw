public abstract class Staff {

    private String name;
    private Ranking rank;

    public Staff(String name, Ranking rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Ranking getRank() {
        return rank;
    }
}
