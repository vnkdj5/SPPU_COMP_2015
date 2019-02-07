/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionbean;

import javax.ejb.Stateless;

/**
 *
 * @author root
 */
@Stateless
public class SessionBeanEJB implements SessionBeanEJBLocal {

    @Override
    public Integer calSquare(int num1) {
        return num1*num1;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
