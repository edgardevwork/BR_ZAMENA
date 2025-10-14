package com.thoughtworks.xstream.mapper;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public abstract class AbstractAttributeAliasingMapper extends MapperWrapper {
    public final Map aliasToName;
    public transient Map nameToAlias;

    public AbstractAttributeAliasingMapper(Mapper mapper) {
        super(mapper);
        this.aliasToName = new HashMap();
        this.nameToAlias = new HashMap();
    }

    public void addAliasFor(String str, String str2) {
        this.aliasToName.put(str2, str);
        this.nameToAlias.put(str, str2);
    }

    public Object readResolve() {
        this.nameToAlias = new HashMap();
        for (Object obj : this.aliasToName.keySet()) {
            this.nameToAlias.put(this.aliasToName.get(obj), obj);
        }
        return this;
    }
}
