package org.fgarcia.test.springboot.app.models;

import java.math.BigDecimal;

public class TransaccionDto {
    private Long cuentaOrigen;
    private Long cuentaDestino;
    private BigDecimal cantidad;
    private Long bancoID;

    public Long getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(Long cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public Long getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(Long cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public BigDecimal getCantidad() {
        return cantidad;
    }

    public void setCantidad(BigDecimal cantidad) {
        this.cantidad = cantidad;
    }

    public Long getBancoID() {
        return bancoID;
    }

    public void setBancoID(Long bancoID) {
        this.bancoID = bancoID;
    }
}
