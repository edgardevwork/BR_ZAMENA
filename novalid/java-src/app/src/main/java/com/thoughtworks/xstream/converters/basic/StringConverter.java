package com.thoughtworks.xstream.converters.basic;

import com.thoughtworks.xstream.core.util.WeakCache;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public class StringConverter extends AbstractSingleValueConverter {
    public static final int LENGTH_LIMIT = 38;
    public static /* synthetic */ Class class$java$lang$String;
    public final Map cache;
    public final int lengthLimit;

    public StringConverter(Map map, int i) {
        this.cache = map;
        this.lengthLimit = i;
    }

    public StringConverter(Map map) {
        this(map, 38);
    }

    public StringConverter(int i) {
        this(Collections.synchronizedMap(new WeakCache()), i);
    }

    public StringConverter() {
        this(38);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$lang$String;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.String");
            class$java$lang$String = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        if (this.cache == null || str == null) {
            return str;
        }
        if (this.lengthLimit >= 0 && str.length() > this.lengthLimit) {
            return str;
        }
        String str2 = (String) this.cache.get(str);
        if (str2 != null) {
            return str2;
        }
        this.cache.put(str, str);
        return str;
    }
}
