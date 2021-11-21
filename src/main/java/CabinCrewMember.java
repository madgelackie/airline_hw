public class CabinCrewMember extends Staff {

    public CabinCrewMember(String name, Ranking rank) {
        super(name, rank);
    }



    public String relayMessage(){
        return "Please fasten your seatbelt";
    }
}
