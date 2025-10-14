package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.core.Caching;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes8.dex */
public class OuterClassMapper extends MapperWrapper implements Caching {
    public static final String[] EMPTY_NAMES = new String[0];
    public static /* synthetic */ Class class$java$lang$Object;
    public final String alias;
    public final Map innerFields;

    public OuterClassMapper(Mapper mapper) {
        this(mapper, "outer-class");
    }

    public OuterClassMapper(Mapper mapper, String str) throws Throwable {
        super(mapper);
        this.alias = str;
        Map mapSynchronizedMap = Collections.synchronizedMap(new HashMap());
        this.innerFields = mapSynchronizedMap;
        Class clsClass$ = class$java$lang$Object;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Object");
            class$java$lang$Object = clsClass$;
        }
        mapSynchronizedMap.put(clsClass$.getName(), EMPTY_NAMES);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedMember(Class cls, String str) {
        if (str.startsWith("this$")) {
            String[] innerFieldNames = getInnerFieldNames(cls);
            for (int i = 0; i < innerFieldNames.length; i++) {
                if (innerFieldNames[i].equals(str)) {
                    if (i == 0) {
                        return this.alias;
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(this.alias);
                    stringBuffer.append('-');
                    stringBuffer.append(i);
                    return stringBuffer.toString();
                }
            }
        }
        return super.serializedMember(cls, str);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String realMember(Class cls, String str) {
        int iIntValue;
        if (str.startsWith(this.alias)) {
            int length = this.alias.length();
            if (length == str.length()) {
                iIntValue = 0;
            } else {
                int i = length + 1;
                iIntValue = (str.length() <= i || str.charAt(length) != '-') ? -1 : Integer.valueOf(str.substring(i)).intValue();
            }
            if (iIntValue >= 0) {
                String[] innerFieldNames = getInnerFieldNames(cls);
                if (iIntValue < innerFieldNames.length) {
                    return innerFieldNames[iIntValue];
                }
            }
        }
        return super.realMember(cls, str);
    }

    public final String[] getInnerFieldNames(Class cls) {
        String[] innerFieldNames = (String[]) this.innerFields.get(cls.getName());
        if (innerFieldNames == null) {
            innerFieldNames = getInnerFieldNames(cls.getSuperclass());
            for (Field field : cls.getDeclaredFields()) {
                if (field.getName().startsWith("this$")) {
                    int length = innerFieldNames.length;
                    String[] strArr = new String[length + 1];
                    System.arraycopy(innerFieldNames, 0, strArr, 0, innerFieldNames.length);
                    strArr[length] = field.getName();
                    innerFieldNames = strArr;
                }
            }
            this.innerFields.put(cls.getName(), innerFieldNames);
        }
        return innerFieldNames;
    }

    @Override // com.thoughtworks.xstream.core.Caching
    public void flushCache() throws Throwable {
        Set setKeySet = this.innerFields.keySet();
        Class clsClass$ = class$java$lang$Object;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Object");
            class$java$lang$Object = clsClass$;
        }
        setKeySet.retainAll(Collections.singletonList(clsClass$.getName()));
    }
}
