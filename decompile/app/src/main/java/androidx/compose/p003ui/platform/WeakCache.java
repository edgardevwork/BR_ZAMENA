package androidx.compose.p003ui.platform;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import com.blackhub.bronline.launcher.LauncherConstants;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WeakCache.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u000eH\u0002J\r\u0010\u000f\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00028\u0000¢\u0006\u0002\u0010\u0013R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m7105d2 = {"Landroidx/compose/ui/platform/WeakCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "size", "", "getSize", "()I", SavedStateHandle.VALUES, "Landroidx/compose/runtime/collection/MutableVector;", "Ljava/lang/ref/Reference;", "clearWeakReferences", "", "pop", "()Ljava/lang/Object;", LauncherConstants.PUSH, "element", "(Ljava/lang/Object;)V", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWeakCache.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,77:1\n1208#2:78\n1187#2,2:79\n728#3,2:81\n48#3:83\n*S KotlinDebug\n*F\n+ 1 WeakCache.android.kt\nandroidx/compose/ui/platform/WeakCache\n*L\n29#1:78\n29#1:79,2\n38#1:81,2\n49#1:83\n*E\n"})
/* loaded from: classes3.dex */
public final class WeakCache<T> {
    public static final int $stable = 8;

    @NotNull
    private final MutableVector<Reference<T>> values = new MutableVector<>(new Reference[16], 0);

    @NotNull
    private final ReferenceQueue<T> referenceQueue = new ReferenceQueue<>();

    public final void push(T element) {
        clearWeakReferences();
        this.values.add(new WeakReference(element, this.referenceQueue));
    }

    @Nullable
    public final T pop() {
        clearWeakReferences();
        while (this.values.isNotEmpty()) {
            T t = this.values.removeAt(r0.getSize() - 1).get();
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    public final int getSize() {
        clearWeakReferences();
        return this.values.getSize();
    }

    private final void clearWeakReferences() {
        Reference<? extends T> referencePoll;
        do {
            referencePoll = this.referenceQueue.poll();
            if (referencePoll != null) {
                this.values.remove(referencePoll);
            }
        } while (referencePoll != null);
    }
}
