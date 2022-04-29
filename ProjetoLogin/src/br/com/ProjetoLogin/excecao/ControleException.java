package br.com.ProjetoLogin.excecao;

public class ControleException extends Exception{

    // montar log no banco + envio de email


    public ControleException() {
    }
    public ControleException(String message, Exception ex) {
        super(message, ex);
        print();
        if (message.equalsIgnoreCase("Email")){
            enviarEmail();
        }else if (message.equalsIgnoreCase("Log")){
            gravarBanco();
        }
    }

    private void gravarBanco() {
        System.out.println("Gravando registro no banco de dados");
        System.out.println(getMessage());
        printStackTrace();
    }

    private void enviarEmail() {
        String smtpServer = "smtp://fiap.br";
        String smtpPort = "22";

        System.out.println("Abrindo conexão de email:");
        System.out.println("Email de suporte: suporte@fiap.br");
        System.out.println("---------Detalhes--------");
        System.out.println(getMessage());
        printStackTrace();
    }

    private  void print(){
        System.out.println("==== Meu exception ====");
        System.out.println(getMessage());

    }
}
