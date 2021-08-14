/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Doctor.Doctor;
import Business.Doctor.DoctorDirectory;
import Business.EmergencyAdmin.Emergency;
import Business.EmergencyAdmin.EmergencyDirectory;
import Business.Organization.Type;
import Business.Patient.Patient;
import Business.HospitalAdmin.Hospital;
import Business.InsuraceAdmin.InsuranceAdminDirectory;
import Business.InsuraceAdmin.InsuranceeAdmin;
import Business.LabAdmin.Lab;
import Business.LabAdmin.LabDirectory;
import Business.LabAdmin.Test;
import Business.Patient.PatientDirectory;
import Business.Pharmacist.PharamacyAdmin;
import Business.Pharmacist.PharamacyAdminDirectory;
import Business.PharmacyCatalog.PharmacyCatalog;
import Business.PharmacyCatalog.PharmacyCatalogDirectory;
import Business.SupplierAdmin.Supplier;
import Business.SupplierAdmin.SupplierDirectory;
import Business.VoluntaryAdmin.VoluntaryyAdmin;
import java.util.ArrayList;

/**
 *
 * @author shreyascr
 */
public class OrganizationDirectory {
      ArrayList<Organization> organizationList;
DoctorDirectory doctorDirectory;
    PatientDirectory patientDirectory;
    LabDirectory labDirectory;
    InsuranceAdminDirectory insuranceAdminDirectory;

    EmergencyDirectory emergencyDirectory;
    SupplierDirectory supplierDirectory;


    public PharamacyAdminDirectory getPharmacyAdminDirectory() {
        return pharmacyAdminDirectory;
    }

    public void setPharmacyAdminDirectory(PharamacyAdminDirectory pharmacyAdminDirectory) {
        this.pharmacyAdminDirectory = pharmacyAdminDirectory;
    }
    DeliveryManDirectory deliveryManDirectory;
    PharamacyAdminDirectory pharmacyAdminDirectory;
    EcoSystem system;

    public DoctorDirectory getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(DoctorDirectory doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }

    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }

    public void setPatientDirectory(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
    }
     public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public InsuranceAdminDirectory getInsuranceAdminDirectory() {
        return insuranceAdminDirectory;
    }

    public void setInsuranceAdminDirectory(InsuranceAdminDirectory insuranceAdminDirectory) {
        this.insuranceAdminDirectory = insuranceAdminDirectory;
    }
    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public LabDirectory getLabDirectory() {
        return labDirectory;
    }

    public void setLabDirectory(LabDirectory labDirectory) {
        this.labDirectory = labDirectory;
    }

    public EmergencyDirectory getEmergencyDirectory() {
        return emergencyDirectory;
    }

    public void setEmergencyDirectory(EmergencyDirectory emergencyDirectory) {
        this.emergencyDirectory = emergencyDirectory;
    }

    public SupplierDirectory getSupplierDirectory() {
        return supplierDirectory;
    }

    public void setSupplierDirectory(SupplierDirectory supplierDirectory) {
        this.supplierDirectory = supplierDirectory;
    }
    
    
    
    
    
     public Organization findOrganization(String name){
        
         
         for(Organization net : organizationList){
             if(net.getName().equals(name)){
                 return net;
             }
         }
         return null;
     }
     public void deleteOrganization(Organization name){
          System.out.println("orggg"+name);
          for(int i=0;i<organizationList.size();i++){
              if(organizationList.get(i).getName().equals(name.getName())){
                  organizationList.remove(i);
              }
          }
        
        
        
     }
      public ArrayList<Organization> findOrganizationType(Type type){
        
         
         for(Organization net : organizationList){
             if(net.getName().equals(Type.Doctor.getValue())){
                 ArrayList<Organization> array1 = new ArrayList<>();
                  array1.add(net);
                  return array1;
             }
         }
         return null;
     }
//      public Organization createPharmacyOrganization(String name,Type type){
//            Organization organization = null;
//           if (type.getValue().equals(Type.PharamacyAdmin.getValue())){
//            organization = new PharamacyAdmin();
//             organization.setName(name);
//             organization.setEnterpriseType1(type);
//             if(getPharmacyAdminDirectory()==null){
//             PharamacyAdminDirectory pharmacydirectory =new PharamacyAdminDirectory();
//            PharamacyAdmin pharmacy = new PharamacyAdmin();
//            ArrayList<PharamacyAdmin> pharlist = new ArrayList<>();
//            pharmacy.setName(name);
//            //pharmacy.getPharDir().setCatalog(cataloglist);
//            //pharmacy.setSpecialization(random);
//            pharlist.add(pharmacy);
//            pharmacydirectory.setPharmacyList(pharlist);
//            setPharmacyAdminDirectory(pharmacydirectory);
//            }else{
//                getPharmacyAdminDirectory().createPharmacy(name);
//            }
//            organizationList.add(organization);
//        }
//           return organization;
//      }
    public Organization createOrganization(String name,Type type,String random){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new Doctor();
            organization.setName(name);
            organization.setEnterpriseType1(type);
             if(getDoctorDirectory()==null){
             DoctorDirectory doctordirectory =new DoctorDirectory();
            Doctor doctor = new Doctor();
            ArrayList<Doctor> doclist = new ArrayList<>();
            doctor.setName(name);
            doctor.setSpecialization(random);
            doclist.add(doctor);
            doctordirectory.setDoctorList(doclist);
            setDoctorDirectory(doctordirectory);
            }else{
                getDoctorDirectory().createDoctor(name, random);
            }
            organizationList.add(organization);
            
        }
        else if (type.getValue().equals(Type.Patient.getValue())){
            organization = new Patient();
             organization.setName(name);
             organization.setEnterpriseType1(type);
              if(getPatientDirectory()==null){
             PatientDirectory paD =new PatientDirectory();
             Patient pa = new Patient();
            ArrayList<Patient> paList = new ArrayList<>();
            pa.setName(name);
            //doctor.setSpecialization(random);
            paList.add(pa);
            paD.setPatientList(paList);
            setPatientDirectory(paD);
            }else{
                getPatientDirectory().createPatient(name);
            }
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.DeliveryMan.getValue())){
            organization = new DeliveryMan();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            if(getDeliveryManDirectory()==null){
            DeliveryManDirectory deliverydirectory =new DeliveryManDirectory();
            DeliveryMan delivery = new DeliveryMan();
            ArrayList<DeliveryMan> dellist = new ArrayList<>();
            delivery.setDeliveryManName(name);
            //doctor.setSpecialization(random);
            dellist.add(delivery);
            deliverydirectory.setDeliveryList(dellist);
            setDeliveryManDirectory(deliverydirectory);
            }else{
                getDeliveryManDirectory().createDeliveryMan(name);
            }
            organizationList.add(organization);
        }
        
        else if (type.getValue().equals(Type.InsuranceAdmin.getValue())){
            organization = new InsuranceeAdmin();
             organization.setName(name);
             organization.setEnterpriseType1(type);
             if(getInsuranceAdminDirectory()==null){
            InsuranceAdminDirectory insdirectory =new InsuranceAdminDirectory();
            InsuranceeAdmin pharmacy = new InsuranceeAdmin();
            ArrayList<InsuranceeAdmin> inslist = new ArrayList<>();
            pharmacy.setName(name);
            //doctor.setSpecialization(random);
            inslist.add(pharmacy);
            insdirectory.setInsuranceList(inslist);
            setInsuranceAdminDirectory(insdirectory);
            }else{
                getInsuranceAdminDirectory().createInsuranceeAdmin(name);
            }
            organizationList.add(organization);
        }
//        else if (type.getValue().equals(Type.LabAdmin.getValue())){
//            organization = new DeliveryMan();
//             organization.setName(name);
//             organization.setEnterpriseType1(type);
//            organizationList.add(organization);
//        }
         else if (type.getValue().equals(Type.SupportAdmin.getValue())){
            organization = new DeliveryMan();
             organization.setName(name);
             organization.setEnterpriseType1(type);
            organizationList.add(organization);
        }
//         else if (type.getValue().equals(Type.VoluntaryAdmin.getValue())){
//            organization = new VoluntaryyAdmin();
//            organization.setEnterpriseType1(type);
//            organizationList.add(organization);
//        }
            else if (type.getValue().equals(Type.PharamacyAdmin.getValue())){
            organization = new PharamacyAdmin();
            organization.setName(name);
            organization.setEnterpriseType1(type);
            if(getPharmacyAdminDirectory()==null){
            PharamacyAdminDirectory pharmacydirectory =new PharamacyAdminDirectory();
            PharamacyAdmin pharmacy = new PharamacyAdmin();
            ArrayList<PharamacyAdmin> pharlist = new ArrayList<>();
            pharmacy.setName(name);
            //doctor.setSpecialization(random);
            pharlist.add(pharmacy);
            pharmacydirectory.setPharmacyList(pharlist);
            setPharmacyAdminDirectory(pharmacydirectory);
            }else{
                getPharmacyAdminDirectory().createPharmacy(name);
            }
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Type.LabAdmin.getValue())){
            organization = new Lab();
            organization.setName(name);
            organization.setEnterpriseType1(type);
             if(getLabDirectory()==null){
             LabDirectory labDirectory =new LabDirectory();
             Lab lab = new Lab();
            ArrayList<Lab> labList = new ArrayList<>();
            lab.setName(name);
            //doctor.setSpecialization(random);
            labList.add(lab);
            labDirectory.setLabList(labList);
            setLabDirectory(labDirectory);
            }else{
                getLabDirectory().createLab(name);
            }
            organizationList.add(organization);
            
        }
            else if (type.getValue().equals(Type.SupplierAdmin.getValue())){
            organization = new Supplier();
            organization.setName(name);
            organization.setEnterpriseType1(type);
             if(getSupplierDirectory()==null){
             SupplierDirectory supplierDirectory =new SupplierDirectory();
             Supplier supplier = new Supplier();
            ArrayList<Supplier> supplierList = new ArrayList<>();
            supplier.setName(name);
            //doctor.setSpecialization(random);
            supplierList.add(supplier);
            supplierDirectory.setSupplierDirectory(supplierList);
            setSupplierDirectory(supplierDirectory);
            }else{
                getSupplierDirectory().createSupplier(name);
            }
            organizationList.add(organization);
            
        }
            else if (type.getValue().equals(Type.EmergencyAdmin.getValue())){
            organization = new Emergency();
            organization.setName(name);
            organization.setEnterpriseType1(type);
             if(getEmergencyDirectory()==null){
             EmergencyDirectory emergencyDirectory =new EmergencyDirectory();
             Emergency emergency = new Emergency();
            ArrayList<Emergency> emergencyList = new ArrayList<>();
            emergency.setName(name);
            //doctor.setSpecialization(random);
            emergencyList.add(emergency);
            emergencyDirectory.setEmergencyUnitDirectory(emergencyList);
            setEmergencyDirectory(emergencyDirectory);
            }else{
                getEmergencyDirectory().createEmergencyUnit(name);
            }
            organizationList.add(organization);
            
        }
        return organization;
    }
}

