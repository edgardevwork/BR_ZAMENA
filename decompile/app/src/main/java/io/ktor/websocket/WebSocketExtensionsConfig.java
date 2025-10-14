package io.ktor.websocket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: WebSocketExtension.kt */
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0011H\u0002J=\u0010\u0012\u001a\u00020\u000f\"\b\b\u0000\u0010\u0013*\u00020\u00012\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u0002H\u0013\u0012\u0002\b\u00030\u00112\u0019\b\u0002\u0010\u0015\u001a\u0013\u0012\u0004\u0012\u0002H\u0013\u0012\u0004\u0012\u00020\u000f0\u0016¢\u0006\u0002\b\u0017R\"\u0010\u0003\u001a\u0016\u0012\u0012\u0012\u0010\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005j\u0002`\u00070\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0018"}, m7105d2 = {"Lio/ktor/websocket/WebSocketExtensionsConfig;", "", "()V", "installers", "", "Lkotlin/Function0;", "Lio/ktor/websocket/WebSocketExtension;", "Lio/ktor/websocket/ExtensionInstaller;", "rcv", "", "", "[Ljava/lang/Boolean;", "build", "", "checkConflicts", "", "extensionFactory", "Lio/ktor/websocket/WebSocketExtensionFactory;", "install", "ConfigType", "extension", "config", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "ktor-websockets"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWebSocketExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1549#2:134\n1620#2,3:135\n1#3:138\n*S KotlinDebug\n*F\n+ 1 WebSocketExtension.kt\nio/ktor/websocket/WebSocketExtensionsConfig\n*L\n123#1:134\n123#1:135,3\n*E\n"})
/* loaded from: classes7.dex */
public final class WebSocketExtensionsConfig {

    @NotNull
    public final List<Function0<WebSocketExtension<?>>> installers = new ArrayList();

    @NotNull
    public final Boolean[] rcv;

    public WebSocketExtensionsConfig() {
        Boolean bool = Boolean.FALSE;
        this.rcv = new Boolean[]{bool, bool, bool};
    }

    public static /* synthetic */ void install$default(WebSocketExtensionsConfig webSocketExtensionsConfig, WebSocketExtensionFactory webSocketExtensionFactory, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<Object, Unit>() { // from class: io.ktor.websocket.WebSocketExtensionsConfig.install.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Object obj2) {
                    Intrinsics.checkNotNullParameter(obj2, "$this$null");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2(obj2);
                    return Unit.INSTANCE;
                }
            };
        }
        webSocketExtensionsConfig.install(webSocketExtensionFactory, function1);
    }

    public final <ConfigType> void install(@NotNull final WebSocketExtensionFactory<ConfigType, ?> extension, @NotNull final Function1<? super ConfigType, Unit> config) {
        Intrinsics.checkNotNullParameter(extension, "extension");
        Intrinsics.checkNotNullParameter(config, "config");
        checkConflicts(extension);
        this.installers.add(new Function0<WebSocketExtension<?>>() { // from class: io.ktor.websocket.WebSocketExtensionsConfig.install.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebSocketExtension<?> invoke() {
                return extension.install(config);
            }
        });
    }

    @NotNull
    public final List<WebSocketExtension<?>> build() {
        List<Function0<WebSocketExtension<?>>> list = this.installers;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((WebSocketExtension) ((Function0) it.next()).invoke());
        }
        return arrayList;
    }

    public final void checkConflicts(WebSocketExtensionFactory<?, ?> extensionFactory) {
        if (!(!((extensionFactory.getRsv1() && this.rcv[1].booleanValue()) || (extensionFactory.getRsv2() && this.rcv[2].booleanValue()) || (extensionFactory.getRsv3() && this.rcv[3].booleanValue())))) {
            throw new IllegalStateException("Failed to install extension. Please check configured extensions for conflicts.".toString());
        }
    }
}
