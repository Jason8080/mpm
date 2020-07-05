package com.gm.mpm.common.kit;

import java.util.UUID;

public class IdKit {
    public static Long generateUuid(){
        return UUID.randomUUID().getLeastSignificantBits();
    }
}
