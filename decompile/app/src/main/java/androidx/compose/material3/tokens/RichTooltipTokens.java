package androidx.compose.material3.tokens;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: RichTooltipTokens.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0011\u0010\u0011\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0019\u0010\u0013\u001a\u00020\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0006R\u0011\u0010\u001e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0006R\u0011\u0010 \u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u000eR\u0011\u0010\"\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0006R\u0011\u0010$\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, m7105d2 = {"Landroidx/compose/material3/tokens/RichTooltipTokens;", "", "()V", "ActionFocusLabelTextColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getActionFocusLabelTextColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "ActionHoverLabelTextColor", "getActionHoverLabelTextColor", "ActionLabelTextColor", "getActionLabelTextColor", "ActionLabelTextFont", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "getActionLabelTextFont", "()Landroidx/compose/material3/tokens/TypographyKeyTokens;", "ActionPressedLabelTextColor", "getActionPressedLabelTextColor", "ContainerColor", "getContainerColor", "ContainerElevation", "Landroidx/compose/ui/unit/Dp;", "getContainerElevation-D9Ej5fM", "()F", "F", "ContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "ContainerSurfaceTintLayerColor", "getContainerSurfaceTintLayerColor", "SubheadColor", "getSubheadColor", "SubheadFont", "getSubheadFont", "SupportingTextColor", "getSupportingTextColor", "SupportingTextFont", "getSupportingTextFont", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class RichTooltipTokens {
    public static final int $stable = 0;

    @NotNull
    private static final ColorSchemeKeyTokens ActionFocusLabelTextColor;

    @NotNull
    private static final ColorSchemeKeyTokens ActionHoverLabelTextColor;

    @NotNull
    private static final ColorSchemeKeyTokens ActionLabelTextColor;

    @NotNull
    private static final TypographyKeyTokens ActionLabelTextFont;

    @NotNull
    private static final ColorSchemeKeyTokens ActionPressedLabelTextColor;

    @NotNull
    private static final ColorSchemeKeyTokens ContainerColor;
    private static final float ContainerElevation;

    @NotNull
    private static final ShapeKeyTokens ContainerShape;

    @NotNull
    private static final ColorSchemeKeyTokens ContainerSurfaceTintLayerColor;

    @NotNull
    public static final RichTooltipTokens INSTANCE = new RichTooltipTokens();

    @NotNull
    private static final ColorSchemeKeyTokens SubheadColor;

    @NotNull
    private static final TypographyKeyTokens SubheadFont;

    @NotNull
    private static final ColorSchemeKeyTokens SupportingTextColor;

    @NotNull
    private static final TypographyKeyTokens SupportingTextFont;

    private RichTooltipTokens() {
    }

    static {
        ColorSchemeKeyTokens colorSchemeKeyTokens = ColorSchemeKeyTokens.Primary;
        ActionFocusLabelTextColor = colorSchemeKeyTokens;
        ActionHoverLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextColor = colorSchemeKeyTokens;
        ActionLabelTextFont = TypographyKeyTokens.LabelLarge;
        ActionPressedLabelTextColor = colorSchemeKeyTokens;
        ContainerColor = ColorSchemeKeyTokens.Surface;
        ContainerElevation = ElevationTokens.INSTANCE.m10373getLevel2D9Ej5fM();
        ContainerShape = ShapeKeyTokens.CornerMedium;
        ContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;
        ColorSchemeKeyTokens colorSchemeKeyTokens2 = ColorSchemeKeyTokens.OnSurfaceVariant;
        SubheadColor = colorSchemeKeyTokens2;
        SubheadFont = TypographyKeyTokens.TitleSmall;
        SupportingTextColor = colorSchemeKeyTokens2;
        SupportingTextFont = TypographyKeyTokens.BodyMedium;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActionFocusLabelTextColor() {
        return ActionFocusLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActionHoverLabelTextColor() {
        return ActionHoverLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActionLabelTextColor() {
        return ActionLabelTextColor;
    }

    @NotNull
    public final TypographyKeyTokens getActionLabelTextFont() {
        return ActionLabelTextFont;
    }

    @NotNull
    public final ColorSchemeKeyTokens getActionPressedLabelTextColor() {
        return ActionPressedLabelTextColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerColor() {
        return ContainerColor;
    }

    /* renamed from: getContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m10669getContainerElevationD9Ej5fM() {
        return ContainerElevation;
    }

    @NotNull
    public final ShapeKeyTokens getContainerShape() {
        return ContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getContainerSurfaceTintLayerColor() {
        return ContainerSurfaceTintLayerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getSubheadColor() {
        return SubheadColor;
    }

    @NotNull
    public final TypographyKeyTokens getSubheadFont() {
        return SubheadFont;
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
