package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.reflection.AbstractAttributedCharacterIteratorAttributeConverter;

/* loaded from: classes7.dex */
public class TextAttributeConverter extends AbstractAttributedCharacterIteratorAttributeConverter {
    public static /* synthetic */ Class class$java$awt$font$TextAttribute;

    /* JADX WARN: Illegal instructions before constructor call */
    public TextAttributeConverter() throws Throwable {
        Class clsClass$ = class$java$awt$font$TextAttribute;
        if (clsClass$ == null) {
            clsClass$ = class$("java.awt.font.TextAttribute");
            class$java$awt$font$TextAttribute = clsClass$;
        }
        super(clsClass$);
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }
}
