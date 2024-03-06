package automotivo;

import javax.swing.JOptionPane;

public class Automotivo {

    private String modelo;
    private String marca;
    private Integer ano;
    private String cor;
    
    public Automotivo(){
        this("", "", 0, "");
    }
    public Automotivo(String modelo, String marca, Integer ano, String cor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
    }
    
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
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the ano
     */
    public Integer getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void provarExistencia(){
    JOptionPane.showMessageDialog(null, "Modelo: " + this.getModelo() +"\nMarca: " + this.getMarca() +"\nAno: " +this.getAno() + "\nCor: " +this.getCor());
    }
    
    public void entraDados(){
        String modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(modelo);
        marca = JOptionPane.showInputDialog("Marca: ");
        setMarca(marca);
        ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));
        setAno(ano);
        String cor = JOptionPane.showInputDialog("Cor: ");
        setCor(cor);
    }
    
    public static void main(String[] args) {
        Automotivo auto1;
        auto1 = new Automotivo();
        auto1.entraDados();
        auto1.provarExistencia();
    }
    
}
