import java.util.Scanner;

public class inicio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Carga carga = new Carga();
        System.out.println("Informe o o peso da carga: ");
        carga.setPeso(in.nextDouble());
        System.out.println("Informe o o valor da carga: ");
        carga.setValor(in.nextDouble());
        Caminhao caminhao = new Caminhao(carga);
        Vagao vagao = new Vagao(carga);

        //o Se um vagão receber uma carga com menos de 15.000kg, $5.000
        //deverão ser adicionados ao frete.
        //o Se um caminhão receber uma carga com valor acima de $40.000, um
        //desconto de 25% deve ser concedido no frete.

        Double freteVagao = vagao.calculaFrete(20,10);
        if(carga.getPeso() < 15000D){
            freteVagao += 5000;
        }
        Double freteCaminhao = caminhao.calculaFrete(12,30);
        if(carga.getValor()>40000D){
            freteCaminhao -= (freteCaminhao * 25)/100;
        }

        System.out.println("frete Caminhao: " + freteCaminhao+" e frete Vagao: " + freteVagao);

    }
}