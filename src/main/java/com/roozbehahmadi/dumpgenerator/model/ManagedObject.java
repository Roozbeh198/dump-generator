package com.roozbehahmadi.dumpgenerator.model;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
public class ManagedObject {
    @XmlAttribute
    private String id;
    @XmlAttribute
    private String distName;
    @XmlAttribute
    private String version;
    @XmlAttribute(name = "class")
    private String classAttr;
    private List<P> p;
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getClassAttr() {
        return classAttr;
    }

    public void setClassAttr(String classAttr) {
        this.classAttr = classAttr;
    }

    public List<P> getP() {
        return p;
    }

    public void setP(List<P> p) {
        this.p = p;
    }
}
