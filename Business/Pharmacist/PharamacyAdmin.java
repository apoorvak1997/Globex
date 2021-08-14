/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Pharmacist;

import Business.Organization;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
import Business.Role.LabAdminRole;
import Business.Role.PharamacyAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class PharamacyAdmin extends Organization{
    private String name;
    private String pharlocation;

    public PharmacyCatalogDirectory getPharDir() {
        return pharDir;
    }

    public void setPharDir(PharmacyCatalogDirectory pharDir) {
        this.pharDir = pharDir;
    }
    PharmacyCatalogDirectory pharDir;

    public String getPharlocation() {
        return pharlocation;
    }

    public void setPharlocation(String pharlocation) {
        this.pharlocation = pharlocation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
         @Override
    public String toString(){
        return name;
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharamacyAdminRole());
        return roles;
    }
}
