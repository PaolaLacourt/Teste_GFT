public class Vagao extends Transporte {

    public Vagao(Carga carga) {
        super(carga);
    }

    @Override
    public Double calculaFrete(Integer percentCarga, Integer percentValor) {
        return super.calculaFrete(percentCarga, percentValor);
    }
}