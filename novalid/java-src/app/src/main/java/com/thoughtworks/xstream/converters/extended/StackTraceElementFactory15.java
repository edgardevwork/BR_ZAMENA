package com.thoughtworks.xstream.converters.extended;

/* loaded from: classes8.dex */
public class StackTraceElementFactory15 extends StackTraceElementFactory {
    @Override // com.thoughtworks.xstream.converters.extended.StackTraceElementFactory
    public StackTraceElement create(String str, String str2, String str3, int i) {
        return new StackTraceElement(str, str2, str3, i);
    }
}
