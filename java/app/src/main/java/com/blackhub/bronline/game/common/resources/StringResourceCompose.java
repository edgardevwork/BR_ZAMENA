package com.blackhub.bronline.game.common.resources;

import android.content.Context;
import android.widget.TextView;
import androidx.annotation.StringRes;
import androidx.compose.foundation.text.InlineTextContentKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.res.ColorResources_androidKt;
import androidx.compose.p003ui.res.PrimitiveResources_androidKt;
import androidx.compose.p003ui.res.StringResources_androidKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontFamilyKt;
import androidx.compose.p003ui.text.font.FontKt;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.p003ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.text.HtmlCompat;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.OtherExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.task.CommonTaskState;
import com.blackhub.bronline.game.gui.UsefulKt;
import com.blackhub.bronline.game.gui.blackpass.enums.VIPStateEnum;
import com.blackhub.bronline.game.gui.calendar.model.CalendarScreenType;
import com.blackhub.bronline.game.gui.craft.enums.CraftElementStatusEnum;
import com.blackhub.bronline.game.gui.craft.enums.CraftScreenTypeEnum;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringResourceCompose.kt */
@StabilityInferred(parameters = 1)
@SourceDebugExtension({"SMAP\nStringResourceCompose.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResourceCompose.kt\ncom/blackhub/bronline/game/common/resources/StringResourceCompose\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n*L\n1#1,698:1\n1116#2,6:699\n1099#3:705\n928#3,6:706\n1099#3:712\n928#3,6:713\n928#3,6:719\n928#3,6:725\n928#3,6:731\n1099#3:737\n928#3,6:738\n928#3,6:744\n928#3,6:750\n1099#3:756\n928#3,6:757\n1099#3:763\n928#3,6:764\n928#3,6:770\n1099#3:776\n928#3,6:777\n1099#3:783\n928#3,6:784\n928#3,6:790\n928#3,6:796\n1099#3:802\n928#3,6:803\n1099#3:809\n928#3,6:810\n928#3,6:816\n928#3,6:822\n1099#3:828\n1099#3:829\n928#3,6:830\n1099#3:836\n928#3,6:837\n928#3,6:843\n928#3,6:849\n928#3,6:855\n928#3,6:861\n1099#3:867\n928#3,6:868\n1099#3:874\n928#3,6:875\n928#3,6:881\n1099#3:887\n928#3,6:888\n928#3,6:894\n1099#3:900\n928#3,6:901\n928#3,6:907\n1099#3:913\n928#3,6:914\n1099#3:920\n928#3,6:921\n1099#3:927\n1099#3:928\n1099#3:929\n1099#3:930\n1099#3:931\n1099#3:932\n1099#3:933\n1099#3:934\n928#3,6:935\n1099#3:941\n928#3,6:942\n1099#3:948\n928#3,6:949\n928#3,6:955\n1099#3:961\n928#3,6:962\n928#3,6:968\n1099#3:974\n928#3,6:975\n928#3,6:981\n1099#3:987\n928#3,6:988\n928#3,6:994\n928#3,6:1000\n*S KotlinDebug\n*F\n+ 1 StringResourceCompose.kt\ncom/blackhub/bronline/game/common/resources/StringResourceCompose\n*L\n62#1:699,6\n69#1:705\n72#1:706,6\n78#1:712\n79#1:713,6\n82#1:719,6\n86#1:725,6\n90#1:731,6\n96#1:737\n99#1:738,6\n105#1:744,6\n113#1:750,6\n127#1:756\n136#1:757,6\n142#1:763\n145#1:764,6\n151#1:770,6\n157#1:776\n160#1:777,6\n166#1:783\n169#1:784,6\n175#1:790,6\n181#1:796,6\n189#1:802\n192#1:803,6\n200#1:809\n201#1:810,6\n205#1:816,6\n209#1:822,6\n222#1:828\n227#1:829\n230#1:830,6\n236#1:836\n237#1:837,6\n247#1:843,6\n258#1:849,6\n268#1:855,6\n278#1:861,6\n290#1:867\n292#1:868,6\n304#1:874\n306#1:875,6\n315#1:881,6\n327#1:887\n328#1:888,6\n335#1:894,6\n347#1:900\n348#1:901,6\n354#1:907,6\n362#1:913\n363#1:914,6\n371#1:920\n374#1:921,6\n390#1:927\n399#1:928\n404#1:929\n413#1:930\n418#1:931\n435#1:932\n449#1:933\n541#1:934\n548#1:935,6\n564#1:941\n566#1:942,6\n603#1:948\n604#1:949,6\n608#1:955,6\n615#1:961\n618#1:962,6\n622#1:968,6\n629#1:974\n630#1:975,6\n634#1:981,6\n644#1:987\n647#1:988,6\n653#1:994,6\n660#1:1000,6\n*E\n"})
/* loaded from: classes.dex */
public final class StringResourceCompose {
    public static final int $stable = 0;

    @NotNull
    public static final String CATCH_STREAMER_TICKET_TAG = "catchStreamerTicketTag";

    @NotNull
    public static final StringResourceCompose INSTANCE = new StringResourceCompose();

    /* compiled from: StringResourceCompose.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.common.resources.StringResourceCompose$GetHtmlTextWithAndroidView$3 */
    /* loaded from: classes2.dex */
    public static final class C35073 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Modifier $modifier;
        public final /* synthetic */ String $textHtml;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35073(String str, Modifier modifier, int i, int i2) {
            super(2);
            str = str;
            modifier = modifier;
            i = i;
            i = i2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            StringResourceCompose.this.GetHtmlTextWithAndroidView(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
        }
    }

    /* compiled from: StringResourceCompose.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CraftElementStatusEnum.values().length];
            try {
                iArr[CraftElementStatusEnum.IN_THE_QUEUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CraftElementStatusEnum.IN_THE_PIPELINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CommonTaskState.values().length];
            try {
                iArr2[CommonTaskState.GET_STATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[CommonTaskState.UNAVAILABLE_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CommonTaskState.UNAVAILABLE_STATE_2.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CommonTaskState.COMPLETED_STATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CommonTaskState.STOP_STATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CommonTaskState.TRACK_STATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void GetHtmlTextWithAndroidView(@NotNull final String textHtml, @Nullable Modifier modifier, @Nullable Composer composer, int i, int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(textHtml, "textHtml");
        Composer composerStartRestartGroup = composer.startRestartGroup(-775364840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(textHtml) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-775364840, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.GetHtmlTextWithAndroidView (StringResourceCompose.kt:57)");
            }
            C35061 c35061 = C35061.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-529106407);
            boolean z = (i3 & 14) == 4;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<TextView, Unit>() { // from class: com.blackhub.bronline.game.common.resources.StringResourceCompose$GetHtmlTextWithAndroidView$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(TextView textView) {
                        invoke2(textView);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull TextView it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        it.setText(HtmlCompat.fromHtml(textHtml, 63));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            AndroidView_androidKt.AndroidView(c35061, modifier, (Function1) objRememberedValue, composerStartRestartGroup, (i3 & 112) | 6, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.common.resources.StringResourceCompose.GetHtmlTextWithAndroidView.3
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ int $$default;
                public final /* synthetic */ Modifier $modifier;
                public final /* synthetic */ String $textHtml;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C35073(final String textHtml2, Modifier modifier22, int i5, int i22) {
                    super(2);
                    str = textHtml2;
                    modifier = modifier22;
                    i = i5;
                    i = i22;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i5) {
                    StringResourceCompose.this.GetHtmlTextWithAndroidView(str, modifier, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i);
                }
            });
        }
    }

    /* compiled from: StringResourceCompose.kt */
    @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "Landroid/widget/TextView;", "context", "Landroid/content/Context;", "invoke"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.common.resources.StringResourceCompose$GetHtmlTextWithAndroidView$1 */
    /* loaded from: classes2.dex */
    public static final class C35061 extends Lambda implements Function1<Context, TextView> {
        public static final C35061 INSTANCE = ;

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final TextView invoke(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new TextView(context);
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerTitle(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1752294253);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1752294253, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerTitle (StringResourceCompose.kt:68)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.common_meet, composer, 6));
        builder.append(StringResources_androidKt.stringResource(R.string.common_dash, composer, 6));
        composer.startReplaceableGroup(880624640);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_black_russian, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerSubtitle(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-175037229);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-175037229, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerSubtitle (StringResourceCompose.kt:77)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(-682884448);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_morgenshtern, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(-682884282);
            Color.Companion companion = Color.INSTANCE;
            iPushStyle = builder.pushStyle(new SpanStyle(companion.m11377getWhite0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.common_snowflake, composer, 6));
                String upperCase = StringResources_androidKt.stringResource(R.string.common_x, composer, 6).toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                builder.append(upperCase);
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                composer.startReplaceableGroup(-682884084);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.common_black, composer, 6));
                    builder.pop(iPushStyle);
                    composer.endReplaceableGroup();
                    OtherExtensionKt.appendSpace(builder);
                    composer.startReplaceableGroup(-682883914);
                    iPushStyle = builder.pushStyle(new SpanStyle(companion.m11377getWhite0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R.string.common_russia, composer, 6));
                        builder.pop(iPushStyle);
                        composer.endReplaceableGroup();
                        AnnotatedString annotatedString = builder.toAnnotatedString();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        composer.endReplaceableGroup();
                        return annotatedString;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerBlockLeftText(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-941822006);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941822006, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerBlockLeftText (StringResourceCompose.kt:95)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_participate_in, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(1974663485);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_competition, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_prizes_from_black_russia_and, composer, 6));
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(1974663779);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_alishera, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                builder.append(StringResources_androidKt.stringResource(R.string.common_snowflake, composer, 6));
                Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_you_can_get, composer, 6));
                OtherExtensionKt.appendSpace(builder);
                composer.startReplaceableGroup(1974664131);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_you_can_get_yellow, composer, 6));
                    builder.pop(iPushStyle);
                    composer.endReplaceableGroup();
                    Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                    Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                    builder.append(StringResources_androidKt.stringResource(R.string.common_you_buy, composer, 6));
                    OtherExtensionKt.appendSpace(builder);
                    InlineTextContentKt.appendInlineContent$default(builder, CATCH_STREAMER_TICKET_TAG, null, 2, null);
                    OtherExtensionKt.appendSpace(builder);
                    builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_that_will_determine_your_chances, composer, 6));
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return annotatedString;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getBlockCostTicketBC(int i, int i2, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(111355660);
        int i5 = (i4 & 1) != 0 ? 1 : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(111355660, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getBlockCostTicketBC (StringResourceCompose.kt:126)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int i6 = i2 * i5;
        builder.append(String.valueOf(i5));
        OtherExtensionKt.appendSpace(builder);
        OtherExtensionKt.appendSpace(builder);
        InlineTextContentKt.appendInlineContent$default(builder, CATCH_STREAMER_TICKET_TAG, null, 2, null);
        OtherExtensionKt.appendSpace(builder);
        builder.append(StringResources_androidKt.stringResource(R.string.common_equals, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(1723561532);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_ticket_price, new Object[]{Integer.valueOf(i6)}, composer, 70));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerBlockRightText(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1522221297);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1522221297, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerBlockRightText (StringResourceCompose.kt:141)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_play_with_alisher, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(1848501363);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.common_black_russia, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_and_get_a_prize, composer, 6));
            builder.append(StringResources_androidKt.stringResource(R.string.common_dash, composer, 6));
            composer.startReplaceableGroup(1848501668);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_up_to_game_rubles, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerCurrentBuyTickets(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1388659708);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388659708, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerCurrentBuyTickets (StringResourceCompose.kt:156)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_your_purchased, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(-1118548555);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_x_count, new Object[]{Integer.valueOf(i)}, composer, 70));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getRegistrationInCompetitionBlockSubtitle(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-917056225);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-917056225, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getRegistrationInCompetitionBlockSubtitle (StringResourceCompose.kt:165)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_take_part, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(-2140048658);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.common_black_russia, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_russia_in_real_life, composer, 6));
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(-2140048383);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_alishera_and_dani, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                OtherExtensionKt.appendSpace(builder);
                builder.append(StringResources_androidKt.stringResource(R.string.common_and, composer, 6));
                OtherExtensionKt.appendSpace(builder);
                composer.startReplaceableGroup(-2140048116);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_vip_platinum, composer, 6));
                    builder.pop(iPushStyle);
                    composer.endReplaceableGroup();
                    OtherExtensionKt.appendSpace(builder);
                    builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_on_thirty_days, composer, 6));
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return annotatedString;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getCatchStreamerPromptTitle(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1180662295);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1180662295, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getCatchStreamerPromptTitle (StringResourceCompose.kt:188)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_play_with, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(-2105540494);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.catch_streamer_alisherom, composer, 6));
            builder.append(StringResources_androidKt.stringResource(R.string.common_snowflake, composer, 6));
            builder.append(StringResources_androidKt.stringResource(R.string.common_exclamation_point, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getPurchaseOfferRewardWithBPLuck(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1716037180);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1716037180, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getPurchaseOfferRewardWithBPLuck (StringResourceCompose.kt:199)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(1895845895);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.purchase_offer_reward_double, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(1895846081);
            iPushStyle = builder.pushStyle(new SpanStyle(Color.INSTANCE.m11377getWhite0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.purchase_offer_reward_your_reward, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                OtherExtensionKt.appendSpace(builder);
                composer.startReplaceableGroup(1895846252);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.purchase_offer_reward_x2, composer, 6));
                    builder.pop(iPushStyle);
                    composer.endReplaceableGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer.endReplaceableGroup();
                    return annotatedString;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final String getBPPrizeDialogButtonText(boolean z, @Nullable Composer composer, int i) {
        String strStringResource;
        composer.startReplaceableGroup(-334340966);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-334340966, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getBPPrizeDialogButtonText (StringResourceCompose.kt:214)");
        }
        if (z) {
            composer.startReplaceableGroup(-1294143338);
            strStringResource = StringResources_androidKt.stringResource(R.string.common_take, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1294143275);
            strStringResource = StringResources_androidKt.stringResource(R.string.common_close, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final AnnotatedString getBPPrizeLevel(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(1561465394);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561465394, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getBPPrizeLevel (StringResourceCompose.kt:221)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String upperCase = StringResources_androidKt.stringResource(R.string.common_value_with_level, new Object[]{Integer.valueOf(i)}, composer, 70).toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        builder.append(upperCase);
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString bpBoostHintTitle(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-1124570796);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1124570796, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBoostHintTitle (StringResourceCompose.kt:226)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_title, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(1968231760);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_title_days, new Object[]{Integer.valueOf(i)}, composer, 70));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString bpBoostHintText(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(472474352);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(472474352, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBoostHintText (StringResourceCompose.kt:235)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(-1322087206);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_text1, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(-1322086812);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.muller_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_text2, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
                composer.startReplaceableGroup(-1322086404);
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_text3, composer, 6));
                    builder.pop(iPushStyle);
                    composer.endReplaceableGroup();
                    OtherExtensionKt.appendSpace(builder);
                    composer.startReplaceableGroup(-1322086010);
                    iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.red, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_semi_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
                    try {
                        builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_text4, composer, 6));
                        OtherExtensionKt.appendSpace(builder);
                        builder.pop(iPushStyle);
                        composer.endReplaceableGroup();
                        composer.startReplaceableGroup(-1322085612);
                        iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._10ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_regular, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources_androidKt.stringResource(R.string.black_pass_boost_hint_text5, composer, 6));
                            builder.pop(iPushStyle);
                            composer.endReplaceableGroup();
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            composer.endReplaceableGroup();
                            return annotatedString;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    /* renamed from: bpBannerSubTitle-ek8zF_U */
    public final AnnotatedString m14395bpBannerSubTitleek8zF_U(long j, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-184363298);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-184363298, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBannerSubTitle (StringResourceCompose.kt:289)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.banner_body_text_1_1, composer, 6));
        composer.startReplaceableGroup(-1041157687);
        int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65502, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.banner_body_text_1_2, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            builder.append(StringResources_androidKt.stringResource(R.string.banner_body_text_1_3, composer, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString bpBannerBuyBlackPassPremium(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2094273434);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2094273434, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBannerBuyBlackPassPremium (StringResourceCompose.kt:303)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        String strStringResource = StringResources_androidKt.stringResource(R.string.banner_body_text_2_1, composer, 6);
        Locale locale = Locale.ROOT;
        String upperCase = strStringResource.toUpperCase(locale);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        builder.append(upperCase);
        composer.startReplaceableGroup(356203668);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65502, (DefaultConstructorMarker) null));
        try {
            String upperCase2 = StringResources_androidKt.stringResource(R.string.banner_body_text_2_2, composer, 6).toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            builder.append(upperCase2);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            String upperCase3 = StringResources_androidKt.stringResource(R.string.banner_body_text_2_3, composer, 6).toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            builder.append(upperCase3);
            composer.startReplaceableGroup(356204051);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65502, (DefaultConstructorMarker) null));
            try {
                String upperCase4 = StringResources_androidKt.stringResource(R.string.banner_body_text_2_4, composer, 6).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                builder.append(upperCase4);
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                String upperCase5 = StringResources_androidKt.stringResource(R.string.banner_body_text_2_5, composer, 6).toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
                builder.append(upperCase5);
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString bpBannerMoreRewardInPremiumDeluxe(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-634149170);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-634149170, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBannerMoreRewardInPremiumDeluxe (StringResourceCompose.kt:326)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(1815517846);
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_semibold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.banner_body_text_3_1, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            composer.startReplaceableGroup(1815518082);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.artegra_sans_ex_black, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65502, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.banner_body_text_3_2, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString bpBannerTitlePrize1(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-69911172);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-69911172, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.bpBannerTitlePrize1 (StringResourceCompose.kt:346)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(1214748667);
        int iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.banner_title_prize_1_1, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
            composer.startReplaceableGroup(1214748887);
            iPushStyle = builder.pushStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_medium, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65503, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.banner_title_prize_1_2, composer, 6));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString getFishingResultSubtitle(@NotNull String firstPhrase, @NotNull String secondPhrase, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(firstPhrase, "firstPhrase");
        Intrinsics.checkNotNullParameter(secondPhrase, "secondPhrase");
        composer.startReplaceableGroup(-1609063682);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1609063682, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getFishingResultSubtitle (StringResourceCompose.kt:361)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.orange, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(firstPhrase);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            OtherExtensionKt.appendSpace(builder);
            builder.append(secondPhrase);
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString purchaseSimCards(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(733631120);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(733631120, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.purchaseSimCards (StringResourceCompose.kt:370)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.br_sim_banner_purchase_br_sim_card1, composer, 6));
        OtherExtensionKt.appendSpace(builder);
        composer.startReplaceableGroup(998637241);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.yellow, composer, 6), TextUnitKt.getSp(PrimitiveResources_androidKt.dimensionResource(R.dimen._8ssp, composer, 6)), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, FontFamilyKt.FontFamily(FontKt.m13257FontYpTlLL0$default(R.font.montserrat_bold, null, 0, 0, 14, null)), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65500, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.br_sim_banner_purchase_br_sim_card2, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            builder.append(StringResources_androidKt.stringResource(R.string.br_sim_banner_purchase_br_sim_card3, composer, 6));
            Intrinsics.checkNotNullExpressionValue(builder.append('\n'), "append(...)");
            builder.append(StringResources_androidKt.stringResource(R.string.br_sim_banner_purchase_br_sim_card4, composer, 6));
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString chTreeTitleIfDone(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1089233513);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1089233513, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.chTreeTitleIfDone (StringResourceCompose.kt:389)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (z) {
            composer.startReplaceableGroup(1158993863);
            builder.append(StringResources_androidKt.stringResource(R.string.christmas_tree_prize_done, composer, 6));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1158993956);
            builder.append(StringResources_androidKt.stringResource(R.string.christmas_tree_prize_not_done, composer, 6));
            composer.endReplaceableGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString chTreeValueOfEnergy(@StringRes int i, int i2, @Nullable Composer composer, int i3) {
        composer.startReplaceableGroup(-1897835156);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1897835156, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.chTreeValueOfEnergy (StringResourceCompose.kt:398)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(i, new Object[]{Integer.valueOf(i2)}, composer, (i3 & 14) | 64));
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString giftsTitleIfStandard(boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(344031136);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(344031136, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.giftsTitleIfStandard (StringResourceCompose.kt:403)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (z) {
            composer.startReplaceableGroup(-435956880);
            String upperCase = StringResources_androidKt.stringResource(R.string.gift_purchase_title_standard, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            builder.append(upperCase);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-435956772);
            String upperCase2 = StringResources_androidKt.stringResource(R.string.gift_purchase_title_legendary, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            builder.append(upperCase2);
            composer.endReplaceableGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString giftsValueOfPurchaseGift(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-994586354);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-994586354, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.giftsValueOfPurchaseGift (StringResourceCompose.kt:412)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(StringResources_androidKt.stringResource(R.string.common_number_things, new Object[]{Integer.valueOf(i)}, composer, 70));
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString giftsButtonText(int i, int i2, @Nullable Composer composer, int i3, int i4) {
        composer.startReplaceableGroup(1122251617);
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1122251617, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.giftsButtonText (StringResourceCompose.kt:417)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (i == 0) {
            composer.startReplaceableGroup(-1427598029);
            String upperCase = StringResources_androidKt.stringResource(R.string.common_open, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            builder.append(upperCase);
            composer.endReplaceableGroup();
        } else if (i == 1) {
            composer.startReplaceableGroup(-1427597931);
            String upperCase2 = StringResources_androidKt.stringResource(R.string.gift_purchase_button_watch, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            builder.append(upperCase2);
            composer.endReplaceableGroup();
        } else if (i == 2) {
            composer.startReplaceableGroup(-1427597815);
            String upperCase3 = StringResources_androidKt.stringResource(R.string.gift_purchase_button_purchase, new Object[]{Integer.valueOf(i2)}, composer, 70).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
            builder.append(upperCase3);
            composer.endReplaceableGroup();
        } else if (i == 3) {
            composer.startReplaceableGroup(-1427597599);
            String upperCase4 = StringResources_androidKt.stringResource(R.string.gift_purchase_button_open_free, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
            builder.append(upperCase4);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-1427597498);
            String upperCase5 = StringResources_androidKt.stringResource(R.string.common_open, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase5, "toUpperCase(...)");
            builder.append(upperCase5);
            composer.endReplaceableGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString giftsTitlePurchase(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(2009901998);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2009901998, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.giftsTitlePurchase (StringResourceCompose.kt:434)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (i == 1) {
            composer.startReplaceableGroup(340666884);
            String upperCase = StringResources_androidKt.stringResource(R.string.gift_purchase_all_gifts, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            builder.append(upperCase);
            composer.endReplaceableGroup();
        } else if (i == 2 || i == 3) {
            composer.startReplaceableGroup(340667074);
            String upperCase2 = StringResources_androidKt.stringResource(R.string.gift_purchase_open_gift, composer, 6).toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            builder.append(upperCase2);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(340667169);
            composer.endReplaceableGroup();
            builder.append(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString giftsValueOfBC(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-917179618);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-917179618, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.giftsValueOfBC (StringResourceCompose.kt:448)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(UsefulKt.getPriceWithSpaces(Integer.valueOf(i)));
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString getUpgradeObjectName(boolean z, @Nullable String str, @Nullable Composer composer, int i, int i2) {
        AnnotatedString annotatedStringHtmlTextToAnnotatedString;
        composer.startReplaceableGroup(327028802);
        if ((i2 & 2) != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(327028802, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getUpgradeObjectName (StringResourceCompose.kt:456)");
        }
        if (z) {
            composer.startReplaceableGroup(635827516);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.upgrade_object_event_name_for_player, composer, 6));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(635827703);
            if (str == null) {
                str = "";
            }
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.upgrade_object_event_name_for_server, new Object[]{str}, composer, 70));
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedStringHtmlTextToAnnotatedString;
    }

    @Composable
    @NotNull
    public final String getOptionThousand(int i, boolean z, @Nullable Composer composer, int i2) {
        String strValueOf;
        composer.startReplaceableGroup(1030487583);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1030487583, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.getOptionThousand (StringResourceCompose.kt:468)");
        }
        if (z && i != 0) {
            strValueOf = StringResources_androidKt.stringResource(R.string.common_thousand, new Object[]{Integer.valueOf(i)}, composer, 70);
        } else {
            strValueOf = String.valueOf(i);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strValueOf;
    }

    @Composable
    @NotNull
    public final String platesPriceOfPurchase(int i, int i2, @Nullable Composer composer, int i3) {
        String strStringResource;
        composer.startReplaceableGroup(-1003361603);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1003361603, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.platesPriceOfPurchase (StringResourceCompose.kt:476)");
        }
        if (i == 1) {
            composer.startReplaceableGroup(-297233936);
            strStringResource = StringResources_androidKt.stringResource(R.string.plates_price_bc, new Object[]{Integer.valueOf(i2)}, composer, 70);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-297233854);
            strStringResource = StringResources_androidKt.stringResource(R.string.plates_price_rub, new Object[]{Integer.valueOf(i2)}, composer, 70);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final String platesPriceOfRefresh(int i, int i2, @Nullable Composer composer, int i3) {
        String strStringResource;
        composer.startReplaceableGroup(-998579091);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-998579091, i3, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.platesPriceOfRefresh (StringResourceCompose.kt:485)");
        }
        if (i == 1) {
            composer.startReplaceableGroup(861293487);
            strStringResource = StringResources_androidKt.stringResource(R.string.plates_change_plate_price_bc, new Object[]{Integer.valueOf(i2)}, composer, 70);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(861293582);
            strStringResource = StringResources_androidKt.stringResource(R.string.plates_change_plate_price_rub, new Object[]{Integer.valueOf(i2)}, composer, 70);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final AnnotatedString platesGetCurrentFormat(int i, @Nullable Composer composer, int i2) {
        AnnotatedString annotatedStringHtmlTextToAnnotatedString;
        composer.startReplaceableGroup(989613903);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(989613903, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.platesGetCurrentFormat (StringResourceCompose.kt:494)");
        }
        if (i == 0) {
            composer.startReplaceableGroup(-67487306);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_rus_number_format, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 1) {
            composer.startReplaceableGroup(-67487183);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_ua_number_format, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 2) {
            composer.startReplaceableGroup(-67487060);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_by_number_format, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 3) {
            composer.startReplaceableGroup(-67486937);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_kz_number_format, composer, 6));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-67486857);
            composer.endReplaceableGroup();
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedStringHtmlTextToAnnotatedString;
    }

    @Composable
    @NotNull
    public final AnnotatedString platesGetActualSymbols(int i, @Nullable Composer composer, int i2) {
        AnnotatedString annotatedStringHtmlTextToAnnotatedString;
        composer.startReplaceableGroup(1195790380);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1195790380, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.platesGetActualSymbols (StringResourceCompose.kt:514)");
        }
        if (i == 0) {
            composer.startReplaceableGroup(1761075836);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_rus_allowed_symbols, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 1) {
            composer.startReplaceableGroup(1761075961);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_ua_allowed_symbols, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 2) {
            composer.startReplaceableGroup(1761076086);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_by_allowed_symbols, composer, 6));
            composer.endReplaceableGroup();
        } else if (i == 3) {
            composer.startReplaceableGroup(1761076211);
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(StringResources_androidKt.stringResource(R.string.plates_kz_allowed_symbols, composer, 6));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1761076291);
            composer.endReplaceableGroup();
            annotatedStringHtmlTextToAnnotatedString = StringExtensionKt.htmlTextToAnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedStringHtmlTextToAnnotatedString;
    }

    @Composable
    @NotNull
    /* renamed from: calendarGetSeasonTitle-sW7UJKQ */
    public final AnnotatedString m14396calendarGetSeasonTitlesW7UJKQ(@Nullable CalendarScreenType calendarScreenType, long j, @NotNull String seasonName, boolean z, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(seasonName, "seasonName");
        composer.startReplaceableGroup(1062603844);
        CalendarScreenType calendarScreenType2 = (i2 & 1) != 0 ? CalendarScreenType.MAIN : calendarScreenType;
        boolean z2 = (i2 & 8) != 0 ? false : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1062603844, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.calendarGetSeasonTitle (StringResourceCompose.kt:540)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (calendarScreenType2 == CalendarScreenType.MAIN) {
            composer.startReplaceableGroup(1372297478);
            builder.append(StringResources_androidKt.stringResource(R.string.calendar_action_title, composer, 6));
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1372297570);
            builder.append(StringResources_androidKt.stringResource(R.string.calendar_action_comeback_title, composer, 6));
            composer.endReplaceableGroup();
        }
        OtherExtensionKt.appendSpace(builder);
        int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(seasonName);
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.startReplaceableGroup(-1386423264);
            if (z2) {
                OtherExtensionKt.appendSpace(builder);
                builder.append(StringResources_androidKt.stringResource(R.string.calendar_event_title_all_rewards, composer, 6));
            }
            composer.endReplaceableGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return annotatedString;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }

    @Composable
    @NotNull
    /* renamed from: calendarSeasonDays-Bx497Mc */
    public final AnnotatedString m14397calendarSeasonDaysBx497Mc(int i, int i2, int i3, long j, @Nullable Composer composer, int i4) {
        composer.startReplaceableGroup(793713869);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(793713869, i4, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.calendarSeasonDays (StringResourceCompose.kt:563)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        if (i <= i3) {
            composer.startReplaceableGroup(1796508004);
            composer.startReplaceableGroup(1796508004);
            int iPushStyle = builder.pushStyle(new SpanStyle(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.common_number_value, new Object[]{Integer.valueOf(i)}, composer, 70));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                builder.append(StringResources_androidKt.stringResource(R.string.common_slash, composer, 6));
                builder.append(StringResources_androidKt.stringResource(R.string.common_number_value, new Object[]{Integer.valueOf(i2)}, composer, 70));
                composer.endReplaceableGroup();
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        } else {
            composer.startReplaceableGroup(1796508358);
            builder.append(StringResources_androidKt.stringResource(R.string.common_current_and_max_values, new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, composer, 70));
            composer.endReplaceableGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final String casesDialogPreviewBonusReward(int i, @Nullable Composer composer, int i2) {
        String strStringResource;
        composer.startReplaceableGroup(744919379);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(744919379, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.casesDialogPreviewBonusReward (StringResourceCompose.kt:583)");
        }
        if (i == 2) {
            composer.startReplaceableGroup(-268125656);
            strStringResource = StringResources_androidKt.stringResource(R.string.cases_press_for_get, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-268125577);
            strStringResource = StringResources_androidKt.stringResource(R.string.cases_press_for_close, composer, 6);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final String craftElementDescriptionIsNeedVIPPlatinum(boolean z, int i, @Nullable Composer composer, int i2) {
        String strStringResource;
        composer.startReplaceableGroup(1425234435);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1425234435, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.craftElementDescriptionIsNeedVIPPlatinum (StringResourceCompose.kt:594)");
        }
        if (z) {
            composer.startReplaceableGroup(541928551);
            strStringResource = StringResources_androidKt.stringResource(R.string.craft_is_with_vip_platinum, composer, 6);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(541928637);
            strStringResource = StringResources_androidKt.stringResource(R.string.craft_bonus_with_vip_platinum, new Object[]{Integer.valueOf(i)}, composer, 70);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final AnnotatedString craftTimerForCrafting(@NotNull String timer, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(timer, "timer");
        composer.startReplaceableGroup(1194745668);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1194745668, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.craftTimerForCrafting (StringResourceCompose.kt:602)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(-2100200489);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white_40, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.craft_timer_for_crafting, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(-2100200281);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.common_single_string_value, new Object[]{timer}, composer, 70));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString craftChanceIsWithVIPPlatinum(boolean z, int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(87682169);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(87682169, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.craftChanceIsWithVIPPlatinum (StringResourceCompose.kt:614)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int i3 = z ? R.color.dark_medium_green : R.color.white;
        composer.startReplaceableGroup(-379996521);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white_40, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.craft_chance_of_crafting, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(-379996313);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(i3, composer, 0), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.common_value_and_percent, new Object[]{Integer.valueOf(i)}, composer, 70));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString craftElementWeight(@NotNull String weight, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(weight, "weight");
        composer.startReplaceableGroup(-571526982);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-571526982, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.craftElementWeight (StringResourceCompose.kt:628)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceableGroup(-1792266875);
        int iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white_40, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(R.string.craft_element_weight_title, composer, 6));
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceableGroup();
            OtherExtensionKt.appendSpace(builder);
            composer.startReplaceableGroup(-1792266665);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.craft_element_weight_value, new Object[]{weight}, composer, 70));
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
                AnnotatedString annotatedString = builder.toAnnotatedString();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return annotatedString;
            } finally {
            }
        } finally {
        }
    }

    @Composable
    @NotNull
    public final AnnotatedString craftElementStatus(@NotNull CraftElementStatusEnum elementState, @NotNull CraftScreenTypeEnum currentScreen, @Nullable Composer composer, int i) {
        int iPushStyle;
        Intrinsics.checkNotNullParameter(elementState, "elementState");
        Intrinsics.checkNotNullParameter(currentScreen, "currentScreen");
        composer.startReplaceableGroup(1726401017);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1726401017, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.craftElementStatus (StringResourceCompose.kt:643)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        int i2 = WhenMappings.$EnumSwitchMapping$0[elementState.ordinal()];
        if (i2 == 1) {
            composer.startReplaceableGroup(1281294741);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.craft_in_the_queue, composer, 6));
                Unit unit = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
            } finally {
            }
        } else if (i2 == 2) {
            composer.startReplaceableGroup(1281295017);
            iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.white, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
            try {
                builder.append(StringResources_androidKt.stringResource(R.string.craft_in_the_pipeline, composer, 6));
                Unit unit2 = Unit.INSTANCE;
                builder.pop(iPushStyle);
                composer.endReplaceableGroup();
            } finally {
            }
        } else {
            composer.startReplaceableGroup(1281295262);
            if (currentScreen != CraftScreenTypeEnum.STASH) {
                builder.append(AnyExtensionKt.empty(StringCompanionObject.INSTANCE));
            } else {
                iPushStyle = builder.pushStyle(new SpanStyle(ColorResources_androidKt.colorResource(R.color.dark_medium_green, composer, 6), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null));
                try {
                    builder.append(StringResources_androidKt.stringResource(R.string.common_ready, composer, 6));
                    Unit unit3 = Unit.INSTANCE;
                } finally {
                }
            }
            composer.endReplaceableGroup();
        }
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return annotatedString;
    }

    @Composable
    @NotNull
    public final String holidayEventsTaskButton(@NotNull CommonTaskState stateOfTask, int i, @Nullable Composer composer, int i2) {
        String strStringResource;
        Intrinsics.checkNotNullParameter(stateOfTask, "stateOfTask");
        composer.startReplaceableGroup(-698918329);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-698918329, i2, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.holidayEventsTaskButton (StringResourceCompose.kt:670)");
        }
        switch (WhenMappings.$EnumSwitchMapping$1[stateOfTask.ordinal()]) {
            case 1:
                composer.startReplaceableGroup(-134522683);
                strStringResource = StringResources_androidKt.stringResource(R.string.common_get, composer, 6);
                composer.endReplaceableGroup();
                break;
            case 2:
                composer.startReplaceableGroup(-134522593);
                strStringResource = StringResources_androidKt.stringResource(R.string.common_unavailable, composer, 6);
                composer.endReplaceableGroup();
                break;
            case 3:
                composer.startReplaceableGroup(-134522493);
                strStringResource = StringResources_androidKt.stringResource(R.string.common_unavailable, composer, 6);
                composer.endReplaceableGroup();
                break;
            case 4:
                composer.startReplaceableGroup(-134522390);
                composer.endReplaceableGroup();
                strStringResource = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
                break;
            case 5:
                composer.startReplaceableGroup(-134522340);
                strStringResource = StringResources_androidKt.stringResource(R.string.holiday_events_stop_button, composer, 6);
                composer.endReplaceableGroup();
                break;
            case 6:
                composer.startReplaceableGroup(-134522222);
                if (i == 0) {
                    composer.startReplaceableGroup(-134522170);
                    strStringResource = StringResources_androidKt.stringResource(R.string.common_unavailable, composer, 6);
                    composer.endReplaceableGroup();
                } else if (i == 1 || i == 6) {
                    composer.startReplaceableGroup(-134522061);
                    strStringResource = StringResources_androidKt.stringResource(R.string.common_track, composer, 6);
                    composer.endReplaceableGroup();
                } else {
                    composer.startReplaceableGroup(-134521990);
                    strStringResource = StringResources_androidKt.stringResource(R.string.common_go_to, composer, 6);
                    composer.endReplaceableGroup();
                }
                composer.endReplaceableGroup();
                break;
            default:
                composer.startReplaceableGroup(-134549118);
                composer.endReplaceableGroup();
                throw new NoWhenBranchMatchedException();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return strStringResource;
    }

    @Composable
    @NotNull
    public final String blackPassCategoryButtonText(@NotNull VIPStateEnum vipState, @Nullable Composer composer, int i) {
        String vipName;
        Intrinsics.checkNotNullParameter(vipState, "vipState");
        composer.startReplaceableGroup(-447895905);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-447895905, i, -1, "com.blackhub.bronline.game.common.resources.StringResourceCompose.blackPassCategoryButtonText (StringResourceCompose.kt:688)");
        }
        if (vipState == VIPStateEnum.STANDARD) {
            vipName = StringResources_androidKt.stringResource(R.string.common_get, composer, 6);
        } else {
            vipName = vipState == VIPStateEnum.PREMIUM ? VIPStateEnum.PREMIUM_DELUXE.getVipName() : AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return vipName;
    }
}

