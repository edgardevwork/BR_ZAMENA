package com.thoughtworks.xstream.converters.enums;

import com.thoughtworks.xstream.InitializationException;
import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class EnumToStringConverter<T extends Enum<T>> extends AbstractSingleValueConverter {
    public final Class<T> enumType;
    public final Map<String, T> strings;
    public final EnumMap<T, String> values;

    public EnumToStringConverter(Class<T> cls) {
        this(cls, extractStringMap(cls), null);
    }

    public EnumToStringConverter(Class<T> cls, Map<String, T> map) {
        this(cls, map, buildValueMap(cls, map));
    }

    public EnumToStringConverter(Class<T> cls, Map<String, T> map, EnumMap<T, String> enumMap) {
        this.enumType = cls;
        this.strings = map;
        this.values = enumMap;
    }

    public static <T extends Enum<T>> Map<String, T> extractStringMap(Class<T> cls) {
        checkType(cls);
        EnumSet enumSetAllOf = EnumSet.allOf(cls);
        HashMap map = new HashMap(enumSetAllOf.size());
        Iterator it = enumSetAllOf.iterator();
        while (it.hasNext()) {
            Enum r2 = (Enum) it.next();
            if (map.put(r2.toString(), r2) != null) {
                throw new InitializationException("Enum type " + cls.getName() + " does not have unique string representations for its values");
            }
        }
        return map;
    }

    public static <T> void checkType(Class<T> cls) {
        if (!Enum.class.isAssignableFrom(cls) && cls != Enum.class) {
            throw new InitializationException("Converter can only handle enum types");
        }
    }

    public static <T extends Enum<T>> EnumMap<T, String> buildValueMap(Class<T> cls, Map<String, T> map) {
        EnumMap<T, String> enumMap = new EnumMap<>(cls);
        for (Map.Entry<String, T> entry : map.entrySet()) {
            enumMap.put((EnumMap<T, String>) entry.getValue(), (T) entry.getKey());
        }
        return enumMap;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls != null && this.enumType.isAssignableFrom(cls);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        Enum r2 = (Enum) Enum.class.cast(obj);
        EnumMap<T, String> enumMap = this.values;
        return enumMap == null ? r2.toString() : enumMap.get(r2);
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        if (str == null) {
            return null;
        }
        T t = this.strings.get(str);
        if (t != null) {
            return t;
        }
        ConversionException conversionException = new ConversionException("Invalid string representation for enum type");
        conversionException.add("enum-type", this.enumType.getName());
        conversionException.add("enum-string", str);
        throw conversionException;
    }
}
