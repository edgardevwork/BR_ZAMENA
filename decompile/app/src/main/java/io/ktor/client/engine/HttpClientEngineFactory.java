package io.ktor.client.engine;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.client.engine.HttpClientEngineConfig;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpClientEngine.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J#\u0010\u0004\u001a\u00020\u00052\u0019\b\u0002\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\b\tH&¨\u0006\n"}, m7105d2 = {"Lio/ktor/client/engine/HttpClientEngineFactory;", ExifInterface.GPS_DIRECTION_TRUE, "Lio/ktor/client/engine/HttpClientEngineConfig;", "", "create", "Lio/ktor/client/engine/HttpClientEngine;", "block", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "ktor-client-core"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public interface HttpClientEngineFactory<T extends HttpClientEngineConfig> {
    @NotNull
    HttpClientEngine create(@NotNull Function1<? super T, Unit> block);

    /* compiled from: HttpClientEngine.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ HttpClientEngine create$default(HttpClientEngineFactory httpClientEngineFactory, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: create");
            }
            if ((i & 1) != 0) {
                function1 = new Function1<T, Unit>() { // from class: io.ktor.client.engine.HttpClientEngineFactory.create.1
                    public final void invoke(@NotNull T t) {
                        Intrinsics.checkNotNullParameter(t, "$this$null");
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                        invoke((C101161) obj2);
                        return Unit.INSTANCE;
                    }
                };
            }
            return httpClientEngineFactory.create(function1);
        }
    }
}
