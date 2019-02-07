/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cust;

import java.sql.DriverManager;
import java.util.HashMap;
import javax.ejb.Stateless;
import java.sql.*;
/**
 *
 * @author root
 */
@Stateless
public class CustBean implements CustBeanLocal {

    @Override
    public HashMap<String,String>getCustDetails(int custid) throws Exception {
        HashMap<String,String> details=new HashMap<>();
        
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tnp_db","root","");
            
            Statement st=con.createStatement();
            
            String sql="select * from student_info where studentRollNo="+custid;
            
            ResultSet rs=st.executeQuery(sql);
            rs.next();
            details.put("name","vaibhav");
            details.put("roll_no",""+rs.getInt("studentRollNo"));
            details.put("studentName", rs.getString("studentName"));
            details.put("studentEmail",rs.getString("studentEmail"));
            
            rs.close();
            st.close();
            con.close();
                    
        
        
        return details;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    
}
