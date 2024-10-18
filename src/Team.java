public class Team 
{
    private String nome;
     public Team( String nome){
         this.nome=nome;
     }
     public String getNome(){
         return nome;
     }
     public String toString(){
         return "Sono il team " + nome;
     }
}