package io.ktor.http;

import io.ktor.util.StringValuesBuilderImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Headers.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nH\u0014¨\u0006\r"}, m7105d2 = {"Lio/ktor/http/HeadersBuilder;", "Lio/ktor/util/StringValuesBuilderImpl;", "size", "", "(I)V", "build", "Lio/ktor/http/Headers;", "validateName", "", "name", "", "validateValue", "value", "ktor-http"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class HeadersBuilder extends StringValuesBuilderImpl {
    public HeadersBuilder() {
        this(0, 1, null);
    }

    public HeadersBuilder(int i) {
        super(true, i);
    }

    public /* synthetic */ HeadersBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl, io.ktor.util.StringValuesBuilder
    @NotNull
    public Headers build() {
        return new HeadersImpl(getValues());
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateName(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        super.validateName(name);
        HttpHeaders.INSTANCE.checkHeaderName(name);
    }

    @Override // io.ktor.util.StringValuesBuilderImpl
    public void validateValue(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        super.validateValue(value);
        HttpHeaders.INSTANCE.checkHeaderValue(value);
    }
}
