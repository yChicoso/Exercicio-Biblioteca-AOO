public class Aluno extends Pessoa {
    String codigo;

    public Aluno(String nome, String codigo){
        super(nome, codigo);
        this.codigo = codigo;
    
    } 

    public void setCod(String meuCod){
    this.codigo = meuCod;    
    }
    public String getCod(){
    return this.codigo;
    }
}