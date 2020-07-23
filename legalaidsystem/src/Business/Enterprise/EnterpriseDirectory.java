/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author kranthikumar
 */
public class EnterpriseDirectory {

    private ArrayList<Enterprise> enterpriseList;

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }

    public EnterpriseDirectory() {
        enterpriseList = new ArrayList<Enterprise>();
    }

    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type, String location) {
        Enterprise enterprise = null;
        if (type == Enterprise.EnterpriseType.Intermediary) {
            enterprise = new IntermediaryEnterprise(name, location);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.LawFirm) {
            enterprise = new LawFirmEnterprise(name, location);
            enterpriseList.add(enterprise);
        } else if (type == Enterprise.EnterpriseType.NPO) {
            enterprise = new NPOEnterprise(name, location);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
