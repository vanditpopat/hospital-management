import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DOCTORDAOIMPL implements DoctorDAO {
    Connection conn;
    Doctor d;

    public DOCTORDAOIMPL() {
        try {
            Class.forName("org.h2.Driver");
            conn=DriverManager.getConnection("jdbc:h2:~/test","sa","1234");
            System.out.println("Conneted");
        } catch (Exception e) {
            System.out.println("Not Connected" +e.getMessage());
        }
    }

    @Override
    public Doctor getUserByDocName(String Name) {
        
        try {
            PreparedStatement ps=conn.prepareStatement("Select * from DOC where DName =?");
            ps.setString(1,Name);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                d=new Doctor();
                d.setDname(rs.getString(1));
                d.setDAdd(rs.getString(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return d;
    }

    @Override
    public boolean addDOC(Doctor d) {
         try {
            PreparedStatement ps = conn.prepareStatement("insert into user values (?,?,?,?,?,?,?,?)");
            ps.setInt(1, d.getId());
            ps.setString(2, d.getDname());
            ps.setString(3, d.getDHosp());
            ps.setString(4, d.getDNum());
            ps.setString(5, d.getDNum());
            ps.setString(6, d.getDAdd());
            ps.setString(7, d.getDSpec());
            ps.setString(8, d.getDDay());
            int res = ps.executeUpdate();
            System.out.println("result : "+res);
            if (res !=0) {
                System.out.println("Inserted : "+ d.getDname());
                return true;
            }
            else
            {
                System.out.println("Not inserted : "+ d.getDname());
            }
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        return false;
    }
    }

    
    

