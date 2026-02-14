package org.gengar.model;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class AccessToken {
    private static int globalCode = 0;
    private final int code; //use id generator
    private final Instant expiration;

    public AccessToken() {
        this.code = globalCode++;
        this.expiration = Instant.now().plus(60, ChronoUnit.SECONDS);;
    }

    public int getCode() {
        return code;
    }

    public boolean isExpired() {
        return Instant.now().compareTo(expiration) > 0;
    }
}
