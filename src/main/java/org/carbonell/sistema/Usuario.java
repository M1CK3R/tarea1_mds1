package org.carbonell.sistema;

public class Usuario {

    // Datos a guardar del usuario
    private String nombre;
    private String username;
    private String password;
    private String email;

    // Constructor del Usuario
    public Usuario(String nombre, String username, String password, String email) {
        this.nombre = nombre;
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public Usuario() {

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean autenticarUsuario(String email, String password){
        return this.email.equals(email) && this.password.equals(password);
    }
}
