package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.FocusInteraction;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.p003ui.unit.C2046Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Elevation.kt */
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m7105d2 = {"Landroidx/compose/material3/ElevationDefaults;", "", "()V", "incomingAnimationSpecForInteraction", "Landroidx/compose/animation/core/AnimationSpec;", "Landroidx/compose/ui/unit/Dp;", "interaction", "Landroidx/compose/foundation/interaction/Interaction;", "outgoingAnimationSpecForInteraction", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ElevationDefaults {

    @NotNull
    public static final ElevationDefaults INSTANCE = new ElevationDefaults();

    @Nullable
    public final AnimationSpec<C2046Dp> incomingAnimationSpecForInteraction(@NotNull Interaction interaction) {
        if ((interaction instanceof PressInteraction.Press) || (interaction instanceof DragInteraction.Start) || (interaction instanceof HoverInteraction.Enter) || (interaction instanceof FocusInteraction.Focus)) {
            return ElevationKt.DefaultIncomingSpec;
        }
        return null;
    }

    @Nullable
    public final AnimationSpec<C2046Dp> outgoingAnimationSpecForInteraction(@NotNull Interaction interaction) {
        if (!(interaction instanceof PressInteraction.Press) && !(interaction instanceof DragInteraction.Start)) {
            if (interaction instanceof HoverInteraction.Enter) {
                return ElevationKt.HoveredOutgoingSpec;
            }
            if (interaction instanceof FocusInteraction.Focus) {
                return ElevationKt.DefaultOutgoingSpec;
            }
            return null;
        }
        return ElevationKt.DefaultOutgoingSpec;
    }
}
