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
public class ValidaSeCampoEhSoNumero {
    public boolean ValidaCampo(String DadoAhValidar){
        try {
            int teste = Integer.parseInt(DadoAhValidar);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
