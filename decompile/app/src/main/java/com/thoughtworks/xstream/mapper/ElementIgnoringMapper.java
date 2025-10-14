package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.core.util.FastField;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ElementIgnoringMapper extends MapperWrapper {
    public static /* synthetic */ Class class$java$lang$Object;
    public final Set fieldsToOmit;
    public final Set unknownElementsToIgnore;

    public ElementIgnoringMapper(Mapper mapper) {
        super(mapper);
        this.fieldsToOmit = new HashSet();
        this.unknownElementsToIgnore = new LinkedHashSet();
    }

    public void addElementsToIgnore(Pattern pattern) {
        this.unknownElementsToIgnore.add(pattern);
    }

    public void omitField(Class cls, String str) {
        this.fieldsToOmit.add(key(cls, str));
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public boolean shouldSerializeMember(Class cls, String str) throws Throwable {
        if (this.fieldsToOmit.contains(key(cls, str))) {
            return false;
        }
        Class clsClass$ = class$java$lang$Object;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Object");
            class$java$lang$Object = clsClass$;
        }
        if (cls == clsClass$ && isIgnoredElement(str)) {
            return false;
        }
        return super.shouldSerializeMember(cls, str);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public boolean isIgnoredElement(String str) {
        if (!this.unknownElementsToIgnore.isEmpty()) {
            Iterator it = this.unknownElementsToIgnore.iterator();
            while (it.hasNext()) {
                if (((Pattern) it.next()).matcher(str).matches()) {
                    return true;
                }
            }
        }
        return super.isIgnoredElement(str);
    }

    public final Object key(Class cls, String str) {
        return new FastField(cls, str);
    }
}
