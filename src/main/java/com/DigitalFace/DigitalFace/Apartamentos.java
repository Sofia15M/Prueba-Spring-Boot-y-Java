package com.DigitalFace.DigitalFace;

@Entity
@Table(name = "Apartamentos")
public class Apartamentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_Apartamento;

    private String Descripcion_Apartamento;
    private int ID_UNIDAD;
    private String status;
    private String ID_Propietario;
}
