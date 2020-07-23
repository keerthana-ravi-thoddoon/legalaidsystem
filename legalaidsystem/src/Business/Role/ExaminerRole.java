/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.ExaminerRole.ExaminerWorkAreaJPanel;

/**
 *
 * @author keert
 */
public class ExaminerRole extends Role {

    public ExaminerRole() {
        super(Role.RoleType.Examiner.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ExaminerWorkAreaJPanel(userProcessContainer, account, organization, business, network, enterprise);
    }
}
