package com.ut.sm41.dto;

public class OpeningsDTO {

    String id;
    String opening_id;
    String status;
    String opened_at;
    String closed_at;
    String application_id;
    String close_reason;

    public OpeningsDTO(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOpening_id() {
        return opening_id;
    }

    public void setOpening_id(String opening_id) {
        this.opening_id = opening_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getOpened_at() {
        return opened_at;
    }

    public void setOpened_at(String opened_at) {
        this.opened_at = opened_at;
    }

    public String getClosed_at() {
        return closed_at;
    }

    public void setClosed_at(String closed_at) {
        this.closed_at = closed_at;
    }

    public String getApplication_id() {
        return application_id;
    }

    public void setApplication_id(String application_id) {
        this.application_id = application_id;
    }

    public String getClose_reason() {
        return close_reason;
    }

    public void setClose_reason(String close_reason) {
        this.close_reason = close_reason;
    }
}
