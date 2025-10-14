package com.blackhub.bronline.game.p019ui.plates;

import android.annotation.SuppressLint;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.theme.TypographyStyle;
import com.bless.client.R;
import io.ktor.util.date.GMTDateParser;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PlatesTypeOfPlate.kt */
@SourceDebugExtension({"SMAP\nPlatesTypeOfPlate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatesTypeOfPlate.kt\ncom/blackhub/bronline/game/ui/plates/PlatesTypeOfPlateKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,391:1\n67#2,7:392\n74#2:427\n78#2:485\n67#2,7:486\n74#2:521\n78#2:532\n67#2,7:533\n74#2:568\n78#2:579\n67#2,7:580\n74#2:615\n78#2:673\n67#2,7:674\n74#2:709\n78#2:714\n79#3,11:399\n79#3,11:435\n92#3:479\n92#3:484\n79#3,11:493\n92#3:531\n79#3,11:540\n92#3:578\n79#3,11:587\n79#3,11:623\n92#3:667\n92#3:672\n79#3,11:681\n92#3:713\n456#4,8:410\n464#4,3:424\n456#4,8:446\n464#4,3:460\n467#4,3:476\n467#4,3:481\n456#4,8:504\n464#4,3:518\n467#4,3:528\n456#4,8:551\n464#4,3:565\n467#4,3:575\n456#4,8:598\n464#4,3:612\n456#4,8:634\n464#4,3:648\n467#4,3:664\n467#4,3:669\n456#4,8:692\n464#4,3:706\n467#4,3:710\n3737#5,6:418\n3737#5,6:454\n3737#5,6:512\n3737#5,6:559\n3737#5,6:606\n3737#5,6:642\n3737#5,6:700\n86#6,7:428\n93#6:463\n97#6:480\n86#6,7:616\n93#6:651\n97#6:668\n1116#7,6:464\n1116#7,6:470\n1116#7,6:522\n1116#7,6:569\n1116#7,6:652\n1116#7,6:658\n*S KotlinDebug\n*F\n+ 1 PlatesTypeOfPlate.kt\ncom/blackhub/bronline/game/ui/plates/PlatesTypeOfPlateKt\n*L\n57#1:392,7\n57#1:427\n57#1:485\n149#1:486,7\n149#1:521\n149#1:532\n202#1:533,7\n202#1:568\n202#1:579\n255#1:580,7\n255#1:615\n255#1:673\n350#1:674,7\n350#1:709\n350#1:714\n57#1:399,11\n68#1:435,11\n68#1:479\n57#1:484\n149#1:493,11\n149#1:531\n202#1:540,11\n202#1:578\n255#1:587,11\n266#1:623,11\n266#1:667\n255#1:672\n350#1:681,11\n350#1:713\n57#1:410,8\n57#1:424,3\n68#1:446,8\n68#1:460,3\n68#1:476,3\n57#1:481,3\n149#1:504,8\n149#1:518,3\n149#1:528,3\n202#1:551,8\n202#1:565,3\n202#1:575,3\n255#1:598,8\n255#1:612,3\n266#1:634,8\n266#1:648,3\n266#1:664,3\n255#1:669,3\n350#1:692,8\n350#1:706,3\n350#1:710,3\n57#1:418,6\n68#1:454,6\n149#1:512,6\n202#1:559,6\n255#1:606,6\n266#1:642,6\n350#1:700,6\n68#1:428,7\n68#1:463\n68#1:480\n266#1:616,7\n266#1:651\n266#1:668\n73#1:464,6\n111#1:470,6\n162#1:522,6\n215#1:569,6\n271#1:652,6\n311#1:658,6\n*E\n"})

public final class PlatesTypeOfPlateKt {
    public static final int BY_PLATE_MAX_LENGTH = 9;
    public static final int KZ_PLATE_MAX_LENGTH = 6;
    public static final int KZ_REGION_MAX_LENGTH = 2;
    public static final int RU_PLATE_MAX_LENGTH = 6;
    public static final int RU_REGION_MAX_LENGTH = 3;
    public static final int UA_PLATE_MAX_LENGTH = 10;

    @NotNull
    public static final char[] mAllowedLower = {'a', 'b', 'c', 'e', GMTDateParser.HOURS, 'k', GMTDateParser.MINUTES, 'o', 'p', 't', 'x', 'y', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @NotNull
    public static final char[] mAllowedHighUa = {'A', 'B', 'C', 'E', 'H', 'K', GMTDateParser.MONTH, 'O', 'P', 'T', 'X', GMTDateParser.YEAR, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' '};

    @NotNull
    public static final char[] mAllowedHighBy = {'A', 'B', 'C', 'E', 'H', 'K', GMTDateParser.MONTH, 'O', 'P', 'T', 'X', GMTDateParser.YEAR, '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', ' ', '-'};

    @NotNull
    public static final char[] mAllowedReg = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PlatesTypeOfPlate(final int i, @NotNull final MutableState<String> plateNumber, @NotNull final MutableState<String> plateRegion, final boolean z, @NotNull final Function0<Unit> sendServerNewPlateNumber, @Nullable Composer composer, final int i2) {
        int i3;
        int i4;
        boolean z2;
        Intrinsics.checkNotNullParameter(plateNumber, "plateNumber");
        Intrinsics.checkNotNullParameter(plateRegion, "plateRegion");
        Intrinsics.checkNotNullParameter(sendServerNewPlateNumber, "sendServerNewPlateNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-530041512);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(plateNumber) ? 32 : 16;
        }
        if ((i2 & 896) == 0) {
            i3 |= composerStartRestartGroup.changed(plateRegion) ? 256 : 128;
        }
        if ((i2 & 7168) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 57344) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(sendServerNewPlateNumber) ? 16384 : 8192;
        }
        int i5 = i3;
        if ((46811 & i5) != 9362 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-530041512, i5, -1, "com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlate (PlatesTypeOfPlate.kt:50)");
            }
            float fDimensionResource = PrimitiveResources_androidKt.dimensionResource(R.dimen._300wdp, composerStartRestartGroup, 6);
            float fDimensionResource2 = PrimitiveResources_androidKt.dimensionResource(R.dimen._86wdp, composerStartRestartGroup, 6);
            if (i == 0) {
                composerStartRestartGroup.startReplaceableGroup(-1733182746);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment centerStart = companion.getCenterStart();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(centerStart, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_plate_ru, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion2, fDimensionResource), fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(companion2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                String value = plateNumber.getValue();
                Modifier modifierM8127paddingqDBjuR0$default = PaddingKt.m8127paddingqDBjuR0$default(SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._230wdp, composerStartRestartGroup, 6), fDimensionResource2), PrimitiveResources_androidKt.dimensionResource(R.dimen._5wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                TextStyle textStyleM14878ruOrKzFontsMvkAmo = typographyStyle.m14878ruOrKzFontsMvkAmo(R.dimen._70wsp, 0L, 0, BaselineShift.m13442boximpl(BaselineShift.m13443constructorimpl(-1.0f)), 0L, 0.0f, composerStartRestartGroup, 1575942, 54);
                KeyboardType.Companion companion4 = KeyboardType.INSTANCE;
                int iM13391getEmailPjHm6EE = companion4.m13391getEmailPjHm6EE();
                ImeAction.Companion companion5 = ImeAction.INSTANCE;
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, iM13391getEmailPjHm6EE, companion5.m13342getDoneeUduSuo(), null, 19, null);
                Color.Companion companion6 = Color.INSTANCE;
                SolidColor solidColor = new SolidColor(companion6.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(2106025747);
                int i6 = i5 & 57344;
                boolean z3 = ((i5 & 112) == 32) | (i6 == 16384);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateNumber;
                            int length = stringNumber.length();
                            int i7 = 0;
                            while (true) {
                                if (i7 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i7), PlatesTypeOfPlateKt.mAllowedLower)) {
                                    stringNumber = stringNumber.substring(0, i7);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i7++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 6));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableSingletons$PlatesTypeOfPlateKt composableSingletons$PlatesTypeOfPlateKt = ComposableSingletons$PlatesTypeOfPlateKt.INSTANCE;
                int i7 = (i5 & 7168) | 1572864;
                BasicTextFieldKt.BasicTextField(value, (Function1<? super String, Unit>) objRememberedValue, modifierM8127paddingqDBjuR0$default, z, false, textStyleM14878ruOrKzFontsMvkAmo, keyboardOptions, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$PlatesTypeOfPlateKt.m15013getLambda1$app_siteRelease(), composerStartRestartGroup, i7, 221184, 16272);
                String value2 = plateRegion.getValue();
                Modifier modifierM8174sizeVpY3zN4 = SizeKt.m8174sizeVpY3zN4(companion2, PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composerStartRestartGroup, 6), fDimensionResource2);
                TextStyle textStyleM14878ruOrKzFontsMvkAmo2 = typographyStyle.m14878ruOrKzFontsMvkAmo(R.dimen._34wsp, 0L, 0, BaselineShift.m13442boximpl(BaselineShift.m13443constructorimpl(-1.0f)), 0L, 0.0f, composerStartRestartGroup, 1575942, 54);
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, false, companion4.m13391getEmailPjHm6EE(), companion5.m13342getDoneeUduSuo(), null, 19, null);
                SolidColor solidColor2 = new SolidColor(companion6.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(2106027509);
                boolean z4 = ((i5 & 896) == 256) | (i6 == 16384);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$1$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateRegion;
                            int length = stringNumber.length();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i8), PlatesTypeOfPlateKt.mAllowedReg)) {
                                    stringNumber = stringNumber.substring(0, i8);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i8++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 3));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(value2, (Function1<? super String, Unit>) objRememberedValue2, modifierM8174sizeVpY3zN4, z, false, textStyleM14878ruOrKzFontsMvkAmo2, keyboardOptions2, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$PlatesTypeOfPlateKt.m15014getLambda2$app_siteRelease(), composerStartRestartGroup, i7, 221184, 16272);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            } else if (i == 1) {
                composerStartRestartGroup.startReplaceableGroup(-1733178801);
                Alignment center = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion7 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion8.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(companion7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl3 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl3, measurePolicyRememberBoxMeasurePolicy2, companion8.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl3, currentCompositionLocalMap3, companion8.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion8.getSetCompositeKeyHash();
                if (composerM10870constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM10870constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM10870constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                function3ModifierMaterializerOf3.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_plate_ua, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion7, fDimensionResource), fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                String value3 = plateNumber.getValue();
                Modifier modifierM8083offsetVpY3zN4 = OffsetKt.m8083offsetVpY3zN4(SizeKt.m8174sizeVpY3zN4(companion7, fDimensionResource, fDimensionResource2), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
                TextStyle textStyleM14879uaOrByFontbl3sdaw = TypographyStyle.INSTANCE.m14879uaOrByFontbl3sdaw(R.dimen._45wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
                KeyboardOptions keyboardOptions3 = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13391getEmailPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null);
                SolidColor solidColor3 = new SolidColor(Color.INSTANCE.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(-389294626);
                boolean z5 = ((i5 & 112) == 32) | ((i5 & 57344) == 16384);
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (z5 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$2$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateNumber;
                            int length = stringNumber.length();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i8), PlatesTypeOfPlateKt.mAllowedHighUa)) {
                                    stringNumber = stringNumber.substring(0, i8);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i8++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 10));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(value3, (Function1<? super String, Unit>) objRememberedValue3, modifierM8083offsetVpY3zN4, z, false, textStyleM14879uaOrByFontbl3sdaw, keyboardOptions3, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor3, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$PlatesTypeOfPlateKt.INSTANCE.m15015getLambda3$app_siteRelease(), composerStartRestartGroup, (i5 & 7168) | 1572864, 221184, 16272);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            } else if (i == 2) {
                composerStartRestartGroup.startReplaceableGroup(-1733176772);
                Alignment center2 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion9 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(companion9);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyRememberBoxMeasurePolicy3, companion10.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion10.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion10.getSetCompositeKeyHash();
                if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                    composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                    composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                }
                function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_plate_by, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion9, fDimensionResource), fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                String value4 = plateNumber.getValue();
                Modifier modifierM8083offsetVpY3zN42 = OffsetKt.m8083offsetVpY3zN4(SizeKt.m8174sizeVpY3zN4(companion9, fDimensionResource, fDimensionResource2), PrimitiveResources_androidKt.dimensionResource(R.dimen._27wdp, composerStartRestartGroup, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._3wdp, composerStartRestartGroup, 6));
                TextStyle textStyleM14879uaOrByFontbl3sdaw2 = TypographyStyle.INSTANCE.m14879uaOrByFontbl3sdaw(R.dimen._45wsp, 0L, 0, 0L, 0.0f, composerStartRestartGroup, 196614, 30);
                KeyboardOptions keyboardOptions4 = new KeyboardOptions(0, false, KeyboardType.INSTANCE.m13391getEmailPjHm6EE(), ImeAction.INSTANCE.m13342getDoneeUduSuo(), null, 19, null);
                SolidColor solidColor4 = new SolidColor(Color.INSTANCE.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(-389292597);
                boolean z6 = ((i5 & 112) == 32) | ((i5 & 57344) == 16384);
                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (z6 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$3$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateNumber;
                            int length = stringNumber.length();
                            int i8 = 0;
                            while (true) {
                                if (i8 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i8), PlatesTypeOfPlateKt.mAllowedHighBy)) {
                                    stringNumber = stringNumber.substring(0, i8);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i8++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 9));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(value4, (Function1<? super String, Unit>) objRememberedValue4, modifierM8083offsetVpY3zN42, z, false, textStyleM14879uaOrByFontbl3sdaw2, keyboardOptions4, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor4, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableSingletons$PlatesTypeOfPlateKt.INSTANCE.m15016getLambda4$app_siteRelease(), composerStartRestartGroup, (i5 & 7168) | 1572864, 221184, 16272);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit3 = Unit.INSTANCE;
            } else if (i == 3) {
                composerStartRestartGroup.startReplaceableGroup(-1733174743);
                Alignment.Companion companion11 = Alignment.INSTANCE;
                Alignment center3 = companion11.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion12 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor5 = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(companion12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor5);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy4, companion13.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion13.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion13.getSetCompositeKeyHash();
                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                }
                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_plate_kz, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion12, fDimensionResource), fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                Alignment.Vertical centerVertically2 = companion11.getCenterVertically();
                composerStartRestartGroup.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composerStartRestartGroup, 48);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor6 = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(companion12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor6);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl6 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl6, measurePolicyRowMeasurePolicy2, companion13.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl6, currentCompositionLocalMap6, companion13.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion13.getSetCompositeKeyHash();
                if (composerM10870constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                    composerM10870constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                    composerM10870constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                }
                function3ModifierMaterializerOf6.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                String value5 = plateNumber.getValue();
                Modifier modifierM8174sizeVpY3zN42 = SizeKt.m8174sizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._60wdp, composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._160wdp, composerStartRestartGroup, 6), fDimensionResource2);
                TypographyStyle typographyStyle2 = TypographyStyle.INSTANCE;
                TextStyle textStyleM14878ruOrKzFontsMvkAmo3 = typographyStyle2.m14878ruOrKzFontsMvkAmo(R.dimen._55wsp, 0L, 0, BaselineShift.m13442boximpl(BaselineShift.m13443constructorimpl(-1.0f)), 0L, 0.0f, composerStartRestartGroup, 1575942, 54);
                KeyboardType.Companion companion14 = KeyboardType.INSTANCE;
                int iM13391getEmailPjHm6EE2 = companion14.m13391getEmailPjHm6EE();
                ImeAction.Companion companion15 = ImeAction.INSTANCE;
                KeyboardOptions keyboardOptions5 = new KeyboardOptions(0, false, iM13391getEmailPjHm6EE2, companion15.m13342getDoneeUduSuo(), null, 19, null);
                Color.Companion companion16 = Color.INSTANCE;
                SolidColor solidColor5 = new SolidColor(companion16.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(2106033745);
                int i8 = i5 & 57344;
                boolean z7 = ((i5 & 112) == 32) | (i8 == 16384);
                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (z7 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$4$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateNumber;
                            int length = stringNumber.length();
                            int i9 = 0;
                            while (true) {
                                if (i9 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i9), PlatesTypeOfPlateKt.mAllowedLower)) {
                                    stringNumber = stringNumber.substring(0, i9);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i9++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 6));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                ComposableSingletons$PlatesTypeOfPlateKt composableSingletons$PlatesTypeOfPlateKt2 = ComposableSingletons$PlatesTypeOfPlateKt.INSTANCE;
                int i9 = (i5 & 7168) | 1572864;
                BasicTextFieldKt.BasicTextField(value5, (Function1<? super String, Unit>) objRememberedValue5, modifierM8174sizeVpY3zN42, z, false, textStyleM14878ruOrKzFontsMvkAmo3, keyboardOptions5, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor5, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$PlatesTypeOfPlateKt2.m15017getLambda5$app_siteRelease(), composerStartRestartGroup, i9, 221184, 16272);
                String value6 = plateRegion.getValue();
                Modifier modifierM8174sizeVpY3zN43 = SizeKt.m8174sizeVpY3zN4(companion12, PrimitiveResources_androidKt.dimensionResource(R.dimen._64wdp, composerStartRestartGroup, 6), fDimensionResource2);
                TextStyle textStyleM14878ruOrKzFontsMvkAmo4 = typographyStyle2.m14878ruOrKzFontsMvkAmo(R.dimen._50wsp, 0L, 0, BaselineShift.m13442boximpl(BaselineShift.m13443constructorimpl(-1.0f)), 0L, 0.0f, composerStartRestartGroup, 1575942, 54);
                KeyboardOptions keyboardOptions6 = new KeyboardOptions(0, false, companion14.m13391getEmailPjHm6EE(), companion15.m13342getDoneeUduSuo(), null, 19, null);
                SolidColor solidColor6 = new SolidColor(companion16.m11375getTransparent0d7_KjU(), null);
                composerStartRestartGroup.startReplaceableGroup(2106035510);
                if ((i5 & 896) == 256) {
                    z2 = true;
                    i4 = i8;
                } else {
                    i4 = i8;
                    z2 = false;
                }
                boolean z8 = z2 | (i4 == 16384);
                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (z8 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt$PlatesTypeOfPlate$4$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str) {
                            invoke2(str);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String stringNumber) {
                            Intrinsics.checkNotNullParameter(stringNumber, "stringNumber");
                            MutableState<String> mutableState = plateRegion;
                            int length = stringNumber.length();
                            int i10 = 0;
                            while (true) {
                                if (i10 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(stringNumber.charAt(i10), PlatesTypeOfPlateKt.mAllowedReg)) {
                                    stringNumber = stringNumber.substring(0, i10);
                                    Intrinsics.checkNotNullExpressionValue(stringNumber, "substring(...)");
                                    break;
                                }
                                i10++;
                            }
                            mutableState.setValue(StringsKt___StringsKt.take(stringNumber, 2));
                            sendServerNewPlateNumber.invoke();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                BasicTextFieldKt.BasicTextField(value6, (Function1<? super String, Unit>) objRememberedValue6, modifierM8174sizeVpY3zN43, z, false, textStyleM14878ruOrKzFontsMvkAmo4, keyboardOptions6, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) solidColor6, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) composableSingletons$PlatesTypeOfPlateKt2.m15018getLambda6$app_siteRelease(), composerStartRestartGroup, i9, 221184, 16272);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit4 = Unit.INSTANCE;
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1733170803);
                Alignment center4 = Alignment.INSTANCE.getCenter();
                composerStartRestartGroup.startReplaceableGroup(733328855);
                Modifier.Companion companion17 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion18 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor7 = companion18.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(companion17);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor7);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM10870constructorimpl7 = Updater.m10870constructorimpl(composerStartRestartGroup);
                Updater.m10877setimpl(composerM10870constructorimpl7, measurePolicyRememberBoxMeasurePolicy5, companion18.getSetMeasurePolicy());
                Updater.m10877setimpl(composerM10870constructorimpl7, currentCompositionLocalMap7, companion18.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = companion18.getSetCompositeKeyHash();
                if (composerM10870constructorimpl7.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                    composerM10870constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                    composerM10870constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
                }
                function3ModifierMaterializerOf7.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceableGroup(2058660585);
                BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.img_plate_empty, composerStartRestartGroup, 6), (String) null, SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(companion17, fDimensionResource), fDimensionResource2), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit5 = Unit.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt.PlatesTypeOfPlate.6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i10) {
                    PlatesTypeOfPlateKt.PlatesTypeOfPlate(i, plateNumber, plateRegion, z, sendServerNewPlateNumber, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @FigmaLargePreview
    @SuppressLint({"UnrememberedMutableState"})
    @Composable
    public static final void PreviewPlatesTypeOfPlate(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1417936151);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1417936151, i, -1, "com.blackhub.bronline.game.ui.plates.PreviewPlatesTypeOfPlate (PlatesTypeOfPlate.kt:382)");
            }
            PlatesTypeOfPlate(3, SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("777MM", null, 2, null), SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("77", null, 2, null), true, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt.PreviewPlatesTypeOfPlate.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 27654);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.plates.PlatesTypeOfPlateKt.PreviewPlatesTypeOfPlate.2
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
                    PlatesTypeOfPlateKt.PreviewPlatesTypeOfPlate(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

