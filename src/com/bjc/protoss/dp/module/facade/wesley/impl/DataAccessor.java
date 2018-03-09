package com.bjc.protoss.dp.module.facade.wesley.impl;

import com.bjc.protoss.dp.module.facade.wesley.Authorization;
import com.bjc.protoss.dp.module.facade.wesley.DataBase;
import com.bjc.protoss.dp.module.facade.wesley.DataCache;
import com.bjc.protoss.dp.module.facade.wesley.DataSourceFacade;
import com.bjc.protoss.dp.module.facade.wesley.UnAuthorizedException;

public class DataAccessor implements DataSourceFacade {

    Authorization authorization = new OAuth();
    DataCache cache = new Redis();
    DataBase db = new MySQL();

    @Override
    public boolean setValue(String key, String value) throws UnAuthorizedException {
        boolean authorized = authorization.authorize("valid_token");
        if (authorized) {
            cache.setValue(key, value);
            db.setValue(key, value);
            return true;
        }

        throw new UnAuthorizedException();
    }

    @Override
    public String getValue(String key) throws UnAuthorizedException {
        String result = null;
        boolean authorized = authorization.authorize("valid_token");
        if (authorized) {
            result = cache.getValue(key);
            if (result == null) {
                result = db.getValue(key);
            }

            return result;
        }

        throw new UnAuthorizedException();
    }

}
