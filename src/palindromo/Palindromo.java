/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindromo;

/**
 *
 * @author alexj
 */
public class Palindromo {
    
    static String palindromo = "acaso hubo buhos aca";
    static String prueba1 = "";
    static String prueba2 = "";
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        compruebaPalindromo();
    }    
    
    static private void compruebaPalindromo() {
        //Hacemos la comprobacion de la palabra de izquierda a derecha
        //y la guardamos en la variable prueba1, declarada anteriormente
        for (int i = 0; i < palindromo.length(); i++) {
            if (palindromo.charAt(i) != ' ') {      //se ponen comillas simple porq es un char no un string
                prueba1 += palindromo.charAt(i);
            }
        }
        //Hacemos la comprobacion de la palabra de derecha a izquierda
        //y la guardamos en la variable prueba2, declarada anteriormente
        for (int j = palindromo.length() - 1; j >= 0; j--) {
            if (palindromo.charAt(j) != ' ') {
                prueba2 += palindromo.charAt(j);
            }
        }
       
        prueba1.replace(" ","");
        prueba2.replace(" ","");
        System.out.println(prueba1);
        System.out.println(prueba2);
        
        //comprobamos si son iguales
        if(prueba1.equals(prueba2)){
            System.out.println("Es un Palíndromo.");
        } else {
            System.out.println("No es un Palíndromo.");
        }
    }
}
