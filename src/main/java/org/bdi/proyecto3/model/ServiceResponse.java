package org.bdi.proyecto3.model;

// Clase para almacenar las respuestas de la base de datos
public class ServiceResponse {
    Boolean success; // Flag para manejar los procesos exitosos y los fallidos
    String message; // Guarda mensaje de salida del servicio

    // Metodo para obtener estado de accion
    public Boolean getSuccess() {return success;}

    // Metodo para cambiar estado de accion
    public void setSuccess(Boolean success) {this.success = success;}

    // Metodo para obtener el mensaje de salida
    public String getMessage() {return message;}

    // Metodo para cambiar el mensaje de salida
    public void setMessage(String message) {this.message = message;}
}
