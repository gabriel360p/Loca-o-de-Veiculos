import java.util.Scanner;
import java.util.ArrayList; //a ideia original era usar arraylist para armazenamento, porém tive aluns problemas na estrutura lógica de selecionar clientes e carros
public class Funcionario extends Cliente{
    private String matricula;
    
    Scanner ler = new Scanner(System.in);
    // ArrayList carrosAlugados = new ArrayList();
    
        //--------------------------------------------------------------------------------------------

    //preenchidos pelo usuario:
    Cliente cliente = new Cliente();
    Carro carro1 = new Carro();
    
    //preenchidos para testes:
    Cliente cliente2 = new Cliente();
    Cliente cliente3 = new Cliente();
    Carro carro2 = new Carro();
    Carro carro3 = new Carro();
    Carro carro4 = new Carro();

    //--------------------------------------------------------------------------------------------


    public void geraDados(){

        //pré-definidos:
        cliente2.setNome("Keven");
        cliente2.setNumeroCartao("98765");
        cliente2.setTipoClinte(true);
        cliente2.setTaxaDesconto(120);
        cliente2.setKmExtra(12);
        cliente2.setAlugouCarro(false);
        cliente2.setDataExpedicao("05/08/2021"); //isso é declarado na hora que o carro é alugado

        cliente3.setNome("Mario");
        cliente3.setNumeroCartao("09876");
        cliente3.setTipoClinte(false);
        cliente3.setTaxaDesconto(0);
        cliente3.setKmExtra(0);
        cliente3.setAlugouCarro(false);
        cliente3.setDataExpedicao("20/10/2020"); //isso é declarado na hora que o carro é alugado

        //--------------------------------------------------------------------------------------------

        //pré-definidos:

        carro2.setModelo("Gol Eco");
        carro2.setTipo("Luxuoso");
        carro2.setValorAluguel(170);
        carro2.setPlacaCarro("ABC-123");

        carro3.setModelo("Van Escolar");
        carro3.setTipo("Utilitario");
        carro3.setValorAluguel(90);
        carro3.setPlacaCarro("JBC-456");

        carro4.setModelo("Fiat Mobi");
        carro4.setTipo("Popular");
        carro4.setValorAluguel(120);
        carro4.setPlacaCarro("KHA-098");

        //--------------------------------------------------------------------------------------------
    }


    public void alugaCarro(){
        System.out.println("|Escolher Cliente:");
        if (cliente.getNome()==null){
            System.out.println("|Cliente (1) indisponivel");
        } else{
            System.out.println("|(1)"+cliente.getNome());
        }
        System.out.println("|(2)"+cliente2.getNome());
        System.out.println("|(3)"+cliente3.getNome());
        int pathClinte=ler.nextInt();
        System.out.println("==============================");
        
        switch(pathClinte){
        case 1:
                if(cliente.isAlugouCarro()==true){
                    System.out.println("|Voce nao pode alugar mais de um carro por vez");
                }else{
                    System.out.println("|Ola "+cliente.getNome()+" escolha o Carro");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                   
                    int pathCarro=ler.nextInt();    
                        switch(pathCarro){
                            case 1:
                                if(carro1.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente.isTipoClinte()==true){
                                        double desconto = cliente.getTaxaDesconto();    
                                        int kmextra = cliente.getKmExtra();    
                                        double aluguel = carro1.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro1.setDisponivel(false);
                                        carro1.setInquilino(cliente.getNome());
                                        cliente.setAlugouCarro(true);
                                        cliente.setModeloAlugado(1);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro1.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro1.setDisponivel(false);
                                        cliente.setAlugouCarro(true);
                                        carro1.setInquilino(cliente.getNome()); 
                                        cliente.setModeloAlugado(1);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break; 

                 
                        case 2: 
                      
                            if(carro2.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente.isTipoClinte()==true){
                                        double desconto = cliente.getTaxaDesconto();    
                                        int kmextra = cliente.getKmExtra();    
                                        double aluguel = carro2.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro2.setDisponivel(false);
                                        cliente.setAlugouCarro(true);
                                        carro2.setInquilino(cliente.getNome());
                                        cliente.setModeloAlugado(2);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro2.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro2.setDisponivel(false);
                                        carro2.setInquilino(cliente.getNome()); 
                                        cliente.setModeloAlugado(2);
                                        cliente.setAlugouCarro(true);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break;



                        case 3:
                            if(carro3.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente.isTipoClinte()==true){
                                        double desconto = cliente.getTaxaDesconto();    
                                        int kmextra = cliente.getKmExtra();    
                                        double aluguel = carro3.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro3.setDisponivel(false);
                                        cliente.setModeloAlugado(3);
                                        cliente.setAlugouCarro(true);
                                        carro3.setInquilino(cliente.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro3.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro3.setDisponivel(false);
                                        cliente.setAlugouCarro(true);
                                        carro3.setInquilino(cliente.getNome()); 
                                        cliente.setModeloAlugado(3);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        
                        break;

                        case 4:
                            if(carro4.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente.isTipoClinte()==true){
                                        double desconto = cliente.getTaxaDesconto();    
                                        int kmextra = cliente.getKmExtra();    
                                        double aluguel = carro4.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro4.setDisponivel(false);
                                        cliente.setAlugouCarro(true);
                                        cliente.setModeloAlugado(4);
                                        carro4.setInquilino(cliente.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro4.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente.getDataExpedicao());
                                        carro4.setDisponivel(false);
                                        carro4.setInquilino(cliente.getNome()); 
                                        cliente.setModeloAlugado(4);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        break;
                }

                        }  

        break; 

  
        

        case 2: 
        
              if(cliente.isAlugouCarro()==true){
                    System.out.println("|Voce nao pode alugar mais de um carro por vez");
                }else{
                    System.out.println("|Ola "+cliente2.getNome()+" escolha o Carro");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                   
                    int pathCarro=ler.nextInt();    
                        switch(pathCarro){
                            case 1:
                                if(carro1.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente2.isTipoClinte()==true){
                                        double desconto = cliente2.getTaxaDesconto();    
                                        int kmextra = cliente2.getKmExtra();    
                                        double aluguel = carro1.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente2.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        cliente2.setAlugouCarro(true);
                                        cliente2.setModeloAlugado(1);
                                        carro1.setDisponivel(false);
                                        carro1.setInquilino(cliente2.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro1.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        cliente2.setModeloAlugado(1);
                                        cliente2.setAlugouCarro(true);
                                        carro1.setDisponivel(false);
                                        carro1.setInquilino(cliente2.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break; 

                 
                        case 2: 

  
                            if(carro2.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente2.isTipoClinte()==true){
                                        double desconto = cliente2.getTaxaDesconto();    
                                        int kmextra = cliente2.getKmExtra();    
                                        double aluguel = carro2.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente2.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        cliente2.setAlugouCarro(true);
                                        cliente2.setModeloAlugado(2);
                                        carro2.setDisponivel(false);
                                        carro2.setInquilino(cliente2.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro2.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        cliente2.setAlugouCarro(true);
                                        cliente2.setModeloAlugado(2);
                                        carro2.setDisponivel(false);
                                        carro2.setInquilino(cliente2.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break;


                        case 3:
                            if(carro3.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente2.isTipoClinte()==true){
                                        double desconto = cliente2.getTaxaDesconto();    
                                        int kmextra = cliente2.getKmExtra();    
                                        double aluguel = carro3.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente2.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        carro3.setDisponivel(false);
                                        cliente2.setAlugouCarro(true);
                                        cliente2.setModeloAlugado(3);
                                        carro3.setInquilino(cliente2.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro3.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        carro3.setDisponivel(false);
                                        cliente2.setModeloAlugado(3);
                                        cliente2.setAlugouCarro(true);
                                        carro3.setInquilino(cliente2.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        
                        break;

                        case 4:
                            if(carro4.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente2.isTipoClinte()==true){
                                        double desconto = cliente2.getTaxaDesconto();    
                                        int kmextra = cliente2.getKmExtra();    
                                        double aluguel = carro4.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente2.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        carro4.setDisponivel(false);
                                        cliente2.setModeloAlugado(4);
                                        cliente2.setAlugouCarro(true);
                                        carro4.setInquilino(cliente2.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro4.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente2.getDataExpedicao());
                                        carro4.setDisponivel(false);
                                        cliente2.setModeloAlugado(4);
                                        cliente2.setAlugouCarro(true);
                                        carro4.setInquilino(cliente2.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        break;
                }

                        }  
        break;

          case 3: //cliente 3
              if(cliente3.isAlugouCarro()==true){
                    System.out.println("|Voce nao pode alugar mais de um carro por vez");
                }else{
                    System.out.println("|Ola "+cliente3.getNome()+" escolha o Carro");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                   
                    int pathCarro=ler.nextInt();    
                        switch(pathCarro){
                            case 1:
                                if(carro1.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente3.isTipoClinte()==true){
                                        double desconto = cliente3.getTaxaDesconto();    
                                        int kmextra = cliente3.getKmExtra();    
                                        double aluguel = carro1.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente3.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        carro1.setDisponivel(false);
                                        cliente3.setAlugouCarro(true);
                                        carro1.setInquilino(cliente3.getNome());
                                        cliente3.setModeloAlugado(1);
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro1.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        cliente3.setModeloAlugado(1);
                                        carro1.setDisponivel(false);
                                        cliente3.setAlugouCarro(true);
                                        carro1.setInquilino(cliente3.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break; 

                 
                        case 2: 
                            if(carro2.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente3.isTipoClinte()==true){
                                        double desconto = cliente3.getTaxaDesconto();    
                                        int kmextra = cliente3.getKmExtra();    
                                        double aluguel = carro2.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente3.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        carro2.setDisponivel(false);
                                        cliente3.setAlugouCarro(true);
                                        cliente3.setModeloAlugado(2);
                                        carro2.setInquilino(cliente3.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro2.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        carro2.setDisponivel(false);
                                        cliente3.setModeloAlugado(2);
                                        cliente3.setAlugouCarro(true);
                                        carro2.setInquilino(cliente3.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }        
                        break;


                        case 3:
                            if(carro3.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente3.isTipoClinte()==true){
                                        double desconto = cliente3.getTaxaDesconto();    
                                        int kmextra = cliente3.getKmExtra();    
                                        double aluguel = carro3.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente3.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        cliente3.setModeloAlugado(3);
                                        carro3.setDisponivel(false);
                                        cliente3.setAlugouCarro(true);
                                        carro3.setInquilino(cliente3.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro3.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        carro3.setDisponivel(false);
                                        cliente3.setModeloAlugado(3);
                                        cliente3.setAlugouCarro(true);
                                        carro3.setInquilino(cliente3.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        
                        break;

                        case 4:
                            if(carro4.isDisponivel() == false){
                                    System.out.println("|Carro Indisponivel");
                                } else{
                                    //verificando se o cliente é especial
                                    if (cliente2.isTipoClinte()==true){
                                        double desconto = cliente2.getTaxaDesconto();    
                                        int kmextra = cliente2.getKmExtra();    
                                        double aluguel = carro4.getValorAluguel();
                                        
                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();

                                        System.out.println("|Verificamos que voce possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, sera aplicado alguns descontos e vantagens");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        
                                        double calDesconto=(horas*aluguel)-desconto;

                                        System.out.println("|Com o desconto de "+desconto+" fica em torno de: "+calDesconto);
                                        System.out.println("|E sua km extra e de: "+cliente3.getKmExtra());
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        cliente3.setAlugouCarro(true);
                                        carro4.setDisponivel(false);
                                        cliente3.setModeloAlugado(4);
                                        carro4.setInquilino(cliente3.getNome());
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    } else {

                                        System.out.println("|Quantidade de horas: ");
                                        int horas = ler.nextInt();
                                        double aluguel = carro4.getValorAluguel();

                                        System.out.println("|Verificamos que voce nao possui um pacote premium (especial)");
                                        System.out.println("|E por conta disso, o valor normal de locacao sera aplicado");
                                        System.out.println("|"+horas+"  horas resultaria em "+horas*aluguel);
                                        System.out.println("|Sua data de expedicao e: "+cliente3.getDataExpedicao());
                                        carro4.setDisponivel(false);
                                        cliente3.setAlugouCarro(true);
                                        cliente3.setModeloAlugado(4);
                                        carro4.setInquilino(cliente3.getNome()); 
                                        System.out.println("|Carro Alugado, aproveite a viagem!");

                                    }
                               }  
                        break;
                }

                        }  
        break;

    }//switch cliente

    System.out.println("==============================");
}

    public void devolveCarro(){
        // aqui o valor boolean de disponibilidade do carro esta false pois ele esta alugado, então para devolver esse valor muda de false para true
        //que significa que ele ficou disponivel para alugar

    System.out.println("|Status dos carros: ");
    System.out.println(""+carro1.apresenta());
    System.out.println(""+carro2.apresenta());
    System.out.println(""+carro3.apresenta());
    System.out.println(""+carro4.apresenta());
    
    System.out.println("==============================");
    
    System.out.println("|Escolha o Cliente: ");
    if (cliente.getNome()==null){
        System.out.println("|Cliente (1) indisponivel");
    } else{
        System.out.println("|(1)"+cliente.toString());
    }
    System.out.println("|(2)"+cliente2.toString());
    System.out.println("|(3)"+cliente3.toString());
    int pathClinte2=ler.nextInt();
    
    switch(pathClinte2){
        case 1:
            if(cliente.isAlugouCarro()==false){
                System.out.println("|Em nossos registros, esta salvo que este cliente ja devolveu o carro");
            } else{
                    System.out.println("|Ola "+cliente.getNome()+" voce vai devolver o:");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                    int pathCarro2=ler.nextInt();
                    
                    if(pathCarro2!=cliente.getModeloAlugado()){
                        System.out.println("|O Cliente nao alugou este modelo");
                    }else{
                    
                        switch(pathCarro2){
                        case 1:
                            System.out.println("|Efetuando devolucao...");
                            cliente.setAlugouCarro(false); 
                            carro1.setDisponivel(true);
                        break;
                        
                        case 2:
                            System.out.println("|Efetuando devolucao...");
                            cliente.setAlugouCarro(false); 
                            carro2.setDisponivel(true);
                        break;

                        case 3:
                            System.out.println("|Efetuando devolucao...");
                            cliente.setAlugouCarro(false); 
                            carro3.setDisponivel(true);
                        break;

                        case 4:
                            System.out.println("|Efetuando devolucao...");
                            cliente.setAlugouCarro(false); 
                            carro4.setDisponivel(true);
                        break;
                        }
                    }

            }
    break;

    case 2:
            if(cliente2.isAlugouCarro()==false){
                System.out.println("|Em nossos registros, esta salvo que este cliente ja devolveu o carro");
            } else{
                    System.out.println("|Ola "+cliente2.getNome()+" voce vai devolver o:");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                    int pathCarro2=ler.nextInt();
                    
                    if(pathCarro2!=cliente2.getModeloAlugado()){
                        System.out.println("|O Cliente nao alugou este modelo");
                    }else{
                        switch(pathCarro2){
                        case 1:
                            System.out.println("|Efetuando devolucao...");
                            cliente2.setAlugouCarro(false); 
                            carro1.setDisponivel(true);
                        break;
                        
                        case 2:
                            System.out.println("|Efetuando devolucao...");
                            cliente2.setAlugouCarro(false); 
                            carro2.setDisponivel(true);
                        break;

                        case 3:
                            System.out.println("|Efetuando devolucao...");
                            cliente2.setAlugouCarro(false); 
                            carro3.setDisponivel(true);
                        break;

                        case 4:
                            System.out.println("|Efetuando devolucao...");
                            cliente2.setAlugouCarro(false); 
                            carro4.setDisponivel(true);
                        break;
                        }
                    }   
            }
    break;

    case 3:
            if(cliente3.isAlugouCarro()==false){
                System.out.println("|Em nossos registros, esta salvo que este cliente ja devolveu o carro");
            } else{
                    System.out.println("|Ola "+cliente3.getNome()+" voce vai devolver o:");
                    
                    if (carro1.getModelo()==null){
                            System.out.println("|Carro (1) fora de servico");
                        } else{
                            System.out.println("|(1)"+carro1.apresenta()+"");
                        }
                                        
                    
                    System.out.println("|(2)"+carro2.apresenta());
                    System.out.println("|(3)"+carro3.apresenta());
                    System.out.println("|(4)"+carro4.apresenta());
                    System.out.println("==============================");
                    int pathCarro2=ler.nextInt();

                    if(pathCarro2!=cliente3.getModeloAlugado()){
                        System.out.println("|O Cliente nao alugou este modelo");
                    }else{
                        switch(pathCarro2){
                        case 1:
                            System.out.println("|Efetuando devolucao...");
                            cliente3.setAlugouCarro(false); 
                            carro1.setDisponivel(true);
                        break;
                        
                        case 2:
                            System.out.println("|Efetuando devolucao...");
                            cliente3.setAlugouCarro(false); 
                            carro2.setDisponivel(true);
                        break;

                        case 3:
                            System.out.println("|Efetuando devolucao...");
                            cliente3.setAlugouCarro(false); 
                            carro3.setDisponivel(true);
                        break;

                        case 4:
                            System.out.println("|Efetuando devolucao...");
                            cliente3.setAlugouCarro(false); 
                            carro4.setDisponivel(true);
                        break;
                        }
                    }   

            }
    break;
    }

    System.out.println("==============================");

    }

    public void cadCliente(){
        System.out.println("==============================");
        System.out.println("Insira as informacoes:");
        
        System.out.println("|Nome:");
        String bug = ler.nextLine(); //nesta linha as vezes ocorre um bug onde o java pula e ignora essa linha de código, por isso tem dois scanners, porém como eu disse, eu acho que é um bug, porque as vezes pula e as vezes não pula
        String nome = ler.nextLine();
        nome=nome+bug; //concatenei as duas strings porque eu não sei quando ele vai pular a linha ou não, foi a solução que eu pensei pelo menos
        cliente.setNome(nome);
        
        System.out.println("|Numero do Cartao:");
        String numeroCartao = ler.nextLine();
        cliente.setNumeroCartao(numeroCartao);
        
        System.out.println("|Data de expedicao:");
        String dataExpedicao = ler.nextLine();
        cliente.setDataExpedicao(dataExpedicao);
        
        System.out.println("|Tipo de cliente: (1)Especial (2)Comum");
        int clienteTipo = ler.nextInt();
        if (clienteTipo==1){
            boolean tipoClinte = true;
            cliente.setTipoClinte(tipoClinte);

            System.out.println("|Km Extra:");
            int kmExtra = ler.nextInt();
            cliente.setKmExtra(kmExtra);
        
            System.out.println("|Taxa de desconto:");
            double taxaDesconto = ler.nextDouble();
            cliente.setTaxaDesconto(taxaDesconto);

        } else{
            boolean tipoClinte = false;
            cliente.setTipoClinte(tipoClinte);
        }


        System.out.println("==============================");
        System.out.println("|Cliente Cadastrado");
        System.out.println("==============================");
    }


    public void cadCarro(){
        System.out.println("==============================");
        System.out.println("Insira as informações:");

        System.out.println("|Modelo de carro:");
        String bug2 = ler.nextLine();
        String modelo = ler.nextLine();
        carro1.setModelo(modelo);

        System.out.println("|Tipo de carro : Luxuoso, Popular ou Utilitario:");
        String tipo = ler.nextLine();
        carro1.setTipo(tipo);

        System.out.println("|Placa:");
        String placa = ler.nextLine();
        carro1.setPlacaCarro(placa);

        System.out.println("|Valor Aluguel:");
        double valorAluguel = ler.nextDouble();
        carro1.setValorAluguel(valorAluguel);
             
        System.out.println("|Esta Disponivel?: (1)Sim (2)Nao");
        int disponibilidade = ler.nextInt();
        if (disponibilidade==1){
            boolean disponivel = true;
            carro1.setDisponivel(disponivel);
        } else{
            boolean disponivel = true;
            carro1.setDisponivel(disponivel);
        }

        System.out.println("==============================");
        System.out.println("|Carro Cadastrado");
        System.out.println("==============================");
    }


    /**
     * @return String return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}