package com.bjc.protoss.dp.module.facade.wesley;

public interface DataSourceFacade {

    public boolean setValue(String key, String value) throws UnAuthorizedException;

    public String getValue(String key) throws UnAuthorizedException;

}
