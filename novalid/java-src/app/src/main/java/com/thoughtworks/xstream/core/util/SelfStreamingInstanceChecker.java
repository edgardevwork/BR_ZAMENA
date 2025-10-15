package com.thoughtworks.xstream.core.util;

import com.thoughtworks.xstream.converters.ConversionException;
import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.ConverterLookup;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;

/* loaded from: classes6.dex */
public class SelfStreamingInstanceChecker implements Converter {
    public static /* synthetic */ Class class$java$lang$Object;
    public Converter defaultConverter;
    public final ConverterLookup lookup;
    public final Object self;

    public SelfStreamingInstanceChecker(ConverterLookup converterLookup, Object obj) {
        this.lookup = converterLookup;
        this.self = obj;
    }

    public SelfStreamingInstanceChecker(Converter converter, Object obj) {
        this.defaultConverter = converter;
        this.self = obj;
        this.lookup = null;
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) {
        return cls == this.self.getClass();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        if (obj == this.self) {
            throw new ConversionException("Cannot marshal the XStream instance in action");
        }
        getConverter().marshal(obj, hierarchicalStreamWriter, marshallingContext);
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) {
        return getConverter().unmarshal(hierarchicalStreamReader, unmarshallingContext);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    private Converter getConverter() throws Throwable {
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
}
