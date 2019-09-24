import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PatientDAOImpl implements PatientDao {
    Connection conn;
    patient p;

    public PatientDAOImpl() {
        try {
            Class.forName("org.h2.Driver");
            conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "1234");
            System.out.println("Connected");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    @Override
    public boolean addPatient(patient p) {
        try {
            PreparedStatement ps = conn.prepareStatement("insert into user values (?,?,?,?,?)");
            ps.setInt(1, p.getPid());
            ps.setString(2, p.getPadd());
            ps.setString(3, p.getPname());
            ps.setString(4, p.getProblem());
            ps.setString(5, p.getPnum());
            int res = ps.executeUpdate();
            System.out.println("result : "+res);
            if (res !=0) {
                System.out.println("Inserted : "+ p.getPname());
                return true;
            }
            else
            {
                System.out.println("Not inserted : "+ p.getPname());
            }
        } catch (Exception e) {
             System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public patient getUserBYPName(String Name1) {
         try {
            PreparedStatement ps=conn.prepareStatement("Select * from PATIENT where PNAME =?");
            ps.setString(1,Name1);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                p=new patient();
                p.setPname(rs.getString(1));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return p;
    }
    }
    
    

