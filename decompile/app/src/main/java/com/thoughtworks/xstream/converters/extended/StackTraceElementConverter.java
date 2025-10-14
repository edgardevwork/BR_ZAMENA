package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import com.thoughtworks.xstream.core.JVM;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes7.dex */
public class StackTraceElementConverter extends AbstractSingleValueConverter {
    public static final StackTraceElementFactory FACTORY;
    public static final Pattern PATTERN = Pattern.compile("^(.+)\\.([^\\(]+)\\(([^:]*)(:(\\d+))?\\)$");
    public static /* synthetic */ Class class$java$lang$StackTraceElement;

    static {
        StackTraceElementFactory stackTraceElementFactory;
        StackTraceElementFactory stackTraceElementFactory2 = null;
        if (JVM.isVersion(5)) {
            try {
                stackTraceElementFactory = (StackTraceElementFactory) JVM.loadClassForName("com.thoughtworks.xstream.converters.extended.StackTraceElementFactory15", false).newInstance();
            } catch (Exception | LinkageError unused) {
            }
        } else {
            stackTraceElementFactory = null;
        }
        if (stackTraceElementFactory == null) {
            stackTraceElementFactory = new StackTraceElementFactory();
        }
        try {
            stackTraceElementFactory.unknownSourceElement("a", "b");
            stackTraceElementFactory2 = stackTraceElementFactory;
        } catch (Exception | NoClassDefFoundError unused2) {
        }
        FACTORY = stackTraceElementFactory2;
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
        Class clsClass$ = class$java$lang$StackTraceElement;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.StackTraceElement");
            class$java$lang$StackTraceElement = clsClass$;
        }
        return clsClass$.equals(cls) && FACTORY != null;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public String toString(Object obj) {
        return super.toString(obj).replaceFirst(":\\?\\?\\?", "");
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) throws NumberFormatException {
        Matcher matcher = PATTERN.matcher(str);
        if (matcher.matches()) {
            String strGroup = matcher.group(1);
            String strGroup2 = matcher.group(2);
            String strGroup3 = matcher.group(3);
            if (strGroup3.equals("Unknown Source")) {
                return FACTORY.unknownSourceElement(strGroup, strGroup2);
            }
            if (strGroup3.equals("Native Method")) {
                return FACTORY.nativeMethodElement(strGroup, strGroup2);
            }
            if (matcher.group(4) != null) {
                return FACTORY.element(strGroup, strGroup2, strGroup3, Integer.parseInt(matcher.group(5)));
            }
            return FACTORY.element(strGroup, strGroup2, strGroup3);
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Could not parse StackTraceElement : ");
        stringBuffer.append(str);
        throw new ConversionException(stringBuffer.toString());
    }
}
