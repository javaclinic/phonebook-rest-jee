package com.javaclinic.phonebook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="entries")
@XmlRootElement(name="entry")
@XmlAccessorType(XmlAccessType.NONE)
public class PhonebookEntry {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @XmlElement
    private Integer id;

    @XmlElement
    private String name;

    @XmlElement
    private String number;

    @XmlElement
    private String note;

    public PhonebookEntry() {
    }

    public PhonebookEntry(Integer id, String name, String number, String note) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.note = note;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return String.format("PhonebookEntry [id=%s, name=%s, number=%s, note=%s]", id, name, number, note);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((note == null) ? 0 : note.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;

        PhonebookEntry other = (PhonebookEntry) object;

        if (id == null) {
            if (other.id != null) return false;
        } else if (!id.equals(other.id)) {
            return false;
        }

        if (name == null) {
            if (other.name != null) return false;
        } else if (!name.equals(other.name)) {
            return false;
        }

        if (note == null) {
            if (other.note != null) return false;
        } else if (!note.equals(other.note)) {
            return false;
        }

        if (number == null) {
            if (other.number != null) return false;
        } else if (!number.equals(other.number)) {
            return false;
        }

        return true;

    }

}
