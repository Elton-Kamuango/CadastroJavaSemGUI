/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastro;

/**
 *
 * @author elton
 */
public class Data {

  private int dia;
  private int mes;
  private int ano;

    public Data() {
    }

    public Data(int dd, int mm, int aa) {
        this.dia = dd;
        this.mes = mm;
        this.ano = aa;
    }
    //Acessores e Transformadores
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    //Método para transformar mês em String
    String mesComoString(){
        
        switch(this.mes){
            case 1:
                return "Janeiro";         
            case 2:
                return "Fevereiro";           
            case 3:
                return "Marco";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";   
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                System.out.println("O mes inserido e invalido");
        
        }
        return this.mesComoString();
       }

    //Método para comparar datas
    public boolean equals(Data obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Data other = (Data) obj;
        if (this.dia != other.dia) {
            return false;
        }
        if (this.mes != other.mes) {
            return false;
        }
        return this.ano == other.ano;
    }

    @Override
    public String toString() {
        return "" + dia + "/" + this.mesComoString() + "/" + ano;
    }
        
    
}
