/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class OrganizationDirectory {

    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public Organization createOrganization(Type type) {
        Organization organization = null;
        if (type.getValue().equals(Type.Client.getValue())) {
            organization = new ClientOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Lawyer.getValue())) {
            organization = new LawyerOrganization();
            organizationList.add(organization);
        } else if (type.getValue().equals(Type.Assistant.getValue())) {
            organization = new AssistantOrganization();
            organizationList.add(organization);
        }
        if (type.getValue().equals(Type.Examiner.getValue())) {
            organization = new ExaminerOrganization();
            organizationList.add(organization);
        }

        return organization;
    }
}
