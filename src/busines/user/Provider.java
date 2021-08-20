package busines.user;

public class Provider {
    private int id;
    private String fantasy_name;


    public Provider(int id, String fantasy_name){
        this.id = id ;
        this.fantasy_name = fantasy_name;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFantasy_name() {
        return fantasy_name;
    }
    public void setFantasy_name(String fantasy_name) {
        this.fantasy_name = fantasy_name;
    }


}
