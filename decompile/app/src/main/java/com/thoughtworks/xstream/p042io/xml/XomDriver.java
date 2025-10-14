package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.URL;
import nu.xom.Builder;
import nu.xom.ParsingException;
import nu.xom.ValidityException;

/* loaded from: classes7.dex */
public class XomDriver extends AbstractXmlDriver {
    public final Builder builder;

    public XomDriver() {
        this(new XmlFriendlyNameCoder());
    }

    public XomDriver(Builder builder) {
        this(builder, new XmlFriendlyNameCoder());
    }

    public XomDriver(NameCoder nameCoder) {
        super(nameCoder);
        this.builder = null;
    }

    public XomDriver(Builder builder, NameCoder nameCoder) {
        super(nameCoder);
        this.builder = builder;
    }

    public XomDriver(XmlFriendlyReplacer xmlFriendlyReplacer) {
        this((NameCoder) xmlFriendlyReplacer);
    }

    public XomDriver(Builder builder, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(builder, (NameCoder) xmlFriendlyReplacer);
    }

    public Builder getBuilder() {
        return this.builder;
    }

    public Builder createBuilder() {
        Builder builder = getBuilder();
        return builder != null ? builder : new Builder();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(Reader reader) {
        try {
            return new XomReader(createBuilder().build(reader), getNameCoder());
        } catch (ParsingException e) {
            throw new StreamException((Throwable) e);
        } catch (ValidityException e2) {
            throw new StreamException((Throwable) e2);
        } catch (IOException e3) {
            throw new StreamException(e3);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(InputStream inputStream) {
        try {
            return new XomReader(createBuilder().build(inputStream), getNameCoder());
        } catch (ParsingException e) {
            throw new StreamException((Throwable) e);
        } catch (ValidityException e2) {
            throw new StreamException((Throwable) e2);
        } catch (IOException e3) {
            throw new StreamException(e3);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(URL url) {
        try {
            return new XomReader(createBuilder().build(url.toExternalForm()), getNameCoder());
        } catch (ParsingException e) {
            throw new StreamException((Throwable) e);
        } catch (IOException e2) {
            throw new StreamException(e2);
        } catch (ValidityException e3) {
            throw new StreamException((Throwable) e3);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractDriver, com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamReader createReader(File file) {
        try {
            return new XomReader(createBuilder().build(file), getNameCoder());
        } catch (ParsingException e) {
            throw new StreamException((Throwable) e);
        } catch (ValidityException e2) {
            throw new StreamException((Throwable) e2);
        } catch (IOException e3) {
            throw new StreamException(e3);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(Writer writer) {
        return new PrettyPrintWriter(writer, getNameCoder());
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamDriver
    public HierarchicalStreamWriter createWriter(OutputStream outputStream) {
        return new PrettyPrintWriter(new OutputStreamWriter(outputStream), getNameCoder());
    }
}
