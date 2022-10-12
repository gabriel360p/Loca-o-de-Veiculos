public class Carro{
    private String placaCarro;
    private String tipo;
    private String modelo;
    private double valorAluguel;
    private boolean disponivel=true; //false = não esta disponivel e true = esta disponivel
    private String inquilino; //nome do inquilino que o alugou

    public String apresenta(){
        return "|Modelo: "+this.modelo+" |Placa: "+this.placaCarro+" |Tipo: "+this.tipo+" |Valor do Aluguel: "+this.valorAluguel+" |Esta disponivel?"+this.disponivel+" |Inquilino: "+this.inquilino;
    }


    /**
     * @return String return the placaCarro
     */
    public String getPlacaCarro() {
        return placaCarro;
    }

    /**
     * @param placaCarro the placaCarro to set
     */
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    /**
     * @return String return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return double return the valorAluguel
     */
    public double getValorAluguel() {
        return valorAluguel;
    }

    /**
     * @param valorAluguel the valorAluguel to set
     */
    public void setValorAluguel(double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    /**
     * @return boolean return the disponivel
     */
    public boolean isDisponivel() {
        return disponivel;
    }

    /**
     * @param disponivel the disponivel to set
     */
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    /**
     * @return String return the inquilino
     */
    public String getInquilino() {
        return inquilino;
    }

    /**
     * @param inquilino the inquilino to set
     */
    public void setInquilino(String inquilino) {
        this.inquilino = inquilino;
    }

}