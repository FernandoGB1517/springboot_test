package org.fgarcia.test.springboot.app.services;

import org.fgarcia.test.springboot.app.models.Cuenta;

import java.math.BigDecimal;
import java.util.List;

public interface CuentaService {
    List<Cuenta> findAll();

    Cuenta findById(Long id);

    Cuenta save(Cuenta cuenta);

    void deleteById(Long id);

    int revisarTotalTransferencias(Long bancoId);

    BigDecimal revisarSaldo(Long cuentaId);

    void tranferir(Long numCuentaOrigen, Long numCuentaDestino, BigDecimal cantidad, Long bancoId);
}
