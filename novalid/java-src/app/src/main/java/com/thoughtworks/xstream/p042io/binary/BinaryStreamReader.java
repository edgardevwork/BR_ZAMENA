package com.thoughtworks.xstream.p042io.binary;

import com.thoughtworks.xstream.converters.ErrorWriter;
import com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.binary.Token;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes7.dex */
public class BinaryStreamReader implements ExtendedHierarchicalStreamReader {

    /* renamed from: in */
    public final DataInputStream f5908in;
    public Token pushback;
    public final ReaderDepthState depthState = new ReaderDepthState();
    public final IdRegistry idRegistry = new IdRegistry();
    public final Token.Formatter tokenFormatter = new Token.Formatter();

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader, com.thoughtworks.xstream.converters.ErrorReporter
    public void appendErrors(ErrorWriter errorWriter) {
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public HierarchicalStreamReader underlyingReader() {
        return this;
    }

    public BinaryStreamReader(InputStream inputStream) {
        this.f5908in = new DataInputStream(inputStream);
        moveDown();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public boolean hasMoreChildren() {
        return this.depthState.hasMoreChildren();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getNodeName() {
        return this.depthState.getName();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getValue() {
        return this.depthState.getValue();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(String str) {
        return this.depthState.getAttribute(str);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttribute(int i) {
        return this.depthState.getAttribute(i);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public int getAttributeCount() {
        return this.depthState.getAttributeCount();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public String getAttributeName(int i) {
        return this.depthState.getAttributeName(i);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public Iterator getAttributeNames() {
        return this.depthState.getAttributeNames();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveDown() {
        this.depthState.push();
        Token token = readToken();
        if (token.getType() == 3) {
            this.depthState.setName(this.idRegistry.get(token.getId()));
            while (true) {
                Token token2 = readToken();
                byte type = token2.getType();
                if (type == 3) {
                    this.depthState.setHasMoreChildren(true);
                    pushBack(token2);
                    return;
                }
                if (type == 4) {
                    this.depthState.setHasMoreChildren(false);
                    pushBack(token2);
                    return;
                } else if (type == 5) {
                    this.depthState.addAttribute(this.idRegistry.get(token2.getId()), token2.getValue());
                } else if (type == 6) {
                    this.depthState.setValue(token2.getValue());
                } else {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("Unexpected token ");
                    stringBuffer.append(token2);
                    throw new StreamException(stringBuffer.toString());
                }
            }
        } else {
            throw new StreamException("Expected StartNode");
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void moveUp() {
        this.depthState.pop();
        int i = 0;
        while (true) {
            byte type = readToken().getType();
            if (type == 3) {
                i++;
            } else if (type != 4) {
                continue;
            } else if (i == 0) {
                break;
            } else {
                i--;
            }
        }
        Token token = readToken();
        byte type2 = token.getType();
        if (type2 == 3) {
            this.depthState.setHasMoreChildren(true);
        } else if (type2 == 4) {
            this.depthState.setHasMoreChildren(false);
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unexpected token ");
            stringBuffer.append(token);
            throw new StreamException(stringBuffer.toString());
        }
        pushBack(token);
    }

    public final Token readToken() {
        Token token = this.pushback;
        if (token == null) {
            try {
                Token token2 = this.tokenFormatter.read(this.f5908in);
                if (token2.getType() != 2) {
                    return token2;
                }
                this.idRegistry.put(token2.getId(), token2.getValue());
                return readToken();
            } catch (IOException e) {
                throw new StreamException(e);
            }
        }
        this.pushback = null;
        return token;
    }

    public void pushBack(Token token) {
        if (this.pushback == null) {
            this.pushback = token;
            return;
        }
        throw new Error("Cannot push more than one token back");
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamReader
    public void close() throws IOException {
        try {
            this.f5908in.close();
        } catch (IOException e) {
            throw new StreamException(e);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamReader
    public String peekNextChild() {
        if (this.depthState.hasMoreChildren()) {
            return this.idRegistry.get(this.pushback.getId());
        }
        return null;
    }

    /* loaded from: classes8.dex */
    public static class IdRegistry {
        public Map map;

        public IdRegistry() {
            this.map = new HashMap();
        }

        public void put(long j, String str) {
            this.map.put(new Long(j), str);
        }

        public String get(long j) {
            String str = (String) this.map.get(new Long(j));
            if (str != null) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("Unknown ID : ");
            stringBuffer.append(j);
            throw new StreamException(stringBuffer.toString());
        }
    }
}
