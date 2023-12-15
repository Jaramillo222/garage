/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Jaramillo
 */
public class Cliente {
    private int IDCliente;
    private String NombreCliente;
    private String Telefono;
    private String Email;

    public Cliente(int IDCliente, String NombreCliente, String Telefono, String Email) {
        this.IDCliente = IDCliente;
        this.NombreCliente = NombreCliente;
        this.Telefono = Telefono;
        this.Email = Email;
    }

    public Cliente() {
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombreCliente() {
        return NombreCliente;
    }

    public void setNombreCliente(String NombreCliente) {
        this.NombreCliente = NombreCliente;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
    
}
