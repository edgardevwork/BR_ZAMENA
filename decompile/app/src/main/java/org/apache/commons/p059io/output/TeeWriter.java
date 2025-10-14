package org.apache.commons.p059io.output;

import java.io.Writer;
import java.util.Collection;

/* loaded from: classes8.dex */
public class TeeWriter extends ProxyCollectionWriter {
    public TeeWriter(Collection<Writer> collection) {
        super(collection);
    }

    public TeeWriter(Writer... writerArr) {
        super(writerArr);
    }
}
