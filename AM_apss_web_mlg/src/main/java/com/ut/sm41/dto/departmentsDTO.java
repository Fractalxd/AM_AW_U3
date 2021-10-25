package com.ut.sm41.dto;

public class departmentsDTO {

    String id;
    String name;
    String parent_id;
    String child_ids;
    String external_id;

    public departmentsDTO(){
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

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getChild_ids() {
        return child_ids;
    }

    public void setChild_ids(String child_ids) {
        this.child_ids = child_ids;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }
}
