package com.blackhub.bronline.game.p019ui.blackpass;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import com.blackhub.bronline.game.common.resources.StringResourceCompose;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.utils.BitmapUtilsKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.blackpass.data.PrizeObj;
import com.blackhub.bronline.game.p019ui.widget.utils.ImageBitmapKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.Nullable;

/* compiled from: BlackPassPrizeItemUi.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a0\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001aF\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, m7105d2 = {"BlackPassPrizeItemUi", "", "modifier", "Landroidx/compose/ui/Modifier;", "prizeObj", "Lcom/blackhub/bronline/game/gui/blackpass/data/PrizeObj;", "widthOfElement", "Landroidx/compose/ui/unit/Dp;", "BlackPassPrizeItemUi-6a0pyJM", "(Landroidx/compose/ui/Modifier;Lcom/blackhub/bronline/game/gui/blackpass/data/PrizeObj;FLandroidx/compose/runtime/Composer;II)V", "BlackPassPrizeItemUiContent", "prizeLevel", "", "prizeName", "", "imageBitmap", "Landroid/graphics/Bitmap;", "BlackPassPrizeItemUiContent-FJfuzF0", "(Landroidx/compose/ui/Modifier;ILjava/lang/String;Landroid/graphics/Bitmap;FLandroidx/compose/runtime/Composer;II)V", "PreviewBlackPassPrizeItemUi", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nBlackPassPrizeItemUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlackPassPrizeItemUi.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeItemUiKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,155:1\n74#2:156\n58#3:157\n51#3:158\n58#3:160\n58#3:161\n154#4:159\n*S KotlinDebug\n*F\n+ 1 BlackPassPrizeItemUi.kt\ncom/blackhub/bronline/game/ui/blackpass/BlackPassPrizeItemUiKt\n*L\n62#1:156\n66#1:157\n72#1:158\n74#1:160\n75#1:161\n73#1:159\n*E\n"})
/* loaded from: classes.dex */
public final class BlackPassPrizeItemUiKt {
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ec  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassPrizeItemUi-6a0pyJM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14889BlackPassPrizeItemUi6a0pyJM(@Nullable Modifier modifier, @Nullable PrizeObj prizeObj, float f, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        Modifier modifier3;
        PrizeObj prizeObj2;
        float fDimensionResource;
        Composer composerStartRestartGroup = composer.startRestartGroup(-532770196);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                f2 = f;
                int i6 = composerStartRestartGroup.changed(f2) ? 256 : 128;
                i3 |= i6;
            } else {
                f2 = f;
            }
            i3 |= i6;
        } else {
            f2 = f;
        }
        if (i5 != 2 || (i3 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if (i5 != 0) {
                    prizeObj2 = new PrizeObj(0, null, 0, 0, 0, null, 0, 0, 0, 0, 1023, null);
                    i3 &= -113;
                } else {
                    prizeObj2 = prizeObj;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                    fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composerStartRestartGroup, 6);
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-532770196, i3, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUi (BlackPassPrizeItemUi.kt:43)");
                }
                m14890BlackPassPrizeItemUiContentFJfuzF0(modifier3, prizeObj2.getCurrentLevel(), prizeObj2.getPrizeTitle(), prizeObj2.getImageBitmap(), fDimensionResource, composerStartRestartGroup, (i3 & 14) | 4096 | ((i3 << 6) & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if (i5 != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                prizeObj2 = prizeObj;
                modifier3 = modifier2;
            }
            fDimensionResource = f2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
            }
            m14890BlackPassPrizeItemUiContentFJfuzF0(modifier3, prizeObj2.getCurrentLevel(), prizeObj2.getPrizeTitle(), prizeObj2.getImageBitmap(), fDimensionResource, composerStartRestartGroup, (i3 & 14) | 4096 | ((i3 << 6) & 57344), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            prizeObj2 = prizeObj;
            modifier3 = modifier2;
            fDimensionResource = f2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier3;
            final PrizeObj prizeObj3 = prizeObj2;
            final float f3 = fDimensionResource;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiKt$BlackPassPrizeItemUi$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i7) {
                    BlackPassPrizeItemUiKt.m14889BlackPassPrizeItemUi6a0pyJM(modifier4, prizeObj3, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c8  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: BlackPassPrizeItemUiContent-FJfuzF0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14890BlackPassPrizeItemUiContentFJfuzF0(@Nullable Modifier modifier, int i, @Nullable String str, @Nullable Bitmap bitmap, float f, @Nullable Composer composer, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        int i5;
        String strEmpty;
        int i6;
        float f2;
        Modifier modifier3;
        Bitmap bitmap2;
        float fDimensionResource;
        int i7;
        final Bitmap bitmap3;
        final float f3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1792674345);
        int i8 = i3 & 1;
        if (i8 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        int i9 = i3 & 2;
        if (i9 == 0) {
            if ((i2 & 112) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 32 : 16;
            }
            if ((i2 & 896) != 0) {
                if ((i3 & 4) == 0) {
                    strEmpty = str;
                    int i10 = composerStartRestartGroup.changed(strEmpty) ? 256 : 128;
                    i4 |= i10;
                } else {
                    strEmpty = str;
                }
                i4 |= i10;
            } else {
                strEmpty = str;
            }
            i6 = i3 & 8;
            if (i6 != 0) {
                i4 |= 1024;
            }
            if ((57344 & i2) != 0) {
                if ((i3 & 16) == 0) {
                    f2 = f;
                    int i11 = composerStartRestartGroup.changed(f2) ? 16384 : 8192;
                    i4 |= i11;
                } else {
                    f2 = f;
                }
                i4 |= i11;
            } else {
                f2 = f;
            }
            if (i6 == 8 || (46811 & i4) != 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i9 != 0) {
                        i5 = 0;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                        strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                    }
                    Bitmap bitmap4 = i6 == 0 ? null : bitmap;
                    if ((i3 & 16) == 0) {
                        i4 &= -57345;
                        fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._86sdp, composerStartRestartGroup, 6);
                        bitmap2 = bitmap4;
                        i7 = i5;
                        int i12 = i4;
                        final String str2 = strEmpty;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1792674345, i12, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiContent (BlackPassPrizeItemUi.kt:60)");
                        }
                        Bitmap bitmapDrawableToBitmap = bitmap2 != null ? BitmapUtilsKt.drawableToBitmap((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), R.drawable.img_logo_br_big) : bitmap2;
                        float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6);
                        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(fDimensionResource - fDimensionResource2);
                        float fDimensionResource3 = PrimitiveResources_androidKt.dimensionResource(R.dimen._101sdp, composerStartRestartGroup, 6);
                        final float fDimensionResource4 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                        final float fDimensionResource5 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6);
                        final float fDimensionResource6 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composerStartRestartGroup, 6);
                        final float fDimensionResource7 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6);
                        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(fDimensionResource6 + fDimensionResource7);
                        final float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(0);
                        final float fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(fDimensionResource - PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6));
                        final float fM13666constructorimpl5 = C2046Dp.m13666constructorimpl(fDimensionResource - PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6));
                        final Bitmap bitmap5 = bitmapDrawableToBitmap;
                        final int i13 = i7;
                        SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(modifier3, fDimensionResource2, fDimensionResource2, 0.0f, 0.0f, 12, null), fM13666constructorimpl, fDimensionResource3), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource4), ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1769627086, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiKt$BlackPassPrizeItemUiContent$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i14) {
                                if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1769627086, i14, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiContent.<anonymous> (BlackPassPrizeItemUi.kt:83)");
                                    }
                                    Alignment.Companion companion = Alignment.INSTANCE;
                                    Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                    float f4 = fM13666constructorimpl4;
                                    float f5 = fM13666constructorimpl5;
                                    Bitmap bitmap6 = bitmap5;
                                    float f6 = fDimensionResource5;
                                    String str3 = str2;
                                    float f7 = fDimensionResource6;
                                    float f8 = fDimensionResource7;
                                    float f9 = fDimensionResource4;
                                    float f10 = fM13666constructorimpl3;
                                    float f11 = fM13666constructorimpl2;
                                    int i15 = i13;
                                    composer2.startReplaceableGroup(-483455358);
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor2);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    Color.Companion companion4 = Color.INSTANCE;
                                    BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(companion2, companion4.m11377getWhite0d7_KjU(), null, 2, null), 0.0f, 1, null), f7), composer2, 0);
                                    BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, f8, 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(f9, f9, f10, f10)), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), null, 2, null), 0.0f, 1, null), f7), composer2, 0);
                                    Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f11);
                                    Alignment center = companion.getCenter();
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                                    if (!(composer2.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer2.startReusableNode();
                                    if (composer2.getInserting()) {
                                        composer2.createNode(constructor3);
                                    } else {
                                        composer2.useNode();
                                    }
                                    Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                                    Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                    AnnotatedString bPPrizeLevel = StringResourceCompose.INSTANCE.getBPPrizeLevel(i15, composer2, 48);
                                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                                    long jM11366getBlack0d7_KjU = companion4.m11366getBlack0d7_KjU();
                                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                                    TextKt.m10025TextIbK3jfQ(bPPrizeLevel, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14872mullerBold7ssp67j0QOw(jM11366getBlack0d7_KjU, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 24582, 12), composer2, 48, 0, 131068);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap6, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, f4), f5), null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composer2, 3080, 116);
                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion2, f6, 0.0f, 2, null);
                                    int iM13558getCentere0LSkKk = companion5.m13558getCentere0LSkKk();
                                    TextKt.m10024Text4IGK_g(str3, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14842montserratMedium9spOr7ssp67j0QOw(ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, MatroskaExtractor.ID_CONTENT_ENCODINGS, 2), composer2, 0, 0, 65020);
                                    composer2.endReplaceableGroup();
                                    composer2.endNode();
                                    composer2.endReplaceableGroup();
                                    composer2.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer2.skipToGroupEnd();
                            }
                        }), composerStartRestartGroup, 12582912, 120);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        strEmpty = str2;
                        bitmap3 = bitmap2;
                        f3 = fDimensionResource;
                    } else {
                        bitmap2 = bitmap4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 16) != 0) {
                        i4 &= -57345;
                    }
                    bitmap2 = bitmap;
                    modifier3 = modifier2;
                }
                i7 = i5;
                fDimensionResource = f2;
                int i122 = i4;
                final String str22 = strEmpty;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                if (bitmap2 != null) {
                }
                float fDimensionResource22 = PrimitiveResources_androidKt.dimensionResource(R.dimen._2sdp, composerStartRestartGroup, 6);
                float fM13666constructorimpl6 = C2046Dp.m13666constructorimpl(fDimensionResource - fDimensionResource22);
                float fDimensionResource32 = PrimitiveResources_androidKt.dimensionResource(R.dimen._101sdp, composerStartRestartGroup, 6);
                final float fDimensionResource42 = PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6);
                final float fDimensionResource52 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6);
                final float fDimensionResource62 = PrimitiveResources_androidKt.dimensionResource(R.dimen._14sdp, composerStartRestartGroup, 6);
                final float fDimensionResource72 = PrimitiveResources_androidKt.dimensionResource(R.dimen._1sdp, composerStartRestartGroup, 6);
                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(fDimensionResource62 + fDimensionResource72);
                final float fM13666constructorimpl32 = C2046Dp.m13666constructorimpl(0);
                final float fM13666constructorimpl42 = C2046Dp.m13666constructorimpl(fDimensionResource - PrimitiveResources_androidKt.dimensionResource(R.dimen._8sdp, composerStartRestartGroup, 6));
                final float fM13666constructorimpl52 = C2046Dp.m13666constructorimpl(fDimensionResource - PrimitiveResources_androidKt.dimensionResource(R.dimen._18sdp, composerStartRestartGroup, 6));
                final Bitmap bitmap52 = bitmapDrawableToBitmap;
                final int i132 = i7;
                SurfaceKt.m9876SurfaceT9BRK9s(SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(modifier3, fDimensionResource22, fDimensionResource22, 0.0f, 0.0f, 12, null), fM13666constructorimpl6, fDimensionResource32), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(fDimensionResource42), ColorResources_androidKt.colorResource(R.color.dark_gray_blue, composerStartRestartGroup, 6), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1769627086, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiKt$BlackPassPrizeItemUiContent$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                    @Composable
                    public final void invoke(@Nullable Composer composer2, int i14) {
                        if ((i14 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1769627086, i14, -1, "com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiContent.<anonymous> (BlackPassPrizeItemUi.kt:83)");
                            }
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                            float f4 = fM13666constructorimpl42;
                            float f5 = fM13666constructorimpl52;
                            Bitmap bitmap6 = bitmap52;
                            float f6 = fDimensionResource52;
                            String str3 = str22;
                            float f7 = fDimensionResource62;
                            float f8 = fDimensionResource72;
                            float f9 = fDimensionResource42;
                            float f10 = fM13666constructorimpl32;
                            float f11 = fM13666constructorimpl22;
                            int i15 = i132;
                            composer2.startReplaceableGroup(-483455358);
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion.getTopStart(), false, composer2, 0);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            Color.Companion companion4 = Color.INSTANCE;
                            BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(companion2, companion4.m11377getWhite0d7_KjU(), null, 2, null), 0.0f, 1, null), f7), composer2, 0);
                            BoxKt.Box(SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(PaddingKt.m8127paddingqDBjuR0$default(companion2, 0.0f, f8, 0.0f, 0.0f, 13, null), RoundedCornerShapeKt.m8393RoundedCornerShapea9UjIt4(f9, f9, f10, f10)), ColorResources_androidKt.colorResource(R.color.yellow, composer2, 6), null, 2, null), 0.0f, 1, null), f7), composer2, 0);
                            Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), f11);
                            Alignment center = companion.getCenter();
                            composer2.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM8158height3ABfNKs);
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor3);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composer2);
                            Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            AnnotatedString bPPrizeLevel = StringResourceCompose.INSTANCE.getBPPrizeLevel(i15, composer2, 48);
                            TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                            long jM11366getBlack0d7_KjU = companion4.m11366getBlack0d7_KjU();
                            TextAlign.Companion companion5 = TextAlign.INSTANCE;
                            TextKt.m10025TextIbK3jfQ(bPPrizeLevel, modifierFillMaxWidth$default, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, typographyStyle.m14872mullerBold7ssp67j0QOw(jM11366getBlack0d7_KjU, companion5.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, 24582, 12), composer2, 48, 0, 131068);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            ImageBitmapKt.m15118ImageBitmapAy9G7rc(bitmap6, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, f4), f5), null, ContentScale.INSTANCE.getInside(), 0.0f, null, 0, composer2, 3080, 116);
                            Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion2, f6, 0.0f, 2, null);
                            int iM13558getCentere0LSkKk = companion5.m13558getCentere0LSkKk();
                            TextKt.m10024Text4IGK_g(str3, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14842montserratMedium9spOr7ssp67j0QOw(ColorResources_androidKt.colorResource(R.color.white, composer2, 6), 0, Offset.INSTANCE.m11115getZeroF1C5BW0(), 0.0f, composer2, MatroskaExtractor.ID_CONTENT_ENCODINGS, 2), composer2, 0, 0, 65020);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, 12582912, 120);
                if (ComposerKt.isTraceInProgress()) {
                }
                strEmpty = str22;
                bitmap3 = bitmap2;
                f3 = fDimensionResource;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                bitmap3 = bitmap;
                modifier3 = modifier2;
                i7 = i5;
                f3 = f2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final int i14 = i7;
                final String str3 = strEmpty;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiKt$BlackPassPrizeItemUiContent$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i15) {
                        BlackPassPrizeItemUiKt.m14890BlackPassPrizeItemUiContentFJfuzF0(modifier4, i14, str3, bitmap3, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                    }
                });
                return;
            }
            return;
        }
        i4 |= 48;
        i5 = i;
        if ((i2 & 896) != 0) {
        }
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        if ((57344 & i2) != 0) {
        }
        if (i6 == 8) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i8 == 0) {
                }
                if (i9 != 0) {
                }
                if ((i3 & 4) != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 16) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewBlackPassPrizeItemUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1596620354);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1596620354, i, -1, "com.blackhub.bronline.game.ui.blackpass.PreviewBlackPassPrizeItemUi (BlackPassPrizeItemUi.kt:149)");
            }
            m14890BlackPassPrizeItemUiContentFJfuzF0(null, 1, "мотоциghfhfgss\n'урал'\n'мотоциghfhfgкsss'", null, 0.0f, composerStartRestartGroup, 432, 25);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.blackpass.BlackPassPrizeItemUiKt.PreviewBlackPassPrizeItemUi.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    BlackPassPrizeItemUiKt.PreviewBlackPassPrizeItemUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}
