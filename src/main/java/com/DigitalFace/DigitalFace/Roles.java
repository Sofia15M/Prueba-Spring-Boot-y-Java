package com.DigitalFace.DigitalFace;

@Entity
@Table(name = "Roles")
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID_ROL;

    private String  Cargo;
}
