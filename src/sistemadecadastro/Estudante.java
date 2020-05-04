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
public class Estudante extends Pessoa{
    
    protected String curso;
    protected int ano;

    public Estudante(String curso, int ano, String nme, String sexo, Data dob, String nSegSoc, String end) {
        super(nme, sexo, dob, nSegSoc, end);
        this.curso = curso;
        this.ano = ano;
    }
//Acessores e Transformadores
    public String getCurso() {
        return curso;
    }

    public void setCurso(String s) {
        if(s != null)
        this.curso = s;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int aa) {
        if(0 < aa)
        this.ano = aa;
    }
    //Método para clonar Estudantes
     public void CopiarE(Estudante outro){
     if(outro != null)
         nome = outro.nome;
         sexo = outro.sexo;
         dataNascimento = outro.dataNascimento;
         endereco = outro.endereco;
         nSegSoc = outro.nSegSoc;
         curso = outro.curso;
         ano = outro.ano;
     }

    @Override
    public String toString() {
        return "\t\tEstudante"+"\n Número de segurança social: "+nSegSoc+"\n Nome: "+ nome +"\n Género: "+sexo+"\n Data de nascimento: "+dataNascimento+"\n Endereço: "+endereco+ "\n Curso: " + curso + "\n Ano: " + ano;
    }
    
}
