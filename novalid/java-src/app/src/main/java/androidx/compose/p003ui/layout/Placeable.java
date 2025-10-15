package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Placeable.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0002J=\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\"2\u0019\u0010#\u001a\u0015\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u001e\u0018\u00010$¢\u0006\u0002\b&H$ø\u0001\u0000¢\u0006\u0004\b'\u0010(R&\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR,\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0012\u0010\u0007\"\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR,\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u0017@DX\u0084\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\u0014R\u001e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, m7105d2 = {"Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/Measured;", "()V", "<set-?>", "Landroidx/compose/ui/unit/IntOffset;", "apparentToRealOffset", "getApparentToRealOffset-nOcc-ac", "()J", "J", "", "height", "getHeight", "()I", "measuredHeight", "getMeasuredHeight", "value", "Landroidx/compose/ui/unit/IntSize;", "measuredSize", "getMeasuredSize-YbymL2g", "setMeasuredSize-ozmzZPI", "(J)V", "measuredWidth", "getMeasuredWidth", "Landroidx/compose/ui/unit/Constraints;", "measurementConstraints", "getMeasurementConstraints-msEJaDk", "setMeasurementConstraints-BRTryo0", "width", "getWidth", "onMeasuredSizeChanged", "", "placeAt", "position", "zIndex", "", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeAt-f8xVGno", "(JFLkotlin/jvm/functions/Function1;)V", "PlacementScope", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public abstract class Placeable implements Measured {
    public static final int $stable = 8;
    private int height;
    private int width;
    private long measuredSize = IntSizeKt.IntSize(0, 0);
    private long measurementConstraints = PlaceableKt.DefaultConstraints;
    private long apparentToRealOffset = IntOffset.INSTANCE.m13804getZeronOccac();

    /* renamed from: placeAt-f8xVGno */
    public abstract void mo12611placeAtf8xVGno(long position, float zIndex, @Nullable Function1<? super GraphicsLayerScope, Unit> layerBlock);

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.compose.p003ui.layout.Measured
    public int getMeasuredWidth() {
        return IntSize.m13836getWidthimpl(this.measuredSize);
    }

    @Override // androidx.compose.p003ui.layout.Measured
    public int getMeasuredHeight() {
        return IntSize.m13835getHeightimpl(this.measuredSize);
    }

    /* renamed from: getMeasuredSize-YbymL2g, reason: from getter */
    public final long getMeasuredSize() {
        return this.measuredSize;
    }

    /* renamed from: setMeasuredSize-ozmzZPI */
    public final void m12659setMeasuredSizeozmzZPI(long j) {
        if (IntSize.m13834equalsimpl0(this.measuredSize, j)) {
            return;
        }
        this.measuredSize = j;
        onMeasuredSizeChanged();
    }

    private final void onMeasuredSizeChanged() {
        this.width = RangesKt___RangesKt.coerceIn(IntSize.m13836getWidthimpl(this.measuredSize), Constraints.m13624getMinWidthimpl(this.measurementConstraints), Constraints.m13622getMaxWidthimpl(this.measurementConstraints));
        this.height = RangesKt___RangesKt.coerceIn(IntSize.m13835getHeightimpl(this.measuredSize), Constraints.m13623getMinHeightimpl(this.measurementConstraints), Constraints.m13621getMaxHeightimpl(this.measurementConstraints));
        this.apparentToRealOffset = IntOffsetKt.IntOffset((this.width - IntSize.m13836getWidthimpl(this.measuredSize)) / 2, (this.height - IntSize.m13835getHeightimpl(this.measuredSize)) / 2);
    }

    /* renamed from: getMeasurementConstraints-msEJaDk, reason: from getter */
    public final long getMeasurementConstraints() {
        return this.measurementConstraints;
    }

    /* renamed from: setMeasurementConstraints-BRTryo0 */
    public final void m12660setMeasurementConstraintsBRTryo0(long j) {
        if (Constraints.m13615equalsimpl0(this.measurementConstraints, j)) {
            return;
        }
        this.measurementConstraints = j;
        onMeasuredSizeChanged();
    }

    /* renamed from: getApparentToRealOffset-nOcc-ac, reason: from getter */
    public final long getApparentToRealOffset() {
        return this.apparentToRealOffset;
    }

    /* compiled from: Placeable.kt */
    @StabilityInferred(parameters = 1)
    @Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u000f\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JD\u0010\u001a\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u001b\b\b\u0010\u001b\u001a\u0015\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001c¢\u0006\u0002\b\u001eH\u0080\bø\u0001\u0000¢\u0006\u0004\b\"\u0010 J&\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015ø\u0001\u0000¢\u0006\u0004\b$\u0010\u0017J$\u0010#\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u0015JA\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b&\u0010 J?\u0010%\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eJA\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eø\u0001\u0000¢\u0006\u0004\b(\u0010 J?\u0010'\u001a\u00020\u0010*\u00020\u00112\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0019\b\u0002\u0010\u001b\u001a\u0013\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00100\u001c¢\u0006\u0002\b\u001eR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¤\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¤\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, m7105d2 = {"Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "()V", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "parentLayoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "parentWidth", "", "getParentWidth", "()I", "place", "", "Landroidx/compose/ui/layout/Placeable;", "position", "Landroidx/compose/ui/unit/IntOffset;", "zIndex", "", "place-70tqf50", "(Landroidx/compose/ui/layout/Placeable;JF)V", "x", "y", "placeApparentToRealOffset", "layerBlock", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "placeApparentToRealOffset-aW-9-wM$ui_release", "(Landroidx/compose/ui/layout/Placeable;JFLkotlin/jvm/functions/Function1;)V", "placeAutoMirrored", "placeAutoMirrored-aW-9-wM$ui_release", "placeRelative", "placeRelative-70tqf50", "placeRelativeWithLayer", "placeRelativeWithLayer-aW-9-wM", "placeWithLayer", "placeWithLayer-aW-9-wM", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nPlaceable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffset\n*L\n1#1,404:1\n331#1,2:405\n348#1:407\n349#1:409\n334#1,2:410\n348#1,2:412\n340#1:414\n331#1,2:415\n348#1:417\n349#1:419\n334#1,2:420\n348#1,2:422\n340#1:424\n348#1:425\n349#1:427\n348#1:428\n349#1:430\n331#1,2:431\n348#1:433\n349#1:435\n334#1,2:436\n348#1,2:438\n340#1:440\n331#1,2:441\n348#1:443\n349#1:445\n334#1,2:446\n348#1,2:448\n340#1:450\n348#1:451\n349#1:453\n348#1:454\n349#1:456\n348#1:457\n349#1:459\n348#1:460\n349#1:462\n86#2:408\n86#2:418\n86#2:426\n86#2:429\n86#2:434\n86#2:444\n86#2:452\n86#2:455\n86#2:458\n86#2:461\n86#2:463\n*S KotlinDebug\n*F\n+ 1 Placeable.kt\nandroidx/compose/ui/layout/Placeable$PlacementScope\n*L\n186#1:405,2\n186#1:407\n186#1:409\n186#1:410,2\n186#1:412,2\n186#1:414\n204#1:415,2\n204#1:417\n204#1:419\n204#1:420,2\n204#1:422,2\n204#1:424\n218#1:425\n218#1:427\n231#1:428\n231#1:430\n255#1:431,2\n255#1:433\n255#1:435\n255#1:436,2\n255#1:438,2\n255#1:440\n281#1:441,2\n281#1:443\n281#1:445\n281#1:446,2\n281#1:448,2\n281#1:450\n303#1:451\n303#1:453\n323#1:454\n323#1:456\n332#1:457\n332#1:459\n334#1:460\n334#1:462\n186#1:408\n204#1:418\n218#1:426\n231#1:429\n255#1:434\n281#1:444\n303#1:452\n323#1:455\n332#1:458\n334#1:461\n348#1:463\n*E\n"})
    /* loaded from: classes4.dex */
    public static abstract class PlacementScope {
        public static final int $stable = 0;

        @Nullable
        public LayoutCoordinates getCoordinates() {
            return null;
        }

        @NotNull
        public abstract LayoutDirection getParentLayoutDirection();

        public abstract int getParentWidth();

        /* renamed from: placeRelative-70tqf50$default */
        public static /* synthetic */ void m12662placeRelative70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m12668placeRelative70tqf50(placeable, j, f);
        }

        public static /* synthetic */ void placeRelative$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.placeRelative(placeable, i, i2, f);
        }

        public final void placeRelative(@NotNull Placeable placeable, int i, int i2, float f) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j)), f, null);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jIntOffset));
                long j2 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset2) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(jIntOffset2) + IntOffset.m13795getYimpl(j2)), f, null);
            }
        }

        public static /* synthetic */ void place$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            placementScope.place(placeable, i, i2, f);
        }

        public final void place(@NotNull Placeable placeable, int i, int i2, float f) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j)), f, null);
        }

        /* renamed from: place-70tqf50$default */
        public static /* synthetic */ void m12661place70tqf50$default(PlacementScope placementScope, Placeable placeable, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            placementScope.m12665place70tqf50(placeable, j, f);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m12663placeRelativeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m12669placeRelativeWithLayeraW9wM(placeable, j, f2, function1);
        }

        public static /* synthetic */ void placeRelativeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeRelativeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeRelativeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j)), f, function1);
            } else {
                long jIntOffset2 = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m13794getXimpl(jIntOffset), IntOffset.m13795getYimpl(jIntOffset));
                long j2 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset2) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(jIntOffset2) + IntOffset.m13795getYimpl(j2)), f, function1);
            }
        }

        public static /* synthetic */ void placeWithLayer$default(PlacementScope placementScope, Placeable placeable, int i, int i2, float f, Function1 function1, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i3 & 8) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.placeWithLayer(placeable, i, i2, f2, function1);
        }

        public final void placeWithLayer(@NotNull Placeable placeable, int i, int i2, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long jIntOffset = IntOffsetKt.IntOffset(i, i2);
            long j = placeable.apparentToRealOffset;
            placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j)), f, function1);
        }

        /* renamed from: placeWithLayer-aW-9-wM$default */
        public static /* synthetic */ void m12664placeWithLayeraW9wM$default(PlacementScope placementScope, Placeable placeable, long j, float f, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer-aW-9-wM");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            float f2 = f;
            if ((i & 4) != 0) {
                function1 = PlaceableKt.DefaultLayerBlock;
            }
            placementScope.m12670placeWithLayeraW9wM(placeable, j, f2, function1);
        }

        /* renamed from: placeAutoMirrored-aW-9-wM$ui_release */
        public final void m12667placeAutoMirroredaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j3), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j3)), f, function1);
            }
        }

        /* renamed from: placeApparentToRealOffset-aW-9-wM$ui_release */
        public final void m12666placeApparentToRealOffsetaW9wM$ui_release(@NotNull Placeable placeable, long j, float f, @Nullable Function1<? super GraphicsLayerScope, Unit> function1) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, function1);
        }

        /* renamed from: placeRelative-70tqf50 */
        public final void m12668placeRelative70tqf50(@NotNull Placeable placeable, long j, float f) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, null);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j3), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j3)), f, null);
            }
        }

        /* renamed from: place-70tqf50 */
        public final void m12665place70tqf50(@NotNull Placeable placeable, long j, float f) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, null);
        }

        /* renamed from: placeRelativeWithLayer-aW-9-wM */
        public final void m12669placeRelativeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            if (getParentLayoutDirection() == LayoutDirection.Ltr || getParentWidth() == 0) {
                long j2 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, function1);
            } else {
                long jIntOffset = IntOffsetKt.IntOffset((getParentWidth() - placeable.getWidth()) - IntOffset.m13794getXimpl(j), IntOffset.m13795getYimpl(j));
                long j3 = placeable.apparentToRealOffset;
                placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(jIntOffset) + IntOffset.m13794getXimpl(j3), IntOffset.m13795getYimpl(jIntOffset) + IntOffset.m13795getYimpl(j3)), f, function1);
            }
        }

        /* renamed from: placeWithLayer-aW-9-wM */
        public final void m12670placeWithLayeraW9wM(@NotNull Placeable placeable, long j, float f, @NotNull Function1<? super GraphicsLayerScope, Unit> function1) {
            long j2 = placeable.apparentToRealOffset;
            placeable.mo12611placeAtf8xVGno(IntOffsetKt.IntOffset(IntOffset.m13794getXimpl(j) + IntOffset.m13794getXimpl(j2), IntOffset.m13795getYimpl(j) + IntOffset.m13795getYimpl(j2)), f, function1);
        }
    }
}
