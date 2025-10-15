package com.thoughtworks.xstream.converters.reflection;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.core.util.Fields;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.AttributedCharacterIterator;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class AbstractAttributedCharacterIteratorAttributeConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$java$text$AttributedCharacterIterator$Attribute;
    public static /* synthetic */ Class class$java$util$Map;
    public static final Map instanceMaps = Collections.synchronizedMap(new HashMap());
    public final Class type;

    public AbstractAttributedCharacterIteratorAttributeConverter(Class cls) throws Throwable {
        Class clsClass$ = class$java$text$AttributedCharacterIterator$Attribute;
        if (clsClass$ == null) {
            clsClass$ = class$("java.text.AttributedCharacterIterator$Attribute");
            class$java$text$AttributedCharacterIterator$Attribute = clsClass$;
        }
        if (!clsClass$.isAssignableFrom(cls)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(cls.getName());
            stringBuffer.append(" is not a ");
            Class clsClass$2 = class$java$text$AttributedCharacterIterator$Attribute;
            if (clsClass$2 == null) {
                clsClass$2 = class$("java.text.AttributedCharacterIterator$Attribute");
                class$java$text$AttributedCharacterIterator$Attribute = clsClass$2;
            }
            stringBuffer.append(clsClass$2.getName());
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        this.type = cls;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == this.type && !getAttributeMap().isEmpty();
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return getName((AttributedCharacterIterator.Attribute) obj);
    }

    public final String getName(AttributedCharacterIterator.Attribute attribute) {
        Throwable th = null;
        if (Reflections.getName != null) {
            try {
                return (String) Reflections.getName.invoke(attribute, null);
            } catch (IllegalAccessException | InvocationTargetException e) {
                th = e;
            }
        }
        String string = attribute.toString();
        String name = attribute.getClass().getName();
        if (string.startsWith(name)) {
            return string.substring(name.length() + 1, string.length() - 1);
        }
        ConversionException conversionException = new ConversionException("Cannot find name of attribute", th);
        conversionException.add("attribute-type", name);
        throw conversionException;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        Object obj = getAttributeMap().get(str);
        if (obj != null) {
            return obj;
        }
        ConversionException conversionException = new ConversionException("Cannot find attribute");
        conversionException.add("attribute-type", this.type.getName());
        conversionException.add("attribute-name", str);
        throw conversionException;
    }

    public final Map getAttributeMap() throws Throwable {
        Map map = instanceMaps;
        Map map2 = (Map) map.get(this.type.getName());
        if (map2 != null) {
            return map2;
        }
        Map mapBuildAttributeMap = buildAttributeMap();
        map.put(this.type.getName(), mapBuildAttributeMap);
        return mapBuildAttributeMap;
    }

    public final Map buildAttributeMap() throws Throwable {
        boolean z;
        HashMap map = new HashMap();
        Class cls = this.type;
        Class clsClass$ = class$java$util$Map;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.Map");
            class$java$util$Map = clsClass$;
        }
        Field fieldLocate = Fields.locate(cls, clsClass$, true);
        if (fieldLocate != null) {
            try {
                Map map2 = (Map) Fields.read(fieldLocate, null);
                if (map2 != null) {
                    Iterator it = map2.entrySet().iterator();
                    loop1: while (true) {
                        while (z && it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            Class<?> cls2 = entry.getKey().getClass();
                            Class<?> clsClass$2 = class$java$lang$String;
                            if (clsClass$2 == null) {
                                clsClass$2 = class$("java.lang.String");
                                class$java$lang$String = clsClass$2;
                            }
                            z = cls2 == clsClass$2 && entry.getValue().getClass() == this.type;
                        }
                    }
                    if (z) {
                        map.putAll(map2);
                    }
                }
            } catch (ObjectAccessException unused) {
            }
        }
        if (map.isEmpty()) {
            try {
                Field[] declaredFields = this.type.getDeclaredFields();
                for (int i = 0; i < declaredFields.length; i++) {
                    if ((declaredFields[i].getType() == this.type) == Modifier.isStatic(declaredFields[i].getModifiers())) {
                        AttributedCharacterIterator.Attribute attribute = (AttributedCharacterIterator.Attribute) Fields.read(declaredFields[i], null);
                        map.put(toString(attribute), attribute);
                    }
                }
            } catch (ObjectAccessException unused2) {
                map.clear();
            } catch (NoClassDefFoundError unused3) {
                map.clear();
            } catch (SecurityException unused4) {
                map.clear();
            }
        }
        return map;
    }

    /* loaded from: classes5.dex */
    public static class Reflections {
        public static final Method getName;

        static {
            Method declaredMethod = null;
            try {
                Class clsClass$ = AbstractAttributedCharacterIteratorAttributeConverter.class$java$text$AttributedCharacterIterator$Attribute;
                if (clsClass$ == null) {
                    clsClass$ = AbstractAttributedCharacterIteratorAttributeConverter.class$("java.text.AttributedCharacterIterator$Attribute");
                    AbstractAttributedCharacterIteratorAttributeConverter.class$java$text$AttributedCharacterIterator$Attribute = clsClass$;
                }
                declaredMethod = clsClass$.getDeclaredMethod("getName", null);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
            } catch (NoSuchMethodException | SecurityException unused) {
            }
            getName = declaredMethod;
        }
    }
}
