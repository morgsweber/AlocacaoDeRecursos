package main.java.com.pucrs.alocacaorecursos.alocacaorecursos.core.Search;

public interface Request {
    /*
     * Retorna lista com todas solicitacoes de troca de sala pendentes
     * - nome da disciplina
     * - nome do professor que solicitou a troca
     * - id da disciplina
     * - sala antiga
     * - sala nova
     */
    List<Request> getAllPendingRequests();

    /*
     * Retorna a versão de um request detalhada
     * - nome da disciplina
     * - nome do professor que solicitou a troca
     * - id da disciplina
     * - sala antiga
     * - sala nova
     * - justificativa de troca
     */
    Request getRequestDetails(int requestId);


}
