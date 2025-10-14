package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public class RegexPatternConverter implements Converter {
    public static /* synthetic */ Class class$java$util$regex$Pattern;

    public RegexPatternConverter() {
    }

    public RegexPatternConverter(Converter converter) {
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
        Class clsClass$ = class$java$util$regex$Pattern;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.regex.Pattern");
            class$java$util$regex$Pattern = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) {
        Pattern pattern = (Pattern) obj;
        hierarchicalStreamWriter.startNode("pattern");
        hierarchicalStreamWriter.setValue(pattern.pattern());
        hierarchicalStreamWriter.endNode();
        hierarchicalStreamWriter.startNode("flags");
        hierarchicalStreamWriter.setValue(String.valueOf(pattern.flags()));
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws NumberFormatException {
        hierarchicalStreamReader.moveDown();
        String value = hierarchicalStreamReader.getValue();
        hierarchicalStreamReader.moveUp();
        hierarchicalStreamReader.moveDown();
        int i = Integer.parseInt(hierarchicalStreamReader.getValue());
        hierarchicalStreamReader.moveUp();
        return Pattern.compile(value, i);
    }
}
