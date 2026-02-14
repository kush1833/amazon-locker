package org.gengar.service;

import org.gengar.model.AccessToken;
import org.gengar.model.Compartment;
import org.gengar.model.Locker;
import org.gengar.model.Size;

import java.util.Map;

public class TransactionManager {
    private Locker locker;
    private Map<AccessToken, Compartment> compartmentToAccessTokenRecord;

    public TransactionManager(int totalSmall, int totalMedium, int totalLarge) {
        this.locker = new Locker(totalSmall, totalMedium, totalLarge);
    }

    public AccessToken deposit(Size size) throws Exception{
        if(locker.hasSizeAvailable(size)) {
            AccessToken accessToken = gelocker.deposit(size);
        }
        throw new Exception("No available compartments of size: " + size);
    }

    public void retrieve(AccessToken)
}
