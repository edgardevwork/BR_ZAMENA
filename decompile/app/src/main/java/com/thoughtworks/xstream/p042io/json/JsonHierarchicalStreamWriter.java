package com.thoughtworks.xstream.p042io.json;

import java.io.Writer;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class JsonHierarchicalStreamWriter extends JsonWriter {
    public JsonHierarchicalStreamWriter(Writer writer, char[] cArr, String str) {
        super(writer, cArr, str);
    }

    public JsonHierarchicalStreamWriter(Writer writer, char[] cArr) {
        this(writer, cArr, StringUtils.f9903LF);
    }

    public JsonHierarchicalStreamWriter(Writer writer, String str, String str2) {
        this(writer, str.toCharArray(), str2);
    }

    public JsonHierarchicalStreamWriter(Writer writer, String str) {
        this(writer, str.toCharArray());
    }

    public JsonHierarchicalStreamWriter(Writer writer) {
        this(writer, new char[]{' ', ' '});
    }
}
