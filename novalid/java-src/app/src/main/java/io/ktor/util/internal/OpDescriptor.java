package io.ktor.util.internal;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: LockFreeLinkedList.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H&¨\u0006\u0005"}, m7105d2 = {"Lio/ktor/util/internal/OpDescriptor;", "", "()V", "perform", "affected", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public abstract class OpDescriptor {
    @Nullable
    public abstract Object perform(@Nullable Object affected);
}
