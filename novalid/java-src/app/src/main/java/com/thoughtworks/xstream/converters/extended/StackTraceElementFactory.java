package com.thoughtworks.xstream.converters.extended;

import com.thoughtworks.xstream.core.util.Fields;

/* loaded from: classes5.dex */
public class StackTraceElementFactory {
    public static /* synthetic */ Class class$java$lang$StackTraceElement;

    public StackTraceElement nativeMethodElement(String str, String str2) {
        return create(str, str2, "Native Method", -2);
    }

    public StackTraceElement unknownSourceElement(String str, String str2) {
        return create(str, str2, "Unknown Source", -1);
    }

    public StackTraceElement element(String str, String str2, String str3) {
        return create(str, str2, str3, -1);
    }

    public StackTraceElement element(String str, String str2, String str3, int i) {
        return create(str, str2, str3, i);
    }

    public StackTraceElement create(String str, String str2, String str3, int i) throws Throwable {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[0];
        setField(stackTraceElement, "declaringClass", str);
        setField(stackTraceElement, "methodName", str2);
        setField(stackTraceElement, "fileName", str3);
        setField(stackTraceElement, "lineNumber", new Integer(i));
        return stackTraceElement;
    }

    public static /* synthetic */ Class class$(String str) throws Throwable {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            throw new NoClassDefFoundError().initCause(e);
        }
    }

    public final void setField(StackTraceElement stackTraceElement, String str, Object obj) throws Throwable {
        Class clsClass$ = class$java$lang$StackTraceElement;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.StackTraceElement");
            class$java$lang$StackTraceElement = clsClass$;
        }
        Fields.write(Fields.find(clsClass$, str), stackTraceElement, obj);
    }
}
