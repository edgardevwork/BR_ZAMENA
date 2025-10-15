package io.ktor.http.auth;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AuthScheme.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, m7105d2 = {"Lio/ktor/http/auth/AuthScheme;", "", "()V", "Basic", "", AuthScheme.Bearer, "Digest", "Negotiate", AuthScheme.OAuth, "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes6.dex */
public final class AuthScheme {

    @NotNull
    public static final String Basic = "Basic";

    @NotNull
    public static final String Bearer = "Bearer";

    @NotNull
    public static final String Digest = "Digest";

    @NotNull
    public static final AuthScheme INSTANCE = new AuthScheme();

    @NotNull
    public static final String Negotiate = "Negotiate";

    @NotNull
    public static final String OAuth = "OAuth";
}
