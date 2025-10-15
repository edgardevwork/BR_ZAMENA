package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.Indication;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.RectangleShapeKt;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.input.pointer.PointerInputScope;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Surface.kt */
@Metadata(m7104d1 = {"\u0000d\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0085\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001ac\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u001a\u008d\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0093\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010$\u001a\u00020\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00010&2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0011\u0010\u0019\u001a\r\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010'\u001a,\u0010(\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\t2\b\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020\u000eH\u0003ø\u0001\u0000¢\u0006\u0004\b,\u0010-\u001a8\u0010.\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010/\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00062"}, m7105d2 = {"Surface", "", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "shape", "Landroidx/compose/ui/graphics/Shape;", "color", "Landroidx/compose/ui/graphics/Color;", "contentColor", OutlinedTextFieldKt.BorderId, "Landroidx/compose/foundation/BorderStroke;", "elevation", "Landroidx/compose/ui/unit/Dp;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "indication", "Landroidx/compose/foundation/Indication;", "enabled", "", "onClickLabel", "", "role", "Landroidx/compose/ui/semantics/Role;", "content", "Landroidx/compose/runtime/Composable;", "Surface-9VG74zQ", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/foundation/Indication;ZLjava/lang/String;Landroidx/compose/ui/semantics/Role;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Surface-LPr_se0", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Surface-F-jzlyU", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "selected", "Surface-Ny5ogXk", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "checked", "onCheckedChange", "Lkotlin/Function1;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Shape;JJLandroidx/compose/foundation/BorderStroke;FLandroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "surfaceColorAtElevation", "elevationOverlay", "Landroidx/compose/material/ElevationOverlay;", "absoluteElevation", "surfaceColorAtElevation-cq6XJ1M", "(JLandroidx/compose/material/ElevationOverlay;FLandroidx/compose/runtime/Composer;I)J", "surface", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "surface-8ww4TTg", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/Shape;JLandroidx/compose/foundation/BorderStroke;F)Landroidx/compose/ui/Modifier;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,642:1\n154#2:643\n154#2:646\n154#2:656\n154#2:666\n154#2:676\n74#3:644\n74#3:654\n74#3:664\n74#3:674\n74#3:684\n74#3:685\n51#4:645\n51#4:655\n51#4:665\n51#4:675\n51#4:686\n25#5:647\n25#5:657\n25#5:667\n25#5:677\n1116#6,6:648\n1116#6,6:658\n1116#6,6:668\n1116#6,6:678\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n111#1:643\n220#1:646\n334#1:656\n449#1:666\n577#1:676\n114#1:644\n224#1:654\n338#1:664\n453#1:674\n579#1:684\n585#1:685\n114#1:645\n224#1:655\n338#1:665\n453#1:675\n585#1:686\n221#1:647\n335#1:657\n450#1:667\n578#1:677\n221#1:648,6\n335#1:658,6\n450#1:668,6\n578#1:678,6\n*E\n"})
/* loaded from: classes2.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:149:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:245:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-F-jzlyU */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9025SurfaceFjzlyU(@Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Shape rectangleShape;
        long jM8850getSurface0d7_KjU;
        long j3;
        int i4;
        BorderStroke borderStroke2;
        int i5;
        float fM13666constructorimpl;
        Modifier modifier2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1412203386);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                rectangleShape = shape;
                i3 |= composerStartRestartGroup.changed(rectangleShape) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i2 & 4) == 0) {
                    jM8850getSurface0d7_KjU = j;
                    int i8 = composerStartRestartGroup.changed(jM8850getSurface0d7_KjU) ? 256 : 128;
                    i3 |= i8;
                } else {
                    jM8850getSurface0d7_KjU = j;
                }
                i3 |= i8;
            } else {
                jM8850getSurface0d7_KjU = j;
            }
            if ((i & 7168) != 0) {
                j3 = j2;
                i3 |= ((i2 & 8) == 0 && composerStartRestartGroup.changed(j3)) ? 2048 : 1024;
            } else {
                j3 = j2;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= CpioConstants.C_ISBLK;
            } else {
                if ((57344 & i) == 0) {
                    borderStroke2 = borderStroke;
                    i3 |= composerStartRestartGroup.changed(borderStroke2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((458752 & i) == 0) {
                        fM13666constructorimpl = f;
                        i3 |= composerStartRestartGroup.changed(fM13666constructorimpl) ? 131072 : 65536;
                    }
                    if ((i2 & 64) == 0) {
                        i3 |= 1572864;
                    } else if ((i & 3670016) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i6 == 0 ? Modifier.INSTANCE : modifier;
                            if (i7 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            }
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                                jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                            }
                            if ((i2 & 8) != 0) {
                                long jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 6) & 14);
                                i3 &= -7169;
                                j3 = jM8864contentColorForek8zF_U;
                            }
                            if (i4 != 0) {
                                borderStroke2 = null;
                            }
                            if (i5 != 0) {
                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                            if ((i2 & 8) != 0) {
                                i3 &= -7169;
                            }
                            modifier2 = modifier;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1412203386, i3, -1, "androidx.compose.material.Surface (Surface.kt:112)");
                        }
                        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                        final Modifier modifier4 = modifier2;
                        final Shape shape2 = rectangleShape;
                        final long j4 = jM8850getSurface0d7_KjU;
                        final BorderStroke borderStroke3 = borderStroke2;
                        final float f2 = fM13666constructorimpl;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j3)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1822160838, i9, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:118)");
                                    }
                                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m9031surface8ww4TTg(modifier4, shape2, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j4, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl2, composer2, 0), borderStroke3, f2), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                                        }
                                    }), Unit.INSTANCE, new C12032(null));
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPointerInput);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
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

                            /* compiled from: Surface.kt */
                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            @DebugMetadata(m7119c = "androidx.compose.material.SurfaceKt$Surface$1$2", m7120f = "Surface.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2 */
                            /* loaded from: classes.dex */
                            public static final class C12032 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                public int label;

                                public C12032(Continuation<? super C12032> continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new C12032(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((C12032) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                            }
                        }), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                    }
                    final long j5 = jM8850getSurface0d7_KjU;
                    final BorderStroke borderStroke4 = borderStroke2;
                    final float f3 = fM13666constructorimpl;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        final Modifier modifier5 = modifier3;
                        final Shape shape3 = rectangleShape;
                        final long j6 = j3;
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$2
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

                            public final void invoke(@Nullable Composer composer2, int i9) {
                                SurfaceKt.m9025SurfaceFjzlyU(modifier5, shape3, j5, j6, borderStroke4, f3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                fM13666constructorimpl = f;
                if ((i2 & 64) == 0) {
                }
                if ((i3 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i6 == 0) {
                        }
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if ((i2 & 8) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                        final Modifier modifier42 = modifier2;
                        final Shape shape22 = rectangleShape;
                        final long j42 = jM8850getSurface0d7_KjU;
                        final BorderStroke borderStroke32 = borderStroke2;
                        final float f22 = fM13666constructorimpl;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(j3)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl22))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1822160838, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i9) {
                                if ((i9 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1822160838, i9, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:118)");
                                    }
                                    Modifier modifierPointerInput = SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.semantics(SurfaceKt.m9031surface8ww4TTg(modifier42, shape22, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j42, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl22, composer2, 0), borderStroke32, f22), false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$1.1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            invoke2(semanticsPropertyReceiver);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                                            SemanticsPropertiesKt.setContainer(semanticsPropertyReceiver, true);
                                        }
                                    }), Unit.INSTANCE, new C12032(null));
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierPointerInput);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
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

                            /* compiled from: Surface.kt */
                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/PointerInputScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                            @DebugMetadata(m7119c = "androidx.compose.material.SurfaceKt$Surface$1$2", m7120f = "Surface.kt", m7121i = {}, m7122l = {}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                            /* renamed from: androidx.compose.material.SurfaceKt$Surface$1$2 */
                            /* loaded from: classes.dex */
                            public static final class C12032 extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {
                                public int label;

                                public C12032(Continuation<? super C12032> continuation) {
                                    super(2, continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    return new C12032(continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                @Nullable
                                public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation<? super Unit> continuation) {
                                    return ((C12032) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                    IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    if (this.label != 0) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    return Unit.INSTANCE;
                                }
                            }
                        }), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                    }
                }
                final long j52 = jM8850getSurface0d7_KjU;
                final BorderStroke borderStroke42 = borderStroke2;
                final float f32 = fM13666constructorimpl;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            borderStroke2 = borderStroke;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            fM13666constructorimpl = f;
            if ((i2 & 64) == 0) {
            }
            if ((i3 & 2995931) == 599186) {
            }
            final long j522 = jM8850getSurface0d7_KjU;
            final BorderStroke borderStroke422 = borderStroke2;
            final float f322 = fM13666constructorimpl;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        rectangleShape = shape;
        if ((i & 896) != 0) {
        }
        if ((i & 7168) != 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        borderStroke2 = borderStroke;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        fM13666constructorimpl = f;
        if ((i2 & 64) == 0) {
        }
        if ((i3 & 2995931) == 599186) {
        }
        final long j5222 = jM8850getSurface0d7_KjU;
        final BorderStroke borderStroke4222 = borderStroke2;
        final float f3222 = fM13666constructorimpl;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:331:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-LPr_se0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9026SurfaceLPr_se0(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        long jM8864contentColorForek8zF_U;
        int i6;
        BorderStroke borderStroke2;
        int i7;
        int i8;
        final Modifier modifier2;
        final Shape rectangleShape;
        final long jM8850getSurface0d7_KjU;
        BorderStroke borderStroke3;
        float fM13666constructorimpl;
        MutableInteractionSource mutableInteractionSource2;
        final boolean z3;
        final long j3;
        final BorderStroke borderStroke4;
        final float f2;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1560876237);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else {
            if ((i & 112) == 0) {
                i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 896) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        i3 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
                    }
                    if ((57344 & i) == 0) {
                        i3 |= ((i2 & 16) == 0 && composerStartRestartGroup.changed(j)) ? 16384 : 8192;
                    }
                    if ((458752 & i) != 0) {
                        jM8864contentColorForek8zF_U = j2;
                        i3 |= ((i2 & 32) == 0 && composerStartRestartGroup.changed(jM8864contentColorForek8zF_U)) ? 131072 : 65536;
                    } else {
                        jM8864contentColorForek8zF_U = j2;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else {
                        if ((3670016 & i) == 0) {
                            borderStroke2 = borderStroke;
                            i3 |= composerStartRestartGroup.changed(borderStroke2) ? 1048576 : 524288;
                        }
                        i7 = i2 & 128;
                        if (i7 != 0) {
                            i3 |= 12582912;
                        } else if ((i & 29360128) == 0) {
                            i3 |= composerStartRestartGroup.changed(f) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 != 0) {
                            i3 |= 100663296;
                        } else if ((i & 234881024) == 0) {
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i2 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i3 |= composerStartRestartGroup.changedInstance(function2) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1533916891) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier2 = i9 == 0 ? Modifier.INSTANCE : modifier;
                                    if (i4 != 0) {
                                        z2 = true;
                                    }
                                    rectangleShape = i5 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                                    if ((i2 & 16) == 0) {
                                        i3 &= -57345;
                                        jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                    } else {
                                        jM8850getSurface0d7_KjU = j;
                                    }
                                    if ((i2 & 32) != 0) {
                                        jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i3 >> 12) & 14);
                                        i3 &= -458753;
                                    }
                                    borderStroke3 = i6 == 0 ? null : borderStroke2;
                                    fM13666constructorimpl = i7 == 0 ? C2046Dp.m13666constructorimpl(0) : f;
                                    if (i8 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i2 & 16) != 0) {
                                        i3 &= -57345;
                                    }
                                    if ((i2 & 32) != 0) {
                                        i3 &= -458753;
                                    }
                                    modifier2 = modifier;
                                    rectangleShape = shape;
                                    jM8850getSurface0d7_KjU = j;
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    borderStroke3 = borderStroke2;
                                    fM13666constructorimpl = f;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1560876237, i3, -1, "androidx.compose.material.Surface (Surface.kt:222)");
                                }
                                final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier3 = modifier2;
                                final Shape shape2 = rectangleShape;
                                final long j4 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke5 = borderStroke3;
                                final float f3 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                final boolean z4 = z2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i10) {
                                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:228)");
                                            }
                                            Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3), shape2, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j4, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl2, composer2, 0), borderStroke5, f3), mutableInteractionSource4, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z4, null, null, function0, 24, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z3 = z2;
                                j3 = jM8864contentColorForek8zF_U;
                                borderStroke4 = borderStroke3;
                                f2 = fM13666constructorimpl;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                rectangleShape = shape;
                                jM8850getSurface0d7_KjU = j;
                                mutableInteractionSource3 = mutableInteractionSource;
                                z3 = z2;
                                j3 = jM8864contentColorForek8zF_U;
                                borderStroke4 = borderStroke2;
                                f2 = f;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$5
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

                                    public final void invoke(@Nullable Composer composer2, int i10) {
                                        SurfaceKt.m9026SurfaceLPr_se0(function0, modifier2, z3, rectangleShape, jM8850getSurface0d7_KjU, j3, borderStroke4, f2, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 805306368;
                        if ((i3 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i4 != 0) {
                                }
                                if (i5 == 0) {
                                }
                                if ((i2 & 16) == 0) {
                                }
                                if ((i2 & 32) != 0) {
                                }
                                if (i6 == 0) {
                                }
                                if (i7 == 0) {
                                }
                                if (i8 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier32 = modifier2;
                                final Shape shape22 = rectangleShape;
                                final long j42 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke52 = borderStroke3;
                                final float f32 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                final boolean z42 = z2;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl22))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2031491085, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$4
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i10) {
                                        if ((i10 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(2031491085, i10, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:228)");
                                            }
                                            Modifier modifierM7803clickableO2vRcR0$default = ClickableKt.m7803clickableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier32), shape22, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j42, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl22, composer2, 0), borderStroke52, f32), mutableInteractionSource42, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z42, null, null, function0, 24, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7803clickableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z3 = z2;
                                j3 = jM8864contentColorForek8zF_U;
                                borderStroke4 = borderStroke3;
                                f2 = fM13666constructorimpl;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    borderStroke2 = borderStroke;
                    i7 = i2 & 128;
                    if (i7 != 0) {
                    }
                    i8 = i2 & 256;
                    if (i8 != 0) {
                    }
                    if ((i2 & 512) == 0) {
                    }
                    if ((i3 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((57344 & i) == 0) {
                }
                if ((458752 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                borderStroke2 = borderStroke;
                i7 = i2 & 128;
                if (i7 != 0) {
                }
                i8 = i2 & 256;
                if (i8 != 0) {
                }
                if ((i2 & 512) == 0) {
                }
                if ((i3 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            if ((57344 & i) == 0) {
            }
            if ((458752 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            borderStroke2 = borderStroke;
            i7 = i2 & 128;
            if (i7 != 0) {
            }
            i8 = i2 & 256;
            if (i8 != 0) {
            }
            if ((i2 & 512) == 0) {
            }
            if ((i3 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        if ((57344 & i) == 0) {
        }
        if ((458752 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        borderStroke2 = borderStroke;
        i7 = i2 & 128;
        if (i7 != 0) {
        }
        i8 = i2 & 256;
        if (i8 != 0) {
        }
        if ((i2 & 512) == 0) {
        }
        if ((i3 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9027SurfaceNy5ogXk(final boolean z, @NotNull final Function0<Unit> function0, @Nullable Modifier modifier, boolean z2, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Shape shape2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        Shape rectangleShape;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        BorderStroke borderStroke3;
        float fM13666constructorimpl;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier4;
        final Shape shape3;
        final long j3;
        final boolean z4;
        final long j4;
        final float f2;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(262027249);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        z3 = z2;
                        i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i) == 0) {
                            shape2 = shape;
                            i4 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        }
                        if ((458752 & i) == 0) {
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
                        }
                        if ((i & 3670016) == 0) {
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i8 = i3 & 128;
                        if (i8 == 0) {
                            if ((i & 29360128) == 0) {
                                borderStroke2 = borderStroke;
                                i4 |= composerStartRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                            }
                            i9 = i3 & 256;
                            if (i9 == 0) {
                                i4 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                i4 |= composerStartRestartGroup.changed(f) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            i10 = i3 & 512;
                            if (i10 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 1879048192) == 0) {
                                i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i11 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i11 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
                            } else {
                                i11 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i11 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        z3 = true;
                                    }
                                    rectangleShape = i7 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                    if ((i3 & 32) == 0) {
                                        jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                        i4 &= -458753;
                                    } else {
                                        jM8850getSurface0d7_KjU = j;
                                    }
                                    if ((i3 & 64) == 0) {
                                        jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 15) & 14);
                                        i4 &= -3670017;
                                    } else {
                                        jM8864contentColorForek8zF_U = j2;
                                    }
                                    borderStroke3 = i8 == 0 ? null : borderStroke2;
                                    fM13666constructorimpl = i9 == 0 ? C2046Dp.m13666constructorimpl(0) : f;
                                    if (i10 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    rectangleShape = shape2;
                                    borderStroke3 = borderStroke2;
                                    jM8850getSurface0d7_KjU = j;
                                    jM8864contentColorForek8zF_U = j2;
                                    fM13666constructorimpl = f;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(262027249, i4, i11, "androidx.compose.material.Surface (Surface.kt:336)");
                                }
                                final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier5 = modifier3;
                                final Shape shape4 = rectangleShape;
                                final long j5 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke5 = borderStroke3;
                                final float f3 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                final boolean z5 = z3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1391199439, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:342)");
                                            }
                                            Modifier modifierM8364selectableO2vRcR0$default = SelectableKt.m8364selectableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier5), shape4, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j5, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl2, composer2, 0), borderStroke5, f3), z, mutableInteractionSource4, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z5, null, function0, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8364selectableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                shape3 = rectangleShape;
                                j3 = jM8850getSurface0d7_KjU;
                                z4 = z3;
                                j4 = jM8864contentColorForek8zF_U;
                                f2 = fM13666constructorimpl;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                j3 = j;
                                f2 = f;
                                modifier4 = modifier2;
                                z4 = z3;
                                shape3 = shape2;
                                borderStroke4 = borderStroke2;
                                j4 = j2;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$8
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

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        SurfaceKt.m9027SurfaceNy5ogXk(z, function0, modifier4, z4, shape3, j3, j4, borderStroke4, f2, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 12582912;
                        borderStroke2 = borderStroke;
                        i9 = i3 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i3 & 512;
                        if (i10 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier52 = modifier3;
                                final Shape shape42 = rectangleShape;
                                final long j52 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke52 = borderStroke3;
                                final float f32 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                final boolean z52 = z3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl22))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1391199439, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$7
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1391199439, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:342)");
                                            }
                                            Modifier modifierM8364selectableO2vRcR0$default = SelectableKt.m8364selectableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier52), shape42, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j52, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl22, composer2, 0), borderStroke52, f32), z, mutableInteractionSource42, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z52, null, function0, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8364selectableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                shape3 = rectangleShape;
                                j3 = jM8850getSurface0d7_KjU;
                                z4 = z3;
                                j4 = jM8864contentColorForek8zF_U;
                                f2 = fM13666constructorimpl;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    shape2 = shape;
                    if ((458752 & i) == 0) {
                    }
                    if ((i & 3670016) == 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                    }
                    borderStroke2 = borderStroke;
                    i9 = i3 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                shape2 = shape;
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                borderStroke2 = borderStroke;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            shape2 = shape;
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        shape2 = shape;
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:205:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:357:? A[RETURN, SYNTHETIC] */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9028SurfaceNy5ogXk(final boolean z, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, boolean z2, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z3;
        int i7;
        Shape shape2;
        int i8;
        BorderStroke borderStroke2;
        int i9;
        int i10;
        int i11;
        Modifier modifier3;
        Shape rectangleShape;
        long jM8850getSurface0d7_KjU;
        long jM8864contentColorForek8zF_U;
        BorderStroke borderStroke3;
        float fM13666constructorimpl;
        MutableInteractionSource mutableInteractionSource2;
        final Modifier modifier4;
        final Shape shape3;
        final long j3;
        final boolean z4;
        final long j4;
        final float f2;
        final BorderStroke borderStroke4;
        final MutableInteractionSource mutableInteractionSource3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1341569296);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                } else {
                    if ((i & 7168) == 0) {
                        z3 = z2;
                        i4 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
                    }
                    i7 = i3 & 16;
                    if (i7 == 0) {
                        i4 |= CpioConstants.C_ISBLK;
                    } else {
                        if ((57344 & i) == 0) {
                            shape2 = shape;
                            i4 |= composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        }
                        if ((458752 & i) == 0) {
                            i4 |= ((i3 & 32) == 0 && composerStartRestartGroup.changed(j)) ? 131072 : 65536;
                        }
                        if ((i & 3670016) == 0) {
                            i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(j2)) ? 1048576 : 524288;
                        }
                        i8 = i3 & 128;
                        if (i8 == 0) {
                            if ((i & 29360128) == 0) {
                                borderStroke2 = borderStroke;
                                i4 |= composerStartRestartGroup.changed(borderStroke2) ? 8388608 : 4194304;
                            }
                            i9 = i3 & 256;
                            if (i9 == 0) {
                                i4 |= 100663296;
                            } else if ((i & 234881024) == 0) {
                                i4 |= composerStartRestartGroup.changed(f) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            i10 = i3 & 512;
                            if (i10 == 0) {
                                i4 |= 805306368;
                            } else if ((i & 1879048192) == 0) {
                                i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i11 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i11 = i2 | (composerStartRestartGroup.changedInstance(function2) ? 4 : 2);
                            } else {
                                i11 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i11 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                                    if (i6 != 0) {
                                        z3 = true;
                                    }
                                    rectangleShape = i7 == 0 ? RectangleShapeKt.getRectangleShape() : shape2;
                                    if ((i3 & 32) == 0) {
                                        jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                        i4 &= -458753;
                                    } else {
                                        jM8850getSurface0d7_KjU = j;
                                    }
                                    if ((i3 & 64) == 0) {
                                        jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 15) & 14);
                                        i4 &= -3670017;
                                    } else {
                                        jM8864contentColorForek8zF_U = j2;
                                    }
                                    borderStroke3 = i8 == 0 ? null : borderStroke2;
                                    fM13666constructorimpl = i9 == 0 ? C2046Dp.m13666constructorimpl(0) : f;
                                    if (i10 == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource2 = mutableInteractionSource;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 32) != 0) {
                                        i4 &= -458753;
                                    }
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    mutableInteractionSource2 = mutableInteractionSource;
                                    modifier3 = modifier2;
                                    rectangleShape = shape2;
                                    borderStroke3 = borderStroke2;
                                    jM8850getSurface0d7_KjU = j;
                                    jM8864contentColorForek8zF_U = j2;
                                    fM13666constructorimpl = f;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1341569296, i4, i11, "androidx.compose.material.Surface (Surface.kt:451)");
                                }
                                final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier5 = modifier3;
                                final Shape shape4 = rectangleShape;
                                final long j5 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke5 = borderStroke3;
                                final float f3 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                                final boolean z5 = z3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-311657392, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:457)");
                                            }
                                            Modifier modifierM8368toggleableO2vRcR0$default = ToggleableKt.m8368toggleableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier5), shape4, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j5, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl2, composer2, 0), borderStroke5, f3), z, mutableInteractionSource4, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z5, null, function1, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8368toggleableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                shape3 = rectangleShape;
                                j3 = jM8850getSurface0d7_KjU;
                                z4 = z3;
                                j4 = jM8864contentColorForek8zF_U;
                                f2 = fM13666constructorimpl;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                j3 = j;
                                f2 = f;
                                modifier4 = modifier2;
                                z4 = z3;
                                shape3 = shape2;
                                borderStroke4 = borderStroke2;
                                j4 = j2;
                                mutableInteractionSource3 = mutableInteractionSource;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$11
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

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        SurfaceKt.m9028SurfaceNy5ogXk(z, function1, modifier4, z4, shape3, j3, j4, borderStroke4, f2, mutableInteractionSource3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 12582912;
                        borderStroke2 = borderStroke;
                        i9 = i3 & 256;
                        if (i9 == 0) {
                        }
                        i10 = i3 & 512;
                        if (i10 == 0) {
                        }
                        if ((i3 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                }
                                if ((i3 & 32) == 0) {
                                }
                                if ((i3 & 64) == 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + fM13666constructorimpl);
                                final Modifier modifier52 = modifier3;
                                final Shape shape42 = rectangleShape;
                                final long j52 = jM8850getSurface0d7_KjU;
                                final BorderStroke borderStroke52 = borderStroke3;
                                final float f32 = fM13666constructorimpl;
                                final MutableInteractionSource mutableInteractionSource42 = mutableInteractionSource2;
                                final boolean z52 = z3;
                                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl22))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -311657392, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$10
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

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 11) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-311657392, i12, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:457)");
                                            }
                                            Modifier modifierM8368toggleableO2vRcR0$default = ToggleableKt.m8368toggleableO2vRcR0$default(SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier52), shape42, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j52, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl22, composer2, 0), borderStroke52, f32), z, mutableInteractionSource42, RippleKt.m9113rememberRipple9IZ8Weo(false, 0.0f, 0L, composer2, 0, 7), z52, null, function1, 16, null);
                                            Function2<Composer, Integer, Unit> function22 = function2;
                                            composer2.startReplaceableGroup(733328855);
                                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                            composer2.startReplaceableGroup(-1323940314);
                                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8368toggleableO2vRcR0$default);
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
                                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            }
                                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                            composer2.startReplaceableGroup(2058660585);
                                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                            function22.invoke(composer2, 0);
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
                                }), composerStartRestartGroup, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier4 = modifier3;
                                shape3 = rectangleShape;
                                j3 = jM8850getSurface0d7_KjU;
                                z4 = z3;
                                j4 = jM8864contentColorForek8zF_U;
                                f2 = fM13666constructorimpl;
                                borderStroke4 = borderStroke3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    shape2 = shape;
                    if ((458752 & i) == 0) {
                    }
                    if ((i & 3670016) == 0) {
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                    }
                    borderStroke2 = borderStroke;
                    i9 = i3 & 256;
                    if (i9 == 0) {
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                    }
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                z3 = z2;
                i7 = i3 & 16;
                if (i7 == 0) {
                }
                shape2 = shape;
                if ((458752 & i) == 0) {
                }
                if ((i & 3670016) == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                borderStroke2 = borderStroke;
                i9 = i3 & 256;
                if (i9 == 0) {
                }
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                if ((i3 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            z3 = z2;
            i7 = i3 & 16;
            if (i7 == 0) {
            }
            shape2 = shape;
            if ((458752 & i) == 0) {
            }
            if ((i & 3670016) == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            borderStroke2 = borderStroke;
            i9 = i3 & 256;
            if (i9 == 0) {
            }
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            if ((i3 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        z3 = z2;
        i7 = i3 & 16;
        if (i7 == 0) {
        }
        shape2 = shape;
        if ((458752 & i) == 0) {
        }
        if ((i & 3670016) == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        borderStroke2 = borderStroke;
        i9 = i3 & 256;
        if (i9 == 0) {
        }
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        if ((i3 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:406:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:429:? A[RETURN, SYNTHETIC] */
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    @Deprecated(level = DeprecationLevel.ERROR, message = "This API is deprecated with the introduction a newer Surface function overload that accepts an onClick().", replaceWith = @ReplaceWith(expression = "Surface(onClick, modifier, enabled, shape, color, contentColor, border, elevation, interactionSource, content)", imports = {}))
    @Composable
    @ExperimentalMaterialApi
    /* renamed from: Surface-9VG74zQ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9024Surface9VG74zQ(@NotNull final Function0<Unit> function0, @Nullable Modifier modifier, @Nullable Shape shape, long j, long j2, @Nullable BorderStroke borderStroke, float f, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Indication indication, boolean z, @Nullable String str, @Nullable Role role, @NotNull final Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        long jM8864contentColorForek8zF_U;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Shape rectangleShape;
        long jM8850getSurface0d7_KjU;
        float f2;
        MutableInteractionSource mutableInteractionSource2;
        Indication indication2;
        Role role2;
        MutableInteractionSource mutableInteractionSource3;
        String str2;
        int i13;
        Modifier modifier2;
        float f3;
        boolean z2;
        BorderStroke borderStroke2;
        final BorderStroke borderStroke3;
        final String str3;
        final Role role3;
        final Modifier modifier3;
        final float f4;
        final MutableInteractionSource mutableInteractionSource4;
        final Shape shape2;
        final boolean z3;
        final Indication indication3;
        final long j3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1585925488);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 14) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i14 = i3 & 2;
        if (i14 != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    i4 |= composerStartRestartGroup.changed(shape) ? 256 : 128;
                }
                if ((i & 7168) == 0) {
                    i4 |= ((i3 & 8) == 0 && composerStartRestartGroup.changed(j)) ? 2048 : 1024;
                }
                if ((i & 57344) == 0) {
                    jM8864contentColorForek8zF_U = j2;
                    i4 |= ((i3 & 16) == 0 && composerStartRestartGroup.changed(jM8864contentColorForek8zF_U)) ? 16384 : 8192;
                } else {
                    jM8864contentColorForek8zF_U = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(borderStroke) ? 131072 : 65536;
                }
                i7 = i3 & 64;
                if (i7 != 0) {
                    i4 |= 1572864;
                } else if ((i & 3670016) == 0) {
                    i4 |= composerStartRestartGroup.changed(f) ? 1048576 : 524288;
                }
                i8 = i3 & 128;
                if (i8 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 8388608 : 4194304;
                }
                if ((i & 234881024) == 0) {
                    i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(indication)) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i9 = i3 & 512;
                if (i9 != 0) {
                    i4 |= 805306368;
                } else if ((i & 1879048192) == 0) {
                    i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                i10 = i3 & 1024;
                if (i10 != 0) {
                    i11 = i2 | 6;
                } else if ((i2 & 14) == 0) {
                    i11 = i2 | (composerStartRestartGroup.changed(str) ? 4 : 2);
                } else {
                    i11 = i2;
                }
                i12 = i3 & 2048;
                if (i12 != 0) {
                    i11 |= 48;
                } else if ((i2 & 112) == 0) {
                    i11 |= composerStartRestartGroup.changed(role) ? 32 : 16;
                }
                int i15 = i11;
                if ((i3 & 4096) == 0) {
                    if ((i2 & 896) == 0) {
                        i15 |= composerStartRestartGroup.changedInstance(function2) ? 256 : 128;
                    }
                    if ((i4 & 1533916891) == 306783378 || (i15 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier;
                            rectangleShape = i5 == 0 ? RectangleShapeKt.getRectangleShape() : shape;
                            if ((i3 & 8) == 0) {
                                jM8850getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m8850getSurface0d7_KjU();
                                i4 &= -7169;
                            } else {
                                jM8850getSurface0d7_KjU = j;
                            }
                            if ((i3 & 16) != 0) {
                                jM8864contentColorForek8zF_U = ColorsKt.m8864contentColorForek8zF_U(jM8850getSurface0d7_KjU, composerStartRestartGroup, (i4 >> 9) & 14);
                                i4 &= -57345;
                            }
                            BorderStroke borderStroke4 = i6 == 0 ? null : borderStroke;
                            Modifier modifier5 = modifier4;
                            float fM13666constructorimpl = i7 == 0 ? C2046Dp.m13666constructorimpl(0) : f;
                            if (i8 == 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                f2 = fM13666constructorimpl;
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                f2 = fM13666constructorimpl;
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i3 & 256) == 0) {
                                indication2 = (Indication) composerStartRestartGroup.consume(IndicationKt.getLocalIndication());
                                i4 &= -234881025;
                            } else {
                                indication2 = indication;
                            }
                            boolean z4 = i9 == 0 ? true : z;
                            String str4 = i10 == 0 ? null : str;
                            if (i12 == 0) {
                                mutableInteractionSource3 = mutableInteractionSource2;
                                str2 = str4;
                                i13 = i4;
                                role2 = null;
                            } else {
                                role2 = role;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                str2 = str4;
                                i13 = i4;
                            }
                            modifier2 = modifier5;
                            f3 = f2;
                            z2 = z4;
                            borderStroke2 = borderStroke4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            modifier2 = modifier;
                            rectangleShape = shape;
                            jM8850getSurface0d7_KjU = j;
                            borderStroke2 = borderStroke;
                            f3 = f;
                            mutableInteractionSource3 = mutableInteractionSource;
                            indication2 = indication;
                            str2 = str;
                            role2 = role;
                            i13 = i4;
                            z2 = z;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1585925488, i13, i15, "androidx.compose.material.Surface (Surface.kt:583)");
                        }
                        final float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + f3);
                        final Modifier modifier6 = modifier2;
                        final Shape shape3 = rectangleShape;
                        final long j5 = jM8850getSurface0d7_KjU;
                        final BorderStroke borderStroke5 = borderStroke2;
                        final float f5 = f3;
                        final MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                        final Indication indication4 = indication2;
                        final boolean z5 = z2;
                        final String str5 = str2;
                        final Role role4 = role2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl2))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i16) {
                                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(149594672, i16, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:589)");
                                    }
                                    Modifier modifierThen = SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier6), shape3, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j5, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl2, composer2, 0), borderStroke5, f5).then(ClickableKt.m7802clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource5, indication4, z5, str5, role4, function0));
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
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
                        }), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        borderStroke3 = borderStroke2;
                        str3 = str2;
                        role3 = role2;
                        modifier3 = modifier2;
                        long j6 = jM8850getSurface0d7_KjU;
                        f4 = f3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = rectangleShape;
                        long j7 = jM8864contentColorForek8zF_U;
                        z3 = z2;
                        indication3 = indication2;
                        j3 = j6;
                        j4 = j7;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        shape2 = shape;
                        j3 = j;
                        borderStroke3 = borderStroke;
                        f4 = f;
                        mutableInteractionSource4 = mutableInteractionSource;
                        str3 = str;
                        role3 = role;
                        j4 = jM8864contentColorForek8zF_U;
                        indication3 = indication;
                        z3 = z;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$14
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

                            public final void invoke(@Nullable Composer composer2, int i16) {
                                SurfaceKt.m9024Surface9VG74zQ(function0, modifier3, shape2, j3, j4, borderStroke3, f4, mutableInteractionSource4, indication3, z3, str3, role3, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i15 |= 384;
                if ((i4 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i3 & 8) == 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i6 == 0) {
                        }
                        Modifier modifier52 = modifier4;
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        modifier2 = modifier52;
                        f3 = f2;
                        z2 = z4;
                        borderStroke2 = borderStroke4;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        final float fM13666constructorimpl22 = C2046Dp.m13666constructorimpl(((C2046Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m13680unboximpl() + f3);
                        final Modifier modifier62 = modifier2;
                        final Shape shape32 = rectangleShape;
                        final long j52 = jM8850getSurface0d7_KjU;
                        final BorderStroke borderStroke52 = borderStroke2;
                        final float f52 = f3;
                        final MutableInteractionSource mutableInteractionSource52 = mutableInteractionSource3;
                        final Indication indication42 = indication2;
                        final boolean z52 = z2;
                        final String str52 = str2;
                        final Role role42 = role2;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(jM8864contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(C2046Dp.m13664boximpl(fM13666constructorimpl22))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 149594672, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material.SurfaceKt$Surface$13
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

                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                            @Composable
                            public final void invoke(@Nullable Composer composer2, int i16) {
                                if ((i16 & 11) != 2 || !composer2.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(149594672, i16, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:589)");
                                    }
                                    Modifier modifierThen = SurfaceKt.m9031surface8ww4TTg(InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier62), shape32, SurfaceKt.m9032surfaceColorAtElevationcq6XJ1M(j52, (ElevationOverlay) composer2.consume(ElevationOverlayKt.getLocalElevationOverlay()), fM13666constructorimpl22, composer2, 0), borderStroke52, f52).then(ClickableKt.m7802clickableO2vRcR0(Modifier.INSTANCE, mutableInteractionSource52, indication42, z52, str52, role42, function0));
                                    Function2<Composer, Integer, Unit> function22 = function2;
                                    composer2.startReplaceableGroup(733328855);
                                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), true, composer2, 48);
                                    composer2.startReplaceableGroup(-1323940314);
                                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
                                    Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
                                    Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                    if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                                    composer2.startReplaceableGroup(2058660585);
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    function22.invoke(composer2, 0);
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
                        }), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        borderStroke3 = borderStroke2;
                        str3 = str2;
                        role3 = role2;
                        modifier3 = modifier2;
                        long j62 = jM8850getSurface0d7_KjU;
                        f4 = f3;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = rectangleShape;
                        long j72 = jM8864contentColorForek8zF_U;
                        z3 = z2;
                        indication3 = indication2;
                        j3 = j62;
                        j4 = j72;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i & 7168) == 0) {
            }
            if ((i & 57344) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            i7 = i3 & 64;
            if (i7 != 0) {
            }
            i8 = i3 & 128;
            if (i8 != 0) {
            }
            if ((i & 234881024) == 0) {
            }
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i10 = i3 & 1024;
            if (i10 != 0) {
            }
            i12 = i3 & 2048;
            if (i12 != 0) {
            }
            int i152 = i11;
            if ((i3 & 4096) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        if ((i & 7168) == 0) {
        }
        if ((i & 57344) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        i7 = i3 & 64;
        if (i7 != 0) {
        }
        i8 = i3 & 128;
        if (i8 != 0) {
        }
        if ((i & 234881024) == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i3 & 1024;
        if (i10 != 0) {
        }
        i12 = i3 & 2048;
        if (i12 != 0) {
        }
        int i1522 = i11;
        if ((i3 & 4096) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* renamed from: surface-8ww4TTg */
    public static final Modifier m9031surface8ww4TTg(Modifier modifier, Shape shape, long j, BorderStroke borderStroke, float f) {
        return ClipKt.clip(BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifier, f, shape, false, 0L, 0L, 24, null).then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j, shape), shape);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: surfaceColorAtElevation-cq6XJ1M */
    public static final long m9032surfaceColorAtElevationcq6XJ1M(long j, ElevationOverlay elevationOverlay, float f, Composer composer, int i) {
        composer.startReplaceableGroup(1561611256);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:634)");
        }
        if (Color.m11341equalsimpl0(j, MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU()) && elevationOverlay != null) {
            j = elevationOverlay.mo8886apply7g2Lkgo(j, f, composer, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return j;
    }
}
