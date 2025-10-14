package androidx.compose.foundation;

import android.os.Build;
import android.view.View;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Stable;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlatformMagnifier.android.kt */
@Stable
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\ba\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017JR\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005ø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, m7105d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory;", "", "canUpdateZoom", "", "getCanUpdateZoom", "()Z", "create", "Landroidx/compose/foundation/PlatformMagnifier;", SVG.View.NODE_NAME, "Landroid/view/View;", "useTextDefault", "size", "Landroidx/compose/ui/unit/DpSize;", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "density", "Landroidx/compose/ui/unit/Density;", "initialZoom", "", "create-nHHXs2Y", "(Landroid/view/View;ZJFFZLandroidx/compose/ui/unit/Density;F)Landroidx/compose/foundation/PlatformMagnifier;", "Companion", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface PlatformMagnifierFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @NotNull
    /* renamed from: create-nHHXs2Y, reason: not valid java name */
    PlatformMagnifier mo7863createnHHXs2Y(@NotNull View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @NotNull Density density, float initialZoom);

    boolean getCanUpdateZoom();

    /* compiled from: PlatformMagnifier.android.kt */
    @Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, m7105d2 = {"Landroidx/compose/foundation/PlatformMagnifierFactory$Companion;", "", "()V", "getForCurrentPlatform", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Stable
        @NotNull
        public final PlatformMagnifierFactory getForCurrentPlatform() {
            if (Magnifier_androidKt.isPlatformMagnifierSupported$default(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? PlatformMagnifierFactoryApi28Impl.INSTANCE : PlatformMagnifierFactoryApi29Impl.INSTANCE;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }
}
