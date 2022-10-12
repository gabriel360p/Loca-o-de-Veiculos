import java.util.Scanner;

public class Interface{
    public static void main(String[] args){
    
        Scanner ler = new Scanner(System.in);
        Funcionario func = new Funcionario();
        func.geraDados(); //não é uma forma muito profissional de se fazer, porém eu só consegui fazer assim 

        System.out.println("==============================");
        System.out.println("|Bem vindo!");
        System.out.println("|Locacao de Carros AutoGab's");
        System.out.println("==============================");
        
        int on=1;
        while (on==1) {       
            System.out.println("|Bem Vindo funcionario!");
            System.out.println("==============================");
            System.out.println("|(1)Cadastrar Cliente");
            System.out.println("|(2)Cadastrar Carro");
            System.out.println("|(3)Alugar Carro");
            System.out.println("|(4)Devolver Carro");
            System.out.println("==============================");
            int pathInterfaceFuncionario = ler.nextInt();
            
            switch(pathInterfaceFuncionario){
                case 1:
                    func.cadCliente();
                break;

                case 2:
                    func.cadCarro();
                break;

                case 3:
                    func.alugaCarro();
                break;

                case 4:
                    func.devolveCarro();      
                break;
            }

        }

    }
}