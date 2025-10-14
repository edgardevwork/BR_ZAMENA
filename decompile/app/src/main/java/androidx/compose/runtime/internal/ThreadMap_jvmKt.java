package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ThreadMap.jvm.kt */
@Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m7105d2 = {"emptyThreadMap", "Landroidx/compose/runtime/internal/ThreadMap;", "getEmptyThreadMap", "()Landroidx/compose/runtime/internal/ThreadMap;", "runtime_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap_jvmKt\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,112:1\n26#2:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap_jvmKt\n*L\n111#1:113\n*E\n"})
/* loaded from: classes2.dex */
public final class ThreadMap_jvmKt {

    @NotNull
    private static final ThreadMap emptyThreadMap = new ThreadMap(0, new long[0], new Object[0]);

    @NotNull
    public static final ThreadMap getEmptyThreadMap() {
        return emptyThreadMap;
    }
}
