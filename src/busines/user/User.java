package busines.user;

public class User {
    private int id;
    private int cpf;
    private String name;
    private String password;
    private String address;

    public User( int id, int cpf, String name, String password, String address){
        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.password = password;
        this.address = address;
    }

    public  int getId(){
        return id;
    }
    public void setId( int id){
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
