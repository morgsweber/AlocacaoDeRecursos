package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.Action;

public interface Request {
    /*
     * Acao realizada apenas pelo professor
     * solicita troca de sala, informa:
     * - id da sala antiga
     * - novo local (Laboratorio, Living)
     * - justificativa
     */
    void requestClassroomExchange(int professorId, int currentClassroomId, int newLocation, String justification);
    
    /*
     * Acao realizada apenas pelo admin
     * altera status da solicitacao
     */
    void approveRequest(int requestId, boolean isApproved);

}
