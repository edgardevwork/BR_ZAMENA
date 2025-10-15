package org.apache.commons.p059io.output;

import java.io.IOException;
import java.io.Serializable;
import java.io.Writer;
import java.util.UUID;
import org.apache.commons.p059io.TaggedIOException;

/* loaded from: classes5.dex */
public class TaggedWriter extends ProxyWriter {
    public final Serializable tag;

    public TaggedWriter(Writer writer) {
        super(writer);
        this.tag = UUID.randomUUID();
    }

    public boolean isCauseOf(Exception exc) {
        return TaggedIOException.isTaggedWith(exc, this.tag);
    }

    public void throwIfCauseOf(Exception exc) throws IOException {
        TaggedIOException.throwCauseIfTaggedWith(exc, this.tag);
    }

    @Override // org.apache.commons.p059io.output.ProxyWriter
    public void handleIOException(IOException iOException) throws IOException {
        throw new TaggedIOException(iOException, this.tag);
    }
}
