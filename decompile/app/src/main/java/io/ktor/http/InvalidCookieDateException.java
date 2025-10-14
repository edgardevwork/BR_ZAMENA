package io.ktor.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: CookieUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m7105d2 = {"Lio/ktor/http/InvalidCookieDateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "data", "", "reason", "(Ljava/lang/String;Ljava/lang/String;)V", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class InvalidCookieDateException extends IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidCookieDateException(@NotNull String data, @NotNull String reason) {
        super("Failed to parse date string: \"" + data + "\". Reason: \"" + reason + '\"');
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(reason, "reason");
    }
}
