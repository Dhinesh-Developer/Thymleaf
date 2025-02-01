package com.dk.Lib.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="e_id")
    private int eId;
    @Column(name="e_name")
    private String eName;
    @Column(name="e_email")
    private String eEmail;
    @Column(name="e_role")
    private String eRole;
    @Column(name="e_salary")
    private String eSalary;

    public Employee(int eId, String eName, String eEmail, String eRole, String eSalary) {
        this.eId = eId;
        this.eName = eName;
        this.eEmail = eEmail;
        this.eRole = eRole;
        this.eSalary = eSalary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String geteEmail() {
        return eEmail;
    }

    public void seteEmail(String eEmail) {
        this.eEmail = eEmail;
    }

    public String geteRole() {
        return eRole;
    }

    public void seteRole(String eRole) {
        this.eRole = eRole;
    }

    public String geteSalary() {
        return eSalary;
    }

    public void seteSalary(String eSalary) {
        this.eSalary = eSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eEmail='" + eEmail + '\'' +
                ", eRole='" + eRole + '\'' +
                ", eSalary='" + eSalary + '\'' +
                '}';
    }

    public Employee() {
    }

    public Employee(String eName, String eEmail, String eSalary, String eRole) {
        this.eName = eName;
        this.eEmail = eEmail;
        this.eSalary = eSalary;
        this.eRole = eRole;
    }
}
