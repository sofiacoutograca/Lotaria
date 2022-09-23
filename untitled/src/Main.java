import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Random rnd = new Random();
    static String nome;
    static int saldo = 100;

    public static void main(String[] args) {

        System.out.println("Olá! Por favor insira o seu nome.");
        nome = in.nextLine();
        System.out.println("Bem vindo " + nome + "!");
        System.out.println("Começa com um saldo de 100€, que poderão ser levantados a qualquer momento.");
        MenuPrincipal();

    }//fecha Main public

    private static void MenuPrincipal() {
        if (saldo >= 2) {
            System.out.println("Por favor escolha uma das opções:");
            System.out.println("1 - Raspadinha - dois tipos de jogo");
            System.out.println("2 - Lotaria - 5 euros serão retirados do seu saldo");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Lotaria 2 random 2 digitos");
            System.out.println("0 - Sair");

            int op = in.nextInt();

            switch (op) {
                case 0: {
                    System.out.println("Jogo acabado a seu pedido.");
                    System.out.println("Poderá levantar: " + saldo + " euros.");
                    break;
                }
                case 1: {
                    Raspadinha();
                    break;
                }
                case 2: {
                    Lotaria();
                    break;
                }
                case 3: {
                    Saldo();
                    break;
                }
                case 4: {
                    Lot2Random();

                }


                default: {
                    System.out.println("Opção inválida, por favor tente novamente");
                }
            }
        }// fecha switch
        else {
            System.out.println("Saldo insuficiente para continuar a jogar");
            System.out.println("1 - Verificar Saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Levantar");
            System.out.println("0 - Sair");
            int ss = in.nextInt();
            switch (ss) {
                case 0: {
                    System.out.println("Jogo acabado a seu pedido.");
                    System.out.println("Poderá levantar: " + saldo + " euros.");
                    break;
                }
                case 1: {
                    System.out.println("Olá " + nome + ", o seu saldo é igual a " + saldo + " euros.");
                }
                case 2: {
                    System.out.println("Olá " + nome + ", por favor indique quando quer depositar.");
                    int dep = in.nextInt();
                    saldo = saldo + dep;
                    System.out.println("o seu saldo é agora " + saldo + " euros.");
                    MenuPrincipal();
                }
                case 3: {
                    System.out.println("Olá " + nome + ", o seu saldo de " + saldo + " euros foi levantado e adicionado à sua conta bancária");
                    System.out.println("Até à próxima!");
                }
                default: {
                    System.out.println("Opção inválida, por favor tente novamente");
                }
            }
        }//fecha else sem saldo
    }// fecha menu principal

    private static void Saldo() {
        System.out.println("Olá " + nome + ", o seu saldo é igual a " + saldo + " euros.");
        System.out.println("1 - Levantar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Voltar ao Menu Principal");
        int os = in.nextInt();
        switch (os) {
            case 1: {
                System.out.println("Olá " + nome + ", o seu saldo de " + saldo + " euros foi levantado e adicionado à sua conta bancária");
                System.out.println("Até à próxima!");
                break;
            }
            case 2: {
                System.out.println("Olá " + nome + ", por favor indique quando quer depositar.");
                int dep = in.nextInt();
                saldo = saldo + dep;
                System.out.println("o seu saldo é agora " + saldo + " euros.");
                MenuPrincipal();
            }
            case 3:
                MenuPrincipal();
            default: {
                System.out.println("Opção inválida, por favor tente novamente");
            }
        }
        MenuPrincipal();
    }

    private static void Raspadinha() {

        System.out.println("*----*RASPADINHA*----*");
        System.out.println("1 - Raspadinha 5 números - serão retirados 2€ ao seu saldo");
        System.out.println("2 - Raspadinha 9 números - serão retirados 2€ ao seu saldo");
        System.out.println("0 - Voltar ao Menu Principal");
        int rasp = in.nextInt();

        if (rasp == 1) {
            saldo = saldo - 2;
            System.out.println("*----*Raspadinha 5 números*----*");
            System.out.println("Por favor selecione um dos seguintes números principais:");
            System.out.println("*1* *2* *3* *4* *5* *6* *7* *8* *9*");
            int np = in.nextInt(); // np - número principal
            int s1 = rnd.nextInt(1, 10);
            int s2 = rnd.nextInt(1, 10);
            int s3 = rnd.nextInt(1, 10);
            int s4 = rnd.nextInt(1, 10);
            int s5 = rnd.nextInt(1, 10); // in.nextInt();
            int p1 = 0, p2 = 0, p3 = 0, p4 = 0, p5 = 0;
            System.out.println("Número principal: *" + np + "*");
            System.out.println("Raspadinha nº: *" + s1 + "*" + s2 + "*" + s3 + "*" + s4 + "*" + s5 + "*");
           /*
        switch (np) {
            case (s1):
                if (np == s1) premio = pr + 100;
            case 2:
                if (np == s2) {
                    premio = premio + 1;
                }
            case 3:
                if (np == s3) {
                    premio = premio + 1;
                }
            case 4:
                if (np == s4) {
                    premio = premio + 10;
                }
            case 5:
                if (np == s5) {
                    premio = premio + 10;
                }
            default:
                ;
                System.out.println("Sem prémio.");

        }//fecha switch np
        System.out.println("Prémio: " + premio + " €");*///Fiz o switch case e deu errado e fiquei triste de apagar tanto código
            if (np == s1 || np == s2 || np == s3 || np == s4 || np == s5) {
                if (np == s1) {
                    p1 = 100;
                }
                if (np == s2) {
                    p2 = 1;
                }
                if (np == s3) {
                    p3 = 1;
                }
                if (np == s4) {
                    p4 = 10;
                }
                if (np == s5) {
                    p5 = 10;
                }
                int prrasp1 = p1 + p2 + p3 + p4 + p5;
                System.out.println("Prémio: " + prrasp1 + " euro(s).");
                saldo = saldo + prrasp1;
            } else {
                System.out.println("Sem prémio nesta raspadinha");
            }
            Raspadinha();
        }//fecha rasp1
        else if (rasp == 2) {
            saldo = saldo - 2;
            System.out.println("Raspadinha 9 números");
            int nr = rnd.nextInt(1, 10);
            System.out.println("Número principal: " + nr);
            int r1 = rnd.nextInt(1, 10);
            int r2 = rnd.nextInt(1, 10);
            int r3 = rnd.nextInt(1, 10);
            int r4 = rnd.nextInt(1, 10);
            int r5 = rnd.nextInt(1, 10);
            int r6 = rnd.nextInt(1, 10);
            int r7 = rnd.nextInt(1, 10);
            int r8 = rnd.nextInt(1, 10);
            int r9 = rnd.nextInt(1, 10);//in.nextInt();//
            int pr21 = rnd.nextInt(1, 11);
            int pr22 = rnd.nextInt(1, 11);
            int pr23 = rnd.nextInt(1, 11);
            int pr24 = rnd.nextInt(1, 11);
            int pr25 = rnd.nextInt(1, 11);
            int pr26 = rnd.nextInt(1, 11);
            int pr27 = rnd.nextInt(1, 11);
            int pr28 = rnd.nextInt(1, 11);
            int pr29 = rnd.nextInt(1, 11);
            int d1 = 0, d2 = 0, d3 = 0, d4 = 0, d5 = 0, d6 = 0, d7 = 0, d8 = 0, d9 = 0, iguais;
            System.out.println("Raspadinha nº: *" + r1 + "(" + pr21 + " EUR)" + "*" + r2 + "(" + pr22 + " EUR)" + "*" + r3 + "(" + pr23 + " EUR)" + "*" + r4 + "(" + pr24 + " EUR)" + "*" + r5 + "(" + pr25 + " EUR)" + "*" + r6 + "(" + pr26 + " EUR)" + "*" + r7 + "(" + pr27 + " EUR)" + "*" + r8 + "(" + pr28 + " EUR)" + "*" + r9 + "(" + pr29 + " EUR)" + "*");
            int prrasp2 = 0;

            if (nr == r1 || nr == r2 || nr == r3 || nr == r4 || nr == r5 || nr == r6 || nr == r7 || nr == r8 || nr == r9) {
                if (nr == r1) {
                    d1 = 1;
                    prrasp2 = prrasp2 + pr21;
                }
                if (nr == r2) {
                    d2 = 1;
                    prrasp2 = prrasp2 + pr22;
                }
                if (nr == r3) {
                    d3 = 1;
                    prrasp2 = prrasp2 + pr23;
                }
                if (nr == r4) {
                    d4 = 1;
                    prrasp2 = prrasp2 + pr24;
                }
                if (nr == r5) {
                    d5 = 1;
                    prrasp2 = prrasp2 + pr25;
                }
                if (nr == r6) {
                    d6 = 1;
                    prrasp2 = prrasp2 + pr26;
                }
                if (nr == r7) {
                    d7 = 1;
                    prrasp2 = prrasp2 + pr27;
                }
                if (nr == r8) {
                    d8 = 1;
                    prrasp2 = prrasp2 + pr28;
                }
                if (nr == r9) {
                    d9 = 1;
                    prrasp2 = prrasp2 + pr29;
                }
            } else {
                System.out.println("Nenhum dos números igual ao principal.");
            }
            ;
            iguais = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9;


            if (iguais >= 3) {
                System.out.println("Parabéns, ganhou a raspadinha!");
                System.out.println("O seu prémio são " + prrasp2 + " €");
                saldo = saldo + prrasp2;
            } else {
                System.out.println("Melhor sorte para a próxima!");
            }
            Raspadinha();
        } //fecha raasp 2
        else if (rasp == 0) {
            MenuPrincipal();
        } else {
            System.out.println("Opção inválida, por favor tente novamente, seleccionando uma opção válida");
            Raspadinha();
        }

    }// fecha a raspadinha

    private static void Lotaria() {
        saldo = saldo - 5;
        System.out.println("*----*LOTARIA*----*");
        System.out.println("Por favor indique um número inteiro de 4 algarismos");
        int l1 = in.nextInt();
        int l2 = rnd.nextInt(1, 10000); // in.nextInt();

        System.out.println("Número inserido " + l1 + " e número sorteado " + l2);

        if (l1 == l2) {
            System.out.println("Parabéns! Ganhou o PRIMEIRO PRÉMIO!");
            System.out.println("Valor do prémio: 1000 euros - acrentados ao seu saldo");
            saldo = saldo + 1000;
        } else if ((l1 % 1000) == (l2 % 1000)) {
            System.out.println("Parabéns! Ganhou o SEGUNDO PRÉMIO!");
            System.out.println("Valor do prémio: 100 euros - acrentados ao seu saldo");
            saldo = saldo + 100;
        } else if (((l1 % 100) == (l2 % 100))) {
            System.out.println("Parabéns! Ganhou o TERCEIRO PRÉMIO!");
            System.out.println("Valor do prémio: 10 euros- acrentados ao seu saldo");
            saldo = saldo + 1000;
        } else {
            System.out.println("Nenhum prémio desta vez. Melhor Sorte na para a próxima!");
        }
        System.out.println("Pretente tentar novamente?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não, Desejo voltar ao menu principal.");
        System.out.println("0 - Não, Desejo acabar o jogo.");
        int tn = in.nextInt();
        if (tn == 0) {
            System.out.println("Jogo terminado a seu pedido.");
            System.out.println("Até à próxima!");
            System.out.println("Valor a levantar: " + saldo + " euros.");
            Saldo();
        } else if (tn == 1) {
            Lotaria();
        } else if (tn == 2) {
            MenuPrincipal();
        } else {
            System.out.println("Opção inválida");
            System.out.println("Iremos reencaminhá-lo para o Menu Principal");
            MenuPrincipal();
        }
    }// fecha lotaria

    private static void Lot2Random() {
        saldo = saldo - 5;
        System.out.println("*----*LOTARIA 2 numeros aleatorios: 1 a 99*----*");
        System.out.println("prima qualquer tecla para voltar ao menu principal e 1 para prosseguir");
        int sim = in.nextInt();

        if (sim == 1) {


            int l1 = rnd.nextInt(1, 100);
            int l2 = rnd.nextInt(1, 100);
            int tentativa = 0;

            do {
                l1 = rnd.nextInt(1, 100);
                l2 = rnd.nextInt(1, 100);

                System.out.println("Gerados os números " + l1 + " e " + l2);
                tentativa = tentativa + 1;
            } while (l1 != l2);

            System.out.println("Números igualados na tentativa número: " + tentativa);
            Lot2Random();
        } else {
            MenuPrincipal();
        }


    }// fecha lotaria2rand.

}//fecha main