package modelo;

public class Usuario {
    private int IDUsuario;
    private String NombreUsuario;
    private String Contrasena;

    public Usuario(int IDUsuario, String NombreUsuario, String Contrasena) {
        this.IDUsuario = IDUsuario;
        this.NombreUsuario = NombreUsuario;
        this.Contrasena = Contrasena;
    }

    public Usuario() {
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public String getNombreUsuario() {
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario) {
        // Validación: asegurarse de que el nombre de usuario no sea nulo o vacío
        if (NombreUsuario != null && !NombreUsuario.isEmpty()) {
            this.NombreUsuario = NombreUsuario;
        } else {
            // Puedes lanzar una excepción, imprimir un mensaje de error, o tomar otra acción según tus necesidades
            throw new IllegalArgumentException("El nombre de usuario no puede ser nulo o vacío.");
        }
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        // Validación: podrías agregar más validaciones aquí según tus necesidades
        this.Contrasena = Contrasena;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "IDUsuario=" + IDUsuario +
                ", NombreUsuario='" + NombreUsuario + '\'' +
                ", Contrasena='" + Contrasena + '\'' +
                '}';
    }
}
