package sqldemo;
 
import java.sql.*;
 
public class MySQLDemo {
 
    // JDBC 驱动名及数据库 URL
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    private static final String DB_URL = "jdbc:mysql://localhost:3306/test3?useUnicode=true&amp;characterEncoding=utf-8";
 
    // 数据库的用户名与密码，需要根据自己的设置
    private static final String USER = "root";
    private static final String PASS = "lcl123";
 
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        try{
            // 1.加载 JDBC 驱动
            Class.forName("com.mysql.jdbc.Driver");
        
            // 2.获得数据库的链接
            System.out.println("连接数据库...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
     
            // 3.通过数据库的连接操作数据库
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "insert into students" +
				"(num,name,sex,age,major,reward)" +			
				"values(" +
				"'123','杨东旭','男',20,'专业','奖励')";
            //插入一组数
            //String sql2="INSERT INTO `websites` VALUES ('6', 'lcl', 'https://www.lcl.cm/', '10000', '')";
            //stmt.executeUpdate(sql2);
            stmt.execute(sql);
      
            // 展开结果集数据库
//            while(rs.next()){
//                // 通过字段检索
//                int id  = rs.getInt("id");
//                String name = rs.getString("name");
//                String url = rs.getString("url");
//    
//                // 输出数据
//                System.out.print("ID: " + id);
//                System.out.print(", 站点名称: " + name);
//                System.out.print(", 站点 URL: " + url);
//                System.out.print("\n");
//            }
            // 完成后关闭
            //rs.close();
            stmt.close();
            conn.close();
        }catch(SQLException se){
            // 处理 JDBC 错误
            se.printStackTrace();
        }catch(Exception e){
            // 处理 Class.forName 错误
            e.printStackTrace();
        }finally{
            // 关闭资源
            try{
                if(stmt!=null) stmt.close();
            }catch(SQLException se2){
            }// 什么都不做
            try{
                if(conn!=null) conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}