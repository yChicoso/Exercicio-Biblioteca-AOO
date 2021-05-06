public class Autor extends Pessoa {
     public String nacionalidade;
     

    public Autor(String nome, String nacionalidade){

     super(nome, nacionalidade);   
     this.nacionalidade = nacionalidade;
        
    }

    public void setNacional(String Nacional){
    this.nacionalidade = Nacional;    
    }
    public String getNacional(){
    return nacionalidade;    
    }
}