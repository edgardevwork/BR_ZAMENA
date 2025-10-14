package com.blackhub.bronline.game.p019ui.catchstreamer;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontFamilyKt;
import androidx.compose.p003ui.text.font.FontKt;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.text.style.TextMotion;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.TextUnitKt;
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
import com.blackhub.bronline.game.p019ui.widget.block.LeftCornerBlockKt;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonFillKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.Nullable;

/* compiled from: FreezeStreamerUi.kt */
@SourceDebugExtension({"SMAP\nFreezeStreamerUi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FreezeStreamerUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/FreezeStreamerUiKt\n+ 2 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,106:1\n1099#2:107\n928#2,6:108\n*S KotlinDebug\n*F\n+ 1 FreezeStreamerUi.kt\ncom/blackhub/bronline/game/ui/catchstreamer/FreezeStreamerUiKt\n*L\n41#1:107\n43#1:108,6\n*E\n"})

public final class FreezeStreamerUiKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void FreezeStreamerUi(@Nullable Modifier modifier, @Nullable Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final Modifier modifier3;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1911474865);
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
        if ((i3 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
            modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1911474865, i3, -1, "com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUi (FreezeStreamerUi.kt:38)");
            }
            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
            builder.append("Заморозьте любого члена команды за ");
            int iPushStyle = builder.pushStyle(new SpanStyle(ColorKt.Color(4294952704L), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append("50 BC");
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                final AnnotatedString annotatedString = builder.toAnnotatedString();
                LeftCornerBlockKt.LeftCornerBlock(null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1564558860, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUiKt.FreezeStreamerUi.1
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
                    public final void invoke(@Nullable Composer composer2, int i5) {
                        if ((i5 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1564558860, i5, -1, "com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUi.<anonymous> (FreezeStreamerUi.kt:49)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            float f = 8;
                            Modifier modifierM8124paddingVpY3zN4 = PaddingKt.m8124paddingVpY3zN4(companion, C2046Dp.m13666constructorimpl(12), C2046Dp.m13666constructorimpl(f));
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_4 = arrangement.m8032spacedBy0680j_4(C2046Dp.m13666constructorimpl(f));
                            AnnotatedString annotatedString2 = annotatedString;
                            Modifier modifier4 = modifier3;
                            composer2.startReplaceableGroup(-483455358);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_4, companion2.getStart(), composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8124paddingVpY3zN4);
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
                            TextKt.m10024Text4IGK_g("Заморозить стримера?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, new TextStyle(ColorKt.Color(4294967295L), TextUnitKt.getSp(12), new FontWeight(700), (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 6, 0, 65534);
                            TextKt.m10025TextIbK3jfQ(annotatedString2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, new TextStyle(ColorKt.Color(4294967295L), TextUnitKt.getSp(7), new FontWeight(600), (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, 0, 0, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, 0, 0, (TextMotion) null, 16777176, (DefaultConstructorMarker) null), composer2, 0, 0, 131070);
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM8032spacedBy0680j_42 = arrangement.m8032spacedBy0680j_4(C2046Dp.m13666constructorimpl(f));
                            composer2.startReplaceableGroup(693286680);
                            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM8032spacedBy0680j_42, companion2.getTop(), composer2, 6);
                            composer2.startReplaceableGroup(-1323940314);
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion);
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
                            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                            composer2.startReplaceableGroup(2058660585);
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            float f2 = 28;
                            MainButtonFillKt.m15075MainButtonFilljAZ_Pg4(SizeKt.m8158height3ABfNKs(modifier4, C2046Dp.m13666constructorimpl(f2)), "АКТИВИРОВАТЬ", TypographyStyle.INSTANCE.m14804montserratBold7brsp67j0QOw(0L, TextAlign.INSTANCE.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), ColorKt.Color(4293013772L), 0.0f, 0.0f, false, false, false, null, composer2, 3120, 1008);
                            IconButtonKt.IconButton(new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUiKt$FreezeStreamerUi$1$1$1$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2() {
                                }

                                @Override // kotlin.jvm.functions.Function0
                                public /* bridge */ /* synthetic */ Unit invoke() {
                                    invoke2();
                                    return Unit.INSTANCE;
                                }
                            }, SizeKt.m8172size3ABfNKs(BackgroundKt.m7770backgroundbw27NRU(modifier4, ColorKt.Color(4283258999L), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(C2046Dp.m13666constructorimpl(4))), C2046Dp.m13666constructorimpl(f2)), false, null, null, ComposableSingletons$FreezeStreamerUiKt.INSTANCE.m14945getLambda1$app_siteRelease(), composer2, 196614, 28);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
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
                }), composerStartRestartGroup, 48, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUiKt.FreezeStreamerUi.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    FreezeStreamerUiKt.FreezeStreamerUi(modifier3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @Preview(backgroundColor = 16777215, name = "FreezeStreamerUi")
    public static final void PreviewFreezeStreamerUi(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1807781812);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1807781812, i, -1, "com.blackhub.bronline.game.ui.catchstreamer.PreviewFreezeStreamerUi (FreezeStreamerUi.kt:103)");
            }
            FreezeStreamerUi(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.catchstreamer.FreezeStreamerUiKt.PreviewFreezeStreamerUi.1
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
                    FreezeStreamerUiKt.PreviewFreezeStreamerUi(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

