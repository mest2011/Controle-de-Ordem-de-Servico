/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleos;

/**
 *
 * @author mest2
 */
class Os {
    private String id;
    private String modelo;
    private String serial;
    private String obs;
    private String idCliente;

     public Os() {
        
    }
    
    public Os(String id, String modelo, String serial, String obs, String idCliente) {
        this.id = id;
        this.modelo = modelo;
        this.serial = serial;
        this.obs = obs;
        this.idCliente = idCliente;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
    
    
    
    
}
