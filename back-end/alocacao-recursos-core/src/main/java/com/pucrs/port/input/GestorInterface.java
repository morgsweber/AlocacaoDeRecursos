package com.pucrs.port.input;

import java.util.List;

import com.pucrs.port.Location;
import com.pucrs.port.Turma;

public interface GestorInterface {

    //public List<Turma, Location> getSolicitacoesTroca();

    public boolean aprovarSolicitacao(int solicitacaoId);

    public void logOut(int gestorId);
}
