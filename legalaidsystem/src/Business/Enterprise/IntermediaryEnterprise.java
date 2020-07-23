/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class IntermediaryEnterprise extends Enterprise {

    public IntermediaryEnterprise(String name, String location) {
        super(name, EnterpriseType.Intermediary, location);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
