package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* loaded from: classes4.dex */
public interface ProgressUpdater {
    @NonNull
    ListenableFuture<Void> updateProgress(@NonNull Context context, @NonNull UUID id, @NonNull Data data);
}
