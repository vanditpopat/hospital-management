import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class HOSPITALDOAIMPL implements HOSPITALDAO{
    Connection conn;
    Hospital h;
    List<Hospital> hl;

    public HOSPITALDOAIMPL() {
        try {
            Class.forName("org.h2.Driver");
            conn=DriverManager.getConnection("jdbc:h2:~/test","sa","1234");
            System.out.println("Conneted");
        } catch (Exception e) {
            System.out.println("error" +e.getMessage());
        }
    }

    @Override
    public boolean addUser(Hospital h) {
        try {
            PreparedStatement ps=conn.prepareStatement("insert into USER values(?,?)");
            ps.setString(1,h.getHUSER());
            ps.setString(2,h.getHPASS());
            int res=ps.executeUpdate();
            System.out.println("result:" +res);
            if(res!=0)
            {
                System.out.println("Inserted :" +h.getHUSER());
                return true;
            }
            else
            {
                System.out.println("Not Inserted " +h.getHUSER());
            }
        } catch (Exception e) {
            System.out.println("Error @Update:" +e.getCause());
            
        }
        return false;
    }

    @Override
    public Hospital getUserByName(String Name) {
        try {
            PreparedStatement ps=conn.prepareStatement("Select * from USER where HUSERS =?");
            ps.setString(1,Name);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                h=new Hospital();
                h.setHUSER(rs.getString(1));
                h.setHPASS(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return h;
    }
    
    
}
