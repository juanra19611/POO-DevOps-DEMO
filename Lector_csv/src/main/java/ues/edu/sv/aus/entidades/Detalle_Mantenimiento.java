/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.aus.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author kevin
 */
@ManagedBean(name = "dtDetalle")
@ViewScoped
public class Detalle_Mantenimiento implements Serializable {

    private int id_mantenimiento;
    private String historico;
    private int n_inventario;
    private String marca;
    private int n_serie;
    private String modelo;
    private String responsable;
    private String sistema_operativo;
    private String version;
    private String observaciones;
    private List<Lista> lista;

    public Detalle_Mantenimiento() {
    }

    public int getId_mantenimiento() {
        return id_mantenimiento;
    }

    public void setId_mantenimiento(int id_mantenimiento) {
        this.id_mantenimiento = id_mantenimiento;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public int getN_inventario() {
        return n_inventario;
    }

    public void setN_inventario(int n_inventario) {
        this.n_inventario = n_inventario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getN_serie() {
        return n_serie;
    }

    public void setN_serie(int n_serie) {
        this.n_serie = n_serie;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getSistema_operativo() {
        return sistema_operativo;
    }

    public void setSistema_operativo(String sistema_operativo) {
        this.sistema_operativo = sistema_operativo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public List<Lista> getLita() {
        List<Lista> algo = new ArrayList<>();
        Lista item = new Lista();

        for (int i = 0; i < 10; i++) {
            item.setApellido("Apellido");
            item.setNombre("Nombre");
            algo.add(item);
        }
        return algo;
    }

    public void setLista(List<Lista> lista) {
        this.lista = lista;
    }

}
