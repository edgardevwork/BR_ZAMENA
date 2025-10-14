package org.apache.ivy.util;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Properties;

/* loaded from: classes8.dex */
public class EncryptedProperties extends Properties {
    @Override // java.util.Properties
    public synchronized Object setProperty(String str, String str2) {
        return StringUtils.decrypt((String) super.setProperty(str, StringUtils.encrypt(str2)));
    }

    @Override // java.util.Properties
    public String getProperty(String str) {
        return StringUtils.decrypt(super.getProperty(str));
    }

    @Override // java.util.Properties
    public String getProperty(String str, String str2) {
        return StringUtils.decrypt(super.getProperty(str, StringUtils.encrypt(str2)));
    }

    @Override // java.util.Hashtable, java.util.Map
    public boolean containsValue(Object obj) {
        return super.containsValue(StringUtils.encrypt((String) obj));
    }

    @Override // java.util.Hashtable
    public synchronized boolean contains(Object obj) {
        return super.contains(StringUtils.encrypt((String) obj));
    }

    @Override // java.util.Hashtable, java.util.Map
    public Collection<Object> values() {
        LinkedList linkedList = new LinkedList(super.values());
        for (Object obj : linkedList) {
            linkedList.set(linkedList.indexOf(obj), StringUtils.decrypt((String) obj));
        }
        return linkedList;
    }
}
