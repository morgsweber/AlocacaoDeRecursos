package com.pucrs.alocacaorecursos.alocacaorecursos.core.usecase;

public interface Login {
    boolean enterUserId(String userId);

    boolean enterPassword(String password);

    boolean login(int userId);
}
