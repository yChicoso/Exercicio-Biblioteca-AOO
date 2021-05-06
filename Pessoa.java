public abstract class Pessoa {
        
    public String nome;

    public Pessoa(String nome, String nacionalidade){
    this.nome = nome;
    }
    public void setNome(String meuNome){
    this.nome = meuNome;    
    }
    public String getNome(){
    return nome;    
    }
}
