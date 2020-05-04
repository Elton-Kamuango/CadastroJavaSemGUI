/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastro;

/**
 *
 * @author Orlando Kamuango
 */
public class Loja {
   private Pessoa[] pessoa;
   private int qtMax;
   private int qtReal;

   public Loja(){
   } 
   public Loja(int max) {
        this.qtMax = max;
        this.qtReal = 0;
    }
//Acessores e Transformadores
    public Pessoa[] getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa[] pessoa) {
        this.pessoa = pessoa;
    }

    public int getQtMax() {
        return qtMax;
    }

    public void setQtMax(int qtMax) {
        this.qtMax = qtMax;
        this.pessoa = new Pessoa[qtMax];
    }

    public int getQtReal() {
        return qtReal;
    }

    public void setQtReal(int qtReal) {
        this.qtReal = qtReal;
    }
    //Método para adicionar pessoas
   public void adicionarPessoa(Pessoa p){
       for(int i=0; i< qtReal;i++){
        if((this.qtReal < this.qtMax)&&(p!=null)){
            
            this.pessoa[qtReal++] = p;
            System.out.println("Cadastro realizado com sucesso!!!");
            break;
        }
        else if((qtReal < qtMax)&&(isIn(p)==false)&&(0<qtReal)){
            pessoa[qtReal]=p;
            qtReal++;
                  System.out.println("A Loja já está Cheia!");
                   break;
        }
   }
   }
   //Método para verificar se a loja está cheia
   public boolean estaCheio(){
       return qtReal == qtMax;
   }
   //Método para ver quantas pessoas foram cadastradas
   public int getCount(){
       return this.qtReal;
   }
   //Método para ver se uma pessoa já foi cadastrada
   public boolean isIn(Pessoa ps){
       int el=0;
       for(int i = 0; i < qtReal; i++){   
        if(pessoa[i].getnSegSoc().equals(ps.getnSegSoc()));
       el=1;
           System.out.println("Essa pessoa já está cadastradas!");
       }
       return el==1;
   }
   //Método para mostrar todas as pessoas cadastradas
   public void displayAll(){
       for(int count = 0; count < this.qtReal;count++){
            System.out.println("\n"+pessoa[count]);
  
   }
   }
}
         
     
 
