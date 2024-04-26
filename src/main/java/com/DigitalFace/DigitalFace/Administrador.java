package com.DigitalFace.DigitalFace;

@Entity
@Table(name = "Administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Administrador;

    private String Foto_Administrador;
    private String Nombre_Administrador;
    private int Edad_Administrador;
    private String Cargo_Administrador;
    private String Direccion_Administrador;
    private String Tel_Cel_Administrador;
    private String Tiempo_Trabajo_Administrador;
    private String Fecha_Registro_Administrador;
    private int ID_UNIDAD;
    private String status;
}
