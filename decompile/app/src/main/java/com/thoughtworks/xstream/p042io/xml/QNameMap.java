package com.thoughtworks.xstream.p042io.xml;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;

/* loaded from: classes5.dex */
public class QNameMap {
    public Map javaToQName;
    public Map qnameToJava;
    public String defaultPrefix = "";
    public String defaultNamespace = "";

    public String getJavaClassName(QName qName) {
        String str;
        Map map = this.qnameToJava;
        return (map == null || (str = (String) map.get(qName)) == null) ? qName.getLocalPart() : str;
    }

    public QName getQName(String str) {
        QName qName;
        Map map = this.javaToQName;
        return (map == null || (qName = (QName) map.get(str)) == null) ? new QName(this.defaultNamespace, str, this.defaultPrefix) : qName;
    }

    public synchronized void registerMapping(QName qName, String str) {
        try {
            if (this.javaToQName == null) {
                this.javaToQName = Collections.synchronizedMap(new HashMap());
            }
            if (this.qnameToJava == null) {
                this.qnameToJava = Collections.synchronizedMap(new HashMap());
            }
            this.javaToQName.put(str, qName);
            this.qnameToJava.put(qName, str);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void registerMapping(QName qName, Class cls) {
        registerMapping(qName, cls.getName());
    }

    public String getDefaultNamespace() {
        return this.defaultNamespace;
    }

    public void setDefaultNamespace(String str) {
        this.defaultNamespace = str;
    }

    public String getDefaultPrefix() {
        return this.defaultPrefix;
    }

    public void setDefaultPrefix(String str) {
        this.defaultPrefix = str;
    }
}
