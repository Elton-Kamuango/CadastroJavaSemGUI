/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastro;

import java.util.Objects;


public class Pessoa {
    protected String nome;
    protected String sexo;
    protected Data dataNascimento;
    protected String endereco;
    protected String nSegSoc; // nº de Segurança Social
    private int count;
    
    public Pessoa() {
        
    }   
    public Pessoa(String nme, String sexo, Data dob, String nSegSoc,String end) {
        if(dob!= null){
            this.nome = nme;
            this.sexo = sexo;
            this.dataNascimento = dob;
            this.nSegSoc = nSegSoc;
            this.endereco = end;
            this.count=0;
            count++;
    }
    }
   
    // Acessadores e Transformadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if(endereco != null)
        this.endereco = endereco;
    }

    public String getnSegSoc() {
        return nSegSoc;
    }

    public void setnSegSoc(String nSegSoc) {
        this.nSegSoc = nSegSoc;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    //Método para clonar Pessoa
    public void CopiarP(Pessoa outra){
     if(outra != null)
         nome = outra.nome;
         sexo = outra.sexo;
         dataNascimento = outra.dataNascimento;
         endereco = outra.endereco;
         nSegSoc = outra.nSegSoc;
    }

    //Método para comparar Pessoas
    public boolean equals(Pessoa outra) {
        if (this == outra) {
            return true;
        }
        if (outra == null) {
            return false;
        }
        if (getClass() != outra.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) outra;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return Objects.equals(this.nSegSoc, other.nSegSoc);
    }

    @Override
    public String toString() {
        return "\t\tPessoa" + "\nNúmero de segurança social: "+nSegSoc+"\nNome: "+ nome +"\nGénero: "+sexo+"\nData de nascimento: "+dataNascimento+"\nEndereço: "+endereco;
    }    
}