/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Objects;

/**
 *
 * @author Camilo Sampedro <camilo.sampedro@udea.edu.co>
 */
public class TipoCategoria {

    private String nombreCategoria;

    public TipoCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    /**
     * Get the value of nombreCategoria
     *
     * @return the value of nombreCategoria
     */
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    /**
     * Set the value of nombreCategoria
     *
     * @param nombreCategoria new value of nombreCategoria
     */
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nombreCategoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TipoCategoria other = (TipoCategoria) obj;
        if (!Objects.equals(this.nombreCategoria, other.nombreCategoria)) {
            return false;
        }
        return true;
    }

}
