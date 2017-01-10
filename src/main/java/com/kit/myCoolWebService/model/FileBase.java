package com.kit.myCoolWebService.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(schema = "filestorage")
public class FileBase extends AbstractEntity<Long> {

    @Column(name = "name")
    private String firstName;

    @Column(name = "text")
    private String text;

    @Column(name = "date_create")
    private Date date_create;

    public String getFirstName() {
        return firstName;
    }

    public String getText() {
        return text;
    }

    public Date getDate_create() {
        return date_create;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setDate_create(Date date_create) {
        this.date_create = date_create;
    }
}
