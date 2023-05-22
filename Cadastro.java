import java.util.ArrayList;
import java.util.Scanner;
public class Cadastro {
    public static void main(String[] args) {
        ArrayList<String> cliente = new ArrayList<String>();
        //ArrayList<String> casa = new ArrayList<String>();
        //ArrayList<String> apartamento = new ArrayList<String>();
        ArrayList<String> imovel = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        int verifica = 0;
        String estiloEscolhido = "";
        do {
            System.out.println();
            System.out.println("Bem vindo a Arquechefe! A melhor do Brás!");
            System.out.println("Digite:");
            System.out.println("1. Realizar orçamento");
            System.out.println("2. Para ver os estilos de arquitetura");
            System.out.println("3. Para ver valores por cada serviço");
            System.out.println("4. Seus orçamentos");
            System.out.println("5. Para Clientes");
            System.out.println("0. para sair");
            System.out.print("Digite: ");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    //CADASTRO
                    System.out.println("Cadastro");
                    System.out.println("Digite seu nome:");
                    String nome = scanner.next();
                    scanner.nextLine();

                    System.out.println("Digite seu email:");
                    String email = scanner.next();
                    scanner.nextLine();

                    System.out.println("Digite seu Telefone/Celular:");
                    String contato = scanner.next();
                    scanner.nextLine();

                    System.out.println("Digite seu endereço");
                    String endereco = scanner.next();
                    scanner.nextLine();

                    cliente.add(String.valueOf(new Cliente(nome, email, contato, endereco)));
                    //TIPO DE IMÓVEL
                    //CASA
                    System.out.print("Tipo de Imóvel (casa/Apartamento): ");
                    String tipoImovel = scanner.next();

                    if (tipoImovel.equalsIgnoreCase("casa")) {
                        System.out.println("É um Sobrado? (S/N)");
                        boolean sobrado = false;
                        String temSobrado = scanner.next();
                        if (temSobrado.equalsIgnoreCase("N")) sobrado = false;
                        else if (temSobrado.equalsIgnoreCase("S")) sobrado = true;
                        else System.out.println("Erro");

                        System.out.println("Tamanho por Metro Quadrado:");
                        double metrosQuadrados = scanner.nextDouble();

                        System.out.print("Tem Garagem (S/N) ");
                        boolean temGaragem = false;
                        String garagem = scanner.next();
                        if (garagem.equalsIgnoreCase("N")) temGaragem = false;
                        else if (garagem.equalsIgnoreCase("S")) temGaragem = true;
                        else System.out.println("Erro");

                        System.out.print("Deseja Design de Interiores (S/N): ");
                        boolean designInteriores = false;
                        String temDesignInteriores = scanner.next();
                        if (temDesignInteriores.equalsIgnoreCase("S")){
                            designInteriores = true;
                            verifica = 1;
                        }
                        else if (temDesignInteriores.equalsIgnoreCase("N")){
                            designInteriores = false;
                            verifica = 0;
                        }
                        else System.out.println("Erro");
                        //ESTILO DE ARQUITETURA
                        String[] estilosArquitetura = {"Moderno", "Clássico", "Contemporâneo", "Retrô", "Minimalista"};
                        if(verifica == 1) {
                            System.out.println("Estilos de Arquitetura Disponíveis:");
                            for (int i = 0; i < estilosArquitetura.length; i++) {
                                System.out.println((i + 1) + ". " + estilosArquitetura[i]);
                            }

                            int escolhaArquitetura;
                            do {
                                System.out.print("Escolha o número correspondente ao estilo de arquitetura: ");
                                escolhaArquitetura = scanner.nextInt();
                            } while (escolhaArquitetura < 1 || escolhaArquitetura > 5);
                            estiloEscolhido = estilosArquitetura[escolhaArquitetura - 1];
                        }else{
                            estiloEscolhido = "";
                        }


                        // MOSTRAR ITENS
                        System.out.println("\nTipo de Imóvel: " + tipoImovel);
                        System.out.println("Tamanho por Metro Quadrado: " + metrosQuadrados);
                        System.out.println("Sobrado: " + (sobrado ? "Sim" : "Não"));
                        System.out.println("Tem Garagem?" + (temGaragem ? "sim" : "Não"));
                        System.out.println("Design de Interiores: " + (designInteriores ? "Sim" : "Não"));
                        System.out.println("Estilo de Arquitetura Escolhido: " + estiloEscolhido);
                        double valorFinal = metrosQuadrados * 500.00;
                        if (sobrado) {
                            valorFinal += 20000;
                        }
                        if (temGaragem) {
                            valorFinal += 2500;
                        }
                        if (designInteriores) {
                            valorFinal += 10000;
                        }
                        if (valorFinal > 50000){
                            double valorantigo;
                            double valordesconto;
                            valorantigo = valorFinal;
                            valorFinal *= 0.8;
                            valordesconto = valorantigo - valorFinal;
                            System.out.printf("Desconto aplicado. O valor de R$%.2f passou a ser R$%.2f\nDesconto de R$%.2f\n", valorantigo, valorFinal, valordesconto);
                        }
                        System.out.println("Orçamento: " + valorFinal);
                        imovel.add(String.valueOf(new Casa(sobrado,metrosQuadrados,temGaragem,designInteriores, estiloEscolhido,valorFinal)));
                        System.out.println("Orçamento cadastrado com sucesso!");

                        //APARTAMENTO
                    } else if (tipoImovel.equalsIgnoreCase("Apartamento")) {

                        System.out.print("Tamanho por Metro Quadrado: ");
                        double metrosQuadrados = scanner.nextDouble();

                        System.out.print("Deseja Design de Interiores (S/N): ");
                        boolean designInteriores = false;
                        String temDesignInteriores = scanner.next();
                        if (temDesignInteriores.equalsIgnoreCase("S")){
                            designInteriores = true;
                            verifica = 1;
                        }
                        else if (temDesignInteriores.equalsIgnoreCase("N")){
                            designInteriores = false;
                            verifica = 0;
                        }
                        else System.out.println("Erro");
                        //ESTILO DE ARQUITETURA
                        String[] estilosArquitetura = {"Moderno", "Clássico", "Contemporâneo", "Retrô", "Minimalista"};
                        if(verifica == 1) {
                            System.out.println("Estilos de Arquitetura Disponíveis:");
                            for (int i = 0; i < estilosArquitetura.length; i++) {
                                System.out.println((i + 1) + ". " + estilosArquitetura[i]);
                            }

                            int escolhaArquitetura;
                            do {
                                System.out.print("Escolha o número correspondente ao estilo de arquitetura: ");
                                escolhaArquitetura = scanner.nextInt();
                            } while (escolhaArquitetura < 1 || escolhaArquitetura > 5);
                            estiloEscolhido = estilosArquitetura[escolhaArquitetura - 1];
                        }
                        //MOSTRAR ITENS
                        System.out.println("Design de Interiores: " + (designInteriores ? "Sim" : "Não"));
                        System.out.println("Tamanho por Metro Quadrado: " + metrosQuadrados);
                        System.out.println("Estilos de Arquitetura Escolhido: " + estiloEscolhido);
                        System.out.println("Orçamento cadastrado com sucesso!");

                        double valorFinal = metrosQuadrados * 500.00;

                        if (designInteriores) {
                            valorFinal += 10000;
                        }
                        if (valorFinal > 25000){
                            double valorantigo;
                            double valordesconto;
                            valorantigo = valorFinal;
                            valorFinal *= 0.8;
                            valordesconto = valorantigo - valorFinal;
                            System.out.printf("Desconto aplicado. O valor de R$%.2f passou a ser R$%.2f\nDesconto de R$%.2f\n", valorantigo, valorFinal, valordesconto);
                        }
                        System.out.println("Orçamento: " + valorFinal);
                        imovel.add(String.valueOf(new Apartamento(metrosQuadrados, designInteriores, estiloEscolhido,valorFinal)));

                    } else {
                        System.out.println("Tipo de imóvel inválido.");

                    }
                    break;
                case 2:
                    String[] estilosArquitetura = {"Moderno", "Clássico", "Contemporâneo", "Retrô", "Minimalista"};
                    System.out.println();
                    System.out.println("Estilos de Arquitetura Disponíveis:");
                    for (int i = 0; i < estilosArquitetura.length; i++) {
                        System.out.println((i + 1) + ". " + estilosArquitetura[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("\nPreço por metro quadrado: R$ 500");
                    System.out.println("Caso a casa for sobrado: R$ 20000");
                    System.out.println("Caso a casa tenha garagem: R$ 2500");
                    System.out.println("Design de Interiores: R$ 10000\n");
                    break;
                case 4:
                    int contador = 0;
                    if(imovel.size() > 0) {
                        for (int i = 0; i < imovel.size(); i++) {
                            System.out.print("Imovel "+(i+1)+": "+imovel.get(i));
                        }
                        contador++;
                    }
                    //if(imovel.size() > 0){
                    //    for (int i = 0; i < imovel.size(); i++) {
                    //        System.out.print("Apartamento "+(i+1)+": "+imovel.get(i));
                    //    }
                   //     contador++;
                   // }
                    if(contador < 1){
                        System.out.println("Faça um orçamento antes de usar essa opção.");
                    }
                    break;
                case 5:
                    System.out.println("Area para administradores da empresa!");
                    System.out.println("Digite a senha para continuar: ");
                    String senha = scanner.next();
                    if (senha.equalsIgnoreCase("coxinha")){
                        for (int i = 0; i < cliente.size(); i++) {
                            System.out.println(cliente.get(i));
                        }
                    }else{
                        System.out.println("Senha incorreta.");
                    }
                    break;
                default:
                    if (opcao > 0){
                        System.out.println("Opção invalida, digite novamente.\n");
                    }else {
                        System.out.println("Encerrando o programa.");
                    } break;
            }

        }while (opcao!= 0);
    }
}