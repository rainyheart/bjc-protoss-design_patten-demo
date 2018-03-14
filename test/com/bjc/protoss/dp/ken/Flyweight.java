/*------------------------------------------------------------------------------
 * COPYRIGHT BJC 2018
 *
 * The copyright to the computer program(s) herein is the property of
 * BJC Inc. The programs may be used and/or copied only with written
 * permission from Ericsson Inc. or in accordance with the terms and
 * conditions stipulated in the agreement/contract under which the
 * program(s) have been supplied.
 *----------------------------------------------------------------------------*/
package com.bjc.protoss.dp.ken;

import org.junit.Test;

import com.bjc.protoss.dp.module.flyweight.ken.DataBaseType;
import com.bjc.protoss.dp.module.flyweight.ken.DataSource;
import com.bjc.protoss.dp.module.flyweight.ken.DataSourceFactory;

/**
 * Definition:<br/>
 * A flyweight is an object that minimizes memory usage by sharing as
 * much data as possible with other similar objects; it is a way to
 * use objects in large numbers when a simple repeated representation
 * would use an unacceptable amount of memory. Often some parts of the
 * object state can be shared, and it is common practice to hold them
 * in external data structures and pass them to the objects
 * temporarily when they are used.
 *
 */
public class Flyweight {

    @Test
    public void execute() {
        DataSourceFactory dataSourceFactory = DataSourceFactory.getInstance();
        String selectSql = "SELECT * FROM CUSTOMER";

        executeSql(dataSourceFactory, DataBaseType.MySQL, selectSql);
        executeSql(dataSourceFactory, DataBaseType.Oracle, selectSql);
        executeSql(dataSourceFactory, DataBaseType.PostgreSQL, selectSql);
        executeSql(dataSourceFactory, DataBaseType.DB2, selectSql);
        executeSql(dataSourceFactory, DataBaseType.Derby, selectSql);
        executeSql(dataSourceFactory, DataBaseType.SqlServer, selectSql);

        String insertSql = "INSERT INTO CUSTOMER(NAME, AGE) VALUES ('Ken', 18)";

        executeSql(dataSourceFactory, DataBaseType.MySQL, insertSql);
        executeSql(dataSourceFactory, DataBaseType.Oracle, insertSql);
        executeSql(dataSourceFactory, DataBaseType.PostgreSQL, insertSql);
        executeSql(dataSourceFactory, DataBaseType.DB2, insertSql);
        executeSql(dataSourceFactory, DataBaseType.Derby, insertSql);
        executeSql(dataSourceFactory, DataBaseType.SqlServer, insertSql);

    }

    private void executeSql(DataSourceFactory dataSourceFactory, DataBaseType dbType, String sql) {
        DataSource mysql = dataSourceFactory.getDataSource(dbType);
        mysql.execute(sql);
        System.out.println("DataSource Count is: " + DataSourceFactory.getDataSourceCount());
    }
}
