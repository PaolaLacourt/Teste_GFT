import java.util.ArrayList;
import java.util.List;

public class SimulacaoCustoFrete {


    //Peso Valor
    //18550 27500
    //8100 35410
    //25700 3650
    //9541 5799
    //25740 45000
    //5000 90570
    //8900 41000

    public static void main(String[] args) {
        List<Carga> cargas =  new ArrayList<>();
        cargas.add(new Carga(27500D,18550D));
        cargas.add(new Carga(35410D,8100D));
        cargas.add(new Carga(3650D,25700D));
        cargas.add(new Carga(5799D,9541D));
        cargas.add(new Carga(45000D,25740D));
        cargas.add(new Carga(90570D,5000D));
        cargas.add(new Carga(41000D,8900D));


        Double custoTotalVagao = 0D;
        Double custoTotalCaminhao = 0D;
        for (Carga c : cargas){
            Caminhao caminhao = new Caminhao(c);
            Vagao vagao = new Vagao(c);

            custoTotalVagao += vagao.calculaFrete(20,10);
            if(c.getPeso() < 15000D){
                custoTotalVagao += 5000;
            }
            Double freteCaminhao = caminhao.calculaFrete(12,30);
            if(c.getValor()>40000D){
                freteCaminhao -= (freteCaminhao * 25)/100;
            }
            custoTotalCaminhao += freteCaminhao;


        }
        if(custoTotalCaminhao <= custoTotalVagao){
            //Quantos caminhões serão necessários
            System.out.println("Serão necessarios "+ cargas.size()+ " caminhoes");
            System.out.println("Custo total:  "+ custoTotalCaminhao);
        }else{
            //o Quantos vagões serão necessários
            System.out.println("Serão necessarios "+ cargas.size()+ " vagoes");
            System.out.println("Custo total:  "+ custoTotalVagao);
        }
    }

}