package com.pucrs.port.Access;

public interface Login {
    boolean enterUserId(String userId);

    boolean enterPassword(String password);

    boolean login(int id);
}
