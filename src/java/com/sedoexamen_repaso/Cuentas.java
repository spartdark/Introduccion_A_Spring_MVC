package com.sedoexamen_repaso;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cuenta")
public class Cuentas {
    
    @Id
    @Column(name="Id")
    private int Id;
    
    @Column(name="saldo")
    private float saldo;
    
    @Column(name="numero")
    private int numero;

    public Cuentas(int Id, float saldo, int numero) {
        this.Id = Id;
        this.saldo = saldo;
        this.numero = numero;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
