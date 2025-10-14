package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;

/* loaded from: classes7.dex */
public class DurationConverter extends AbstractSingleValueConverter {
    public static /* synthetic */ Class class$javax$xml$datatype$Duration;
    public final DatatypeFactory factory;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.thoughtworks.xstream.converters.extended.DurationConverter$1] */
    public DurationConverter() {
        this(new Object() { // from class: com.thoughtworks.xstream.converters.extended.DurationConverter.1
            public DatatypeFactory getFactory() {
                try {
                    return DatatypeFactory.newInstance();
                } catch (DatatypeConfigurationException unused) {
                    return null;
                }
            }
        }.getFactory());
    }

    public DurationConverter(DatatypeFactory datatypeFactory) {
        this.factory = datatypeFactory;
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
        if (this.factory != null && cls != null) {
            Class clsClass$ = class$javax$xml$datatype$Duration;
            if (clsClass$ == null) {
                clsClass$ = class$("javax.xml.datatype.Duration");
                class$javax$xml$datatype$Duration = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.basic.AbstractSingleValueConverter, com.thoughtworks.xstream.converters.SingleValueConverter
    public Object fromString(String str) {
        return this.factory.newDuration(str);
    }
}
