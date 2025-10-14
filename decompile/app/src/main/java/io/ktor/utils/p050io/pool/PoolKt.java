package io.ktor.utils.p050io.pool;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Pool.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a?\u0010\b\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00010\u0006H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\t"}, m7105d2 = {"useBorrowed", "R", ExifInterface.GPS_DIRECTION_TRUE, "", "Lio/ktor/utils/io/pool/ObjectPool;", "block", "Lkotlin/Function1;", "(Lio/ktor/utils/io/pool/ObjectPool;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "useInstance", "ktor-io"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n1#1,166:1\n159#1,5:167\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/PoolKt\n*L\n152#1:167,5\n*E\n"})
/* loaded from: classes5.dex */
public final class PoolKt {
    public static final <T, R> R useInstance(@NotNull ObjectPool<T> objectPool, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(objectPool, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T tBorrow = objectPool.borrow();
        try {
            return block.invoke(tBorrow);
        } finally {
            InlineMarker.finallyStart(1);
            objectPool.recycle(tBorrow);
            InlineMarker.finallyEnd(1);
        }
    }

    @Deprecated(message = "Use useInstance instead", replaceWith = @ReplaceWith(expression = "useInstance(block)", imports = {}))
    public static final <T, R> R useBorrowed(@NotNull ObjectPool<T> objectPool, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(objectPool, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T tBorrow = objectPool.borrow();
        try {
            return block.invoke(tBorrow);
        } finally {
            InlineMarker.finallyStart(1);
            objectPool.recycle(tBorrow);
            InlineMarker.finallyEnd(1);
        }
    }
}
