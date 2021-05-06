public class Main {
   public static void main(String[] args){
   
      
   Autor autor1 = new Autor("Autor:"+" Stephen Hawking. "," Nacionalidade:"+" Reino Unido");
   System.out.println(autor1.nome + autor1.nacionalidade);
   Autor autor2 = new Autor("Autor:"+" Stephen Covey. ","Nacionalidade:"+" Estados Unidos");
   System.out.println(autor2.nome + autor2.nacionalidade);
   
   Aluno aluno = new Aluno("Aluno:"+" Peterson Correia. ","Código:"+" 0101");
   System.out.println(aluno.nome + aluno.codigo);
   Professor prof = new Professor("Professor:"+" Efrain Rodriguez. ","Código:"+" 0202");
   System.out.println(prof.nome + prof.codigo);

   Livro livro1 = new Livro("Livro:"+" Uma breve história do tempo. "+"",autor1);
   livro1.emprestadoPor = aluno;
   System.out.println(livro1.nome + autor1.nome);
   System.out.println("Emprestado por: "+ livro1.emprestadoPor.nome);

   Livro livro2 = new Livro("Livro:"+" Os 7 hábitos das pessoas altamente eficazes. "+"",autor2);
   livro2.emprestadoPor = prof;
   System.out.println(livro2.nome + autor2.nome);
   System.out.println("Emprestado por: "+ livro2.emprestadoPor.nome);


   }
}
