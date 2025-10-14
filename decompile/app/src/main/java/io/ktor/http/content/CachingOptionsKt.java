package io.ktor.http.content;

import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CachingOptions.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\",\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u00072\b\u0010\u0005\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\f"}, m7105d2 = {"CachingProperty", "Lio/ktor/util/AttributeKey;", "Lio/ktor/http/content/CachingOptions;", "getCachingProperty", "()Lio/ktor/util/AttributeKey;", "value", "caching", "Lio/ktor/http/content/OutgoingContent;", "getCaching", "(Lio/ktor/http/content/OutgoingContent;)Lio/ktor/http/content/CachingOptions;", "setCaching", "(Lio/ktor/http/content/OutgoingContent;Lio/ktor/http/content/CachingOptions;)V", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class CachingOptionsKt {

    @NotNull
    public static final AttributeKey<CachingOptions> CachingProperty = new AttributeKey<>("Caching");

    @NotNull
    public static final AttributeKey<CachingOptions> getCachingProperty() {
        return CachingProperty;
    }

    @Nullable
    public static final CachingOptions getCaching(@NotNull OutgoingContent outgoingContent) {
        Intrinsics.checkNotNullParameter(outgoingContent, "<this>");
        return (CachingOptions) outgoingContent.getProperty(CachingProperty);
    }

    public static final void setCaching(@NotNull OutgoingContent outgoingContent, @Nullable CachingOptions cachingOptions) {
        Intrinsics.checkNotNullParameter(outgoingContent, "<this>");
        outgoingContent.setProperty(CachingProperty, cachingOptions);
    }
}
