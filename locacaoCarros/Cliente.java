public class Cliente extends Pessoa{
    private String numeroCartao;
    private String dataExpedicao;
    private boolean tipoClinte; //true==especial e false == comum
    private double taxaDesconto;
    private int kmExtra;
    private boolean alugouCarro; //true = o inquilino alugou um carro false = o inquilino não tem um carro alugado 
    private int modeloAlugado;

    public String toString(){
        return "|Nome: "+super.nome+" |N Cartao: "+this.numeroCartao+" |Data de Expedicao: "+this.dataExpedicao+" |Cliente especial?"+this.tipoClinte+" |Taxa de desconto: "+this.taxaDesconto+" |Km extra: "+this.kmExtra+" |Carro Alugado no momento?"+this.alugouCarro;
    }

    /**
     * @return String return the numeroCartao
     */
    public String getNumeroCartao() {
        return numeroCartao;
    }

    /**
     * @param numeroCartao the numeroCartao to set
     */
    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    /**
     * @return String return the dataExpedicao
     */
    public String getDataExpedicao() {
        return dataExpedicao;
    }

    /**
     * @param dataExpedicao the dataExpedicao to set
     */
    public void setDataExpedicao(String dataExpedicao) {
        this.dataExpedicao = dataExpedicao;
    }

    /**
     * @return boolean return the tipoClinte
     */
    public boolean isTipoClinte() {
        return tipoClinte;
    }

    /**
     * @param tipoClinte the tipoClinte to set
     */
    public void setTipoClinte(boolean tipoClinte) {
        this.tipoClinte = tipoClinte;
    }


    /**
     * @return double return the taxaDesconto
     */
    public double getTaxaDesconto() {
        return taxaDesconto;
    }

    /**
     * @param taxaDesconto the taxaDesconto to set
     */
    public void setTaxaDesconto(double taxaDesconto) {
        this.taxaDesconto = taxaDesconto;
    }


    /**
     * @return int return the kmExtra
     */
    public int getKmExtra() {
        return kmExtra;
    }

    /**
     * @param kmExtra the kmExtra to set
     */
    public void setKmExtra(int kmExtra) {
        this.kmExtra = kmExtra;
    }


    /**
     * @return boolean return the alugouCarro
     */
    public boolean isAlugouCarro() {
        return alugouCarro;
    }

    /**
     * @param alugouCarro the alugouCarro to set
     */
    public void setAlugouCarro(boolean alugouCarro) {
        this.alugouCarro = alugouCarro;
    }


    /**
     * @return int return the modeloAlugado
     */
    public int getModeloAlugado() {
        return modeloAlugado;
    }

    /**
     * @param modeloAlugado the modeloAlugado to set
     */
    public void setModeloAlugado(int modeloAlugado) {
        this.modeloAlugado = modeloAlugado;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }


}