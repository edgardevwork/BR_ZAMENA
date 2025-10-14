package androidx.compose.p003ui.input.pointer;

import android.view.PointerIcon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerIcon.android.kt */
@Metadata(m7104d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0014\u0010\b\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003¨\u0006\u000f"}, m7105d2 = {"pointerIconCrosshair", "Landroidx/compose/ui/input/pointer/PointerIcon;", "getPointerIconCrosshair", "()Landroidx/compose/ui/input/pointer/PointerIcon;", "pointerIconDefault", "getPointerIconDefault", "pointerIconHand", "getPointerIconHand", "pointerIconText", "getPointerIconText", "PointerIcon", "pointerIcon", "Landroid/view/PointerIcon;", "pointerIconType", "", "ui_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class PointerIcon_androidKt {

    @NotNull
    private static final PointerIcon pointerIconDefault = new AndroidPointerIcon(1000);

    @NotNull
    private static final PointerIcon pointerIconCrosshair = new AndroidPointerIcon(1007);

    @NotNull
    private static final PointerIcon pointerIconText = new AndroidPointerIcon(1008);

    @NotNull
    private static final PointerIcon pointerIconHand = new AndroidPointerIcon(1002);

    @NotNull
    public static final PointerIcon PointerIcon(@NotNull PointerIcon pointerIcon) {
        return new AndroidPointerIcon(pointerIcon);
    }

    @NotNull
    public static final PointerIcon PointerIcon(int i) {
        return new AndroidPointerIcon(i);
    }

    @NotNull
    public static final PointerIcon getPointerIconDefault() {
        return pointerIconDefault;
    }

    @NotNull
    public static final PointerIcon getPointerIconCrosshair() {
        return pointerIconCrosshair;
    }

    @NotNull
    public static final PointerIcon getPointerIconText() {
        return pointerIconText;
    }

    @NotNull
    public static final PointerIcon getPointerIconHand() {
        return pointerIconHand;
    }
}
