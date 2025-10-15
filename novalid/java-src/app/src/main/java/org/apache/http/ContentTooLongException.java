package org.apache.http;

import java.io.IOException;

/* loaded from: classes8.dex */
public class ContentTooLongException extends IOException {
    public static final long serialVersionUID = -924287689552495383L;

    public ContentTooLongException(String str) {
        super(str);
    }

    public ContentTooLongException(String str, Object... objArr) {
        super(HttpException.clean(String.format(str, objArr)));
    }
}
