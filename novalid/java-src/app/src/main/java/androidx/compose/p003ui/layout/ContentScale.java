package androidx.compose.p003ui.layout;

import androidx.compose.p003ui.geometry.Size;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jfrog.build.extractor.scan.Scope;

/* compiled from: ContentScale.kt */
@Stable
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u0000 \t2\u00020\u0001:\u0001\tJ\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m7105d2 = {"Landroidx/compose/ui/layout/ContentScale;", "", "computeScaleFactor", "Landroidx/compose/ui/layout/ScaleFactor;", "srcSize", "Landroidx/compose/ui/geometry/Size;", "dstSize", "computeScaleFactor-H7hwNQA", "(JJ)J", "Companion", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface ContentScale {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* renamed from: computeScaleFactor-H7hwNQA */
    long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize);

    /* compiled from: ContentScale.kt */
    @Metadata(m7104d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001c\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u0002\u001a\u0004\b\r\u0010\u0007R\u001c\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0007R\u001c\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0007R\u001c\u0010\u0014\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0002\u001a\u0004\b\u0016\u0010\u0007R\u001c\u0010\u0017\u001a\u00020\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0002\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m7105d2 = {"Landroidx/compose/ui/layout/ContentScale$Companion;", "", "()V", "Crop", "Landroidx/compose/ui/layout/ContentScale;", "getCrop$annotations", "getCrop", "()Landroidx/compose/ui/layout/ContentScale;", "FillBounds", "getFillBounds$annotations", "getFillBounds", "FillHeight", "getFillHeight$annotations", "getFillHeight", "FillWidth", "getFillWidth$annotations", "getFillWidth", "Fit", "getFit$annotations", "getFit", "Inside", "getInside$annotations", "getInside", Scope.NONE_SCOPE, "Landroidx/compose/ui/layout/FixedScale;", "getNone$annotations", "getNone", "()Landroidx/compose/ui/layout/FixedScale;", "ui_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final ContentScale Crop = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Crop$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM12607computeFillMaxDimensioniLBOSCw = ContentScaleKt.m12607computeFillMaxDimensioniLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM12607computeFillMaxDimensioniLBOSCw, fM12607computeFillMaxDimensioniLBOSCw);
            }
        };

        @NotNull
        private static final ContentScale Fit = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Fit$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM12608computeFillMinDimensioniLBOSCw = ContentScaleKt.m12608computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM12608computeFillMinDimensioniLBOSCw, fM12608computeFillMinDimensioniLBOSCw);
            }
        };

        @NotNull
        private static final ContentScale FillHeight = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillHeight$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM12606computeFillHeightiLBOSCw = ContentScaleKt.m12606computeFillHeightiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM12606computeFillHeightiLBOSCw, fM12606computeFillHeightiLBOSCw);
            }
        };

        @NotNull
        private static final ContentScale FillWidth = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillWidth$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                float fM12609computeFillWidthiLBOSCw = ContentScaleKt.m12609computeFillWidthiLBOSCw(srcSize, dstSize);
                return ScaleFactorKt.ScaleFactor(fM12609computeFillWidthiLBOSCw, fM12609computeFillWidthiLBOSCw);
            }
        };

        @NotNull
        private static final ContentScale Inside = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$Inside$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                if (Size.m11168getWidthimpl(srcSize) > Size.m11168getWidthimpl(dstSize) || Size.m11165getHeightimpl(srcSize) > Size.m11165getHeightimpl(dstSize)) {
                    float fM12608computeFillMinDimensioniLBOSCw = ContentScaleKt.m12608computeFillMinDimensioniLBOSCw(srcSize, dstSize);
                    return ScaleFactorKt.ScaleFactor(fM12608computeFillMinDimensioniLBOSCw, fM12608computeFillMinDimensioniLBOSCw);
                }
                return ScaleFactorKt.ScaleFactor(1.0f, 1.0f);
            }
        };

        @NotNull
        private static final FixedScale None = new FixedScale(1.0f);

        @NotNull
        private static final ContentScale FillBounds = new ContentScale() { // from class: androidx.compose.ui.layout.ContentScale$Companion$FillBounds$1
            @Override // androidx.compose.p003ui.layout.ContentScale
            /* renamed from: computeScaleFactor-H7hwNQA */
            public long mo12601computeScaleFactorH7hwNQA(long srcSize, long dstSize) {
                return ScaleFactorKt.ScaleFactor(ContentScaleKt.m12609computeFillWidthiLBOSCw(srcSize, dstSize), ContentScaleKt.m12606computeFillHeightiLBOSCw(srcSize, dstSize));
            }
        };

        @Stable
        public static /* synthetic */ void getCrop$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillBounds$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillHeight$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFillWidth$annotations() {
        }

        @Stable
        public static /* synthetic */ void getFit$annotations() {
        }

        @Stable
        public static /* synthetic */ void getInside$annotations() {
        }

        @Stable
        public static /* synthetic */ void getNone$annotations() {
        }

        private Companion() {
        }

        @NotNull
        public final ContentScale getCrop() {
            return Crop;
        }

        @NotNull
        public final ContentScale getFit() {
            return Fit;
        }

        @NotNull
        public final ContentScale getFillHeight() {
            return FillHeight;
        }

        @NotNull
        public final ContentScale getFillWidth() {
            return FillWidth;
        }

        @NotNull
        public final ContentScale getInside() {
            return Inside;
        }

        @NotNull
        public final FixedScale getNone() {
            return None;
        }

        @NotNull
        public final ContentScale getFillBounds() {
            return FillBounds;
        }
    }
}
