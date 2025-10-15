package io.ktor.client.plugins.json;

import io.ktor.http.ContentType;
import io.ktor.http.ContentTypeMatcher;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: JsonContentTypeMatcher.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/client/plugins/json/JsonContentTypeMatcher;", "Lio/ktor/http/ContentTypeMatcher;", "()V", "contains", "", "contentType", "Lio/ktor/http/ContentType;", "ktor-client-json"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class JsonContentTypeMatcher implements ContentTypeMatcher {
    @Override // io.ktor.http.ContentTypeMatcher
    public boolean contains(@NotNull ContentType contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        if (ContentType.Application.INSTANCE.getJson().match(contentType)) {
            return true;
        }
        String string = contentType.withoutParameters().toString();
        return StringsKt__StringsJVMKt.startsWith$default(string, "application/", false, 2, null) && StringsKt__StringsJVMKt.endsWith$default(string, "+json", false, 2, null);
    }
}
