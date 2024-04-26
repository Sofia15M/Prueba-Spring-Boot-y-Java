package com.DigitalFace.DigitalFace;

@Entity
@Table(name = "PersonalLimpieza")
public class PersonalLimpieza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_PersonalL;

    private String Foto_PersonalL;
    private String Nombre_PersonalL;
    private int Edad_PersonalL;
    private String Cargo_PersonalL;
    private String Direccion_PersonalL;
    private String Tel_Cel_PersonalL;
    private String Tiempo_Trabajo_PersonalL;
    private String Fecha_Registro_PersonalL;
    private int ID_UNIDAD;
    private String status;
}
