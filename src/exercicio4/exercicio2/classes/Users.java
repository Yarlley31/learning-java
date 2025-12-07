package exercicio4.exercicio2.classes;

public class Users {
    protected  String name;
    protected String email;
    protected int password;
    protected boolean isAdm;

    public Users(String name, String email, int password, boolean isAdm) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdm = isAdm;
    }

    public void login() {
        System.out.println(this.name + " realizou login.");
    }
    public void logout() {
        System.out.println(this.name + " saiu do sistema.");
    }

    public void ChangeData(String newName, String newEmail) {
        this.name = newName;
        this.email = newEmail;
        System.out.println("Dados atualizados com sucesso!");
    }

    public void changePassword(int newPassword) {
        this.password = newPassword;
        System.out.println("Senha alterada com sucesso!");
    }
    // getters e setters basic
    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }
    public String getEmail(){ return email; }
    public void setEmail(String email){ this.email = email; }
    public boolean isAdm(){ return isAdm; }

}
