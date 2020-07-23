/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AssistantRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class AssistantOrganization extends Organization {

    public AssistantOrganization() {
        super(Organization.Type.Assistant.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new AssistantRole());
        return roles;
    }
}
