public class Livro {
   String nome;
   public Autor autor;
   public Pessoa emprestadoPor;

   public Livro(String nome, Autor autor){
    this.nome = nome;
    this.autor = autor;
   }

     
  public Autor getAutor(){
      return autor;    
  }
  public void setAutor(Autor Autor){
   this.autor = Autor;    
  }
  public Pessoa getLivro(){
      return this.emprestadoPor;    
  }
  public void setLivro(Pessoa Livro){
   this.emprestadoPor = Livro;    
  }

}
