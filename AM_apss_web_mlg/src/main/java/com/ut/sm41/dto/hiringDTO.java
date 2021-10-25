package com.ut.sm41.dto;

public class hiringDTO {

    String id;
    String name;
    String requisition_id;
    String notes;
    String confidential;
    String status;
    String is_template;
    String copied_from_id;
    String created_at;
    String opened_at;
    String updated_at;
    String closed_at;

    public hiringDTO(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRequisition_id() {
        return requisition_id;
    }

    public void setRequisition_id(String requisition_id) {
        this.requisition_id = requisition_id;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getConfidential() {
        return confidential;
    }

    public void setConfidential(String confidential) {
        this.confidential = confidential;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getIs_template() {
        return is_template;
    }

    public void setIs_template(String is_template) {
        this.is_template = is_template;
    }

    public String getCopied_from_id() {
        return copied_from_id;
    }

    public void setCopied_from_id(String copied_from_id) {
        this.copied_from_id = copied_from_id;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getOpened_at() {
        return opened_at;
    }

    public void setOpened_at(String opened_at) {
        this.opened_at = opened_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }
}
