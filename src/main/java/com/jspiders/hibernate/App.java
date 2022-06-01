package com.jspiders.hibernate;

import org.hibernate.Session;

import com.hibernate.Dao.RestDao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Rest rest = new Rest();
        rest.setName("abc");
        rest.setId(1);
        rest.setAddress("bangalore");
        rest.setType("veg");
        RestDao dao = new RestDao();
        dao.save(rest);
    }
}
