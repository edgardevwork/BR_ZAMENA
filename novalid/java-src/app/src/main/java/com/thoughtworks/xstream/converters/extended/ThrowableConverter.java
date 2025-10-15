package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;

/* loaded from: classes6.dex */
public class ThrowableConverter implements Converter {
    public static /* synthetic */ Class class$java$lang$Object;
    public static /* synthetic */ Class class$java$lang$Throwable;
    public Converter defaultConverter;
    public final ConverterLookup lookup;

    public ThrowableConverter(Converter converter) {
        this.defaultConverter = converter;
        this.lookup = null;
    }

    public ThrowableConverter(ConverterLookup converterLookup) {
        this.lookup = converterLookup;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != null) {
            Class clsClass$ = class$java$lang$Throwable;
            if (clsClass$ == null) {
                clsClass$ = class$("java.lang.Throwable");
                class$java$lang$Throwable = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Throwable th = (Throwable) obj;
        if (th.getCause() == null) {
            try {
                th.initCause(null);
            } catch (IllegalStateException unused) {
            }
        }
        th.getStackTrace();
        getConverter().marshal(th, hierarchicalStreamWriter, marshallingContext);
    }

    public final Converter getConverter() throws Throwable {
        Converter converter = this.defaultConverter;
        if (converter != null) {
            return converter;
        }
        ConverterLookup converterLookup = this.lookup;
        Class clsClass$ = class$java$lang$Object;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.Object");
            class$java$lang$Object = clsClass$;
        }
        return converterLookup.lookupConverterForType(clsClass$);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return getConverter().unmarshal(hierarchicalStreamReader, unmarshallingContext);
    }
}
