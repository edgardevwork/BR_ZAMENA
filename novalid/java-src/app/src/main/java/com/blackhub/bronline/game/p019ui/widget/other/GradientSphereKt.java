package com.blackhub.bronline.game.p019ui.widget.other;

import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.TileMode;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.core.enums.SideEnum;
import com.bless.client.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GradientSphere.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\u001aq\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072*\u0010\t\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b0\n\"\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m7105d2 = {"GradientSphere", "", "modifier", "Landroidx/compose/ui/Modifier;", "centerSphere", "Lcom/blackhub/bronline/game/core/enums/SideEnum;", "colorList", "", "Landroidx/compose/ui/graphics/Color;", "colorStops", "", "Lkotlin/Pair;", "", "alpha", "radius", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/core/enums/SideEnum;Ljava/util/List;[Lkotlin/Pair;FFLandroidx/compose/runtime/Composer;II)V", "PreviewGradientSphere", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nGradientSphere.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GradientSphere.kt\ncom/blackhub/bronline/game/ui/widget/other/GradientSphereKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,82:1\n68#2,6:83\n74#2:117\n78#2:122\n79#3,11:89\n92#3:121\n456#4,8:100\n464#4,3:114\n467#4,3:118\n3737#5,6:108\n*S KotlinDebug\n*F\n+ 1 GradientSphere.kt\ncom/blackhub/bronline/game/ui/widget/other/GradientSphereKt\n*L\n34#1:83,6\n34#1:117\n34#1:122\n34#1:89,11\n34#1:121\n34#1:100,8\n34#1:114,3\n34#1:118,3\n34#1:108,6\n*E\n"})
/* loaded from: classes3.dex */
public final class GradientSphereKt {

    /* compiled from: GradientSphere.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt$GradientSphere$2 */
    /* loaded from: classes8.dex */
    public static final class C64372 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ float $alpha;
        public final /* synthetic */ SideEnum $centerSphere;
        public final /* synthetic */ List<Color> $colorList;
        public final /* synthetic */ Pair<Float, Color>[] $colorStops;
        public final /* synthetic */ float $radius;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64372(SideEnum sideEnum, List<Color> list, Pair<Float, Color>[] pairArr, float f, float f2, int i, int i2) {
            super(2);
            sideEnum = sideEnum;
            list = list;
            pairArr = pairArr;
            f = f;
            f = f2;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            Modifier modifier = modifier;
            SideEnum sideEnum = sideEnum;
            List<Color> list = list;
            Pair<Float, Color>[] pairArr = pairArr;
            GradientSphereKt.GradientSphere(modifier, sideEnum, list, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), f, f, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: GradientSphere.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt$PreviewGradientSphere$1 */
    /* loaded from: classes8.dex */
    public static final class C64381 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64381(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            GradientSphereKt.PreviewGradientSphere(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:231:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GradientSphere(@Nullable Modifier modifier, @Nullable SideEnum sideEnum, @Nullable List<Color> list, @NotNull final Pair<Float, Color>[] colorStops, float f, float f2, @Nullable Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        SideEnum sideEnum2;
        int i4;
        int i5;
        float f3;
        int i6;
        float f4;
        List<Color> listListOf;
        List<Color> list2;
        SideEnum sideEnum3;
        Modifier modifier3;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier modifier4;
        SideEnum sideEnum4;
        List<Color> list3;
        float f5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(colorStops, "colorStops");
        Composer composerStartRestartGroup = composer.startRestartGroup(2051711626);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                sideEnum2 = sideEnum;
                i3 |= composerStartRestartGroup.changed(sideEnum2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 128;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((i & 57344) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((i & 458752) == 0) {
                        f4 = f2;
                        i3 |= composerStartRestartGroup.changed(f4) ? 131072 : 65536;
                    }
                    composerStartRestartGroup.startMovableGroup(-53716804, Integer.valueOf(colorStops.length));
                    for (Pair<Float, Color> pair : colorStops) {
                        i3 |= composerStartRestartGroup.changed(pair) ? 2048 : 0;
                    }
                    composerStartRestartGroup.endMovableGroup();
                    if ((i3 & 7168) == 0) {
                        i3 |= 1024;
                    }
                    if (i4 != 4 && (374491 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        sideEnum4 = sideEnum2;
                        f5 = f3;
                        list3 = list;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier5 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i8 != 0) {
                                sideEnum2 = SideEnum.TOP_RIGHT;
                            }
                            if (i4 == 0) {
                                Color colorM11330boximpl = Color.m11330boximpl(ColorResources_androidKt.colorResource(R.color.dark_red, composerStartRestartGroup, 6));
                                Color.Companion companion = Color.INSTANCE;
                                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{colorM11330boximpl, Color.m11330boximpl(companion.m11366getBlack0d7_KjU()), Color.m11330boximpl(companion.m11375getTransparent0d7_KjU())});
                                i3 &= -897;
                            } else {
                                listListOf = list;
                            }
                            if (i5 != 0) {
                                f3 = 0.3f;
                            }
                            if (i6 == 0) {
                                list2 = listListOf;
                                f4 = 500.0f;
                            } else {
                                list2 = listListOf;
                            }
                            sideEnum3 = sideEnum2;
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if (i4 != 0) {
                                i3 &= -897;
                            }
                            list2 = list;
                            sideEnum3 = sideEnum2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2051711626, i3, -1, "com.blackhub.bronline.game.ui.widget.other.GradientSphere (GradientSphere.kt:31)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        final SideEnum sideEnum5 = sideEnum3;
                        final float f6 = f4;
                        final float f7 = f3;
                        final List<Color> list4 = list2;
                        CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt$GradientSphere$1$1

                            /* compiled from: GradientSphere.kt */
                            @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                            /* loaded from: classes3.dex */
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[SideEnum.values().length];
                                    try {
                                        iArr[SideEnum.TOP_LEFT.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[SideEnum.TOP_CENTER.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    try {
                                        iArr[SideEnum.TOP_RIGHT.ordinal()] = 3;
                                    } catch (NoSuchFieldError unused3) {
                                    }
                                    try {
                                        iArr[SideEnum.CENTER_LEFT.ordinal()] = 4;
                                    } catch (NoSuchFieldError unused4) {
                                    }
                                    try {
                                        iArr[SideEnum.CENTER_RIGHT.ordinal()] = 5;
                                    } catch (NoSuchFieldError unused5) {
                                    }
                                    try {
                                        iArr[SideEnum.BOTTOM_LEFT.ordinal()] = 6;
                                    } catch (NoSuchFieldError unused6) {
                                    }
                                    try {
                                        iArr[SideEnum.BOTTOM_CENTER.ordinal()] = 7;
                                    } catch (NoSuchFieldError unused7) {
                                    }
                                    try {
                                        iArr[SideEnum.BOTTOM_RIGHT.ordinal()] = 8;
                                    } catch (NoSuchFieldError unused8) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope Canvas) {
                                long jOffset;
                                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                switch (WhenMappings.$EnumSwitchMapping$0[sideEnum5.ordinal()]) {
                                    case 1:
                                        jOffset = OffsetKt.Offset(0.0f, 0.0f);
                                        break;
                                    case 2:
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / 2, 0.0f);
                                        break;
                                    case 3:
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), 0.0f);
                                        break;
                                    case 4:
                                        jOffset = OffsetKt.Offset(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / 2);
                                        break;
                                    case 5:
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / 2);
                                        break;
                                    case 6:
                                        jOffset = OffsetKt.Offset(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                        break;
                                    case 7:
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / 2, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                        break;
                                    case 8:
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                        break;
                                    default:
                                        float f8 = 2;
                                        jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / f8, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f8);
                                        break;
                                }
                                Pair<Float, Color>[] pairArr = colorStops;
                                if (!(pairArr.length == 0)) {
                                    Brush brushM11304radialGradientP_VxKs = Brush.INSTANCE.m11304radialGradientP_VxKs((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), jOffset, f6, TileMode.INSTANCE.m11712getClamp3opZhB0());
                                    float f9 = f6;
                                    long jM11103minusMKHz9U = Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(f9, f9));
                                    float f10 = f6;
                                    float f11 = 2;
                                    DrawScope.m11877drawOvalAsUm42w$default(Canvas, brushM11304radialGradientP_VxKs, jM11103minusMKHz9U, androidx.compose.p003ui.geometry.SizeKt.Size(f10 * f11, f10 * f11), f7, null, null, 0, 112, null);
                                    return;
                                }
                                Brush brushM11303radialGradientP_VxKs = Brush.INSTANCE.m11303radialGradientP_VxKs(list4, jOffset, f6, TileMode.INSTANCE.m11712getClamp3opZhB0());
                                float f12 = f6;
                                long jM11103minusMKHz9U2 = Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(f12, f12));
                                float f13 = f6;
                                float f14 = 2;
                                DrawScope.m11877drawOvalAsUm42w$default(Canvas, brushM11303radialGradientP_VxKs, jM11103minusMKHz9U2, androidx.compose.p003ui.geometry.SizeKt.Size(f13 * f14, f13 * f14), f7, null, null, 0, 112, null);
                            }
                        }, composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endNode();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        sideEnum4 = sideEnum3;
                        list3 = list2;
                        f5 = f3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt.GradientSphere.2
                            public final /* synthetic */ int $$changed;
                            public final /* synthetic */ int $$default;
                            public final /* synthetic */ float $alpha;
                            public final /* synthetic */ SideEnum $centerSphere;
                            public final /* synthetic */ List<Color> $colorList;
                            public final /* synthetic */ Pair<Float, Color>[] $colorStops;
                            public final /* synthetic */ float $radius;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public C64372(SideEnum sideEnum42, List<Color> list32, final Pair<Float, Color>[] colorStops2, float f52, float f42, int i9, int i22) {
                                super(2);
                                sideEnum = sideEnum42;
                                list = list32;
                                pairArr = colorStops2;
                                f = f52;
                                f = f42;
                                i = i9;
                                i = i22;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i9) {
                                Modifier modifier6 = modifier;
                                SideEnum sideEnum6 = sideEnum;
                                List<Color> list5 = list;
                                Pair<Float, Color>[] pairArr = pairArr;
                                GradientSphereKt.GradientSphere(modifier6, sideEnum6, list5, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), f, f, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                f42 = f2;
                composerStartRestartGroup.startMovableGroup(-53716804, Integer.valueOf(colorStops2.length));
                while (i < r14) {
                }
                composerStartRestartGroup.endMovableGroup();
                if ((i3 & 7168) == 0) {
                }
                if (i4 != 4) {
                    composerStartRestartGroup.startDefaults();
                    if ((i9 & 1) != 0) {
                        if (i7 == 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        sideEnum3 = sideEnum2;
                        modifier3 = modifier5;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifier3);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM10870constructorimpl.getInserting()) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                            final SideEnum sideEnum52 = sideEnum3;
                            final float f62 = f42;
                            final float f72 = f3;
                            final List<Color> list42 = list2;
                            CanvasKt.Canvas(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt$GradientSphere$1$1

                                /* compiled from: GradientSphere.kt */
                                @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
                                /* loaded from: classes3.dex */
                                public /* synthetic */ class WhenMappings {
                                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                    static {
                                        int[] iArr = new int[SideEnum.values().length];
                                        try {
                                            iArr[SideEnum.TOP_LEFT.ordinal()] = 1;
                                        } catch (NoSuchFieldError unused) {
                                        }
                                        try {
                                            iArr[SideEnum.TOP_CENTER.ordinal()] = 2;
                                        } catch (NoSuchFieldError unused2) {
                                        }
                                        try {
                                            iArr[SideEnum.TOP_RIGHT.ordinal()] = 3;
                                        } catch (NoSuchFieldError unused3) {
                                        }
                                        try {
                                            iArr[SideEnum.CENTER_LEFT.ordinal()] = 4;
                                        } catch (NoSuchFieldError unused4) {
                                        }
                                        try {
                                            iArr[SideEnum.CENTER_RIGHT.ordinal()] = 5;
                                        } catch (NoSuchFieldError unused5) {
                                        }
                                        try {
                                            iArr[SideEnum.BOTTOM_LEFT.ordinal()] = 6;
                                        } catch (NoSuchFieldError unused6) {
                                        }
                                        try {
                                            iArr[SideEnum.BOTTOM_CENTER.ordinal()] = 7;
                                        } catch (NoSuchFieldError unused7) {
                                        }
                                        try {
                                            iArr[SideEnum.BOTTOM_RIGHT.ordinal()] = 8;
                                        } catch (NoSuchFieldError unused8) {
                                        }
                                        $EnumSwitchMapping$0 = iArr;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope Canvas) {
                                    long jOffset;
                                    Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                                    switch (WhenMappings.$EnumSwitchMapping$0[sideEnum52.ordinal()]) {
                                        case 1:
                                            jOffset = OffsetKt.Offset(0.0f, 0.0f);
                                            break;
                                        case 2:
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / 2, 0.0f);
                                            break;
                                        case 3:
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), 0.0f);
                                            break;
                                        case 4:
                                            jOffset = OffsetKt.Offset(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / 2);
                                            break;
                                        case 5:
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / 2);
                                            break;
                                        case 6:
                                            jOffset = OffsetKt.Offset(0.0f, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                            break;
                                        case 7:
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / 2, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                            break;
                                        case 8:
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()));
                                            break;
                                        default:
                                            float f8 = 2;
                                            jOffset = OffsetKt.Offset(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) / f8, Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) / f8);
                                            break;
                                    }
                                    Pair<Float, Color>[] pairArr = colorStops2;
                                    if (!(pairArr.length == 0)) {
                                        Brush brushM11304radialGradientP_VxKs = Brush.INSTANCE.m11304radialGradientP_VxKs((Pair<Float, Color>[]) Arrays.copyOf(pairArr, pairArr.length), jOffset, f62, TileMode.INSTANCE.m11712getClamp3opZhB0());
                                        float f9 = f62;
                                        long jM11103minusMKHz9U = Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(f9, f9));
                                        float f10 = f62;
                                        float f11 = 2;
                                        DrawScope.m11877drawOvalAsUm42w$default(Canvas, brushM11304radialGradientP_VxKs, jM11103minusMKHz9U, androidx.compose.p003ui.geometry.SizeKt.Size(f10 * f11, f10 * f11), f72, null, null, 0, 112, null);
                                        return;
                                    }
                                    Brush brushM11303radialGradientP_VxKs = Brush.INSTANCE.m11303radialGradientP_VxKs(list42, jOffset, f62, TileMode.INSTANCE.m11712getClamp3opZhB0());
                                    float f12 = f62;
                                    long jM11103minusMKHz9U2 = Offset.m11103minusMKHz9U(jOffset, OffsetKt.Offset(f12, f12));
                                    float f13 = f62;
                                    float f14 = 2;
                                    DrawScope.m11877drawOvalAsUm42w$default(Canvas, brushM11303radialGradientP_VxKs, jM11103minusMKHz9U2, androidx.compose.p003ui.geometry.SizeKt.Size(f13 * f14, f13 * f14), f72, null, null, 0, 112, null);
                                }
                            }, composerStartRestartGroup, 6);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            sideEnum42 = sideEnum3;
                            list32 = list2;
                            f52 = f3;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i6 = i22 & 32;
            if (i6 == 0) {
            }
            f42 = f2;
            composerStartRestartGroup.startMovableGroup(-53716804, Integer.valueOf(colorStops2.length));
            while (i < r14) {
            }
            composerStartRestartGroup.endMovableGroup();
            if ((i3 & 7168) == 0) {
            }
            if (i4 != 4) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        sideEnum2 = sideEnum;
        i4 = i22 & 4;
        if (i4 != 0) {
        }
        i5 = i22 & 16;
        if (i5 == 0) {
        }
        f3 = f;
        i6 = i22 & 32;
        if (i6 == 0) {
        }
        f42 = f2;
        composerStartRestartGroup.startMovableGroup(-53716804, Integer.valueOf(colorStops2.length));
        while (i < r14) {
        }
        composerStartRestartGroup.endMovableGroup();
        if ((i3 & 7168) == 0) {
        }
        if (i4 != 4) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(name = "GradientSphere")
    public static final void PreviewGradientSphere(Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(35853408);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(35853408, i, -1, "com.blackhub.bronline.game.ui.widget.other.PreviewGradientSphere (GradientSphere.kt:79)");
            }
            GradientSphere(null, null, null, new Pair[0], 0.0f, 0.0f, composerStartRestartGroup, 4096, 55);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.other.GradientSphereKt.PreviewGradientSphere.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64381(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    GradientSphereKt.PreviewGradientSphere(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
