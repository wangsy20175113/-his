package com.neuedu.hospitalbackend.model.vo;

/**
 * 检查检验项目
 */
public class ProjectPatientParam {

    private Integer projectType; //1.检查 2.检验 3.处置
    private Integer departmentId; //部门id
    private Integer caseId;
    private String patientName;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
}