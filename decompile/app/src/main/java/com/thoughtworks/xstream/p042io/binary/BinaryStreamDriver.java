package com.thoughtworks.xstream.p042io.binary;

import com.thoughtworks.xstream.p042io.AbstractDriver;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

/* loaded from: classes8.dex */
public class BinaryStreamDriver extends AbstractDriver {
    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        throw new UnsupportedOperationException("The BinaryDriver cannot use character-oriented input streams.");
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        return new BinaryStreamReader(inputStream);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(Writer writer) {
        throw new UnsupportedOperationException("The BinaryDriver cannot use character-oriented output streams.");
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(OutputStream outputStream) {
        return new BinaryStreamWriter(outputStream);
    }
}
