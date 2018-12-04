package edu.iot.sagittarius;

import org.apache.ibatis.session.SqlSession;

import edu.iot.common.database.Session;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {        
        SqlSession session = Session.getSession();
        
        System.out.println("준비 완료!");
        session.close();
    }
}
