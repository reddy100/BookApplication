import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDB {
	public static Book getBook(String sku)
	{
		
		Book book = new Book();
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "select * from bookDb where sku='"+sku+"'";
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:ora1/ora1@localhost:1521:orcl");
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				book.setTitle(rs.getString("Title"));
				book.setAuthor(rs.getString("Author"));
				book.setDescription(rs.getString("message"));
				book.setPrice(Integer.parseInt(rs.getString("price")));
				book.setSku(rs.getString("sku"));
				book.setQuantity(10);
				book.setInStock(true);
			}
			}catch (SQLException e) {
				e.printStackTrace();
			}catch (ClassNotFoundException e) {
				e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	return book;	
	}
}
