package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import io.ktor.util.converters.DataConversion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: DataConversion.kt */
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH\u0016J!\u0010\u000e\u001a\u00020\u00032\u0017\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\u0010¢\u0006\u0002\b\u0011H\u0016R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/client/plugins/DataConversion;", "Lio/ktor/client/plugins/HttpClientPlugin;", "Lio/ktor/util/converters/DataConversion$Configuration;", "Lio/ktor/util/converters/DataConversion;", "()V", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class DataConversion implements HttpClientPlugin<DataConversion.Configuration, io.ktor.util.converters.DataConversion> {

    @NotNull
    public static final DataConversion INSTANCE = new DataConversion();

    @NotNull
    public static final AttributeKey<io.ktor.util.converters.DataConversion> key = new AttributeKey<>("DataConversion");

    @Override // io.ktor.client.plugins.HttpClientPlugin
    public void install(@NotNull io.ktor.util.converters.DataConversion plugin, @NotNull HttpClient scope) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(scope, "scope");
    }

    @Override // io.ktor.client.plugins.HttpClientPlugin
    @NotNull
    public AttributeKey<io.ktor.util.converters.DataConversion> getKey() {
        return key;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.ktor.client.plugins.HttpClientPlugin
    @NotNull
    public io.ktor.util.converters.DataConversion prepare(@NotNull Function1<? super DataConversion.Configuration, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        DataConversion.Configuration configuration = new DataConversion.Configuration();
        block.invoke(configuration);
        return new io.ktor.util.converters.DataConversion(configuration);
    }
}
