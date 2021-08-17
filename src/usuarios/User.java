package usuarios;

public class User {
    private int id;
    private int cpf;
    private String name;
    private String email;
    private String password;
    private String function;
    private String address;

    public User( int id, int cpf, String name, String email, String password, String function, String address){

        this.id = id;
        this.cpf = cpf;
        this.name = name;
        this.email = email;
        this.password = password;
        this.function = function;
        this.address = address;
    }
}
