package recorridoSuperApp.models;

import java.util.Map;

public class User {

    private String opcionLogin;
    private String email;
    private String password;
    private String nombreUsuario;
    private String segmentacion;
    private String numero;
    private String documento;
    private String revisarNombreUser;

    private String celular;

    private String contrasena;

    private String miniprograma;

    private String zona;



    public String getOpcionLogin() {
        return opcionLogin;
    }

    public void setOpcionLogin(String opcionLogin) {
        this.opcionLogin = opcionLogin;
    }

    public String getRevisarNombreUser() {
        return revisarNombreUser;
    }

    public void setRevisarNombreUser(String revisarNombreUser) {
        this.revisarNombreUser = revisarNombreUser;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setSegmentacion(String segmentacion) {
        this.segmentacion = segmentacion;
    }

    public String getSegmentacion() {
        return segmentacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getMiniprograma() {
        return miniprograma;
    }

    public void setMiniprograma(String miniprograma) {
        this.miniprograma = miniprograma;
    }

    public String getZona() {  return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }



    public User(Map<String, String> info) {
        this.opcionLogin = info.get("opcionLogin");
        this.email = info.get("email");
        this.password = info.get("password");
        this.nombreUsuario = info.get("nombreUsuario");
        this.segmentacion = info.get("segmentacion");
        this.numero = info.get("numero");
        this.documento = info.get("documento");
        this.revisarNombreUser = info.get("revisarNombreUser");
        this.contrasena = info.get("contrasena");
        this.celular = info.get("celular");
        this.zona = info.get("zona");
        this.miniprograma = info.get("miniprograma");


    }


}
