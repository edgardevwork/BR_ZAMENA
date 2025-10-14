package androidx.compose.material3.tokens;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: SheetBottomTokens.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0019\u0010\u000f\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0019\u0010\u001a\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001b\u0010\u0012R\u0019\u0010\u001c\u001a\u00020\u0010ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u001d\u0010\u0012\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/material3/tokens/SheetBottomTokens;", "", "()V", "DockedContainerColor", "Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "getDockedContainerColor", "()Landroidx/compose/material3/tokens/ColorSchemeKeyTokens;", "DockedContainerShape", "Landroidx/compose/material3/tokens/ShapeKeyTokens;", "getDockedContainerShape", "()Landroidx/compose/material3/tokens/ShapeKeyTokens;", "DockedContainerSurfaceTintLayerColor", "getDockedContainerSurfaceTintLayerColor", "DockedDragHandleColor", "getDockedDragHandleColor", "DockedDragHandleHeight", "Landroidx/compose/ui/unit/Dp;", "getDockedDragHandleHeight-D9Ej5fM", "()F", "F", "DockedDragHandleOpacity", "", "DockedDragHandleWidth", "getDockedDragHandleWidth-D9Ej5fM", "DockedMinimizedContainerShape", "getDockedMinimizedContainerShape", "DockedModalContainerElevation", "getDockedModalContainerElevation-D9Ej5fM", "DockedStandardContainerElevation", "getDockedStandardContainerElevation-D9Ej5fM", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSheetBottomTokens.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetBottomTokens.kt\nandroidx/compose/material3/tokens/SheetBottomTokens\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,35:1\n164#2:36\n164#2:37\n*S KotlinDebug\n*F\n+ 1 SheetBottomTokens.kt\nandroidx/compose/material3/tokens/SheetBottomTokens\n*L\n28#1:36\n30#1:37\n*E\n"})
/* loaded from: classes3.dex */
public final class SheetBottomTokens {
    public static final int $stable = 0;
    public static final float DockedDragHandleOpacity = 0.4f;
    private static final float DockedModalContainerElevation;
    private static final float DockedStandardContainerElevation;

    @NotNull
    public static final SheetBottomTokens INSTANCE = new SheetBottomTokens();

    @NotNull
    private static final ColorSchemeKeyTokens DockedContainerColor = ColorSchemeKeyTokens.Surface;

    @NotNull
    private static final ShapeKeyTokens DockedContainerShape = ShapeKeyTokens.CornerExtraLargeTop;

    @NotNull
    private static final ColorSchemeKeyTokens DockedContainerSurfaceTintLayerColor = ColorSchemeKeyTokens.SurfaceTint;

    @NotNull
    private static final ColorSchemeKeyTokens DockedDragHandleColor = ColorSchemeKeyTokens.OnSurfaceVariant;
    private static final float DockedDragHandleHeight = C2046Dp.m13666constructorimpl((float) 4.0d);
    private static final float DockedDragHandleWidth = C2046Dp.m13666constructorimpl((float) 32.0d);

    @NotNull
    private static final ShapeKeyTokens DockedMinimizedContainerShape = ShapeKeyTokens.CornerNone;

    private SheetBottomTokens() {
    }

    static {
        ElevationTokens elevationTokens = ElevationTokens.INSTANCE;
        DockedModalContainerElevation = elevationTokens.m10372getLevel1D9Ej5fM();
        DockedStandardContainerElevation = elevationTokens.m10372getLevel1D9Ej5fM();
    }

    @NotNull
    public final ColorSchemeKeyTokens getDockedContainerColor() {
        return DockedContainerColor;
    }

    @NotNull
    public final ShapeKeyTokens getDockedContainerShape() {
        return DockedContainerShape;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDockedContainerSurfaceTintLayerColor() {
        return DockedContainerSurfaceTintLayerColor;
    }

    @NotNull
    public final ColorSchemeKeyTokens getDockedDragHandleColor() {
        return DockedDragHandleColor;
    }

    /* renamed from: getDockedDragHandleHeight-D9Ej5fM, reason: not valid java name */
    public final float m10680getDockedDragHandleHeightD9Ej5fM() {
        return DockedDragHandleHeight;
    }

    /* renamed from: getDockedDragHandleWidth-D9Ej5fM, reason: not valid java name */
    public final float m10681getDockedDragHandleWidthD9Ej5fM() {
        return DockedDragHandleWidth;
    }

    @NotNull
    public final ShapeKeyTokens getDockedMinimizedContainerShape() {
        return DockedMinimizedContainerShape;
    }

    /* renamed from: getDockedModalContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m10682getDockedModalContainerElevationD9Ej5fM() {
        return DockedModalContainerElevation;
    }

    /* renamed from: getDockedStandardContainerElevation-D9Ej5fM, reason: not valid java name */
    public final float m10683getDockedStandardContainerElevationD9Ej5fM() {
        return DockedStandardContainerElevation;
    }
}
