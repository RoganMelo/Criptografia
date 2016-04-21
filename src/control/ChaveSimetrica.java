/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

public class ChaveSimetrica {
    public static String cifra(String mensagem, int chave){
        StringBuilder builder = new StringBuilder();
 
        for (int i = 0; i < mensagem.length(); i++) {
            char c = (char)(mensagem.charAt(i) + chave);
            builder.append(c);
        }
        
        return builder.toString();
    }
 
    public static String decifra(String mensagem, int chave){
        return cifra(mensagem, -chave);
    }
}