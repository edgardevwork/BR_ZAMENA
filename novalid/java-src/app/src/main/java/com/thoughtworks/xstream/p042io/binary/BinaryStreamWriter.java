package com.thoughtworks.xstream.p042io.binary;

import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.binary.Token;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes8.dex */
public class BinaryStreamWriter implements ExtendedHierarchicalStreamWriter {
    public final DataOutputStream out;
    public final IdRegistry idRegistry = new IdRegistry();
    public final Token.Formatter tokenFormatter = new Token.Formatter();

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }

    public BinaryStreamWriter(OutputStream outputStream) {
        this.out = new DataOutputStream(outputStream);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void startNode(String str) {
        write(new Token.StartNode(this.idRegistry.getId(str)));
    }

    @Override // com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    public void startNode(String str, Class cls) {
        startNode(str);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void addAttribute(String str, String str2) {
        write(new Token.Attribute(this.idRegistry.getId(str), str2));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void setValue(String str) {
        write(new Token.Value(str));
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void endNode() {
        write(new Token.EndNode());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void flush() throws IOException {
        try {
            this.out.flush();
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void close() throws IOException {
        try {
            this.out.close();
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    public final void write(Token token) {
        try {
            this.tokenFormatter.write(this.out, token);
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    public class IdRegistry {
        public Map ids;
        public long nextId;

        public IdRegistry() {
            this.nextId = 0L;
            this.ids = new HashMap();
        }

        public long getId(String str) {
            Long l = (Long) this.ids.get(str);
            if (l == null) {
                long j = this.nextId + 1;
                this.nextId = j;
                l = new Long(j);
                this.ids.put(str, l);
                BinaryStreamWriter.this.write(new Token.MapIdToValue(l.longValue(), str));
            }
            return l.longValue();
        }
    }
}
