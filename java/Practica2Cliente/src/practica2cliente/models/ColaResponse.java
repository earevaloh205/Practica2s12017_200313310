/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2cliente.models;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author estuardoarevalo
 */
public class ColaResponse {
    @SerializedName("error")
    public String error;
    
    @SerializedName("success")
    public boolean success;
    
    @SerializedName("numero")
    public int numero;
}
