package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.converters.Converter;
import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.converters.UnmarshallingContext;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriterHelper;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/* loaded from: classes6.dex */
public class GregorianCalendarConverter implements Converter {
    public static /* synthetic */ Class class$java$lang$String;
    public static /* synthetic */ Class class$java$util$GregorianCalendar;

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    @Override // com.thoughtworks.xstream.converters.ConverterMatcher
    public boolean canConvert(Class cls) throws Throwable {
        Class clsClass$ = class$java$util$GregorianCalendar;
        if (clsClass$ == null) {
            clsClass$ = class$("java.util.GregorianCalendar");
            class$java$util$GregorianCalendar = clsClass$;
        }
        return cls == clsClass$;
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public void marshal(Object obj, HierarchicalStreamWriter hierarchicalStreamWriter, MarshallingContext marshallingContext) throws Throwable {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) obj;
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, "time", Long.TYPE);
        hierarchicalStreamWriter.setValue(String.valueOf(gregorianCalendar.getTime().getTime()));
        hierarchicalStreamWriter.endNode();
        Class clsClass$ = class$java$lang$String;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.String");
            class$java$lang$String = clsClass$;
        }
        ExtendedHierarchicalStreamWriterHelper.startNode(hierarchicalStreamWriter, "timezone", clsClass$);
        hierarchicalStreamWriter.setValue(gregorianCalendar.getTimeZone().getID());
        hierarchicalStreamWriter.endNode();
    }

    @Override // com.thoughtworks.xstream.converters.Converter
    public Object unmarshal(HierarchicalStreamReader hierarchicalStreamReader, UnmarshallingContext unmarshallingContext) throws NumberFormatException {
        String id;
        hierarchicalStreamReader.moveDown();
        long j = Long.parseLong(hierarchicalStreamReader.getValue());
        hierarchicalStreamReader.moveUp();
        if (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            id = hierarchicalStreamReader.getValue();
            hierarchicalStreamReader.moveUp();
        } else {
            id = TimeZone.getDefault().getID();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeZone(TimeZone.getTimeZone(id));
        gregorianCalendar.setTime(new Date(j));
        return gregorianCalendar;
    }
}
