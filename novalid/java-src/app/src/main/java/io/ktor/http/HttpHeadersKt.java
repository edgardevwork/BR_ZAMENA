package io.ktor.http;

import kotlin.Metadata;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: HttpHeaders.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\f\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m7105d2 = {"isDelimiter", "", "ch", "", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class HttpHeadersKt {
    public static final boolean isDelimiter(char c) {
        return StringsKt__StringsKt.contains$default((CharSequence) "\"(),/:;<=>?@[\\]{}", c, false, 2, (Object) null);
    }
}
