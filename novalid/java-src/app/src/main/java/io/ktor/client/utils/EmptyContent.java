package io.ktor.client.utils;

import io.ktor.http.content.OutgoingContent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Content.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, m7105d2 = {"Lio/ktor/client/utils/EmptyContent;", "Lio/ktor/http/content/OutgoingContent$NoContent;", "()V", "contentLength", "", "getContentLength", "()Ljava/lang/Long;", "toString", "", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class EmptyContent extends OutgoingContent.NoContent {

    @NotNull
    public static final EmptyContent INSTANCE = new EmptyContent();
    public static final long contentLength = 0;

    @Override // io.ktor.http.content.OutgoingContent
    @NotNull
    public Long getContentLength() {
        return Long.valueOf(contentLength);
    }

    @NotNull
    public String toString() {
        return "EmptyContent";
    }
}
