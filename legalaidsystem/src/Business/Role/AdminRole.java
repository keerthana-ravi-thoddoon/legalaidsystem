/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.Intermediary;
import static Business.Enterprise.Enterprise.EnterpriseType.LawFirm;
import static Business.Enterprise.Enterprise.EnterpriseType.NPO;
import Business.Enterprise.IntermediaryEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.InterAdminRole.InterAdminWorkAreaJPanel;
import userInterface.LawAdminRole.LawAdminWorkAreaJPanel;
import userInterface.NPOAdminRole.NPOAdminWorkAreaJPanel;

/**
 *
 * @author keert
 */
public class AdminRole extends Role {

    public AdminRole() {
        super(Role.RoleType.Admin.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        if (enterprise.getEnterpriseType().equals(Intermediary)) {
            return new InterAdminWorkAreaJPanel(userProcessContainer, enterprise);
        } else if (enterprise.getEnterpriseType().equals(LawFirm)) {
            return new LawAdminWorkAreaJPanel(userProcessContainer, enterprise);
        } else if (enterprise.getEnterpriseType().equals(NPO)) {
            return new NPOAdminWorkAreaJPanel(userProcessContainer, enterprise);
        }
        return null;
    }
}
