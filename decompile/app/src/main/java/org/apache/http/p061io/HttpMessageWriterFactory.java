package org.apache.http.p061io;

import org.apache.http.HttpMessage;

/* loaded from: classes8.dex */
public interface HttpMessageWriterFactory<T extends HttpMessage> {
    HttpMessageWriter<T> create(SessionOutputBuffer sessionOutputBuffer);
}
