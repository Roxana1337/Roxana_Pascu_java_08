package ro.sci.PhoneApp;

import java.util.Random;

public interface Apple {

    default long ImeiGenerator() {

        Random rand = new Random();
        long imei = Math.abs(rand.nextLong());
        return imei;

    }
}

