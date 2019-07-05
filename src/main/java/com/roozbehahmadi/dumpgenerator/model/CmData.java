package com.roozbehahmadi.dumpgenerator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class CmData {
    @XmlAttribute
    private String type;
    private Object header;
    private List<ManagedObject> managedObject;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getHeader() {
        return header;
    }

    public void setHeader(Object header) {
        this.header = header;
    }

    public List<ManagedObject> getManagedObject() {
        return managedObject;
    }

    public void setManagedObject(List<ManagedObject> managedObject) {
        this.managedObject = managedObject;
    }
}
