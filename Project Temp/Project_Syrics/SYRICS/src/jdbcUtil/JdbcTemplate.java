package jdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class JdbcTemplate {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
        	e.printStackTrace();
        }
    }

    private Connection makeConn() throws Exception {
        Connection conn = DriverManager.getConnection("jdbc:mysql://10.156.147.116:3306/syrics","root","1111");
        return conn;
    }
    
    public int update(String sql, Object ...args) throws Exception {
        int rc = 0;
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = makeConn();
            stmt = conn.prepareStatement(sql);

            for(int i = 0 ; i < args.length ; i++) {
                if(args[i] == null) {
                    stmt.setObject(i+1,null);
                } else if (args[i] instanceof Integer) {
                    stmt.setInt(i+1,((Integer)args[i]).intValue());
                } else if (args[i] instanceof Long) {
                    stmt.setLong(i+1,((Long)args[i]).longValue());
                } else if (args[i] instanceof Double) {
                    stmt.setDouble(i+1,((Double)args[i]).doubleValue());
                } else if (args[i] instanceof String) {
                    stmt.setString(i+1, (String)args[i]);
                }
            }
            rc = stmt.executeUpdate();
        } catch(Exception e) {
            throw e;
        } finally {
            if(stmt!=null) stmt.close();
            if(conn!=null) conn.close();
        }
        return rc;
    }
    
    public <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object...args) throws Exception {
        T vo = null;

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = makeConn();
            stmt = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                if(args[i] == null) {
                    stmt.setObject(i+1,null);
                } else if (args[i] instanceof Integer) {
                    stmt.setInt(i+1,((Integer)args[i]).intValue());
                } else if (args[i] instanceof Double) {
                    stmt.setDouble(i+1,((Double)args[i]).doubleValue());
                } else if (args[i] instanceof String) {
                    stmt.setString(i+1, (String)args[i]);
                } else if (args[i] instanceof Long) {
                    stmt.setLong(i+1,((Long)args[i]).longValue());
                }
            }
            rs = stmt.executeQuery();

            if(rs.next()) {
                vo = rowMapper.mapRow(rs);
                if(rs.next()) {
                    System.out.println("many records");
                    return null;
                }
            } else {
                System.out.println("no record");
                return null;
            }
        } catch(Exception e) {
            throw e;
        } finally {
            if( rs != null) rs.close();
            if( stmt != null) stmt.close();
            if( conn != null) conn.close();
        }
        return vo;
    }
    
    public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object ... args) throws Exception {
        List<T> rl = new ArrayList<>();
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            conn = makeConn();
            stmt = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                if(args[i] == null) {
                    stmt.setObject(i+1,null);
                } else if (args[i] instanceof Integer) {
                    stmt.setInt(i+1,((Integer)args[i]).intValue());
                } else if (args[i] instanceof Double) {
                    stmt.setDouble(i+1,((Double)args[i]).doubleValue());
                } else if (args[i] instanceof String) {
                    stmt.setString(i+1, (String)args[i]);
                } else if (args[i] instanceof Long) {
                    stmt.setLong(i+1,((Long)args[i]).longValue());
                }
            }
            rs = stmt.executeQuery();

            while(rs.next()) {
                T vo = rowMapper.mapRow(rs);
                rl.add(vo);
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if( rs != null) rs.close();
            if( stmt != null) stmt.close();
            if( conn != null) conn.close();
        }
        return rl;
    }
}