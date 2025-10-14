package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PlainTooltipTokens.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m7105d2 = {"Landroidx/compose/material3/tokens/PlainTooltipTokens;", "", "()V", "ContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "SupportingTextColor", "getSupportingTextColor", "SupportingTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getSupportingTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class PlainTooltipTokens {
    public static final int $stable = 0;

    @NotNull
    public static final PlainTooltipTokens INSTANCE = new PlainTooltipTokens();

    @NotNull
    private static final ColorSchemeKeyTokens ContainerColor = ColorSchemeKeyTokens.InverseSurface;

    @NotNull
    private static final ShapeKeyTokens ContainerShape = ShapeKeyTokens.CornerExtraSmall;

    @NotNull
    private static final ColorSchemeKeyTokens SupportingTextColor = ColorSchemeKeyTokens.InverseOnSurface;

    @NotNull
    private static final TypographyKeyTokens SupportingTextFont = TypographyKeyTokens.BodySmall;

    private PlainTooltipTokens() {
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSupportingTextColor() {
        return SupportingTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getSupportingTextFont() {
        return SupportingTextFont;
    }
}
