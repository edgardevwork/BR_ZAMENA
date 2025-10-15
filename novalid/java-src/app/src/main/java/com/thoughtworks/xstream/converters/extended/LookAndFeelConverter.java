package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.reflection.ReflectionConverter;
import com.thoughtworks.xstream.converters.reflection.ReflectionProvider;
import com.thoughtworks.xstream.mapper.Mapper;

/* loaded from: classes7.dex */
public class LookAndFeelConverter extends ReflectionConverter {
    public static /* synthetic */ Class class$javax$swing$LookAndFeel;

    public LookAndFeelConverter(Mapper mapper, ReflectionProvider reflectionProvider) {
        super(mapper, reflectionProvider);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.reflection.ReflectionConverter, com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        if (cls != null) {
            Class clsClass$ = class$javax$swing$LookAndFeel;
            if (clsClass$ == null) {
                clsClass$ = class$("javax.swing.LookAndFeel");
                class$javax$swing$LookAndFeel = clsClass$;
            }
            if (clsClass$.isAssignableFrom(cls) && canAccess(cls)) {
                return true;
            }
        }
        return false;
    }
}
