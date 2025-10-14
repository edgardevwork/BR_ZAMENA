package androidx.compose.foundation.text;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.TextStyleKt;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HeightInLinesModifier.kt */
@Metadata(m7104d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a(\u0010\u0006\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0001H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, m7105d2 = {"DefaultMinLines", "", "validateMinMaxLines", "", "minLines", "maxLines", "heightInLines", "Landroidx/compose/ui/Modifier;", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "foundation_release", "typeface", ""}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n+ 2 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,135:1\n135#2:136\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt\n*L\n53#1:136\n*E\n"})
/* loaded from: classes2.dex */
public final class HeightInLinesModifierKt {
    public static final int DefaultMinLines = 1;

    public static /* synthetic */ Modifier heightInLines$default(Modifier modifier, TextStyle textStyle, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 1;
        }
        if ((i3 & 4) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        return heightInLines(modifier, textStyle, i, i2);
    }

    /* compiled from: HeightInLinesModifier.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nHeightInLinesModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,135:1\n74#2:136\n74#2:137\n74#2:138\n50#3:139\n49#3:140\n50#3:147\n49#3:148\n83#3,3:155\n83#3,3:164\n1116#4,6:141\n1116#4,6:149\n1116#4,6:158\n1116#4,6:167\n81#5:173\n*S KotlinDebug\n*F\n+ 1 HeightInLinesModifier.kt\nandroidx/compose/foundation/text/HeightInLinesModifierKt$heightInLines$2\n*L\n63#1:136\n64#1:137\n65#1:138\n69#1:139\n69#1:140\n72#1:147\n72#1:148\n81#1:155,3\n97#1:164,3\n69#1:141,6\n72#1:149,6\n81#1:158,6\n97#1:167,6\n72#1:173\n*E\n"})
    /* renamed from: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$2 */
    /* loaded from: classes.dex */
    public static final class C08222 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ int $minLines;
        public final /* synthetic */ TextStyle $textStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08222(int i, int i2, TextStyle textStyle) {
            super(3);
            i = i;
            i = i2;
            textStyle = textStyle;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier modifier, @Nullable Composer composer, int i) {
            composer.startReplaceableGroup(408240218);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(408240218, i, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
            }
            HeightInLinesModifierKt.validateMinMaxLines(i, i);
            if (i == 1 && i == Integer.MAX_VALUE) {
                Modifier.Companion companion = Modifier.INSTANCE;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return companion;
            }
            Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
            FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
            LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
            TextStyle textStyle = textStyle;
            composer.startReplaceableGroup(511388516);
            boolean zChanged = composer.changed(textStyle) | composer.changed(layoutDirection);
            Object objRememberedValue = composer.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = TextStyleKt.resolveDefaults(textStyle, layoutDirection);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceableGroup();
            TextStyle textStyle2 = (TextStyle) objRememberedValue;
            composer.startReplaceableGroup(511388516);
            boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                FontFamily fontFamily = textStyle2.getFontFamily();
                FontWeight fontWeight = textStyle2.getFontWeight();
                if (fontWeight == null) {
                    fontWeight = FontWeight.INSTANCE.getNormal();
                }
                FontStyle fontStyleM13197getFontStyle4Lr2A7w = textStyle2.m13197getFontStyle4Lr2A7w();
                int iM13277unboximpl = fontStyleM13197getFontStyle4Lr2A7w != null ? fontStyleM13197getFontStyle4Lr2A7w.m13277unboximpl() : FontStyle.INSTANCE.m13281getNormal_LCdwA();
                FontSynthesis fontSynthesisM13198getFontSynthesisZQGJjVo = textStyle2.m13198getFontSynthesisZQGJjVo();
                objRememberedValue2 = resolver.mo13249resolveDPcqOEQ(fontFamily, fontWeight, iM13277unboximpl, fontSynthesisM13198getFontSynthesisZQGJjVo != null ? fontSynthesisM13198getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m13291getAllGVVA2EU());
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            State state = (State) objRememberedValue2;
            Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
            composer.startReplaceableGroup(-568225417);
            boolean zChanged3 = false;
            for (int i2 = 0; i2 < 5; i2++) {
                zChanged3 |= composer.changed(objArr[i2]);
            }
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = Integer.valueOf(IntSize.m13835getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceableGroup();
            int iIntValue = ((Number) objRememberedValue3).intValue();
            Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
            composer.startReplaceableGroup(-568225417);
            boolean zChanged4 = false;
            for (int i3 = 0; i3 < 5; i3++) {
                zChanged4 |= composer.changed(objArr2[i3]);
            }
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = Integer.valueOf(IntSize.m13835getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle2, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceableGroup();
            int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
            int i4 = i;
            Integer numValueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * iIntValue2) + iIntValue);
            int i5 = i;
            Integer numValueOf2 = i5 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i5 - 1))) : null;
            Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo7871toDpu2uoSUM(numValueOf.intValue()) : C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo7871toDpu2uoSUM(numValueOf2.intValue()) : C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM());
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierM8159heightInVpY3zN4;
        }
    }

    public static final void validateMinMaxLines(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException(("both minLines " + i + " and maxLines " + i2 + " must be greater than zero").toString());
        }
        if (i <= i2) {
            return;
        }
        throw new IllegalArgumentException(("minLines " + i + " must be less than or equal to maxLines " + i2).toString());
    }

    @NotNull
    public static final Modifier heightInLines(@NotNull Modifier modifier, @NotNull final TextStyle textStyle, final int i, final int i2) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt$heightInLines$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("heightInLines");
                inspectorInfo.getProperties().set("minLines", Integer.valueOf(i));
                inspectorInfo.getProperties().set("maxLines", Integer.valueOf(i2));
                inspectorInfo.getProperties().set("textStyle", textStyle);
            }
        } : InspectableValueKt.getNoInspectorInfo(), new Function3<Modifier, Composer, Integer, Modifier>() { // from class: androidx.compose.foundation.text.HeightInLinesModifierKt.heightInLines.2
            public final /* synthetic */ int $maxLines;
            public final /* synthetic */ int $minLines;
            public final /* synthetic */ TextStyle $textStyle;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C08222(final int i3, final int i22, final TextStyle textStyle2) {
                super(3);
                i = i3;
                i = i22;
                textStyle = textStyle2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier modifier2, @Nullable Composer composer, int i3) {
                composer.startReplaceableGroup(408240218);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(408240218, i3, -1, "androidx.compose.foundation.text.heightInLines.<anonymous> (HeightInLinesModifier.kt:59)");
                }
                HeightInLinesModifierKt.validateMinMaxLines(i, i);
                if (i == 1 && i == Integer.MAX_VALUE) {
                    Modifier.Companion companion = Modifier.INSTANCE;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return companion;
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                FontFamily.Resolver resolver = (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver());
                LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                TextStyle textStyle2 = textStyle;
                composer.startReplaceableGroup(511388516);
                boolean zChanged = composer.changed(textStyle2) | composer.changed(layoutDirection);
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = TextStyleKt.resolveDefaults(textStyle2, layoutDirection);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                TextStyle textStyle22 = (TextStyle) objRememberedValue;
                composer.startReplaceableGroup(511388516);
                boolean zChanged2 = composer.changed(resolver) | composer.changed(textStyle22);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    FontFamily fontFamily = textStyle22.getFontFamily();
                    FontWeight fontWeight = textStyle22.getFontWeight();
                    if (fontWeight == null) {
                        fontWeight = FontWeight.INSTANCE.getNormal();
                    }
                    FontStyle fontStyleM13197getFontStyle4Lr2A7w = textStyle22.m13197getFontStyle4Lr2A7w();
                    int iM13277unboximpl = fontStyleM13197getFontStyle4Lr2A7w != null ? fontStyleM13197getFontStyle4Lr2A7w.m13277unboximpl() : FontStyle.INSTANCE.m13281getNormal_LCdwA();
                    FontSynthesis fontSynthesisM13198getFontSynthesisZQGJjVo = textStyle22.m13198getFontSynthesisZQGJjVo();
                    objRememberedValue2 = resolver.mo13249resolveDPcqOEQ(fontFamily, fontWeight, iM13277unboximpl, fontSynthesisM13198getFontSynthesisZQGJjVo != null ? fontSynthesisM13198getFontSynthesisZQGJjVo.getValue() : FontSynthesis.INSTANCE.m13291getAllGVVA2EU());
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                State state = (State) objRememberedValue2;
                Object[] objArr = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged3 = false;
                for (int i22 = 0; i22 < 5; i22++) {
                    zChanged3 |= composer.changed(objArr[i22]);
                }
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = Integer.valueOf(IntSize.m13835getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle22, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement(), 1)));
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceableGroup();
                int iIntValue = ((Number) objRememberedValue3).intValue();
                Object[] objArr2 = {density, resolver, textStyle, layoutDirection, state.getValue()};
                composer.startReplaceableGroup(-568225417);
                boolean zChanged4 = false;
                for (int i32 = 0; i32 < 5; i32++) {
                    zChanged4 |= composer.changed(objArr2[i32]);
                }
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = Integer.valueOf(IntSize.m13835getHeightimpl(TextFieldDelegateKt.computeSizeForDefaultText(textStyle22, density, resolver, TextFieldDelegateKt.getEmptyTextReplacement() + '\n' + TextFieldDelegateKt.getEmptyTextReplacement(), 2)));
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceableGroup();
                int iIntValue2 = ((Number) objRememberedValue4).intValue() - iIntValue;
                int i4 = i;
                Integer numValueOf = i4 == 1 ? null : Integer.valueOf(((i4 - 1) * iIntValue2) + iIntValue);
                int i5 = i;
                Integer numValueOf2 = i5 != Integer.MAX_VALUE ? Integer.valueOf(iIntValue + (iIntValue2 * (i5 - 1))) : null;
                Modifier modifierM8159heightInVpY3zN4 = SizeKt.m8159heightInVpY3zN4(Modifier.INSTANCE, numValueOf != null ? density.mo7871toDpu2uoSUM(numValueOf.intValue()) : C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM(), numValueOf2 != null ? density.mo7871toDpu2uoSUM(numValueOf2.intValue()) : C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM());
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierM8159heightInVpY3zN4;
            }
        });
    }
}
