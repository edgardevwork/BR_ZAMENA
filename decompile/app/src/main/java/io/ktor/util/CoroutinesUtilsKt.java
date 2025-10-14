package io.ktor.util;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutinesUtils.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m7105d2 = {"SilentSupervisor", "Lkotlin/coroutines/CoroutineContext;", "parent", "Lkotlinx/coroutines/Job;", "printDebugTree", "", TypedValues.CycleType.S_WAVE_OFFSET, "", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCoroutinesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,29:1\n1295#2,2:30\n48#3,4:32\n*S KotlinDebug\n*F\n+ 1 CoroutinesUtils.kt\nio/ktor/util/CoroutinesUtilsKt\n*L\n16#1:30,2\n28#1:32,4\n*E\n"})
/* loaded from: classes7.dex */
public final class CoroutinesUtilsKt {
    public static /* synthetic */ void printDebugTree$default(Job job, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        printDebugTree(job, i);
    }

    public static final void printDebugTree(@NotNull Job job, int i) {
        Intrinsics.checkNotNullParameter(job, "<this>");
        System.out.println((Object) (StringsKt__StringsJVMKt.repeat(" ", i) + job));
        Iterator<Job> it = job.getChildren().iterator();
        while (it.hasNext()) {
            printDebugTree(it.next(), i + 2);
        }
        if (i == 0) {
            System.out.println();
        }
    }

    public static /* synthetic */ CoroutineContext SilentSupervisor$default(Job job, int i, Object obj) {
        if ((i & 1) != 0) {
            job = null;
        }
        return SilentSupervisor(job);
    }

    @NotNull
    public static final CoroutineContext SilentSupervisor(@Nullable Job job) {
        return SupervisorKt.SupervisorJob(job).plus(new C10344xf907d825(CoroutineExceptionHandler.INSTANCE));
    }
}
