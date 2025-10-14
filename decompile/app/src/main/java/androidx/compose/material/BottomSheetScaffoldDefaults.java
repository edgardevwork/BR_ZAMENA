package androidx.compose.material;

import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: BottomSheetScaffold.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, m7105d2 = {"Landroidx/compose/material/BottomSheetScaffoldDefaults;", "", "()V", "SheetElevation", "Landroidx/compose/ui/unit/Dp;", "getSheetElevation-D9Ej5fM", "()F", "F", "SheetPeekHeight", "getSheetPeekHeight-D9Ej5fM", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBottomSheetScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,812:1\n154#2:813\n154#2:814\n*S KotlinDebug\n*F\n+ 1 BottomSheetScaffold.kt\nandroidx/compose/material/BottomSheetScaffoldDefaults\n*L\n665#1:813\n670#1:814\n*E\n"})
/* loaded from: classes.dex */
public final class BottomSheetScaffoldDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetScaffoldDefaults INSTANCE = new BottomSheetScaffoldDefaults();
    private static final float SheetElevation = C2046Dp.m13666constructorimpl(8);
    private static final float SheetPeekHeight = C2046Dp.m13666constructorimpl(56);

    private BottomSheetScaffoldDefaults() {
    }

    /* renamed from: getSheetElevation-D9Ej5fM, reason: not valid java name */
    public final float m8800getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m8801getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
