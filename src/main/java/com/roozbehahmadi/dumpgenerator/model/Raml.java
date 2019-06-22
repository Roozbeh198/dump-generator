package com.roozbehahmadi.dumpgenerator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "raml")
@XmlAccessorType(XmlAccessType.FIELD)
public class Raml {
    private CmData cmData;

    public CmData getCmData() {
        return cmData;
    }

    public void setCmData(CmData cmData) {
        this.cmData = cmData;
    }
}
