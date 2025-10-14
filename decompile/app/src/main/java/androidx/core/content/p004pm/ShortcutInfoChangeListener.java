package androidx.core.content.p004pm;

import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public abstract class ShortcutInfoChangeListener {
    @AnyThread
    public void onAllShortcutsRemoved() {
    }

    @AnyThread
    public void onShortcutAdded(@NonNull List<ShortcutInfoCompat> list) {
    }

    @AnyThread
    public void onShortcutRemoved(@NonNull List<String> list) {
    }

    @AnyThread
    public void onShortcutUpdated(@NonNull List<ShortcutInfoCompat> list) {
    }

    @AnyThread
    public void onShortcutUsageReported(@NonNull List<String> list) {
    }
}
