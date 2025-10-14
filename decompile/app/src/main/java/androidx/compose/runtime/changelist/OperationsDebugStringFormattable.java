package androidx.compose.runtime.changelist;

import com.bumptech.glide.load.engine.GlideException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Operations.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H&\u0082\u0001\u0003\u0005\u0006\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/runtime/changelist/OperationsDebugStringFormattable;", "", "toDebugString", "", "linePrefix", "Landroidx/compose/runtime/changelist/ChangeList;", "Landroidx/compose/runtime/changelist/FixupList;", "Landroidx/compose/runtime/changelist/Operations;", "runtime_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public interface OperationsDebugStringFormattable {
    @NotNull
    String toDebugString(@NotNull String linePrefix);

    static /* synthetic */ String toDebugString$default(OperationsDebugStringFormattable operationsDebugStringFormattable, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toDebugString");
        }
        if ((i & 1) != 0) {
            str = GlideException.IndentedAppendable.INDENT;
        }
        return operationsDebugStringFormattable.toDebugString(str);
    }
}
