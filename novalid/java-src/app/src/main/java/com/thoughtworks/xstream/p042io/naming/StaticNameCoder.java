package com.thoughtworks.xstream.p042io.naming;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class StaticNameCoder implements NameCoder {
    public transient Map attribute2Java;
    public final Map java2Attribute;
    public final Map java2Node;
    public transient Map node2Java;

    public StaticNameCoder(Map map, Map map2) {
        HashMap map3 = new HashMap(map);
        this.java2Node = map3;
        if (map == map2 || map2 == null) {
            this.java2Attribute = map3;
        } else {
            this.java2Attribute = new HashMap(map2);
        }
        readResolve();
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeAttribute(String str) {
        String str2 = (String) this.attribute2Java.get(str);
        return str2 == null ? str : str2;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String decodeNode(String str) {
        String str2 = (String) this.node2Java.get(str);
        return str2 == null ? str : str2;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeAttribute(String str) {
        String str2 = (String) this.java2Attribute.get(str);
        return str2 == null ? str : str2;
    }

    @Override // com.thoughtworks.xstream.p042io.naming.NameCoder
    public String encodeNode(String str) {
        String str2 = (String) this.java2Node.get(str);
        return str2 == null ? str : str2;
    }

    public final Object readResolve() {
        Map mapInvertMap = invertMap(this.java2Node);
        this.node2Java = mapInvertMap;
        Map map = this.java2Node;
        Map map2 = this.java2Attribute;
        if (map == map2) {
            this.attribute2Java = mapInvertMap;
        } else {
            this.attribute2Java = invertMap(map2);
        }
        return this;
    }

    public final Map invertMap(Map map) {
        HashMap map2 = new HashMap(map.size());
        for (Map.Entry entry : map.entrySet()) {
            map2.put((String) entry.getValue(), (String) entry.getKey());
        }
        return map2;
    }
}
