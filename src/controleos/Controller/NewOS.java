/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos.Controller;

/**
 *
 * @author mest2
 */
public class NewOS {
    //dados da OS
    private int idOs; // id cliente
    private String model; // modelo do aparelho
    private String serialNumber; //Numero de serie do aparelho
    private String obsCar; // campo de observações e caracteristicas sobre o aparelho
    //dados cliente;
    private int idCli; // id do cliente
    private String nomeCli; // nome do cliente
    private int cpf; // cpf cliente

    public int getIdOs() {
        return idOs;
    }

    public void setIdOs(int idOs) {
        this.idOs = idOs;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getObsCar() {
        return obsCar;
    }

    public void setObsCar(String obsCar) {
        this.obsCar = obsCar;
    }

    public int getIdCli() {
        return idCli;
    }

    public void setIdCli(int idCli) {
        this.idCli = idCli;
    }

    public String getNomeCli() {
        return nomeCli;
    }

    public void setNomeCli(String nomeCli) {
        this.nomeCli = nomeCli;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public NewOS(int idOs, String model, String serialNumber, String obsCar, int idCli, String nomeCli, int cpf) {
        this.idOs = idOs;
        this.model = model;
        this.serialNumber = serialNumber;
        this.obsCar = obsCar;
        this.idCli = idCli;
        this.nomeCli = nomeCli;
        this.cpf = cpf;
    }
    
    public NewOS(){
    
    }
    
    
    
    
    
    
    
    
}
