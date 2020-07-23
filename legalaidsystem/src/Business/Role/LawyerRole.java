/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import static Business.Enterprise.Enterprise.EnterpriseType.LawFirm;
import static Business.Enterprise.Enterprise.EnterpriseType.NPO;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.LawyerRole.LawyerWorkAreaJPanel;
import userInterface.NPOLawyer.NPOLawyerWorkAreaJPanel;

/**
 *
 * @author keert
 */
public class LawyerRole extends Role {

    public LawyerRole() {
        super(Role.RoleType.Lawyer.getValue());
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {

        if (enterprise.getEnterpriseType().equals(LawFirm)) {
            return new LawyerWorkAreaJPanel(userProcessContainer, account, enterprise);
        } else if (enterprise.getEnterpriseType().equals(NPO)) {
            return new NPOLawyerWorkAreaJPanel(userProcessContainer, account, enterprise);
        }
        return null;
    }
}
