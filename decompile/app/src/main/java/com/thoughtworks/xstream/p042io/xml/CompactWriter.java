package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.io.Writer;

/* loaded from: classes8.dex */
public class CompactWriter extends PrettyPrintWriter {
    @Override // com.thoughtworks.xstream.p042io.xml.PrettyPrintWriter
    public void endOfLine() {
    }

    public CompactWriter(Writer writer) {
        super(writer);
    }

    public CompactWriter(Writer writer, int i) {
        super(writer, i);
    }

    public CompactWriter(Writer writer, NameCoder nameCoder) {
        super(writer, nameCoder);
    }

    public CompactWriter(Writer writer, int i, NameCoder nameCoder) {
        super(writer, i, nameCoder);
    }

    public CompactWriter(Writer writer, XmlFriendlyReplacer xmlFriendlyReplacer) {
        super(writer, xmlFriendlyReplacer);
    }

    public CompactWriter(Writer writer, int i, XmlFriendlyReplacer xmlFriendlyReplacer) {
        super(writer, i, xmlFriendlyReplacer);
    }
}
