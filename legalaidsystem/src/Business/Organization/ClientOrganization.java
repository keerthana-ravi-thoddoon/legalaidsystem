/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ClientRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class ClientOrganization extends Organization{
    public ClientOrganization() {
        super(Organization.Type.Client.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ClientRole());
        return roles;
    }
}
