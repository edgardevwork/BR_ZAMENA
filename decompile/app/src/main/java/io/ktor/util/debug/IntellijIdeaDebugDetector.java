package io.ktor.util.debug;

import java.lang.management.ManagementFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: IntellijIdeaDebugDetectorJvm.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0003\u0010\u0005¨\u0006\b"}, m7105d2 = {"Lio/ktor/util/debug/IntellijIdeaDebugDetector;", "", "()V", "isDebuggerConnected", "", "()Z", "isDebuggerConnected$delegate", "Lkotlin/Lazy;", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class IntellijIdeaDebugDetector {

    @NotNull
    public static final IntellijIdeaDebugDetector INSTANCE = new IntellijIdeaDebugDetector();

    /* renamed from: isDebuggerConnected$delegate, reason: from kotlin metadata */
    @NotNull
    public static final Lazy isDebuggerConnected = LazyKt__LazyJVMKt.lazy(new Function0<Boolean>() { // from class: io.ktor.util.debug.IntellijIdeaDebugDetector.isDebuggerConnected.2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            boolean zContains$default = false;
            try {
                zContains$default = StringsKt__StringsKt.contains$default((CharSequence) ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), (CharSequence) "jdwp", false, 2, (Object) null);
            } catch (Throwable unused) {
            }
            return Boolean.valueOf(zContains$default);
        }
    });

    public final boolean isDebuggerConnected() {
        return ((Boolean) isDebuggerConnected.getValue()).booleanValue();
    }
}
