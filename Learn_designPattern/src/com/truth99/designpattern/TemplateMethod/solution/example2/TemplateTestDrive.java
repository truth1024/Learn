package com.truth99.designpattern.TemplateMethod.solution.example2;

import java.sql.ResultSet;

/**
 * Date: 2009-11-22
 * Time: 12:54:32
 */
public class TemplateTestDrive {

    public void testTemplate() {
        boolean called = new SimpleJdbcQueryTemplate().
                query("select * from db",
                        new ResultSetHandler<Boolean>() {
                            public Boolean handle(ResultSet rs) {
                                //logical to resolve query result...
                            	System.out.println(rs);
                                return Boolean.TRUE;
                            }
                        });

        //to verify result...
//        assertTrue(called);
        System.out.println(called);
    }

    public static void main(String[] args) {
        new TemplateTestDrive().testTemplate();
    }
}