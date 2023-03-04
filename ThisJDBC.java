import java.sql.*;
class MysqlCon{
	public static void main(String args[]){
		try{
			Connection dbCxn=DriverManager.getConnection(
						"jdbc:mysql://localhost:33306/ThisAndThat","root","group3"
					);
			Statement selectThis=dbCxn.createStatement();
			ResultSet rsThis=selectThis.executeQuery("select * from This");
			while(rsThis.next()) {
				System.out.println(rsThis.getInt(1) + " " + rsThis.getString(2) + " " + rsThis.getInt(3) + " " + rsThis.getDate(4) + " " + rsThis.getString(5));
			}
			dbCxn.close();
		}catch(Exception e){ System.out.println(e);}
	}
}
