/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 * Clase donde se almacenarán los datos del esquema (Primera parte del modelo).
 *
 * @author Camilo Sampedro <camilo.sampedro@udea.edu.co>
 */
public class Esquema {

    private static String tipoDeHechos;

    private static ArrayList<TipoDeDimension> tiposDeDimensiones = new ArrayList();

    /**
     * Get the value of tiposDeDimensiones
     *
     * @return the value of tiposDeDimensiones
     */
    public static ArrayList<TipoDeDimension> getTiposDeDimensiones() {
        return tiposDeDimensiones;
    }

    /**
     * Set the value of tiposDeDimensiones
     *
     * @param tiposDeDimensiones new value of tiposDeDimensiones
     */
    public static void setTiposDeDimensiones(ArrayList tiposDeDimensiones) {
        Esquema.tiposDeDimensiones = tiposDeDimensiones;
    }

    /**
     * Get the value of tipoDeHechos
     *
     * @return the value of tipoDeHechos
     */
    public static String getTipoDeHechos() {
        return tipoDeHechos;
    }

    /**
     * Set the value of tipoDeHechos
     *
     * @param tipoDeHechos new value of tipoDeHechos
     */
    public static void setTipoDeHechos(String tipoDeHechos) {
        Esquema.tipoDeHechos = tipoDeHechos;
    }

    public static void agregarTipoDimension(TipoDeDimension nuevoTipoDeDimension) {
        tiposDeDimensiones.add(nuevoTipoDeDimension);
    }

}
