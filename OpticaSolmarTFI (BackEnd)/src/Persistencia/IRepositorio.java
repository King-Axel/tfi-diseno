package Persistencia;

import Modelo.Armazon;
import Modelo.Cristal;
import Modelo.Tratamiento;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.ObraSocial;
import Modelo.OrdenDeTrabajo;

import java.util.ArrayList;

public interface IRepositorio {
    ArrayList<Armazon> buscarArmazones();
    ArrayList<Cristal> buscarCristales();
    ArrayList<Tratamiento> buscarTratamiento();
    ArrayList<ObraSocial> buscarObrasSociales();
    Armazon buscarArmazon(int codigo);
    Cristal buscarCristal(int codigo);
    Tratamiento buscarTratamiento(int codigo);
    ObraSocial buscarObraSocial(int codigo);
    Cliente buscarCliente(int dni);
    void guardarCliente(Cliente cliente);
    void guardarOrdenDeTrabajo(OrdenDeTrabajo ordenDeTrabajo);
}
