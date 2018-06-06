package com.ocp4.webservice.dao;

import javax.inject.Inject;
import javax.sql.DataSource;


public abstract class AbstractDaoImpl {
	@Inject
	private DataSource dataSource;

    protected DataSource getDataSource() {
        return dataSource;
    }

}
