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
public class SubstituirCaracteres {
    
    public String apenasNumeros (String valor){
        String str = valor;
        
        return str.replaceAll("[^0-9]+", "");
        
        
    }
    public String tiraSimbolos(String valor){
        String[] nulos = {"/","-","(",")"," ","."};
	String str = valor;
        
        for (String n:nulos){
		str = str.replaceAll(n, "");
        }
        return str;
    }
    
    public String tiraData(String data){
        String[] nulos = {"/"};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, "-");
        
        return str;
    }
    public String tiraBarra(String data){
        String[] nulos = {"/"};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, "");
        
        return str;
    }
    public String tiraPonto(String data){
        String[] nulos = {"."};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, "");
        
        return str;
    }
    public String colocaData(String data){
        String[] nulos = {"-"};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, "");

        return str;
    }
    
    public String retiraCep(String data){
        String[] nulos = {"-"};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, ".");

        return str;
    }
    
    public String colocaCep(String data){
        String[] nulos = {"."};
	String str = data;

	for (String n:nulos)
		str = str.replaceAll(n, "-");

        return str;
    }
    
}
