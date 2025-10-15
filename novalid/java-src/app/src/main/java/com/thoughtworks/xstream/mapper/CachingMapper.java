package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.XStreamException;
import com.thoughtworks.xstream.core.Caching;
import com.thoughtworks.xstream.security.ForbiddenClassException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class CachingMapper extends MapperWrapper implements Caching {
    public transient Map realClassCache;

    public CachingMapper(Mapper mapper) {
        super(mapper);
        readResolve();
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class realClass(String str) {
        Object obj = this.realClassCache.get(str);
        if (obj != null) {
            if (obj instanceof Class) {
                return (Class) obj;
            }
            throw ((XStreamException) obj);
        }
        try {
            Class clsRealClass = super.realClass(str);
            this.realClassCache.put(str, clsRealClass);
            return clsRealClass;
        } catch (CannotResolveClassException e) {
            this.realClassCache.put(str, e);
            throw e;
        } catch (ForbiddenClassException e2) {
            this.realClassCache.put(str, e2);
            throw e2;
        }
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() {
        this.realClassCache.clear();
    }

    private Object readResolve() {
        this.realClassCache = Collections.synchronizedMap(new HashMap(128));
        return this;
    }
}
