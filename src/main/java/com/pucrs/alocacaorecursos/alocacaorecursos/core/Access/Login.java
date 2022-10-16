package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.Access;

public interface Login {
    boolean enterUserId(String userId);

    boolean enterPassword(String password);

    boolean login(int userId);
}
