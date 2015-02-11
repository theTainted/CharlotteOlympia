package com.CO;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class ExcelasDB
{
public static void main( String [] args )
{
Connection c = null;
Statement stmnt = null;

try
{
Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver" );

//using DSN connection. Here qa is the name of DSN
//c = DriverManager.getConnection( "jdbc:odbc:qa", "", "" );

//using DSN-less connection
c = DriverManager.getConnection( "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls)};DBQ=C:/Selenium/CharlotteOlympia/src/excel/Test.xls");


stmnt = c.createStatement();
String query = "select * from [qas test$] where Month='March' and Year=2001;";
ResultSet rs = stmnt.executeQuery( query );

System.out.println( "Found the following URLs:" );
while( rs.next() )
{
System.out.println( rs.getString( "URL" ) + " " + rs.getInt("Year"));
}
}
catch( Exception e )
{
System.err.println( e );
}
finally
{
try
{
stmnt.close();
c.close();
}
catch( Exception e )
{
System.err.println( e );
}
}
}
}

/*Reference:

JDBC-ODBC Bridge Driver Enables Spreadsheet-as-database Interaction ( http://www.devx.com/Java/Article/17848)*/

