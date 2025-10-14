package org.apache.http.p061io;

import java.io.IOException;
import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

/* loaded from: classes8.dex */
public interface HttpMessageParser<T extends HttpMessage> {
    T parse() throws HttpException, IOException;
}
