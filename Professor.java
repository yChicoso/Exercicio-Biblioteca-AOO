public class Professor extends Pessoa {
    String codigo;

    public Professor(String nome, String codigo){
    super(nome, codigo);
    this.codigo = codigo;
    }
    
    public void setCod(String Cod){
    this.codigo = Cod;    
    }
    public String getCod(){
    return codigo;
    }
   
}
