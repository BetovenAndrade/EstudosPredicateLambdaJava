/*
 * ESTUDO DOS PREDICADOS
 */
package com.betovenandrade.predicate_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author betoven.andrade
 */
public class PredicateLambda {

    public static void main(String[] args) {
        List <String> lista= Arrays.asList(
                "Argentina", "Brasil",
                "Bolívia", "Chile",
                "Colombia", "Venezuela");
        
        System.out.println("Países que começam com \'B\':");
        filtro(lista, (b)->b.startsWith("B"));
        
        System.out.println("Países que contém \'il\':");
        filtro(lista, (predicado)->predicado.contains("il"));
        
        System.out.println("Países que terminam com \'a\'");
        filtro(lista, (p)->p.endsWith("a"));
        
        //Enviando o resultado que definimos para a condição: "true"
        System.out.println("Todos os países da lista:");
        filtro(lista, (paises)->true);
    }
    
    public static void filtro(List<String> lista, Predicate<String> condicao){
        /*
        * Itera sobre uma lista de strings filtrando valores com base na condicao (Predicado passado)
        * Tal condição depende do tipo do predicado. Nesse caso, são as funções inerentes a classe String.   
        */
        for(String texto: lista){
            //test é um método abstrato de Object que retorna um boolean. Avalia este predicado no argumento fornecido
            if(condicao.test(texto)){
                System.out.println(texto);
            }
        }
    }
}
