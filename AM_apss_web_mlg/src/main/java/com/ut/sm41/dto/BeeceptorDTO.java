package com.ut.sm41.dto;

public class BeeceptorDTO {

    String status;
    String code;
    String message;
    Temp_jobDTO temp_jobDTO;
    hiringDTO hiringDTO;
    departmentsDTO departmentsDTO;
    OfficesDTO officesDTO;
    hiring_managersDTO hiring_managersDTO;
    RecruitersDTO recruitersDTO;
    CoordinatorsDTO coordinatorsDTO;
    SourcersDTO sourcersDTO;
    OpeningsDTO openingsDTO;

    public BeeceptorDTO() {
    }

    public Temp_jobDTO getTemp_jobDTO() {
        return temp_jobDTO;
    }

    public void setTemp_jobDTO(Temp_jobDTO temp_jobDTO) {
        this.temp_jobDTO = temp_jobDTO;
    }

    public com.ut.sm41.dto.hiringDTO getHiringDTO() {
        return hiringDTO;
    }

    public void setHiringDTO(com.ut.sm41.dto.hiringDTO hiringDTO) {
        this.hiringDTO = hiringDTO;
    }

    public com.ut.sm41.dto.departmentsDTO getDepartmentsDTO() {
        return departmentsDTO;
    }

    public void setDepartmentsDTO(com.ut.sm41.dto.departmentsDTO departmentsDTO) {
        this.departmentsDTO = departmentsDTO;
    }

    public OfficesDTO getOfficesDTO() {
        return officesDTO;
    }

    public void setOfficesDTO(OfficesDTO officesDTO) {
        this.officesDTO = officesDTO;
    }

    public com.ut.sm41.dto.hiring_managersDTO getHiring_managersDTO() {
        return hiring_managersDTO;
    }

    public void setHiring_managersDTO(com.ut.sm41.dto.hiring_managersDTO hiring_managersDTO) {
        this.hiring_managersDTO = hiring_managersDTO;
    }

    public RecruitersDTO getRecruitersDTO() {
        return recruitersDTO;
    }

    public void setRecruitersDTO(RecruitersDTO recruitersDTO) {
        this.recruitersDTO = recruitersDTO;
    }

    public CoordinatorsDTO getCoordinatorsDTO() {
        return coordinatorsDTO;
    }

    public void setCoordinatorsDTO(CoordinatorsDTO coordinatorsDTO) {
        this.coordinatorsDTO = coordinatorsDTO;
    }

    public SourcersDTO getSourcersDTO() {
        return sourcersDTO;
    }

    public void setSourcersDTO(SourcersDTO sourcersDTO) {
        this.sourcersDTO = sourcersDTO;
    }

    public OpeningsDTO getOpeningsDTO() {
        return openingsDTO;
    }

    public void setOpeningsDTO(OpeningsDTO openingsDTO) {
        this.openingsDTO = openingsDTO;
    }

    /*public ExampleDTO getExampleDTO() {
        return exampleDTO;
    }

    public void setExampleDTO(ExampleDTO exampleDTO) {
        this.exampleDTO = exampleDTO;
    }*/

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "status='" + status + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }

    public String toJson() {
        return "{" +
                "\"status\":\"" + status + "\"," +
                " \"code\":\"" + code + "\"," +
                " \"message\":\"" + message +"\""+
                '}';
    }
}
