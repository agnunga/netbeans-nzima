/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agunga.beanI;

import com.agunga.model.Accountant;
import javax.ejb.Local;

/**
 *
 * @author agunga
 */
@Local
public interface OperationBeanI {

    public Accountant authentication(String username, String pasword);

}
