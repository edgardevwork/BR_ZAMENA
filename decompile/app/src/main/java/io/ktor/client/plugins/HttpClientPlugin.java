package io.ktor.client.plugins;

import io.ktor.client.HttpClient;
import io.ktor.util.AttributeKey;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientPlugin.kt */
@Metadata(m7104d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0002J\u001d\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00020\fH&¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u00028\u00012\u0019\b\u0002\u0010\u000f\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\u0010¢\u0006\u0002\b\u0011H&¢\u0006\u0002\u0010\u0012R\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, m7105d2 = {"Lio/ktor/client/plugins/HttpClientPlugin;", "TConfig", "", "TPlugin", "key", "Lio/ktor/util/AttributeKey;", "getKey", "()Lio/ktor/util/AttributeKey;", "install", "", "plugin", PomReader.SCOPE, "Lio/ktor/client/HttpClient;", "(Ljava/lang/Object;Lio/ktor/client/HttpClient;)V", "prepare", "block", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface HttpClientPlugin<TConfig, TPlugin> {
    @NotNull
    AttributeKey<TPlugin> getKey();

    void install(@NotNull TPlugin plugin, @NotNull HttpClient scope);

    @NotNull
    TPlugin prepare(@NotNull Function1<? super TConfig, Unit> block);

    /* compiled from: HttpClientPlugin.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object prepare$default(HttpClientPlugin httpClientPlugin, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: prepare");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<TConfig, Unit>() { // from class: io.ktor.client.plugins.HttpClientPlugin.prepare.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TConfig tconfig) {
                        Intrinsics.checkNotNullParameter(tconfig, "$this$null");
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke2((C101431) obj2);
                        return Unit.INSTANCE;
                    }
                };
            }
            return httpClientPlugin.prepare(function1);
        }
    }
}
