package com.blackhub.bronline.game.p019ui.admintools.control;

import android.text.TextUtils;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.ImeAction;
import androidx.compose.p003ui.text.input.KeyboardType;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.FigmaLargePreview;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.blackhub.bronline.game.p019ui.widget.button.MainButtonGradientKt;
import com.blackhub.bronline.game.p019ui.widget.other.FakeDialogKt;
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
import kotlin.ranges.ClosedRange;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import kotlin.text.StringsKt___StringsKt;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATCreateAndEditPatternBlock.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a²\u0001\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00012\b\b\u0002\u0010\u0011\u001a\u00020\u00012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00030\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u001bH\u0007¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0007X\u008a\u008e\u0002"}, m7105d2 = {"MAX_LENGTH_FOR_TITLE", "", "ATCreateAndEditPatternBlock", "", "modifier", "Landroidx/compose/ui/Modifier;", "titleDialog", "", "titleFieldText", "descFieldText", "timeFieldText", "timeFieldHintText", "buttonLeftText", "buttonRightText", "validationChars", "", "maxLengthTitle", "maxLengthDesc", "timeRange", "Lkotlin/ranges/IntRange;", "onButtonAddClick", "Lkotlin/Function1;", "Lcom/blackhub/bronline/game/gui/admintools/model/ATTemplateModel;", "Lkotlin/ParameterName;", "name", "template", "onButtonBackClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[CIILkotlin/ranges/IntRange;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "PreviewATCreateAndEditPatternBlock", "(Landroidx/compose/runtime/Composer;I)V", "app_siteRelease", "titleField", "descField", "timeField"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nATCreateAndEditPatternBlock.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ATCreateAndEditPatternBlock.kt\ncom/blackhub/bronline/game/ui/admintools/control/ATCreateAndEditPatternBlockKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,361:1\n1116#2,6:362\n1116#2,6:368\n1116#2,6:374\n1#3:380\n81#4:381\n107#4,2:382\n81#4:384\n107#4,2:385\n81#4:387\n107#4,2:388\n*S KotlinDebug\n*F\n+ 1 ATCreateAndEditPatternBlock.kt\ncom/blackhub/bronline/game/ui/admintools/control/ATCreateAndEditPatternBlockKt\n*L\n76#1:362,6\n77#1:368,6\n78#1:374,6\n76#1:381\n76#1:382,2\n77#1:384\n77#1:385,2\n78#1:387\n78#1:388,2\n*E\n"})
/* loaded from: classes.dex */
public final class ATCreateAndEditPatternBlockKt {
    public static final int MAX_LENGTH_FOR_TITLE = 30;

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void ATCreateAndEditPatternBlock(@Nullable Modifier modifier, @NotNull final String titleDialog, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull final String buttonLeftText, @NotNull final String buttonRightText, @NotNull final char[] validationChars, int i, int i2, @Nullable IntRange intRange, @NotNull final Function1<? super ATTemplateModel, Unit> onButtonAddClick, @NotNull final Function0<Unit> onButtonBackClick, @Nullable Composer composer, final int i3, final int i4, final int i5) {
        final String strEmpty;
        int i6;
        final String strEmpty2;
        final String strEmpty3;
        float fM13680unboximpl;
        Intrinsics.checkNotNullParameter(titleDialog, "titleDialog");
        Intrinsics.checkNotNullParameter(buttonLeftText, "buttonLeftText");
        Intrinsics.checkNotNullParameter(buttonRightText, "buttonRightText");
        Intrinsics.checkNotNullParameter(validationChars, "validationChars");
        Intrinsics.checkNotNullParameter(onButtonAddClick, "onButtonAddClick");
        Intrinsics.checkNotNullParameter(onButtonBackClick, "onButtonBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1620319523);
        Modifier modifier2 = (i5 & 1) != 0 ? Modifier.INSTANCE : modifier;
        if ((i5 & 4) != 0) {
            strEmpty = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i6 = i3 & (-897);
        } else {
            strEmpty = str;
            i6 = i3;
        }
        if ((i5 & 8) != 0) {
            strEmpty2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i6 &= -7169;
        } else {
            strEmpty2 = str2;
        }
        if ((i5 & 16) != 0) {
            strEmpty3 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
            i6 &= -57345;
        } else {
            strEmpty3 = str3;
        }
        String str5 = (i5 & 32) != 0 ? null : str4;
        int i7 = (i5 & 512) != 0 ? 30 : i;
        int i8 = (i5 & 1024) != 0 ? 100 : i2;
        IntRange intRange2 = (i5 & 2048) != 0 ? null : intRange;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1620319523, i6, i4, "com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlock (ATCreateAndEditPatternBlock.kt:73)");
        }
        Object[] objArr = new Object[0];
        composerStartRestartGroup.startReplaceableGroup(782391390);
        boolean z = (((i3 & 896) ^ 384) > 256 && composerStartRestartGroup.changed(strEmpty)) || (i3 & 384) == 256;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$titleField$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(strEmpty, null, 2, null);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState = (MutableState) RememberSaveableKt.m10957rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 8, 6);
        Object[] objArr2 = new Object[0];
        composerStartRestartGroup.startReplaceableGroup(782391463);
        boolean z2 = (((i3 & 7168) ^ 3072) > 2048 && composerStartRestartGroup.changed(strEmpty2)) || (i3 & 3072) == 2048;
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$descField$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(strEmpty2, null, 2, null);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState2 = (MutableState) RememberSaveableKt.m10957rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 8, 6);
        Object[] objArr3 = new Object[0];
        composerStartRestartGroup.startReplaceableGroup(782391535);
        boolean z3 = (((57344 & i3) ^ CpioConstants.C_ISBLK) > 16384 && composerStartRestartGroup.changed(strEmpty3)) || (i3 & CpioConstants.C_ISBLK) == 16384;
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue3 = new Function0<MutableState<String>>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$timeField$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final MutableState<String> invoke() {
                    return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(strEmpty3, null, 2, null);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        final MutableState mutableState3 = (MutableState) RememberSaveableKt.m10957rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 8, 6);
        composerStartRestartGroup.startReplaceableGroup(782391634);
        C2046Dp c2046DpM13664boximpl = str5 != null ? C2046Dp.m13664boximpl(PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composerStartRestartGroup, 6)) : null;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(782391615);
        if (c2046DpM13664boximpl != null) {
            fM13680unboximpl = c2046DpM13664boximpl.m13680unboximpl();
        } else {
            fM13680unboximpl = PrimitiveResources_androidKt.dimensionResource(R.dimen._32sdp, composerStartRestartGroup, 6);
        }
        final float f = fM13680unboximpl;
        composerStartRestartGroup.endReplaceableGroup();
        final RoundedCornerShape roundedCornerShapeM8392RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composerStartRestartGroup, 6));
        final Modifier modifier3 = modifier2;
        final String str6 = str5;
        final int i9 = i7;
        final int i10 = i8;
        final IntRange intRange3 = intRange2;
        FakeDialogKt.m15089FakeDialog3IgeMak(null, Color.INSTANCE.m11375getTransparent0d7_KjU(), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1574555695, true, new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:89:0x070a  */
            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(@Nullable Composer composer2, int i11) {
                int i12;
                Composer composer3;
                final String str7;
                Boolean bool;
                final MutableState<String> mutableState4;
                int i13;
                if ((i11 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1574555695, i11, -1, "com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlock.<anonymous> (ATCreateAndEditPatternBlock.kt:87)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
                    Alignment.Companion companion2 = Alignment.INSTANCE;
                    Alignment center = companion2.getCenter();
                    Modifier modifier4 = modifier3;
                    RoundedCornerShape roundedCornerShape = roundedCornerShapeM8392RoundedCornerShape0680j_4;
                    String str8 = titleDialog;
                    float f2 = f;
                    String str9 = str6;
                    final MutableState<String> mutableState5 = mutableState;
                    final int i14 = i9;
                    final char[] cArr = validationChars;
                    final MutableState<String> mutableState6 = mutableState2;
                    final int i15 = i10;
                    final MutableState<String> mutableState7 = mutableState3;
                    final IntRange intRange4 = intRange3;
                    String str10 = buttonLeftText;
                    final Function1<ATTemplateModel, Unit> function1 = onButtonAddClick;
                    String str11 = buttonRightText;
                    final Function0<Unit> function0 = onButtonBackClick;
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer2, 6);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxSize$default);
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
                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    Modifier modifierM8177width3ABfNKs = SizeKt.m8177width3ABfNKs(modifier4, PrimitiveResources_androidKt.dimensionResource(R.dimen._263sdp, composer2, 6));
                    Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8177width3ABfNKs);
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
                    Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    final ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier modifierBorder = BorderKt.border(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), roundedCornerShape), ColorResources_androidKt.colorResource(R.color.total_black_70, composer2, 6), null, 2, null), BorderStrokeKt.m7798BorderStrokecXLIe8U(PrimitiveResources_androidKt.dimensionResource(R.dimen._05sdp, composer2, 6), ColorResources_androidKt.colorResource(R.color.gray, composer2, 6)), roundedCornerShape);
                    composer2.startReplaceableGroup(733328855);
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composer2, 0);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierBorder);
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
                    ImageKt.Image(PainterResources_androidKt.painterResource(R.drawable.ic_br_logo, composer2, 6), (String) null, boxScopeInstance.align(SizeKt.m8158height3ABfNKs(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._105sdp, composer2, 6)), companion2.getCenter()), companion2.getCenter(), ContentScale.INSTANCE.getFillHeight(), 0.1f, (ColorFilter) null, composer2, 224312, 64);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    Alignment.Horizontal centerHorizontally2 = companion2.getCenterHorizontally();
                    composer2.startReplaceableGroup(-483455358);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement.getTop(), centerHorizontally2, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor4);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl4 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl4, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM10870constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM10870constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    function3ModifierMaterializerOf4.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                    composer2.startReplaceableGroup(2058660585);
                    Modifier modifierAlign = columnScopeInstance.align(PaddingKt.m8127paddingqDBjuR0$default(companion, 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6), 0.0f, 0.0f, 13, null), companion2.getCenterHorizontally());
                    TypographyStyle typographyStyle = TypographyStyle.INSTANCE;
                    TextKt.m10024Text4IGK_g(str8, modifierAlign, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15), composer2, 0, 0, 65532);
                    String strATCreateAndEditPatternBlock$lambda$1 = ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$1(mutableState5);
                    Function1<String, Unit> function12 = new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str12) {
                            invoke2(str12);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String enteredText) {
                            Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                            MutableState<String> mutableState8 = mutableState5;
                            char[] cArr2 = cArr;
                            int length = enteredText.length();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(enteredText.charAt(i16), cArr2)) {
                                    enteredText = enteredText.substring(0, i16);
                                    Intrinsics.checkNotNullExpressionValue(enteredText, "substring(...)");
                                    break;
                                }
                                i16++;
                            }
                            mutableState8.setValue(StringsKt___StringsKt.take(enteredText, i14));
                        }
                    };
                    Modifier modifierM8156defaultMinSizeVpY3zN4 = SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8126paddingqDBjuR0(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._9sdp, composer2, 6)), PrimitiveResources_androidKt.dimensionResource(R.dimen._223sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6));
                    TextAlign.Companion companion4 = TextAlign.INSTANCE;
                    TextStyle textStyleM14834montserratMedium12spOr9ssp67j0QOw = typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13);
                    KeyboardType.Companion companion5 = KeyboardType.INSTANCE;
                    int iM13391getEmailPjHm6EE = companion5.m13391getEmailPjHm6EE();
                    ImeAction.Companion companion6 = ImeAction.INSTANCE;
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, false, iM13391getEmailPjHm6EE, companion6.m13342getDoneeUduSuo(), null, 19, null);
                    Color.Companion companion7 = Color.INSTANCE;
                    BasicTextFieldKt.BasicTextField(strATCreateAndEditPatternBlock$lambda$1, (Function1<? super String, Unit>) function12, modifierM8156defaultMinSizeVpY3zN4, false, false, textStyleM14834montserratMedium12spOr9ssp67j0QOw, keyboardOptions, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(companion7.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, -722530801, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer4, int i16) {
                            int i17;
                            int i18;
                            Composer composer5;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i16 & 14) == 0) {
                                i17 = i16 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i17 = i16;
                            }
                            if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-722530801, i17, -1, "com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ATCreateAndEditPatternBlock.kt:157)");
                                }
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion8, ColorResources_androidKt.colorResource(R.color.gray_75, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer4, 6)));
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                MutableState<String> mutableState8 = mutableState5;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor5);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion9.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(-841968973);
                                if (ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$1(mutableState8).length() == 0) {
                                    String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_pattern_title, composer4, 6);
                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer4, 6), 0.0f, 2, null);
                                    TextAlign.Companion companion10 = TextAlign.INSTANCE;
                                    i18 = i17;
                                    composer5 = composer4;
                                    TextKt.m10024Text4IGK_g(strStringResource, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion10.m13558getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion10.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 13), composer4, 0, 3072, 56828);
                                } else {
                                    i18 = i17;
                                    composer5 = composer4;
                                }
                                composer4.endReplaceableGroup();
                                innerTextField.invoke(composer5, Integer.valueOf(i18 & 14));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer2, 1572864, 221184, 16280);
                    BasicTextFieldKt.BasicTextField(ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$4(mutableState6), (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(String str12) {
                            invoke2(str12);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull String enteredText) {
                            Intrinsics.checkNotNullParameter(enteredText, "enteredText");
                            MutableState<String> mutableState8 = mutableState6;
                            char[] cArr2 = cArr;
                            int length = enteredText.length();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= length) {
                                    break;
                                }
                                if (!UsefulKt.isValidCharField(enteredText.charAt(i16), cArr2)) {
                                    enteredText = enteredText.substring(0, i16);
                                    Intrinsics.checkNotNullExpressionValue(enteredText, "substring(...)");
                                    break;
                                }
                                i16++;
                            }
                            mutableState8.setValue(StringsKt___StringsKt.take(enteredText, i15));
                        }
                    }, SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), f2, 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._223sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6)), false, false, typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), new KeyboardOptions(0, false, companion5.m13391getEmailPjHm6EE(), companion6.m13342getDoneeUduSuo(), null, 19, null), (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(companion7.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, -932435144, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        @Composable
                        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                        public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer4, int i16) {
                            int i17;
                            int i18;
                            Composer composer5;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i16 & 14) == 0) {
                                i17 = i16 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i17 = i16;
                            }
                            if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-932435144, i17, -1, "com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ATCreateAndEditPatternBlock.kt:208)");
                                }
                                Modifier.Companion companion8 = Modifier.INSTANCE;
                                Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion8, ColorResources_androidKt.colorResource(R.color.gray_75, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer4, 6)));
                                Alignment center2 = Alignment.INSTANCE.getCenter();
                                MutableState<String> mutableState8 = mutableState6;
                                composer4.startReplaceableGroup(733328855);
                                MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                composer4.startReplaceableGroup(-1323940314);
                                int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                if (!(composer4.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor5);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion9.getSetMeasurePolicy());
                                Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                                if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                composer4.startReplaceableGroup(2058660585);
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                composer4.startReplaceableGroup(-841965982);
                                if (ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$4(mutableState8).length() == 0) {
                                    String strStringResource = StringResources_androidKt.stringResource(R.string.admin_tools_pattern_body, composer4, 6);
                                    Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer4, 6), 0.0f, 2, null);
                                    TextAlign.Companion companion10 = TextAlign.INSTANCE;
                                    i18 = i17;
                                    composer5 = composer4;
                                    TextKt.m10024Text4IGK_g(strStringResource, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m13551boximpl(companion10.m13558getCentere0LSkKk()), 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, TypographyStyle.INSTANCE.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion10.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 13), composer4, 0, 3072, 56828);
                                } else {
                                    i18 = i17;
                                    composer5 = composer4;
                                }
                                composer4.endReplaceableGroup();
                                innerTextField.invoke(composer5, Integer.valueOf(i18 & 14));
                                composer4.endReplaceableGroup();
                                composer4.endNode();
                                composer4.endReplaceableGroup();
                                composer4.endReplaceableGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer4.skipToGroupEnd();
                        }
                    }), composer2, 1572864, 221184, 16280);
                    composer2.startReplaceableGroup(1847027059);
                    if (AnyExtensionKt.isNotNull(str9)) {
                        bool = null;
                        str7 = str9;
                        mutableState4 = mutableState7;
                        i12 = 1;
                        composer3 = composer2;
                        BasicTextFieldKt.BasicTextField(ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$7(mutableState7), (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$5
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(String str12) {
                                invoke2(str12);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull String textValue) {
                                String strEmpty4;
                                Intrinsics.checkNotNullParameter(textValue, "textValue");
                                if (TextUtils.isDigitsOnly(textValue) && AnyExtensionKt.isNotNull(intRange4)) {
                                    Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(textValue);
                                    IntRange intRange5 = intRange4;
                                    if (intRange5 != null) {
                                        ColumnScope columnScope = columnScopeInstance;
                                        MutableState<String> mutableState8 = mutableState7;
                                        if (intOrNull == null || (strEmpty4 = String.valueOf(RangesKt___RangesKt.coerceIn(intOrNull.intValue(), (ClosedRange<Integer>) intRange5))) == null) {
                                            strEmpty4 = AnyExtensionKt.empty(columnScope);
                                        }
                                        mutableState8.setValue(strEmpty4);
                                    }
                                }
                            }
                        }, SizeKt.m8156defaultMinSizeVpY3zN4(PaddingKt.m8127paddingqDBjuR0$default(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._32sdp, composer2, 6), 2, null), PrimitiveResources_androidKt.dimensionResource(R.dimen._223sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._19sdp, composer2, 6)), false, false, typographyStyle.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion4.m13558getCentere0LSkKk(), 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 13), new KeyboardOptions(0, false, companion5.m13392getNumberPjHm6EE(), companion6.m13342getDoneeUduSuo(), null, 19, null), (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (MutableInteractionSource) null, (Brush) new SolidColor(companion7.m11377getWhite0d7_KjU(), null), (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambdaKt.composableLambda(composer2, 1768395156, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$1$1$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            @Composable
                            @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
                            public final void invoke(@NotNull Function2<? super Composer, ? super Integer, Unit> innerTextField, @Nullable Composer composer4, int i16) {
                                int i17;
                                Composer composer5;
                                int i18;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i16 & 14) == 0) {
                                    i17 = i16 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i17 = i16;
                                }
                                if ((i17 & 91) != 18 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1768395156, i17, -1, "com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlock.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ATCreateAndEditPatternBlock.kt:264)");
                                    }
                                    Modifier.Companion companion8 = Modifier.INSTANCE;
                                    Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(companion8, ColorResources_androidKt.colorResource(R.color.gray_75, composer4, 6), RoundedCornerShapeKt.m8392RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen._4sdp, composer4, 6)));
                                    Alignment center2 = Alignment.INSTANCE.getCenter();
                                    String str12 = str7;
                                    MutableState<String> mutableState8 = mutableState4;
                                    composer4.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center2, false, composer4, 6);
                                    composer4.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer4, 0);
                                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor5 = companion9.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
                                    if (!(composer4.getApplier() instanceof Applier)) {
                                        ComposablesKt.invalidApplier();
                                    }
                                    composer4.startReusableNode();
                                    if (composer4.getInserting()) {
                                        composer4.createNode(constructor5);
                                    } else {
                                        composer4.useNode();
                                    }
                                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer4);
                                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRememberBoxMeasurePolicy3, companion9.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion9.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion9.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                    }
                                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer4)), composer4, 0);
                                    composer4.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                    composer4.startReplaceableGroup(-841962345);
                                    if (ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$7(mutableState8).length() == 0) {
                                        String str13 = str12 == null ? "" : str12;
                                        Modifier modifierM8125paddingVpY3zN4$default = PaddingKt.m8125paddingVpY3zN4$default(companion8, PrimitiveResources_androidKt.dimensionResource(R.dimen._6sdp, composer4, 6), 0.0f, 2, null);
                                        TextAlign.Companion companion10 = TextAlign.INSTANCE;
                                        TextAlign textAlignM13551boximpl = TextAlign.m13551boximpl(companion10.m13558getCentere0LSkKk());
                                        TextStyle textStyleM14834montserratMedium12spOr9ssp67j0QOw2 = TypographyStyle.INSTANCE.m14834montserratMedium12spOr9ssp67j0QOw(0L, companion10.m13558getCentere0LSkKk(), 0L, 0.0f, composer4, CpioConstants.C_ISBLK, 13);
                                        i18 = i17;
                                        composer5 = composer4;
                                        TextKt.m10024Text4IGK_g(str13, modifierM8125paddingVpY3zN4$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, textAlignM13551boximpl, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, textStyleM14834montserratMedium12spOr9ssp67j0QOw2, composer4, 0, 3072, 56828);
                                    } else {
                                        composer5 = composer4;
                                        i18 = i17;
                                    }
                                    composer4.endReplaceableGroup();
                                    innerTextField.invoke(composer5, Integer.valueOf(i18 & 14));
                                    composer4.endReplaceableGroup();
                                    composer4.endNode();
                                    composer4.endReplaceableGroup();
                                    composer4.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }), composer2, 1572864, 221184, 16280);
                    } else {
                        i12 = 1;
                        composer3 = composer2;
                        str7 = str9;
                        bool = null;
                        mutableState4 = mutableState7;
                    }
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    Modifier modifierM8084offsetVpY3zN4$default = OffsetKt.m8084offsetVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, i12, bool), 0.0f, PrimitiveResources_androidKt.dimensionResource(R.dimen._minus17sdp, composer3, 6), i12, bool);
                    Arrangement.HorizontalOrVertical spaceEvenly = arrangement.getSpaceEvenly();
                    composer3.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, companion2.getTop(), composer3, 6);
                    composer3.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composer2.getCurrentCompositionLocalMap();
                    Function0<ComposeUiNode> constructor5 = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierM8084offsetVpY3zN4$default);
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer3.createNode(constructor5);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM10870constructorimpl5 = Updater.m10870constructorimpl(composer2);
                    Updater.m10877setimpl(composerM10870constructorimpl5, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m10877setimpl(composerM10870constructorimpl5, currentCompositionLocalMap5, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion3.getSetCompositeKeyHash();
                    if (composerM10870constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM10870constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM10870constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    function3ModifierMaterializerOf5.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer3, 0);
                    composer3.startReplaceableGroup(2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Modifier modifierM8156defaultMinSizeVpY3zN42 = SizeKt.m8156defaultMinSizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composer3, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composer3, 6));
                    Composer composer4 = composer3;
                    int i16 = i12;
                    final MutableState<String> mutableState8 = mutableState4;
                    final String str12 = str7;
                    Boolean bool2 = bool;
                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                    if (ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$1(mutableState5).length() <= 0 || ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$4(mutableState6).length() <= 0) {
                        i13 = 0;
                    } else {
                        Boolean boolValueOf = Boolean.valueOf(ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$7(mutableState8).length() > 0 ? i16 : 0);
                        if (AnyExtensionKt.isNotNull(str12)) {
                            bool2 = boolValueOf;
                        }
                        if (BooleanExtensionKt.getOrTrue(bool2)) {
                            i13 = i16;
                        }
                    }
                    composer4.startReplaceableGroup(1847031766);
                    boolean zChanged = composer4.changed(str12) | composer4.changed(mutableState8) | composer4.changed(mutableState5) | composer4.changed(mutableState6) | composer4.changed(function1);
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$2$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ATTemplateModel aTTemplateModel;
                                if (AnyExtensionKt.isNotNull(str12) && ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$7(mutableState8).length() > 0) {
                                    aTTemplateModel = new ATTemplateModel(0, ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$1(mutableState5), ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$4(mutableState6), Integer.valueOf(IntExtensionKt.getOrZero(StringsKt__StringNumberConversionsKt.toIntOrNull(ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$7(mutableState8)))), 1, null);
                                } else {
                                    aTTemplateModel = new ATTemplateModel(0, ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$1(mutableState5), ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock$lambda$4(mutableState6), null, 9, null);
                                }
                                function1.invoke(aTTemplateModel);
                            }
                        };
                        composer4.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN42, null, str10, textStyleM14791montserratBold12spOr9ssp67j0QOw, 0.0f, 0, null, null, null, 0.0f, 0L, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, i13, true, false, null, (Function0) objRememberedValue4, composer2, 0, 100663296, 48, 13369330);
                    Modifier modifierM8156defaultMinSizeVpY3zN43 = SizeKt.m8156defaultMinSizeVpY3zN4(companion, PrimitiveResources_androidKt.dimensionResource(R.dimen._108sdp, composer2, 6), PrimitiveResources_androidKt.dimensionResource(R.dimen._34sdp, composer2, 6));
                    TextStyle textStyleM14791montserratBold12spOr9ssp67j0QOw2 = typographyStyle.m14791montserratBold12spOr9ssp67j0QOw(0L, 0, 0L, 0.0f, composer2, CpioConstants.C_ISBLK, 15);
                    long jColorResource = ColorResources_androidKt.colorResource(R.color.light_gray_blue, composer2, 6);
                    composer2.startReplaceableGroup(1847033076);
                    boolean zChanged2 = composer2.changed(function0);
                    Object objRememberedValue5 = composer2.rememberedValue();
                    if (zChanged2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt$ATCreateAndEditPatternBlock$1$1$1$2$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                function0.invoke();
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue5);
                    }
                    composer2.endReplaceableGroup();
                    MainButtonGradientKt.m15077MainButtonGradientlunQu3Y(modifierM8156defaultMinSizeVpY3zN43, null, str11, textStyleM14791montserratBold12spOr9ssp67j0QOw2, 0.0f, 0, null, null, null, 0.0f, jColorResource, 0.0f, null, null, null, 0.0f, 0.0f, false, false, null, false, false, false, null, (Function0) objRememberedValue5, composer2, 0, 100663296, 0, 16514034);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
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
        }), composerStartRestartGroup, 432, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier4 = modifier2;
            final String str7 = strEmpty;
            final String str8 = strEmpty2;
            final String str9 = strEmpty3;
            final String str10 = str5;
            final int i11 = i7;
            final int i12 = i8;
            final IntRange intRange4 = intRange2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i13) {
                    ATCreateAndEditPatternBlockKt.ATCreateAndEditPatternBlock(modifier4, titleDialog, str7, str8, str9, str10, buttonLeftText, buttonRightText, validationChars, i11, i12, intRange4, onButtonAddClick, onButtonBackClick, composer2, RecomposeScopeImplKt.updateChangedFlags(i3 | 1), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @FigmaLargePreview
    public static final void PreviewATCreateAndEditPatternBlock(Composer composer, final int i) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1271162535);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1271162535, i, -1, "com.blackhub.bronline.game.ui.admintools.control.PreviewATCreateAndEditPatternBlock (ATCreateAndEditPatternBlock.kt:350)");
            }
            char[] charArray = StringResources_androidKt.stringResource(R.string.common_edittext_allowed_characters, composerStartRestartGroup, 6).toCharArray();
            Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
            composer2 = composerStartRestartGroup;
            ATCreateAndEditPatternBlock(null, "Редактирование шаблона", null, null, null, "Время наказания (дни)", "Добавить", "Назад", charArray, 0, 0, null, new Function1<ATTemplateModel, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt.PreviewATCreateAndEditPatternBlock.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull ATTemplateModel it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(ATTemplateModel aTTemplateModel) {
                    invoke2(aTTemplateModel);
                    return Unit.INSTANCE;
                }
            }, new Function0<Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt.PreviewATCreateAndEditPatternBlock.2
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            }, composer2, 148570160, 3456, 3613);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.admintools.control.ATCreateAndEditPatternBlockKt.PreviewATCreateAndEditPatternBlock.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer3, int i2) {
                    ATCreateAndEditPatternBlockKt.PreviewATCreateAndEditPatternBlock(composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static final String ATCreateAndEditPatternBlock$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String ATCreateAndEditPatternBlock$lambda$4(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    public static final String ATCreateAndEditPatternBlock$lambda$7(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
