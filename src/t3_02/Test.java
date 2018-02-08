package t3_02;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List; 

public class Test {
	public static void main(String[] args) {
		Filter filter = new Filter();
		filter.setId(1);
		filter.setUserName("f");
		filter.setNumber("1");
		String sql = getSql(filter);
		System.out.println(sql);
		List<Filter> list = queryList(sql);
		System.out.println(list.toString());
	}
	
	static public List<Filter> queryList(String sql) {
			List<Filter> list = new ArrayList<>();
		    DBCutil dbc = new DBCutil();
	        Connection con = dbc.getCon();  
			PreparedStatement ps = null;
			ResultSet rs = null ; 
			try {
				ps = con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
					Filter bean = new Filter() ;
					bean.setId(rs.getInt("t_id"));
					bean.setNumber(rs.getString("t_number"));
					bean.setUserName(rs.getString("t_userName"));
					list.add(bean);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				closeConnect(rs, ps, con);
			}
			
			return list ;
	}
	
	static private String getSql(Filter f) {
		StringBuilder sb = new StringBuilder();//拼接sql
		
		Class<?> c = f.getClass();
		boolean isExist = c.isAnnotationPresent(Table.class);//这个类是否有这个注解@Table
		if(!isExist) {//没有则停止
			return null ;
		}
		Table table = (Table) c.getAnnotation(Table.class);//获得这个注解的类
		String tableName = table.value();//获取注解的值 【与表的名字对应】
		sb.append("select * from ").append(tableName).append(" where 1=1");
		
		Field[] fArray = c.getDeclaredFields();//获取所有类型【共有、私有...】的字段 
		for(Field field : fArray) {
//			field.setAccessible(true);
			boolean isExist1 = field.isAnnotationPresent(Column.class);//这个字段是否有这个注解@Column
			if(!isExist1) {
				continue ;
			}
			Column column = (Column) field.getAnnotation(Column.class);//获得这个注解的类
			String columnName = column.value();//获取注解的值 【与数据库表字段对应】
			String fieldName = field.getName();//获取这个字段的名称
			String getMethodName = "get"
										+fieldName.substring(0, 1).toUpperCase()
										+fieldName.substring(1);//拼接get方法
			Object fieldValue = null ;
			try {
				Method getMethod = c.getMethod(getMethodName);//获取get方法
				fieldValue = getMethod.invoke(f);//获取到方法后通过反射调用，获取我们设置的值
				if(fieldValue == null) {
					continue;
				}
				if(fieldValue instanceof Integer && !fieldValue.equals(0)) {
					sb.append(" and ").append(columnName).append("=").append(fieldValue);
				}else if(fieldValue instanceof String) {
					sb.append(" and ").append(columnName).append("=").append("'"+fieldValue+"'");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		
		return sb.toString();
	}
	
	public static void closeConnect(ResultSet set ,Statement sta ,Connection conn){
		if(set!=null){
			try {
				set.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(sta!=null){
			try {
				sta.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
