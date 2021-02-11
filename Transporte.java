public abstract class Transporte {

    private Carga carga;

    public Transporte(Carga carga) {
        this.carga = carga;
    }

    public Double calculaFrete(Integer percentCarga, Integer percentValor){
        return ((percentCarga * carga.getPeso())/100) + ((percentValor * carga.getValor())/100);
    }
}