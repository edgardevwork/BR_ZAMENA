package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ApplicationResponseProperties.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, m7105d2 = {"etag", "", "Lio/ktor/http/HeadersBuilder;", "entityTag", "", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class ApplicationResponsePropertiesKt {
    public static final void etag(@NotNull HeadersBuilder headersBuilder, @NotNull String entityTag) {
        Intrinsics.checkNotNullParameter(headersBuilder, "<this>");
        Intrinsics.checkNotNullParameter(entityTag, "entityTag");
        headersBuilder.set(HttpHeaders.INSTANCE.getETag(), entityTag);
    }
}
