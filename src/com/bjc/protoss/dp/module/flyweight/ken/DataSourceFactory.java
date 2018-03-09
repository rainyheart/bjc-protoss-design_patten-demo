/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.module.flyweight.ken;

import java.util.HashMap;
import java.util.Map;

import com.bjc.protoss.dp.module.flyweight.ken.impl.DB2;
import com.bjc.protoss.dp.module.flyweight.ken.impl.Derby;
import com.bjc.protoss.dp.module.flyweight.ken.impl.MySQL;
import com.bjc.protoss.dp.module.flyweight.ken.impl.Oracle;
import com.bjc.protoss.dp.module.flyweight.ken.impl.PostgreSQL;
import com.bjc.protoss.dp.module.flyweight.ken.impl.SqlServer;

public class DataSourceFactory {

    private volatile static DataSourceFactory instance;

    private DataSourceFactory() {
        super();
    }

    private static Map<DataBaseType, DataSource> dataSources = new HashMap<>();

    public final DataSource getDataSource(DataBaseType name) {
        if (dataSources.get(name) == null) {
            synchronized (DataSourceFactory.class) {
                if (dataSources.get(name) == null) {
                    switch (name) {
                    case MySQL:
                        dataSources.put(name, new MySQL());
                        break;
                    case Oracle:
                        dataSources.put(name, new Oracle());
                        break;
                    case DB2:
                        dataSources.put(name, new DB2());
                        break;
                    case SqlServer:
                        dataSources.put(name, new SqlServer());
                        break;
                    case Derby:
                        dataSources.put(name, new Derby());
                        break;
                    case PostgreSQL:
                        dataSources.put(name, new PostgreSQL());
                        break;
                    default:
                        throw new UnsupportedOperationException();
                    }
                }
            }
        }

        return dataSources.get(name);
    }

    public static final DataSourceFactory getInstance() {
        if (instance == null) {
            synchronized (DataSourceFactory.class) {
                if (instance == null) {
                    instance = new DataSourceFactory();
                }
            }
        }
        return instance;
    }

    public static final int getDataSourceCount() {
        synchronized (DataSourceFactory.class) {
            return dataSources.size();
        }
    }
}
