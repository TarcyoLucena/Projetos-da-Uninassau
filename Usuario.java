public class Usuario{
    private String nome;
    private String login;
    private String senha;
    
    public Usuario(String nome, String login, String senha){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }
    
    public boolean login(String login, String senha){
        if(login == this.login && senha == this.senha){
            return true;
        }else{
            return false;
        }
    }
}