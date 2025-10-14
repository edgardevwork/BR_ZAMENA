package com.thoughtworks.xstream.mapper;

import com.thoughtworks.xstream.InitializationException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class DefaultImplementationsMapper extends MapperWrapper {
    public static /* synthetic */ Class class$com$thoughtworks$xstream$mapper$Mapper$Null;
    public static /* synthetic */ Class class$java$lang$Boolean;
    public static /* synthetic */ Class class$java$lang$Byte;
    public static /* synthetic */ Class class$java$lang$Character;
    public static /* synthetic */ Class class$java$lang$Double;
    public static /* synthetic */ Class class$java$lang$Float;
    public static /* synthetic */ Class class$java$lang$Integer;
    public static /* synthetic */ Class class$java$lang$Long;
    public static /* synthetic */ Class class$java$lang$Short;
    public transient Map implToType;
    public final Map typeToImpl;

    public DefaultImplementationsMapper(Mapper mapper) throws Throwable {
        super(mapper);
        this.typeToImpl = new HashMap();
        this.implToType = new HashMap();
        addDefaults();
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public void addDefaults() throws Throwable {
        Class clsClass$ = class$com$thoughtworks$xstream$mapper$Mapper$Null;
        if (clsClass$ == null) {
            clsClass$ = class$("com.thoughtworks.xstream.mapper.Mapper$Null");
            class$com$thoughtworks$xstream$mapper$Mapper$Null = clsClass$;
        }
        addDefaultImplementation(null, clsClass$);
        Class clsClass$2 = class$java$lang$Boolean;
        if (clsClass$2 == null) {
            clsClass$2 = class$("java.lang.Boolean");
            class$java$lang$Boolean = clsClass$2;
        }
        addDefaultImplementation(clsClass$2, Boolean.TYPE);
        Class clsClass$3 = class$java$lang$Character;
        if (clsClass$3 == null) {
            clsClass$3 = class$("java.lang.Character");
            class$java$lang$Character = clsClass$3;
        }
        addDefaultImplementation(clsClass$3, Character.TYPE);
        Class clsClass$4 = class$java$lang$Integer;
        if (clsClass$4 == null) {
            clsClass$4 = class$("java.lang.Integer");
            class$java$lang$Integer = clsClass$4;
        }
        addDefaultImplementation(clsClass$4, Integer.TYPE);
        Class clsClass$5 = class$java$lang$Float;
        if (clsClass$5 == null) {
            clsClass$5 = class$("java.lang.Float");
            class$java$lang$Float = clsClass$5;
        }
        addDefaultImplementation(clsClass$5, Float.TYPE);
        Class clsClass$6 = class$java$lang$Double;
        if (clsClass$6 == null) {
            clsClass$6 = class$("java.lang.Double");
            class$java$lang$Double = clsClass$6;
        }
        addDefaultImplementation(clsClass$6, Double.TYPE);
        Class clsClass$7 = class$java$lang$Short;
        if (clsClass$7 == null) {
            clsClass$7 = class$("java.lang.Short");
            class$java$lang$Short = clsClass$7;
        }
        addDefaultImplementation(clsClass$7, Short.TYPE);
        Class clsClass$8 = class$java$lang$Byte;
        if (clsClass$8 == null) {
            clsClass$8 = class$("java.lang.Byte");
            class$java$lang$Byte = clsClass$8;
        }
        addDefaultImplementation(clsClass$8, Byte.TYPE);
        Class clsClass$9 = class$java$lang$Long;
        if (clsClass$9 == null) {
            clsClass$9 = class$("java.lang.Long");
            class$java$lang$Long = clsClass$9;
        }
        addDefaultImplementation(clsClass$9, Long.TYPE);
    }

    public void addDefaultImplementation(Class cls, Class cls2) {
        if (cls != null && cls.isInterface()) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Default implementation is not a concrete class: ");
            stringBuffer.append(cls.getName());
            throw new InitializationException(stringBuffer.toString());
        }
        this.typeToImpl.put(cls2, cls);
        this.implToType.put(cls, cls2);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public String serializedClass(Class cls) {
        Class cls2 = (Class) this.implToType.get(cls);
        return cls2 == null ? super.serializedClass(cls) : super.serializedClass(cls2);
    }

    @Override // com.thoughtworks.xstream.mapper.MapperWrapper, com.thoughtworks.xstream.mapper.Mapper
    public Class defaultImplementationOf(Class cls) {
        if (this.typeToImpl.containsKey(cls)) {
            return (Class) this.typeToImpl.get(cls);
        }
        return super.defaultImplementationOf(cls);
    }

    private Object readResolve() {
        this.implToType = new HashMap();
        for (Object obj : this.typeToImpl.keySet()) {
            this.implToType.put(this.typeToImpl.get(obj), obj);
        }
        return this;
    }
}
