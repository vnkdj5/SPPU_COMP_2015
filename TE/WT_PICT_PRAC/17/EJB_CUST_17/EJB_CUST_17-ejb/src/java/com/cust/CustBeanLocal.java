/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cust;

import java.sql.ResultSet;
import java.util.HashMap;
import javax.ejb.Local;

/**
 *
 * @author root
 */
@Local
public interface CustBeanLocal {

    HashMap<String,String> getCustDetails(int custid) throws Exception;

   
}
