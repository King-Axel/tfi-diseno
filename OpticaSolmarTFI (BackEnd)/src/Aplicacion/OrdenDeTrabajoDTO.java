package Aplicacion;

import java.util.Date;

public class OrdenDeTrabajoDTO {
    private ClienteDTO clienteDTO;
    private VistaDTO lejosDTO;
    private VistaDTO cercaDTO;
    private CodigosDTO codigosDTO;
    private double senia;
    private Date entregaEstimada;

    public OrdenDeTrabajoDTO() {
    }

    public OrdenDeTrabajoDTO(ClienteDTO clienteDTO, VistaDTO lejosDTO, VistaDTO cercaDTO, CodigosDTO codigosDTO, double senia, Date entregaEstimada) {
        this.clienteDTO = clienteDTO;
        this.cercaDTO = cercaDTO;
        this.lejosDTO = lejosDTO;
        this.codigosDTO = codigosDTO;
        this.senia = senia;
        this.entregaEstimada = entregaEstimada;
    }

    public Date getEntregaEstimada() {
        return entregaEstimada;
    }

    public void setEntregaEstimada(Date entregaEstimada) {
        this.entregaEstimada = entregaEstimada;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public CodigosDTO getCodigosDTO() {
        return codigosDTO;
    }

    public void setCodigosDTO(CodigosDTO codigosDTO) {
        this.codigosDTO = codigosDTO;
    }

    public double getSenia() {
        return senia;
    }

    public void setSenia(double senia) {
        this.senia = senia;
    }

    public VistaDTO getLejosDTO() {
        return lejosDTO;
    }

    public void setLejosDTO(VistaDTO lejoDTOs) {
        this.lejosDTO = lejosDTO;
    }

    public VistaDTO getCercaDTO() {
        return cercaDTO;
    }

    public void setCercaDTO(VistaDTO cercaDTO) {
        this.cercaDTO = cercaDTO;
    }
    
    
}
