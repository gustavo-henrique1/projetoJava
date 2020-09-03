/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bandtec.projeto.java;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Aluno
 */
public class Randomico {
    Integer numeroRandom = 0;
    Integer max = 0;
    Integer min = 100;
    Integer total = 0;
    Integer media = 0;
    Integer count = 0;
    void randomizar(){
        numeroRandom = ThreadLocalRandom.current().nextInt(0,100);
        
        if(numeroRandom > max){
            max = numeroRandom;
        } 
        if (numeroRandom < min){
            min = numeroRandom;
        }
        
        total += numeroRandom;
        count++;
        media = total/count;
    }
}
