package io.ktor.util.internal;

import com.blackhub.bronline.game.gui.blackpass.utils.BlackPassKeys;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H&J\u0016\u0010\b\u001a\u0004\u0018\u00010\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006H&¨\u0006\t"}, m7105d2 = {"Lio/ktor/util/internal/AtomicDesc;", "", "()V", "complete", "", BlackPassKeys.OP_PRICE_TITLE, "Lio/ktor/util/internal/AtomicOp;", "failure", "prepare", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class AtomicDesc {
    public abstract void complete(@NotNull AtomicOp<?> op, @Nullable Object failure);

    @Nullable
    public abstract Object prepare(@NotNull AtomicOp<?> op);
}
