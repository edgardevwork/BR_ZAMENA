package com.thoughtworks.xstream.converters.basic;

import org.apache.commons.lang3.BooleanUtils;

/* loaded from: classes5.dex */
public class BooleanConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$java$lang$Boolean;
    public final boolean caseSensitive;
    public final String negative;
    public final String positive;
    public static final BooleanConverter TRUE_FALSE = new BooleanConverter("true", "false", false);
    public static final BooleanConverter YES_NO = new BooleanConverter(BooleanUtils.YES, "no", false);
    public static final BooleanConverter BINARY = new BooleanConverter("1", "0", true);

    public boolean shouldConvert(Class cls, Object obj) {
        return true;
    }

    public BooleanConverter(String str, String str2, boolean z) {
        this.positive = str;
        this.negative = str2;
        this.caseSensitive = z;
    }

    public BooleanConverter() {
        this("true", "false", false);
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
        if (cls != Boolean.TYPE) {
            Class clsClass$ = class$java$lang$Boolean;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Boolean");
                class$java$lang$Boolean = clsClass$;
            }
            if (cls != clsClass$) {
                return false;
            }
        }
        return true;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return this.caseSensitive ? this.positive.equals(str) ? Boolean.TRUE : Boolean.FALSE : this.positive.equalsIgnoreCase(str) ? Boolean.TRUE : Boolean.FALSE;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        Boolean bool = (Boolean) obj;
        if (obj == null) {
            return null;
        }
        return bool.booleanValue() ? this.positive : this.negative;
    }
}
