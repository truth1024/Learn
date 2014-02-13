package com.truth99.designpattern.TemplateMethod.test.example2;

import java.sql.ResultSet;

import com.truth99.designpattern.TemplateMethod.solution.example2.ResultSetHandler;
import com.truth99.designpattern.TemplateMethod.solution.example2.SimpleJdbcQueryTemplate;

public class Test {

	public static void main(String[] args) {
		String called = new SimpleJdbcQueryTemplate().
                query("select * from db",
                        new ResultSetHandler<String>() {
							@Override
							public String handle(ResultSet rs) {
								return "handle result";
							}
						});

        //to verify result...
//        assertTrue(called);
        System.out.println(called);
	}

}
