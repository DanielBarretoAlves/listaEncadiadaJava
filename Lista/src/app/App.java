package app;

import java.util.Scanner;

// import javax.sound.sampled.SourceDataLine;

public class App {
    public static char menu() {
        String msg;
        System.out.println("===========================");
        System.out.println("SELECIONE UM OPÇÃO");
        System.out.println("===========================");
        System.out.println("1 - Inserir no inicio");
        System.out.println("2 - Inserir no final");
        System.out.println("3 - Localizar Pessoa");
        System.out.println("4 - Excluir Pessoa");
        System.out.println("5 - Imprimir Lista");
        System.out.println("6 - Quantidade de Pessoas");
        System.out.println("7 - Sair do Programa");
        System.out.println("===========================");
        msg = new Scanner(System.in).next();
        return msg.charAt(0);
    }// -----------------------------------------------------------MENU

    public static void main(final String[] args) throws Exception {
        final Scanner scan = new Scanner(System.in);
        final lista list = new lista();
        Pessoa p;
        
        char opcao;

        do {
            opcao = menu();
            switch (opcao) {
                case '1':
                System.out.println("Inserindo no inicio...");
                p = new Pessoa();
                System.out.println("Inserir nome");
                p.setNome(scan.next());
                System.out.println("Inserir Sexo");
                p.setSexo(scan.next());
                System.out.println("Inserir Idade");
                p.setIdade(scan.nextInt());
                list.inserirPrimeiro(p);
                    break;
                case '2':
                System.out.println("Inserindo no inicio...");
                p  = new Pessoa();
                System.out.println("Inserir nome");
                p.setNome(scan.next());
                System.out.println("Inserir Sexo");
                p.setSexo(scan.next());
                System.out.println("Inserir Idade");
                p.setIdade(scan.nextInt());
                list.inserirUltimo(p);
                    break;
                case '3':
                if (list.eVazia()) {
                    System.out.println("A Lista é Vazia.");
                } else {
                    System.out.println("Localizando Pessoa .. \nDigite o Nome ");
                    final String nome = scan.next();
                    if (list.pesquisarNo(nome) == null) {
                        System.out.println("A Pessoa procurada não está na lista!");
                    }else{
                        System.out.println("::::: ENCONTRADO :::::");
                        System.out.println(list.pesquisarNo(nome));
                        System.out.println("::::::::::::::::::::::");
                    }
                }
                    break;
                case '4':
                System.out.println("Entrou");
                if (list.eVazia()) {
                    System.out.println("A Lista está Vazia");
                } else {
                    System.out.println("Excluir uma Pessoa\nDigite o nome");
                    final String nome = scan.next();
                    if (list.removerNo(nome)) {
                        System.out.println(nome + " Removido Com Sucesso!");
                    } else {
                        System.out.println("Não Foi Possivel Remover: " + nome);
                    }
                }
                    break;
                case '5':
                System.out.println("-----------------------------------------");
                System.out.println("Lista: "+list.imprmirLista());
                System.out.println("-----------------------------------------");
                    break;
                case '6':
                System.out.println("A Lista tem : "+list.getQtdNo()+ " de Pessoas!");
                    break;
                case '7':
                System.out.println("Obrigado por usar esse software");
                    break;

                default:
                System.out.println("Opção Invalida");
                    break;
            }
        } while (opcao != '7');
        System.exit(0);

        System.out.println("Teste");
    }
}