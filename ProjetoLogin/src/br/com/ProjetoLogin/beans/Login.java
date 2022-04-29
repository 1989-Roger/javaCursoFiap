package br.com.ProjetoLogin.beans;

public class Login {

    private String usuario = "admin";
    private String senha = "admin";

    public Login() {
    }

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario, String senha) {
        try {
            if (usuario.equalsIgnoreCase(this.usuario) && senha.equalsIgnoreCase(this.senha)) {
                return true;
            }
            throw new Exception("log: usuário / senha inválidos - usuario: " + usuario);
        } catch (Exception ex) {
            // como tratar a exceção
            System.out.println(ex.getMessage());
        }
        return false;
    }
}
