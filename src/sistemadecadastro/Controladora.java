/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadecadastro;

import java.util.Scanner;

/**
 *
 * @author elton
 */
public class Controladora {
    public static void main(String[]args){
        // TODO code application logic here

    Scanner tcl = new Scanner(System.in);
    Loja m = new Loja();
         m.setQtMax(1000);
    Data d;
    String r = null;
       
        System.out.println("|*************************************************************************|");
        System.out.println("|\t\tSEJA BEM-VINDO AO SISTEMA DE CADASTRO                     |");
        System.out.println("|*************************************************************************|");
        System.out.println();
        System.out.println("Faça a escolha do que deseja fazer:");
        System.out.print("\n\n1 - Cadastrar\t\t\t 2 - Listar\n\n3 - Pesquisar\t\t\t 0 - Sair");
        System.out.println("\n\nDigite aqui a opção correspondente a operação: ");
        int opcao = tcl.nextInt();
        switch(opcao){
            case 1:
                System.out.println("Faça a escolha de quem deseja cadastrar:");
                System.out.print("\n1 - Pessoa\t\t\t\t 2 - Estudante\n\n\t\t 0 - Voltar");
                System.out.println("\n\nDigite aqui a opção correspondente a operação: ");
                int opcao1 = tcl.nextInt();
                switch(opcao1){
                    case 1:
                        System.out.println("\n\n\t\tCADASTRAMENTO DE PESSOA COMUM");
                   
                        do{ 
                            System.out.println("\n\nDigite o número de segurança social:");
                            String seg = tcl.next();
                            System.out.println("\nDigite o nome:");
                            String nm = tcl.next();
                            System.out.println("\nDigite o género:");
                            String sex = tcl.next();
                            System.out.println("\nQual é a sua data de nascimento?");
                            System.out.println("\nDigite o Dia:");
                            int dia = tcl.nextInt();
                            System.out.println("\nDigite o Mês:");
                            int mes = tcl.nextInt();
                            System.out.println("\nDigite o Ano:");
                            int ano = tcl.nextInt();
                            d = new Data(dia, mes, ano);
                            System.out.println("\nDigite o seu endereço:");
                            String end = tcl.next();
                            Pessoa p = new Pessoa(nm, sex, d, seg, end);
                            m.adicionarPessoa(p);

                            System.out.println("\nDeseja cadastrar mais pessoas?(S-sim/Qualquer outra tecla - não)");
                            r = tcl.next();
                    
                        }while(r.equalsIgnoreCase("s"));
                        break;
                    
                    case 2:
                        System.out.println("CADASTRAMENTO DE ESTUDANTES");
                        do{
                            System.out.println("\n\nDigite o número de segurança social:");
                            String seg = tcl.next();
                            System.out.println("\nDigite o nome:");
                            String nm = tcl.next();
                            System.out.println("\nDigite o género:");
                            String sex = tcl.next();
                            System.out.println("\nQual é a sua data de nascimento?");
                            System.out.println("Digite o Dia:");
                            int dia = tcl.nextInt();
                            System.out.println("Digite o Mês:");
                            int mes = tcl.nextInt();
                            System.out.println("Digite o Ano:");
                            int ano = tcl.nextInt();
                            d = new Data(dia, mes, ano);
                            System.out.println("\nDigite o seu endereço:");
                            String end = tcl.next();
                            System.out.println("\nDigite o Curso: ");
                            String s = tcl.next();
                            System.out.println("\nDigite o ano: ");
                            int aa = tcl.nextInt();
                            Estudante e = new Estudante(s, aa, nm, sex, d, seg, end);
                            m.adicionarPessoa(e);

                            System.out.println("\nDeseja cadastrar mais pessoas?(S-sim/Qualquer outra tecla - não)");
                            r = tcl.next();
                    }while(r.equalsIgnoreCase("s"));
                    break;
                    case 0:
                    break;
                    default:
                        System.out.println("Opção inválida!!!");
                 
                    break;
                }   
                
            case 2:
                System.out.println("\n\t\tLISTAGEM ");
                m.displayAll();
                System.out.println("Total de elementos cadastrados: "+m.getCount());
                break;
                
            case 3:
                System.out.println("\n\t\t\tMenú de Pesquisas");
                System.out.println("Digite o número de segurança social da pessoa a pesquisar: ");
                String pa = tcl.next();
                //if(m.isIn(pa)==true){
                    System.out.println("Existe uma pessoa Cadastrada com este número de segurança social.");    
                //else {
                    System.out.println("Não tem ninguém com esse número de Segurança social.");
                break;
                
            default:
                System.out.println("Opção Inválida!");
    }
    }
}

