package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import com.blackhub.bronline.game.gui.tutorialhints.TutorialKeys;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AnchoredDraggable.kt */
@StabilityInferred(parameters = 0)
@ExperimentalFoundationApi
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n*\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\u0086\u0004¢\u0006\u0002\u0010\fR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, m7105d2 = {"Landroidx/compose/foundation/gestures/DraggableAnchorsConfig;", ExifInterface.GPS_DIRECTION_TRUE, "", "()V", "anchors", "", "", "getAnchors$foundation_release", "()Ljava/util/Map;", TutorialKeys.TUTORIAL_ADDITIONAL_TASK_PROGRESS_LIST_KEY, "", "position", "(Ljava/lang/Object;F)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class DraggableAnchorsConfig<T> {
    public static final int $stable = 8;

    @NotNull
    private final Map<T, Float> anchors = new LinkedHashMap();

    @NotNull
    public final Map<T, Float> getAnchors$foundation_release() {
        return this.anchors;
    }

    /* renamed from: at */
    public final void m40at(T t, float f) {
        this.anchors.put(t, Float.valueOf(f));
    }
}
