package com.blackhub.bronline.game.p019ui.widget.utils;

import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.material3.MaterialThemeKt;
import androidx.compose.material3.TextKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformTextStyle;
import androidx.compose.p003ui.text.TextLayoutResult;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.tooling.preview.Preview;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DensityKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.unit.TextUnitType;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.RangesKt__RangesKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KProperty;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AutoSizeText.kt */
@SourceDebugExtension({"SMAP\nAutoSizeText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoSizeText.kt\ncom/blackhub/bronline/game/ui/widget/utils/AutoSizeTextKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,332:1\n74#2:333\n74#2:334\n74#2:341\n74#2:342\n74#2:343\n74#2:344\n1116#3,6:335\n1#4:345\n*S KotlinDebug\n*F\n+ 1 AutoSizeText.kt\ncom/blackhub/bronline/game/ui/widget/utils/AutoSizeTextKt\n*L\n96#1:333\n146#1:334\n153#1:341\n272#1:342\n273#1:343\n278#1:344\n148#1:335,6\n*E\n"})
/* loaded from: classes3.dex */
public final class AutoSizeTextKt {

    /* compiled from: AutoSizeText.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$PreviewAutoSizeText1$1 */
    /* loaded from: classes6.dex */
    public static final class C64931 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64931(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AutoSizeTextKt.PreviewAutoSizeText1(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: AutoSizeText.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$PreviewAutoSizeText2$1 */
    /* loaded from: classes6.dex */
    public static final class C64941 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C64941(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            AutoSizeTextKt.PreviewAutoSizeText2(composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:288:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:447:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:473:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:496:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:523:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: AutoSizeText-UapLOtE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15112AutoSizeTextUapLOtE(@NotNull final String text, @Nullable Modifier modifier, @Nullable ImmutableWrapper<List<TextUnit>> immutableWrapper, long j, long j2, long j3, @Nullable Alignment alignment, long j4, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j5, @Nullable TextDecoration textDecoration, float f, int i, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        Modifier modifier2;
        ImmutableWrapper<List<TextUnit>> immutableWrapper2;
        Alignment topStart;
        TextStyle textStyle2;
        TextDecoration textDecoration2;
        int i20;
        FontFamily fontFamily2;
        FontWeight fontWeight2;
        int i21;
        float f2;
        int i22;
        Function1<? super TextLayoutResult, Unit> function12;
        long j6;
        long j7;
        long j8;
        long j9;
        FontStyle fontStyle2;
        long j10;
        Composer composer2;
        FontWeight fontWeight3;
        final FontStyle fontStyle3;
        final Modifier modifier3;
        final FontFamily fontFamily3;
        final long j11;
        final TextDecoration textDecoration3;
        final float f3;
        final int i23;
        final Function1<? super TextLayoutResult, Unit> function13;
        final TextStyle textStyle3;
        final FontWeight fontWeight4;
        final ImmutableWrapper<List<TextUnit>> immutableWrapper3;
        final long j12;
        final long j13;
        final Alignment alignment2;
        final long j14;
        final long j15;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1428304551);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i24 = i4 & 2;
        if (i24 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(immutableWrapper)) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
            }
            i7 = i4 & 16;
            if (i7 == 0) {
                i5 |= CpioConstants.C_ISBLK;
            } else if ((i2 & 57344) == 0) {
                i5 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            }
            i8 = i4 & 32;
            if (i8 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i2 & 458752) == 0) {
                i5 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
            }
            i9 = i4 & 64;
            if (i9 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i5 |= composerStartRestartGroup.changed(alignment) ? 1048576 : 524288;
            }
            i10 = i4 & 128;
            if (i10 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                i5 |= composerStartRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            i11 = i4 & 256;
            if (i11 == 0) {
                i5 |= 100663296;
            } else if ((i2 & 234881024) == 0) {
                i5 |= composerStartRestartGroup.changed(fontStyle) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
            }
            i12 = i4 & 512;
            if (i12 == 0) {
                i5 |= 805306368;
            } else if ((i2 & 1879048192) == 0) {
                i5 |= composerStartRestartGroup.changed(fontWeight) ? 536870912 : 268435456;
            }
            i13 = i4 & 1024;
            if (i13 == 0) {
                i14 = i3 | 6;
            } else if ((i3 & 14) == 0) {
                i14 = i3 | (composerStartRestartGroup.changed(fontFamily) ? 4 : 2);
            } else {
                i14 = i3;
            }
            i15 = i4 & 2048;
            if (i15 == 0) {
                i14 |= 48;
            } else if ((i3 & 112) == 0) {
                i14 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
            }
            int i25 = i14;
            i16 = i4 & 4096;
            if (i16 == 0) {
                i25 |= 384;
            } else {
                if ((i3 & 896) == 0) {
                    i25 |= composerStartRestartGroup.changed(textDecoration) ? 256 : 128;
                }
                i17 = i4 & 8192;
                if (i17 == 0) {
                    if ((i3 & 7168) == 0) {
                        i25 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                    }
                    i18 = i4 & 16384;
                    if (i18 == 0) {
                        i25 |= CpioConstants.C_ISBLK;
                    } else if ((i3 & 57344) == 0) {
                        i25 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                    }
                    i19 = i4 & 32768;
                    if (i19 == 0) {
                        i25 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i3 & 458752) == 0) {
                        i25 |= composerStartRestartGroup.changedInstance(function1) ? 131072 : 65536;
                    }
                    if ((i3 & 3670016) == 0) {
                        i25 |= ((i4 & 65536) == 0 && composerStartRestartGroup.changed(textStyle)) ? 1048576 : 524288;
                    }
                    if ((i5 & 1533916891) == 306783378 || (2995931 & i25) != 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier2 = i24 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i4 & 4) == 0) {
                                immutableWrapper2 = toImmutableWrapper(CollectionsKt__CollectionsKt.emptyList());
                                i5 &= -897;
                            } else {
                                immutableWrapper2 = immutableWrapper;
                            }
                            long jM13868getUnspecifiedXSAIIZE = i6 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j;
                            long jM13868getUnspecifiedXSAIIZE2 = i7 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                            long jM13868getUnspecifiedXSAIIZE3 = i8 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                            topStart = i9 == 0 ? Alignment.INSTANCE.getTopStart() : alignment;
                            long jM11376getUnspecified0d7_KjU = i10 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
                            FontStyle fontStyle4 = i11 == 0 ? null : fontStyle;
                            FontWeight fontWeight5 = i12 == 0 ? null : fontWeight;
                            FontFamily fontFamily4 = i13 == 0 ? null : fontFamily;
                            long jM13868getUnspecifiedXSAIIZE4 = i15 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j5;
                            TextDecoration textDecoration4 = i16 == 0 ? textDecoration : null;
                            float f4 = i17 == 0 ? 0.1f : f;
                            int i26 = i18 == 0 ? Integer.MAX_VALUE : i;
                            Function1<? super TextLayoutResult, Unit> function14 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$1
                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull TextLayoutResult it) {
                                    Intrinsics.checkNotNullParameter(it, "it");
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                    invoke2(textLayoutResult);
                                    return Unit.INSTANCE;
                                }
                            } : function1;
                            if ((i4 & 65536) == 0) {
                                textDecoration2 = textDecoration4;
                                i20 = i5;
                                fontFamily2 = fontFamily4;
                                i21 = i25 & (-3670017);
                                f2 = f4;
                                i22 = i26;
                                function12 = function14;
                                textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                j6 = jM13868getUnspecifiedXSAIIZE2;
                                j7 = jM13868getUnspecifiedXSAIIZE3;
                                j8 = jM11376getUnspecified0d7_KjU;
                                j9 = jM13868getUnspecifiedXSAIIZE4;
                                fontWeight2 = fontWeight5;
                            } else {
                                textStyle2 = textStyle;
                                textDecoration2 = textDecoration4;
                                i20 = i5;
                                fontFamily2 = fontFamily4;
                                fontWeight2 = fontWeight5;
                                i21 = i25;
                                f2 = f4;
                                i22 = i26;
                                function12 = function14;
                                j6 = jM13868getUnspecifiedXSAIIZE2;
                                j7 = jM13868getUnspecifiedXSAIIZE3;
                                j8 = jM11376getUnspecified0d7_KjU;
                                j9 = jM13868getUnspecifiedXSAIIZE4;
                            }
                            fontStyle2 = fontStyle4;
                            j10 = jM13868getUnspecifiedXSAIIZE;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i4 & 4) != 0) {
                                i5 &= -897;
                            }
                            if ((i4 & 65536) != 0) {
                                i25 &= -3670017;
                            }
                            modifier2 = modifier;
                            immutableWrapper2 = immutableWrapper;
                            j10 = j;
                            topStart = alignment;
                            j8 = j4;
                            fontStyle2 = fontStyle;
                            fontWeight2 = fontWeight;
                            fontFamily2 = fontFamily;
                            j9 = j5;
                            textDecoration2 = textDecoration;
                            f2 = f;
                            i22 = i;
                            function12 = function1;
                            textStyle2 = textStyle;
                            i20 = i5;
                            i21 = i25;
                            j6 = j2;
                            j7 = j3;
                        }
                        composerStartRestartGroup.endDefaults();
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            fontWeight3 = fontWeight2;
                        } else {
                            fontWeight3 = fontWeight2;
                            ComposerKt.traceEventStart(1428304551, i20, i21, "com.blackhub.bronline.game.ui.widget.utils.AutoSizeText (AutoSizeText.kt:96)");
                        }
                        int i27 = i21 << 3;
                        m15111AutoSizeText0CVRy_0(new AnnotatedString(text, null, null, 6, null), modifier2, immutableWrapper2, j10, j6, j7, topStart, j8, fontStyle2, fontWeight3, fontFamily2, j9, textDecoration2, f2, i22, null, function12, textStyle2, composer2, i20 & 2147483632, (65534 & i21) | (i27 & 3670016) | (i27 & 29360128), 32768);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                        fontFamily3 = fontFamily2;
                        j11 = j9;
                        textDecoration3 = textDecoration2;
                        f3 = f2;
                        i23 = i22;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        Alignment alignment3 = topStart;
                        fontWeight4 = fontWeight3;
                        long j16 = j6;
                        immutableWrapper3 = immutableWrapper2;
                        j12 = j10;
                        j13 = j8;
                        alignment2 = alignment3;
                        j14 = j7;
                        j15 = j16;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        immutableWrapper3 = immutableWrapper;
                        j12 = j;
                        j15 = j2;
                        j14 = j3;
                        alignment2 = alignment;
                        j13 = j4;
                        fontStyle3 = fontStyle;
                        fontWeight4 = fontWeight;
                        fontFamily3 = fontFamily;
                        j11 = j5;
                        textDecoration3 = textDecoration;
                        f3 = f;
                        i23 = i;
                        function13 = function1;
                        textStyle3 = textStyle;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer3, int i28) {
                                AutoSizeTextKt.m15112AutoSizeTextUapLOtE(text, modifier3, immutableWrapper3, j12, j15, j14, alignment2, j13, fontStyle3, fontWeight4, fontFamily3, j11, textDecoration3, f3, i23, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                            }
                        });
                        return;
                    }
                    return;
                }
                i25 |= 3072;
                i18 = i4 & 16384;
                if (i18 == 0) {
                }
                i19 = i4 & 32768;
                if (i19 == 0) {
                }
                if ((i3 & 3670016) == 0) {
                }
                if ((i5 & 1533916891) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i24 == 0) {
                        }
                        if ((i4 & 4) == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i9 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (i12 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (i15 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i17 == 0) {
                        }
                        if (i18 == 0) {
                        }
                        if (i19 == 0) {
                        }
                        if ((i4 & 65536) == 0) {
                        }
                        fontStyle2 = fontStyle4;
                        j10 = jM13868getUnspecifiedXSAIIZE;
                        composerStartRestartGroup.endDefaults();
                        composer2 = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i272 = i21 << 3;
                        m15111AutoSizeText0CVRy_0(new AnnotatedString(text, null, null, 6, null), modifier2, immutableWrapper2, j10, j6, j7, topStart, j8, fontStyle2, fontWeight3, fontFamily2, j9, textDecoration2, f2, i22, null, function12, textStyle2, composer2, i20 & 2147483632, (65534 & i21) | (i272 & 3670016) | (i272 & 29360128), 32768);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        fontStyle3 = fontStyle2;
                        modifier3 = modifier2;
                        fontFamily3 = fontFamily2;
                        j11 = j9;
                        textDecoration3 = textDecoration2;
                        f3 = f2;
                        i23 = i22;
                        function13 = function12;
                        textStyle3 = textStyle2;
                        Alignment alignment32 = topStart;
                        fontWeight4 = fontWeight3;
                        long j162 = j6;
                        immutableWrapper3 = immutableWrapper2;
                        j12 = j10;
                        j13 = j8;
                        alignment2 = alignment32;
                        j14 = j7;
                        j15 = j162;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i17 = i4 & 8192;
            if (i17 == 0) {
            }
            i18 = i4 & 16384;
            if (i18 == 0) {
            }
            i19 = i4 & 32768;
            if (i19 == 0) {
            }
            if ((i3 & 3670016) == 0) {
            }
            if ((i5 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 896) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 == 0) {
        }
        i13 = i4 & 1024;
        if (i13 == 0) {
        }
        i15 = i4 & 2048;
        if (i15 == 0) {
        }
        int i252 = i14;
        i16 = i4 & 4096;
        if (i16 == 0) {
        }
        i17 = i4 & 8192;
        if (i17 == 0) {
        }
        i18 = i4 & 16384;
        if (i18 == 0) {
        }
        i19 = i4 & 32768;
        if (i19 == 0) {
        }
        if ((i3 & 3670016) == 0) {
        }
        if ((i5 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:320:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:490:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:514:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:538:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:544:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:587:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: AutoSizeText-0CVRy_0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m15111AutoSizeText0CVRy_0(@NotNull final AnnotatedString text, @Nullable Modifier modifier, @Nullable ImmutableWrapper<List<TextUnit>> immutableWrapper, long j, long j2, long j3, @Nullable Alignment alignment, long j4, @Nullable FontStyle fontStyle, @Nullable FontWeight fontWeight, @Nullable FontFamily fontFamily, long j5, @Nullable TextDecoration textDecoration, float f, int i, @Nullable ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper2, @Nullable Function1<? super TextLayoutResult, Unit> function1, @Nullable TextStyle textStyle, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ImmutableWrapper<List<TextUnit>> immutableWrapper3;
        ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper4;
        TextDecoration textDecoration2;
        TextStyle textStyle2;
        FontStyle fontStyle2;
        FontWeight fontWeight2;
        float f2;
        FontFamily fontFamily2;
        int i20;
        ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper5;
        Function1<? super TextLayoutResult, Unit> function12;
        ImmutableWrapper<List<TextUnit>> immutableWrapper6;
        long j6;
        Alignment alignment2;
        long j7;
        long j8;
        Modifier modifier2;
        long j9;
        long j10;
        Object objRememberedValue;
        List list;
        Composer composer2;
        final ImmutableWrapper<List<TextUnit>> immutableWrapper7;
        final long j11;
        final long j12;
        final long j13;
        final Alignment alignment3;
        final long j14;
        final FontStyle fontStyle3;
        final FontWeight fontWeight3;
        final FontFamily fontFamily3;
        final long j15;
        final TextDecoration textDecoration3;
        final float f3;
        final int i21;
        final ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper8;
        final Function1<? super TextLayoutResult, Unit> function13;
        final TextStyle textStyle3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1611924276);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(text) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i22 = i4 & 2;
        if (i22 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 896) == 0) {
                i5 |= ((i4 & 4) == 0 && composerStartRestartGroup.changed(immutableWrapper)) ? 256 : 128;
            }
            i6 = i4 & 8;
            if (i6 == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
            }
            i7 = i4 & 16;
            if (i7 == 0) {
                i5 |= CpioConstants.C_ISBLK;
            } else if ((i2 & 57344) == 0) {
                i5 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
            }
            i8 = i4 & 32;
            if (i8 == 0) {
                i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else if ((i2 & 458752) == 0) {
                i5 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
            }
            i9 = i4 & 64;
            if (i9 == 0) {
                i5 |= 1572864;
            } else if ((i2 & 3670016) == 0) {
                i5 |= composerStartRestartGroup.changed(alignment) ? 1048576 : 524288;
            }
            i10 = i4 & 128;
            if (i10 == 0) {
                i5 |= 12582912;
            } else if ((i2 & 29360128) == 0) {
                i5 |= composerStartRestartGroup.changed(j4) ? 8388608 : 4194304;
            }
            i11 = i4 & 256;
            if (i11 == 0) {
                i5 |= 100663296;
            } else {
                if ((234881024 & i2) == 0) {
                    i5 |= composerStartRestartGroup.changed(fontStyle) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i12 = i4 & 512;
                if (i12 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= composerStartRestartGroup.changed(fontWeight) ? 536870912 : 268435456;
                }
                i13 = i4 & 1024;
                if (i13 != 0) {
                    i14 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i14 = i3 | (composerStartRestartGroup.changed(fontFamily) ? 4 : 2);
                } else {
                    i14 = i3;
                }
                i15 = i4 & 2048;
                if (i15 != 0) {
                    i14 |= 48;
                } else if ((i3 & 112) == 0) {
                    i14 |= composerStartRestartGroup.changed(j5) ? 32 : 16;
                }
                int i23 = i14;
                i16 = i4 & 4096;
                if (i16 != 0) {
                    i23 |= 384;
                } else {
                    if ((i3 & 896) == 0) {
                        i23 |= composerStartRestartGroup.changed(textDecoration) ? 256 : 128;
                    }
                    i17 = i4 & 8192;
                    if (i17 != 0) {
                        if ((i3 & 7168) == 0) {
                            i23 |= composerStartRestartGroup.changed(f) ? 2048 : 1024;
                        }
                        i18 = i4 & 16384;
                        if (i18 != 0) {
                            i23 |= CpioConstants.C_ISBLK;
                        } else if ((i3 & 57344) == 0) {
                            i23 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                        }
                        if ((i3 & 458752) == 0) {
                            i23 |= ((i4 & 32768) == 0 && composerStartRestartGroup.changed(immutableWrapper2)) ? 131072 : 65536;
                        }
                        i19 = i4 & 65536;
                        if (i19 != 0) {
                            i23 |= 1572864;
                        } else if ((i3 & 3670016) == 0) {
                            i23 |= composerStartRestartGroup.changedInstance(function1) ? 1048576 : 524288;
                        }
                        if ((i3 & 29360128) == 0) {
                            i23 |= ((i4 & 131072) == 0 && composerStartRestartGroup.changed(textStyle)) ? 8388608 : 4194304;
                        }
                        if ((i5 & 1533916891) != 306783378 || (23967451 & i23) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier3 = i22 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i4 & 4) == 0) {
                                    immutableWrapper3 = toImmutableWrapper(CollectionsKt__CollectionsKt.emptyList());
                                    i5 &= -897;
                                } else {
                                    immutableWrapper3 = immutableWrapper;
                                }
                                long jM13868getUnspecifiedXSAIIZE = i6 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j;
                                long jM13868getUnspecifiedXSAIIZE2 = i7 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j2;
                                long jM13868getUnspecifiedXSAIIZE3 = i8 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j3;
                                Alignment topStart = i9 == 0 ? Alignment.INSTANCE.getTopStart() : alignment;
                                long jM11376getUnspecified0d7_KjU = i10 == 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
                                FontStyle fontStyle4 = i11 == 0 ? null : fontStyle;
                                FontWeight fontWeight4 = i12 == 0 ? null : fontWeight;
                                FontFamily fontFamily4 = i13 == 0 ? null : fontFamily;
                                long jM13868getUnspecifiedXSAIIZE4 = i15 == 0 ? TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE() : j5;
                                TextDecoration textDecoration4 = i16 == 0 ? textDecoration : null;
                                float f4 = i17 == 0 ? 0.1f : f;
                                int i24 = i18 == 0 ? Integer.MAX_VALUE : i;
                                if ((i4 & 32768) == 0) {
                                    immutableWrapper4 = toImmutableWrapper(MapsKt__MapsKt.emptyMap());
                                    i23 &= -458753;
                                } else {
                                    immutableWrapper4 = immutableWrapper2;
                                }
                                Function1<? super TextLayoutResult, Unit> function14 = i19 == 0 ? new Function1<TextLayoutResult, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$3
                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull TextLayoutResult it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(TextLayoutResult textLayoutResult) {
                                        invoke2(textLayoutResult);
                                        return Unit.INSTANCE;
                                    }
                                } : function1;
                                TextDecoration textDecoration5 = textDecoration4;
                                if ((i4 & 131072) == 0) {
                                    i23 &= -29360129;
                                    textDecoration2 = textDecoration5;
                                    textStyle2 = (TextStyle) composerStartRestartGroup.consume(TextKt.getLocalTextStyle());
                                } else {
                                    textDecoration2 = textDecoration5;
                                    textStyle2 = textStyle;
                                }
                                fontStyle2 = fontStyle4;
                                fontWeight2 = fontWeight4;
                                f2 = f4;
                                fontFamily2 = fontFamily4;
                                i20 = i24;
                                immutableWrapper5 = immutableWrapper4;
                                function12 = function14;
                                immutableWrapper6 = immutableWrapper3;
                                j6 = jM13868getUnspecifiedXSAIIZE3;
                                alignment2 = topStart;
                                j7 = jM11376getUnspecified0d7_KjU;
                                j8 = jM13868getUnspecifiedXSAIIZE4;
                                modifier2 = modifier3;
                                j9 = jM13868getUnspecifiedXSAIIZE;
                                j10 = jM13868getUnspecifiedXSAIIZE2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 4) != 0) {
                                    i5 &= -897;
                                }
                                if ((i4 & 32768) != 0) {
                                    i23 &= -458753;
                                }
                                if ((i4 & 131072) != 0) {
                                    i23 &= -29360129;
                                }
                                modifier2 = modifier;
                                immutableWrapper6 = immutableWrapper;
                                j9 = j;
                                j10 = j2;
                                j6 = j3;
                                alignment2 = alignment;
                                j7 = j4;
                                fontStyle2 = fontStyle;
                                fontWeight2 = fontWeight;
                                fontFamily2 = fontFamily;
                                j8 = j5;
                                textDecoration2 = textDecoration;
                                f2 = f;
                                i20 = i;
                                immutableWrapper5 = immutableWrapper2;
                                function12 = function1;
                                textStyle2 = textStyle;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1611924276, i5, i23, "com.blackhub.bronline.game.ui.widget.utils.AutoSizeText (AutoSizeText.kt:146)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-807271769);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                TextUnitType.Companion companion = TextUnitType.INSTANCE;
                                objRememberedValue = CollectionsKt__CollectionsKt.listOf((Object[]) new TextUnitType[]{TextUnitType.m13882boximpl(companion.m13891getUnspecifiedUIouoOA()), TextUnitType.m13882boximpl(companion.m13890getSpUIouoOA())});
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            list = (List) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            if (list.contains(TextUnitType.m13882boximpl(TextUnit.m13856getTypeUIouoOA(j9)))) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            if (!list.contains(TextUnitType.m13882boximpl(TextUnit.m13856getTypeUIouoOA(j10)))) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            if (!list.contains(TextUnitType.m13882boximpl(TextUnit.m13856getTypeUIouoOA(j6)))) {
                                throw new IllegalStateException("Check failed.".toString());
                            }
                            final Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            ProvidedValue<Density> providedValueProvides = CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(density.getDensity(), 1.0f));
                            final Modifier modifier4 = modifier2;
                            final Alignment alignment4 = alignment2;
                            final long j16 = j6;
                            final long j17 = j10;
                            final long j18 = j9;
                            final ImmutableWrapper<List<TextUnit>> immutableWrapper9 = immutableWrapper6;
                            final TextStyle textStyle4 = textStyle2;
                            final float f5 = f2;
                            final int i25 = i20;
                            final ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper10 = immutableWrapper5;
                            final long j19 = j7;
                            final FontStyle fontStyle5 = fontStyle2;
                            final FontWeight fontWeight5 = fontWeight2;
                            final FontFamily fontFamily5 = fontFamily2;
                            final long j20 = j8;
                            final TextDecoration textDecoration6 = textDecoration2;
                            final Function1<? super TextLayoutResult, Unit> function15 = function12;
                            Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$4
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@Nullable Composer composer3, int i26) {
                                    if ((i26 & 11) != 2 || !composer3.getSkipping()) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(216946676, i26, -1, "com.blackhub.bronline.game.ui.widget.utils.AutoSizeText.<anonymous> (AutoSizeText.kt:157)");
                                        }
                                        Modifier modifier5 = modifier4;
                                        final Alignment alignment5 = alignment4;
                                        final long j21 = j16;
                                        final long j22 = j17;
                                        final long j23 = j18;
                                        final ImmutableWrapper<List<TextUnit>> immutableWrapper11 = immutableWrapper9;
                                        final TextStyle textStyle5 = textStyle4;
                                        final AnnotatedString annotatedString = text;
                                        final float f6 = f5;
                                        final int i27 = i25;
                                        final ImmutableWrapper<Map<String, InlineTextContent>> immutableWrapper12 = immutableWrapper10;
                                        final long j24 = j19;
                                        final FontStyle fontStyle6 = fontStyle5;
                                        final FontWeight fontWeight6 = fontWeight5;
                                        final FontFamily fontFamily6 = fontFamily5;
                                        final long j25 = j20;
                                        final TextDecoration textDecoration7 = textDecoration6;
                                        final Function1<TextLayoutResult, Unit> function16 = function15;
                                        final Density density2 = density;
                                        BoxWithConstraintsKt.BoxWithConstraints(modifier5, alignment5, false, ComposableLambdaKt.composableLambda(composer3, 1919351498, true, new Function3<BoxWithConstraintsScope, Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$4.1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(3);
                                            }

                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer4, Integer num) {
                                                invoke(boxWithConstraintsScope, composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX WARN: Multi-variable type inference failed */
                                            /* JADX WARN: Type inference failed for: r4v16 */
                                            /* JADX WARN: Type inference failed for: r4v17 */
                                            /* JADX WARN: Type inference failed for: r4v20, types: [java.util.ArrayList] */
                                            /* JADX WARN: Type inference failed for: r4v21 */
                                            /* JADX WARN: Type inference failed for: r4v31 */
                                            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                            @Composable
                                            public final void invoke(@NotNull BoxWithConstraintsScope BoxWithConstraints, @Nullable Composer composer4, int i28) {
                                                boolean z;
                                                TextStyle textStyleM13191copyp1EtxEg;
                                                int iM13558getCentere0LSkKk;
                                                Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
                                                int i29 = 2;
                                                int i30 = (i28 & 14) == 0 ? i28 | (composer4.changed(BoxWithConstraints) ? 4 : 2) : i28;
                                                if ((i30 & 91) != 18 || !composer4.getSkipping()) {
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventStart(1919351498, i30, -1, "com.blackhub.bronline.game.ui.widget.utils.AutoSizeText.<anonymous>.<anonymous> (AutoSizeText.kt:161)");
                                                    }
                                                    composer4.startReplaceableGroup(-296054370);
                                                    boolean zChanged = composer4.changed(j21);
                                                    Density density3 = density2;
                                                    long j26 = j21;
                                                    Object objRememberedValue2 = composer4.rememberedValue();
                                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                        float fontScale = density3.getFontScale() / density3.getDensity();
                                                        if (!TextUnitKt.m13875isUnspecifiedR2X_6o(j26)) {
                                                            fontScale = RangesKt___RangesKt.coerceAtLeast(TextUnit.m13857getValueimpl(j26), fontScale);
                                                        }
                                                        objRememberedValue2 = Float.valueOf(fontScale);
                                                        composer4.updateRememberedValue(objRememberedValue2);
                                                    }
                                                    float fFloatValue = ((Number) objRememberedValue2).floatValue();
                                                    composer4.endReplaceableGroup();
                                                    float fMo8061getMaxWidthD9Ej5fM = BoxWithConstraints.mo8061getMaxWidthD9Ej5fM();
                                                    float fMo8060getMaxHeightD9Ej5fM = BoxWithConstraints.mo8060getMaxHeightD9Ej5fM();
                                                    composer4.startReplaceableGroup(-296053965);
                                                    boolean zChanged2 = composer4.changed(fMo8061getMaxWidthD9Ej5fM) | composer4.changed(fMo8060getMaxHeightD9Ej5fM) | composer4.changed(j22);
                                                    long j27 = j22;
                                                    Object objRememberedValue3 = composer4.rememberedValue();
                                                    if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(Math.min(BoxWithConstraints.mo8061getMaxWidthD9Ej5fM(), BoxWithConstraints.mo8060getMaxHeightD9Ej5fM()));
                                                        if (!TextUnitKt.m13875isUnspecifiedR2X_6o(j27)) {
                                                            fM13666constructorimpl = RangesKt___RangesKt.coerceAtMost(TextUnit.m13857getValueimpl(j27), fM13666constructorimpl);
                                                        }
                                                        objRememberedValue3 = Float.valueOf(fM13666constructorimpl);
                                                        composer4.updateRememberedValue(objRememberedValue3);
                                                    }
                                                    float fFloatValue2 = ((Number) objRememberedValue3).floatValue();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-296053683);
                                                    boolean zChanged3 = composer4.changed(j23) | composer4.changed(fFloatValue) | composer4.changed(fFloatValue2);
                                                    long j28 = j23;
                                                    Object objRememberedValue4 = composer4.rememberedValue();
                                                    if (zChanged3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = Float.valueOf(TextUnitKt.m13875isUnspecifiedR2X_6o(j28) ? fFloatValue : ((Number) RangesKt___RangesKt.coerceIn(Float.valueOf(TextUnit.m13857getValueimpl(j28)), RangesKt__RangesKt.rangeTo(fFloatValue, fFloatValue2))).floatValue());
                                                        composer4.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    float fFloatValue3 = ((Number) objRememberedValue4).floatValue();
                                                    composer4.endReplaceableGroup();
                                                    composer4.startReplaceableGroup(-296053486);
                                                    boolean zChanged4 = composer4.changed(immutableWrapper11) | composer4.changed(fFloatValue3) | composer4.changed(fFloatValue2) | composer4.changed(fFloatValue);
                                                    ImmutableWrapper<List<TextUnit>> immutableWrapper13 = immutableWrapper11;
                                                    Object objRememberedValue5 = composer4.rememberedValue();
                                                    int i31 = 1;
                                                    if (zChanged4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        List<TextUnit> value = immutableWrapper13.getValue();
                                                        ArrayList arrayList = new ArrayList();
                                                        for (Object obj : value) {
                                                            long packedValue = ((TextUnit) obj).getPackedValue();
                                                            if (TextUnit.m13860isSpimpl(packedValue)) {
                                                                float fM13857getValueimpl = TextUnit.m13857getValueimpl(packedValue);
                                                                if (fFloatValue3 <= fM13857getValueimpl && fM13857getValueimpl <= fFloatValue2) {
                                                                    arrayList.add(obj);
                                                                }
                                                            }
                                                        }
                                                        List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$4$1$invoke$lambda$10$$inlined$sortedByDescending$1
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            @Override // java.util.Comparator
                                                            public final int compare(T t, T t2) {
                                                                return ComparisonsKt__ComparisonsKt.compareValues(Float.valueOf(TextUnit.m13857getValueimpl(((TextUnit) t2).getPackedValue())), Float.valueOf(TextUnit.m13857getValueimpl(((TextUnit) t).getPackedValue())));
                                                            }
                                                        });
                                                        boolean z2 = !listSortedWith.isEmpty();
                                                        ?? arrayList2 = listSortedWith;
                                                        if (!z2) {
                                                            arrayList2 = 0;
                                                        }
                                                        if (arrayList2 == 0) {
                                                            int iFloor = (((int) Math.floor(fFloatValue2 / fFloatValue)) - ((int) Math.ceil(fFloatValue3 / fFloatValue))) + 1;
                                                            arrayList2 = new ArrayList(iFloor);
                                                            for (int i32 = 0; i32 < iFloor; i32++) {
                                                                arrayList2.add(TextUnit.m13847boximpl(TextUnitKt.getSp((r2 - i32) * fFloatValue)));
                                                            }
                                                        }
                                                        objRememberedValue5 = arrayList2;
                                                        composer4.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    List list2 = (List) objRememberedValue5;
                                                    composer4.endReplaceableGroup();
                                                    TextStyle textStylePlus = ((TextStyle) composer4.consume(TextKt.getLocalTextStyle())).plus(textStyle5);
                                                    TextStyle textStyleM13191copyp1EtxEg2 = textStylePlus.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStylePlus.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStylePlus.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStylePlus.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStylePlus.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStylePlus.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStylePlus.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStylePlus.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStylePlus.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStylePlus.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStylePlus.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStylePlus.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStylePlus.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStylePlus.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStylePlus.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStylePlus.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStylePlus.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStylePlus.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStylePlus.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStylePlus.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStylePlus.platformStyle : new PlatformTextStyle(true), (15695871 & 1048576) != 0 ? textStylePlus.paragraphStyle.getLineHeightStyle() : new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m13535getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m13547getBothEVpEnUU(), null), (15695871 & 2097152) != 0 ? textStylePlus.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStylePlus.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStylePlus.paragraphStyle.getTextMotion() : null);
                                                    composer4.startReplaceableGroup(-296052522);
                                                    List list3 = list2;
                                                    if (!list3.isEmpty()) {
                                                        int i33 = 0;
                                                        int lastIndex = CollectionsKt__CollectionsKt.getLastIndex(list2);
                                                        while (i33 <= lastIndex) {
                                                            int i34 = i33 + ((lastIndex - i33) / i29);
                                                            long packedValue2 = ((TextUnit) list2.get(i34)).getPackedValue();
                                                            AnnotatedString annotatedString2 = annotatedString;
                                                            float f7 = i31 + f6;
                                                            TextUnitKt.m13870checkArithmeticR2X_6o(packedValue2);
                                                            List list4 = list2;
                                                            int i35 = i33;
                                                            if (AutoSizeTextKt.shouldShrink(BoxWithConstraints, annotatedString2, textStyleM13191copyp1EtxEg2.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontSize() : packedValue2, (15695871 & 4) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineHeight() : TextUnitKt.pack(TextUnit.m13855getRawTypeimpl(packedValue2), TextUnit.m13857getValueimpl(packedValue2) * f7), (15695871 & 262144) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleM13191copyp1EtxEg2.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextMotion() : null), i27, composer4, i30 & 14)) {
                                                                i33 = i34 + 1;
                                                                list2 = list4;
                                                                i29 = 2;
                                                                i31 = 1;
                                                            } else {
                                                                lastIndex = i34 - 1;
                                                                i33 = i35;
                                                                list2 = list4;
                                                                i29 = 2;
                                                                i31 = 1;
                                                            }
                                                        }
                                                        long packedValue3 = ((TextUnit) list2.get(RangesKt___RangesKt.coerceIn(i33, (ClosedRange<Integer>) CollectionsKt__CollectionsKt.getIndices(list3)))).getPackedValue();
                                                        z = true;
                                                        float f8 = 1 + f6;
                                                        TextUnitKt.m13870checkArithmeticR2X_6o(packedValue3);
                                                        textStyleM13191copyp1EtxEg = textStyleM13191copyp1EtxEg2.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontSize() : packedValue3, (15695871 & 4) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyleM13191copyp1EtxEg2.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineHeight() : TextUnitKt.pack(TextUnit.m13855getRawTypeimpl(packedValue3), TextUnit.m13857getValueimpl(packedValue3) * f8), (15695871 & 262144) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyleM13191copyp1EtxEg2.platformStyle : null, (15695871 & 1048576) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyleM13191copyp1EtxEg2.paragraphStyle.getTextMotion() : null);
                                                    } else {
                                                        z = true;
                                                        textStyleM13191copyp1EtxEg = textStyleM13191copyp1EtxEg2;
                                                    }
                                                    composer4.endReplaceableGroup();
                                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                                    long jM13868getUnspecifiedXSAIIZE5 = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
                                                    Alignment alignment6 = alignment5;
                                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                                    if (Intrinsics.areEqual(alignment6, companion3.getTopStart()) ? z : Intrinsics.areEqual(alignment6, companion3.getCenterStart()) ? z : Intrinsics.areEqual(alignment6, companion3.getBottomStart())) {
                                                        iM13558getCentere0LSkKk = TextAlign.INSTANCE.m13563getStarte0LSkKk();
                                                    } else {
                                                        iM13558getCentere0LSkKk = Intrinsics.areEqual(alignment6, companion3.getTopCenter()) ? z : Intrinsics.areEqual(alignment6, companion3.getCenter()) ? z : Intrinsics.areEqual(alignment6, companion3.getBottomCenter()) ? TextAlign.INSTANCE.m13558getCentere0LSkKk() : TextAlign.INSTANCE.m13559getEnde0LSkKk();
                                                    }
                                                    TextKt.m10025TextIbK3jfQ(annotatedString, companion2, j24, jM13868getUnspecifiedXSAIIZE5, fontStyle6, fontWeight6, fontFamily6, j25, textDecoration7, TextAlign.m13551boximpl(iM13558getCentere0LSkKk), 0L, TextOverflow.INSTANCE.m13609getVisiblegIe3tQ8(), true, i27, 1, immutableWrapper12.getValue(), function16, textStyleM13191copyp1EtxEg, composer4, 3120, 287152, 1024);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                        ComposerKt.traceEventEnd();
                                                        return;
                                                    }
                                                    return;
                                                }
                                                composer4.skipToGroupEnd();
                                            }
                                        }), composer3, 3072, 4);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                            return;
                                        }
                                        return;
                                    }
                                    composer3.skipToGroupEnd();
                                }
                            };
                            composer2 = composerStartRestartGroup;
                            CompositionLocalKt.CompositionLocalProvider(providedValueProvides, ComposableLambdaKt.composableLambda(composer2, 216946676, true, function2), composer2, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            immutableWrapper7 = immutableWrapper6;
                            j11 = j9;
                            j12 = j10;
                            j13 = j6;
                            alignment3 = alignment2;
                            j14 = j7;
                            fontStyle3 = fontStyle2;
                            fontWeight3 = fontWeight2;
                            fontFamily3 = fontFamily2;
                            j15 = j8;
                            textDecoration3 = textDecoration2;
                            f3 = f2;
                            i21 = i20;
                            immutableWrapper8 = immutableWrapper5;
                            function13 = function12;
                            textStyle3 = textStyle2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            immutableWrapper7 = immutableWrapper;
                            j11 = j;
                            j12 = j2;
                            j13 = j3;
                            alignment3 = alignment;
                            fontStyle3 = fontStyle;
                            fontWeight3 = fontWeight;
                            fontFamily3 = fontFamily;
                            j15 = j5;
                            textDecoration3 = textDecoration;
                            f3 = f;
                            i21 = i;
                            immutableWrapper8 = immutableWrapper2;
                            function13 = function1;
                            textStyle3 = textStyle;
                            composer2 = composerStartRestartGroup;
                            j14 = j4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier5 = modifier2;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt$AutoSizeText$5
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer3, int i26) {
                                    AutoSizeTextKt.m15111AutoSizeText0CVRy_0(text, modifier5, immutableWrapper7, j11, j12, j13, alignment3, j14, fontStyle3, fontWeight3, fontFamily3, j15, textDecoration3, f3, i21, immutableWrapper8, function13, textStyle3, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i23 |= 3072;
                    i18 = i4 & 16384;
                    if (i18 != 0) {
                    }
                    if ((i3 & 458752) == 0) {
                    }
                    i19 = i4 & 65536;
                    if (i19 != 0) {
                    }
                    if ((i3 & 29360128) == 0) {
                    }
                    if ((i5 & 1533916891) != 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i22 == 0) {
                            }
                            if ((i4 & 4) == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i11 == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i13 == 0) {
                            }
                            if (i15 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i17 == 0) {
                            }
                            if (i18 == 0) {
                            }
                            if ((i4 & 32768) == 0) {
                            }
                            if (i19 == 0) {
                            }
                            TextDecoration textDecoration52 = textDecoration4;
                            if ((i4 & 131072) == 0) {
                            }
                            fontStyle2 = fontStyle4;
                            fontWeight2 = fontWeight4;
                            f2 = f4;
                            fontFamily2 = fontFamily4;
                            i20 = i24;
                            immutableWrapper5 = immutableWrapper4;
                            function12 = function14;
                            immutableWrapper6 = immutableWrapper3;
                            j6 = jM13868getUnspecifiedXSAIIZE3;
                            alignment2 = topStart;
                            j7 = jM11376getUnspecified0d7_KjU;
                            j8 = jM13868getUnspecifiedXSAIIZE4;
                            modifier2 = modifier3;
                            j9 = jM13868getUnspecifiedXSAIIZE;
                            j10 = jM13868getUnspecifiedXSAIIZE2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            composerStartRestartGroup.startReplaceableGroup(-807271769);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            }
                            list = (List) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            if (list.contains(TextUnitType.m13882boximpl(TextUnit.m13856getTypeUIouoOA(j9)))) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i17 = i4 & 8192;
                if (i17 != 0) {
                }
                i18 = i4 & 16384;
                if (i18 != 0) {
                }
                if ((i3 & 458752) == 0) {
                }
                i19 = i4 & 65536;
                if (i19 != 0) {
                }
                if ((i3 & 29360128) == 0) {
                }
                if ((i5 & 1533916891) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            i12 = i4 & 512;
            if (i12 != 0) {
            }
            i13 = i4 & 1024;
            if (i13 != 0) {
            }
            i15 = i4 & 2048;
            if (i15 != 0) {
            }
            int i232 = i14;
            i16 = i4 & 4096;
            if (i16 != 0) {
            }
            i17 = i4 & 8192;
            if (i17 != 0) {
            }
            i18 = i4 & 16384;
            if (i18 != 0) {
            }
            if ((i3 & 458752) == 0) {
            }
            i19 = i4 & 65536;
            if (i19 != 0) {
            }
            if ((i3 & 29360128) == 0) {
            }
            if ((i5 & 1533916891) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 896) == 0) {
        }
        i6 = i4 & 8;
        if (i6 == 0) {
        }
        i7 = i4 & 16;
        if (i7 == 0) {
        }
        i8 = i4 & 32;
        if (i8 == 0) {
        }
        i9 = i4 & 64;
        if (i9 == 0) {
        }
        i10 = i4 & 128;
        if (i10 == 0) {
        }
        i11 = i4 & 256;
        if (i11 == 0) {
        }
        i12 = i4 & 512;
        if (i12 != 0) {
        }
        i13 = i4 & 1024;
        if (i13 != 0) {
        }
        i15 = i4 & 2048;
        if (i15 != 0) {
        }
        int i2322 = i14;
        i16 = i4 & 4096;
        if (i16 != 0) {
        }
        i17 = i4 & 8192;
        if (i17 != 0) {
        }
        i18 = i4 & 16384;
        if (i18 != 0) {
        }
        if ((i3 & 458752) == 0) {
        }
        i19 = i4 & 65536;
        if (i19 != 0) {
        }
        if ((i3 & 29360128) == 0) {
        }
        if ((i5 & 1533916891) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    public static final boolean shouldShrink(BoxWithConstraintsScope boxWithConstraintsScope, AnnotatedString annotatedString, TextStyle textStyle, int i, Composer composer, int i2) {
        composer.startReplaceableGroup(-1387309881);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1387309881, i2, -1, "com.blackhub.bronline.game.ui.widget.utils.shouldShrink (AutoSizeText.kt:263)");
        }
        boolean hasVisualOverflow = TextDelegate.m8458layoutNN6EwU$default(new TextDelegate(annotatedString, textStyle, i, 1, true, TextOverflow.INSTANCE.m13609getVisiblegIe3tQ8(), (Density) composer.consume(CompositionLocalsKt.getLocalDensity()), (FontFamily.Resolver) composer.consume(CompositionLocalsKt.getLocalFontFamilyResolver()), null, 256, null), boxWithConstraintsScope.mo8059getConstraintsmsEJaDk(), (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection()), null, 4, null).getHasVisualOverflow();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return hasVisualOverflow;
    }

    @NotNull
    public static final <T> ImmutableWrapper<T> toImmutableWrapper(T t) {
        return new ImmutableWrapper<>(t);
    }

    public static final <T> T getValue(@NotNull ImmutableWrapper<T> immutableWrapper, @Nullable Object obj, @NotNull KProperty<?> property) {
        Intrinsics.checkNotNullParameter(immutableWrapper, "<this>");
        Intrinsics.checkNotNullParameter(property, "property");
        return immutableWrapper.getValue();
    }

    /* renamed from: toTextUnit-D5KLDUw */
    public static final long m15113toTextUnitD5KLDUw(float f, @NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "density");
        return density.mo7876toSp0xMU5do(f);
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview.Container({@Preview(heightDp = 100, widthDp = 200), @Preview(heightDp = 30, widthDp = 200), @Preview(heightDp = 30, widthDp = 60)})
    @Composable
    public static final void PreviewAutoSizeText1(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(336617602);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(336617602, i, -1, "com.blackhub.bronline.game.ui.widget.utils.PreviewAutoSizeText1 (AutoSizeText.kt:301)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableSingletons$AutoSizeTextKt.INSTANCE.m15115getLambda2$app_siteRelease(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt.PreviewAutoSizeText1.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64931(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    AutoSizeTextKt.PreviewAutoSizeText1(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Preview.Container({@Preview(heightDp = 100, widthDp = 200), @Preview(heightDp = 30, widthDp = 200), @Preview(heightDp = 30, widthDp = 60)})
    @Composable
    public static final void PreviewAutoSizeText2(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1203669827);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1203669827, i, -1, "com.blackhub.bronline.game.ui.widget.utils.PreviewAutoSizeText2 (AutoSizeText.kt:317)");
            }
            MaterialThemeKt.MaterialTheme(null, null, null, ComposableSingletons$AutoSizeTextKt.INSTANCE.m15117getLambda4$app_siteRelease(), composerStartRestartGroup, 3072, 7);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.ui.widget.utils.AutoSizeTextKt.PreviewAutoSizeText2.1
                public final /* synthetic */ int $$changed;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C64941(int i2) {
                    super(2);
                    i = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i2) {
                    AutoSizeTextKt.PreviewAutoSizeText2(composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }
}

