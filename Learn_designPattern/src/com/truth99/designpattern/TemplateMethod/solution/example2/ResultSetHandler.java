package com.truth99.designpattern.TemplateMethod.solution.example2;

import java.sql.ResultSet;

public interface ResultSetHandler<T> {
	public T handle(ResultSet rs);
}
