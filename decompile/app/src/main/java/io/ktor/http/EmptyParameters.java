package io.ktor.http;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import io.ktor.http.Parameters;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.SetsKt__SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Parameters.kt */
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b0\t0\bH\u0016J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014"}, m7105d2 = {"Lio/ktor/http/EmptyParameters;", "Lio/ktor/http/Parameters;", "()V", "caseInsensitiveName", "", "getCaseInsensitiveName", "()Z", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", "", "", "", "equals", "other", "", "getAll", "name", "isEmpty", "names", "toString", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class EmptyParameters implements Parameters {

    @NotNull
    public static final EmptyParameters INSTANCE = new EmptyParameters();

    @Override // io.ktor.util.StringValues
    @Nullable
    public List<String> getAll(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return null;
    }

    @Override // io.ktor.util.StringValues
    public boolean getCaseInsensitiveName() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public boolean isEmpty() {
        return true;
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(@NotNull String str) {
        return Parameters.DefaultImpls.contains(this, str);
    }

    @Override // io.ktor.util.StringValues
    public boolean contains(@NotNull String str, @NotNull String str2) {
        return Parameters.DefaultImpls.contains(this, str, str2);
    }

    @Override // io.ktor.util.StringValues
    public void forEach(@NotNull Function2<? super String, ? super List<String>, Unit> function2) {
        Parameters.DefaultImpls.forEach(this, function2);
    }

    @Override // io.ktor.util.StringValues
    @Nullable
    public String get(@NotNull String str) {
        return Parameters.DefaultImpls.get(this, str);
    }

    @Override // io.ktor.util.StringValues
    @NotNull
    public Set<String> names() {
        return SetsKt__SetsKt.emptySet();
    }

    @Override // io.ktor.util.StringValues
    @NotNull
    public Set<Map.Entry<String, List<String>>> entries() {
        return SetsKt__SetsKt.emptySet();
    }

    @NotNull
    public String toString() {
        return "Parameters " + entries();
    }

    public boolean equals(@Nullable Object other) {
        return (other instanceof Parameters) && ((Parameters) other).isEmpty();
    }
}
