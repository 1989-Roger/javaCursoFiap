package beans;

public class Pessoa {

    private int id;
    private String nome;
    private int idade;
    private String sentimento;
    private String cidade;

    // getter e setter

    /// setter
    public void setIdade(int idade){
        if(idade < 0){
            this.idade = 0;
        }else{
            this.idade = idade;
        }
    }
    public int getIdade(){
        return this.idade;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setSentimento(String sentimento){
        this.sentimento = sentimento;
    }
    public String getSentimento() {
        return sentimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // metodos
    public void comer(String refeicao){
        System.out.println("Tipo de refeicao: "+ refeicao);
        this.sentimento = "Estufado !!! ";
    }
    public void dormir(int tempo){
        System.out.println("Tempo de sono: "+tempo);
        if(tempo >= 6){
            this.sentimento = ("Descansado");
        }else{
            this.sentimento = "Morto de sono !!!!";
        }
    }
}
