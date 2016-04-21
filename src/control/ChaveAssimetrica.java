/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.math.BigInteger;

/**
 *
 * @author Rogan
 */
public class ChaveAssimetrica {
    public static BigInteger[] converte(String mensagem){
        char msg[] = mensagem.toCharArray();
        BigInteger num[] = new BigInteger[msg.length]; 
        for (int i = 0; i < msg.length; i++){
            num[i] = BigInteger.valueOf(msg[i]);
        }
        return num;
    }
    public static String desconverte(BigInteger[] num){
        char msg[] = new char[num.length];
        String mensagem = "";
        for(int i = 0; i < num.length; i++){
            msg[i] = (char) num[i].intValue();
            mensagem = mensagem + msg[i];
        }
        return mensagem;
    }
    public static String criptografar(String mensagem, int n) {	
        BigInteger x = BigInteger.valueOf(n);
        BigInteger e;
        e = BigInteger.valueOf(13);
        BigInteger num[] = converte(mensagem);
        for (int i = 0; i < num.length; i++) {
            num[i] = num[i].modPow(e, x);
        }
	return desconverte(num);
    }
    public static String decriptografar(String mensagem, int n) {
        BigInteger x = BigInteger.valueOf(n);
        BigInteger d;
        d = BigInteger.valueOf(61);
        BigInteger num[] = converte(mensagem);
        for (int i = 0; i < mensagem.length(); i++) {
            num[i] = num[i].modPow(d, x);
        }
        return desconverte(num);
    }
}