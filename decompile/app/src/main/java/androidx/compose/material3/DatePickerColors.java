package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DatePicker.kt */
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BÍ\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u001c¢\u0006\u0002\u0010\u001dJ\u008c\u0002\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001cø\u0001\u0000¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020@H\u0001¢\u0006\u0004\bC\u0010DJ5\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010E\u001a\u00020@2\u0006\u0010?\u001a\u00020@2\u0006\u0010F\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bG\u0010HJ\u0013\u0010I\u001a\u00020@2\b\u0010J\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010K\u001a\u00020LH\u0016J%\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bN\u0010OJ-\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030>2\u0006\u0010P\u001a\u00020@2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020@H\u0001¢\u0006\u0004\bQ\u0010DJ!\u0010R\u001a\u00020\u001c*\u0004\u0018\u00010\u001c2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001c0TH\u0000¢\u0006\u0002\bUR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001fR\u0011\u0010\u001b\u001a\u00020\u001c¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0019\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b$\u0010\u001fR\u0019\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b%\u0010\u001fR\u0019\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b&\u0010\u001fR\u0019\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b'\u0010\u001fR\u0019\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b(\u0010\u001fR\u0019\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0019\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b*\u0010\u001fR\u0019\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b+\u0010\u001fR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b,\u0010\u001fR\u0019\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b-\u0010\u001fR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b.\u0010\u001fR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b/\u0010\u001fR\u0019\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b0\u0010\u001fR\u0019\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b1\u0010\u001fR\u0019\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b2\u0010\u001fR\u0019\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b3\u0010\u001fR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b4\u0010\u001fR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b5\u0010\u001fR\u0019\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b6\u0010\u001fR\u0019\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b7\u0010\u001fR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b8\u0010\u001fR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010 \u001a\u0004\b9\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, m7105d2 = {"Landroidx/compose/material3/DatePickerColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "navigationContentColor", "yearContentColor", "disabledYearContentColor", "currentYearContentColor", "selectedYearContentColor", "disabledSelectedYearContentColor", "selectedYearContainerColor", "disabledSelectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContainerColor", "dayInSelectionRangeContentColor", "dividerColor", "dateTextFieldColors", "Landroidx/compose/material3/TextFieldColors;", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getCurrentYearContentColor-0d7_KjU", "getDateTextFieldColors", "()Landroidx/compose/material3/TextFieldColors;", "getDayContentColor-0d7_KjU", "getDayInSelectionRangeContainerColor-0d7_KjU", "getDayInSelectionRangeContentColor-0d7_KjU", "getDisabledDayContentColor-0d7_KjU", "getDisabledSelectedDayContainerColor-0d7_KjU", "getDisabledSelectedDayContentColor-0d7_KjU", "getDisabledSelectedYearContainerColor-0d7_KjU", "getDisabledSelectedYearContentColor-0d7_KjU", "getDisabledYearContentColor-0d7_KjU", "getDividerColor-0d7_KjU", "getHeadlineContentColor-0d7_KjU", "getNavigationContentColor-0d7_KjU", "getSelectedDayContainerColor-0d7_KjU", "getSelectedDayContentColor-0d7_KjU", "getSelectedYearContainerColor-0d7_KjU", "getSelectedYearContentColor-0d7_KjU", "getSubheadContentColor-0d7_KjU", "getTitleContentColor-0d7_KjU", "getTodayContentColor-0d7_KjU", "getTodayDateBorderColor-0d7_KjU", "getWeekdayContentColor-0d7_KjU", "getYearContentColor-0d7_KjU", "copy", "copy-tNwlRmA", "(JJJJJJJJJJJJJJJJJJJJJJJJLandroidx/compose/material3/TextFieldColors;)Landroidx/compose/material3/DatePickerColors;", "dayContainerColor", "Landroidx/compose/runtime/State;", "selected", "", "enabled", "animate", "dayContainerColor$material3_release", "(ZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "isToday", "inRange", "dayContentColor$material3_release", "(ZZZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "equals", "other", "hashCode", "", "yearContainerColor", "yearContainerColor$material3_release", "(ZZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "currentYear", "yearContentColor$material3_release", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@Immutable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,2268:1\n658#2:2269\n646#2:2270\n658#2:2271\n646#2:2272\n658#2:2273\n646#2:2274\n658#2:2275\n646#2:2276\n658#2:2277\n646#2:2278\n658#2:2279\n646#2:2280\n658#2:2281\n646#2:2282\n658#2:2283\n646#2:2284\n658#2:2285\n646#2:2286\n658#2:2287\n646#2:2288\n658#2:2289\n646#2:2290\n658#2:2291\n646#2:2292\n658#2:2293\n646#2:2294\n658#2:2295\n646#2:2296\n658#2:2297\n646#2:2298\n658#2:2299\n646#2:2300\n658#2:2301\n646#2:2302\n658#2:2303\n646#2:2304\n658#2:2305\n646#2:2306\n658#2:2307\n646#2:2308\n658#2:2309\n646#2:2310\n658#2:2311\n646#2:2312\n658#2:2313\n646#2:2314\n658#2:2315\n646#2:2316\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerColors\n*L\n847#1:2269\n847#1:2270\n848#1:2271\n848#1:2272\n849#1:2273\n849#1:2274\n850#1:2275\n850#1:2276\n851#1:2277\n851#1:2278\n852#1:2279\n852#1:2280\n853#1:2281\n853#1:2282\n854#1:2283\n854#1:2284\n855#1:2285\n855#1:2286\n856#1:2287\n856#1:2288\n857#1:2289\n857#1:2290\n858#1:2291\n858#1:2292\n859#1:2293\n859#1:2294\n860#1:2295\n860#1:2296\n861#1:2297\n861#1:2298\n862#1:2299\n862#1:2300\n863#1:2301\n863#1:2302\n864#1:2303\n864#1:2304\n865#1:2305\n865#1:2306\n866#1:2307\n866#1:2308\n867#1:2309\n867#1:2310\n868#1:2311\n868#1:2312\n869#1:2313\n869#1:2314\n870#1:2315\n870#1:2316\n*E\n"})
/* loaded from: classes4.dex */
public final class DatePickerColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long currentYearContentColor;

    @NotNull
    private final TextFieldColors dateTextFieldColors;
    private final long dayContentColor;
    private final long dayInSelectionRangeContainerColor;
    private final long dayInSelectionRangeContentColor;
    private final long disabledDayContentColor;
    private final long disabledSelectedDayContainerColor;
    private final long disabledSelectedDayContentColor;
    private final long disabledSelectedYearContainerColor;
    private final long disabledSelectedYearContentColor;
    private final long disabledYearContentColor;
    private final long dividerColor;
    private final long headlineContentColor;
    private final long navigationContentColor;
    private final long selectedDayContainerColor;
    private final long selectedDayContentColor;
    private final long selectedYearContainerColor;
    private final long selectedYearContentColor;
    private final long subheadContentColor;
    private final long titleContentColor;
    private final long todayContentColor;
    private final long todayDateBorderColor;
    private final long weekdayContentColor;
    private final long yearContentColor;

    public /* synthetic */ DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, textFieldColors);
    }

    private DatePickerColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, TextFieldColors textFieldColors) {
        this.containerColor = j;
        this.titleContentColor = j2;
        this.headlineContentColor = j3;
        this.weekdayContentColor = j4;
        this.subheadContentColor = j5;
        this.navigationContentColor = j6;
        this.yearContentColor = j7;
        this.disabledYearContentColor = j8;
        this.currentYearContentColor = j9;
        this.selectedYearContentColor = j10;
        this.disabledSelectedYearContentColor = j11;
        this.selectedYearContainerColor = j12;
        this.disabledSelectedYearContainerColor = j13;
        this.dayContentColor = j14;
        this.disabledDayContentColor = j15;
        this.selectedDayContentColor = j16;
        this.disabledSelectedDayContentColor = j17;
        this.selectedDayContainerColor = j18;
        this.disabledSelectedDayContainerColor = j19;
        this.todayContentColor = j20;
        this.todayDateBorderColor = j21;
        this.dayInSelectionRangeContainerColor = j22;
        this.dayInSelectionRangeContentColor = j23;
        this.dividerColor = j24;
        this.dateTextFieldColors = textFieldColors;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: getTitleContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTitleContentColor() {
        return this.titleContentColor;
    }

    /* renamed from: getHeadlineContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeadlineContentColor() {
        return this.headlineContentColor;
    }

    /* renamed from: getWeekdayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getWeekdayContentColor() {
        return this.weekdayContentColor;
    }

    /* renamed from: getSubheadContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSubheadContentColor() {
        return this.subheadContentColor;
    }

    /* renamed from: getNavigationContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getNavigationContentColor() {
        return this.navigationContentColor;
    }

    /* renamed from: getYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getYearContentColor() {
        return this.yearContentColor;
    }

    /* renamed from: getDisabledYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledYearContentColor() {
        return this.disabledYearContentColor;
    }

    /* renamed from: getCurrentYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getCurrentYearContentColor() {
        return this.currentYearContentColor;
    }

    /* renamed from: getSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContentColor() {
        return this.selectedYearContentColor;
    }

    /* renamed from: getDisabledSelectedYearContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContentColor() {
        return this.disabledSelectedYearContentColor;
    }

    /* renamed from: getSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedYearContainerColor() {
        return this.selectedYearContainerColor;
    }

    /* renamed from: getDisabledSelectedYearContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedYearContainerColor() {
        return this.disabledSelectedYearContainerColor;
    }

    /* renamed from: getDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayContentColor() {
        return this.dayContentColor;
    }

    /* renamed from: getDisabledDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledDayContentColor() {
        return this.disabledDayContentColor;
    }

    /* renamed from: getSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContentColor() {
        return this.selectedDayContentColor;
    }

    /* renamed from: getDisabledSelectedDayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContentColor() {
        return this.disabledSelectedDayContentColor;
    }

    /* renamed from: getSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSelectedDayContainerColor() {
        return this.selectedDayContainerColor;
    }

    /* renamed from: getDisabledSelectedDayContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledSelectedDayContainerColor() {
        return this.disabledSelectedDayContainerColor;
    }

    /* renamed from: getTodayContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayContentColor() {
        return this.todayContentColor;
    }

    /* renamed from: getTodayDateBorderColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTodayDateBorderColor() {
        return this.todayDateBorderColor;
    }

    /* renamed from: getDayInSelectionRangeContainerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContainerColor() {
        return this.dayInSelectionRangeContainerColor;
    }

    /* renamed from: getDayInSelectionRangeContentColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDayInSelectionRangeContentColor() {
        return this.dayInSelectionRangeContentColor;
    }

    /* renamed from: getDividerColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDividerColor() {
        return this.dividerColor;
    }

    @NotNull
    public final TextFieldColors getDateTextFieldColors() {
        return this.dateTextFieldColors;
    }

    @NotNull
    public final TextFieldColors takeOrElse$material3_release(@Nullable TextFieldColors textFieldColors, @NotNull Function0<TextFieldColors> function0) {
        return textFieldColors == null ? function0.invoke() : textFieldColors;
    }

    @Composable
    @NotNull
    public final State<Color> dayContentColor$material3_release(boolean z, boolean z2, boolean z3, boolean z4, @Nullable Composer composer, int i) {
        long j;
        State<Color> stateM7665animateColorAsStateeuL9pac;
        composer.startReplaceableGroup(-1233694918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1233694918, i, -1, "androidx.compose.material3.DatePickerColors.dayContentColor (DatePicker.kt:890)");
        }
        if (z2 && z4) {
            j = this.selectedDayContentColor;
        } else if (z2 && !z4) {
            j = this.disabledSelectedDayContentColor;
        } else if (z3 && z4) {
            j = this.dayInSelectionRangeContentColor;
        } else if (z3 && !z4) {
            j = this.disabledDayContentColor;
        } else if (z) {
            j = this.todayContentColor;
        } else if (z4) {
            j = this.dayContentColor;
        } else {
            j = this.disabledDayContentColor;
        }
        long j2 = j;
        if (z3) {
            composer.startReplaceableGroup(379022200);
            stateM7665animateColorAsStateeuL9pac = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j2), composer, 0);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(379022258);
            stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(j2, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM7665animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> dayContainerColor$material3_release(boolean z, boolean z2, boolean z3, @Nullable Composer composer, int i) {
        long jM11375getTransparent0d7_KjU;
        State<Color> stateRememberUpdatedState;
        composer.startReplaceableGroup(-1240482658);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1240482658, i, -1, "androidx.compose.material3.DatePickerColors.dayContainerColor (DatePicker.kt:924)");
        }
        if (z) {
            jM11375getTransparent0d7_KjU = z2 ? this.selectedDayContainerColor : this.disabledSelectedDayContainerColor;
        } else {
            jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
        }
        long j = jM11375getTransparent0d7_KjU;
        if (z3) {
            composer.startReplaceableGroup(1577421952);
            stateRememberUpdatedState = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1577422116);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m11330boximpl(j), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> yearContentColor$material3_release(boolean z, boolean z2, boolean z3, @Nullable Composer composer, int i) {
        long j;
        composer.startReplaceableGroup(874111097);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(874111097, i, -1, "androidx.compose.material3.DatePickerColors.yearContentColor (DatePicker.kt:952)");
        }
        if (z2 && z3) {
            j = this.selectedYearContentColor;
        } else if (z2 && !z3) {
            j = this.disabledSelectedYearContentColor;
        } else if (z) {
            j = this.currentYearContentColor;
        } else if (z3) {
            j = this.yearContentColor;
        } else {
            j = this.disabledYearContentColor;
        }
        State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(j, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM7665animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> yearContainerColor$material3_release(boolean z, boolean z2, @Nullable Composer composer, int i) {
        long jM11375getTransparent0d7_KjU;
        composer.startReplaceableGroup(-1306331107);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1306331107, i, -1, "androidx.compose.material3.DatePickerColors.yearContainerColor (DatePicker.kt:974)");
        }
        if (z) {
            jM11375getTransparent0d7_KjU = z2 ? this.selectedYearContainerColor : this.disabledSelectedYearContainerColor;
        } else {
            jM11375getTransparent0d7_KjU = Color.INSTANCE.m11375getTransparent0d7_KjU();
        }
        State<Color> stateM7665animateColorAsStateeuL9pac = SingleValueAnimationKt.m7665animateColorAsStateeuL9pac(jM11375getTransparent0d7_KjU, AnimationSpecKt.tween$default(100, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM7665animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof DatePickerColors)) {
            return false;
        }
        DatePickerColors datePickerColors = (DatePickerColors) other;
        return Color.m11341equalsimpl0(this.containerColor, datePickerColors.containerColor) && Color.m11341equalsimpl0(this.titleContentColor, datePickerColors.titleContentColor) && Color.m11341equalsimpl0(this.headlineContentColor, datePickerColors.headlineContentColor) && Color.m11341equalsimpl0(this.weekdayContentColor, datePickerColors.weekdayContentColor) && Color.m11341equalsimpl0(this.subheadContentColor, datePickerColors.subheadContentColor) && Color.m11341equalsimpl0(this.yearContentColor, datePickerColors.yearContentColor) && Color.m11341equalsimpl0(this.disabledYearContentColor, datePickerColors.disabledYearContentColor) && Color.m11341equalsimpl0(this.currentYearContentColor, datePickerColors.currentYearContentColor) && Color.m11341equalsimpl0(this.selectedYearContentColor, datePickerColors.selectedYearContentColor) && Color.m11341equalsimpl0(this.disabledSelectedYearContentColor, datePickerColors.disabledSelectedYearContentColor) && Color.m11341equalsimpl0(this.selectedYearContainerColor, datePickerColors.selectedYearContainerColor) && Color.m11341equalsimpl0(this.disabledSelectedYearContainerColor, datePickerColors.disabledSelectedYearContainerColor) && Color.m11341equalsimpl0(this.dayContentColor, datePickerColors.dayContentColor) && Color.m11341equalsimpl0(this.disabledDayContentColor, datePickerColors.disabledDayContentColor) && Color.m11341equalsimpl0(this.selectedDayContentColor, datePickerColors.selectedDayContentColor) && Color.m11341equalsimpl0(this.disabledSelectedDayContentColor, datePickerColors.disabledSelectedDayContentColor) && Color.m11341equalsimpl0(this.selectedDayContainerColor, datePickerColors.selectedDayContainerColor) && Color.m11341equalsimpl0(this.disabledSelectedDayContainerColor, datePickerColors.disabledSelectedDayContainerColor) && Color.m11341equalsimpl0(this.todayContentColor, datePickerColors.todayContentColor) && Color.m11341equalsimpl0(this.todayDateBorderColor, datePickerColors.todayDateBorderColor) && Color.m11341equalsimpl0(this.dayInSelectionRangeContainerColor, datePickerColors.dayInSelectionRangeContainerColor) && Color.m11341equalsimpl0(this.dayInSelectionRangeContentColor, datePickerColors.dayInSelectionRangeContentColor);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((Color.m11347hashCodeimpl(this.containerColor) * 31) + Color.m11347hashCodeimpl(this.titleContentColor)) * 31) + Color.m11347hashCodeimpl(this.headlineContentColor)) * 31) + Color.m11347hashCodeimpl(this.weekdayContentColor)) * 31) + Color.m11347hashCodeimpl(this.subheadContentColor)) * 31) + Color.m11347hashCodeimpl(this.yearContentColor)) * 31) + Color.m11347hashCodeimpl(this.disabledYearContentColor)) * 31) + Color.m11347hashCodeimpl(this.currentYearContentColor)) * 31) + Color.m11347hashCodeimpl(this.selectedYearContentColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSelectedYearContentColor)) * 31) + Color.m11347hashCodeimpl(this.selectedYearContainerColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSelectedYearContainerColor)) * 31) + Color.m11347hashCodeimpl(this.dayContentColor)) * 31) + Color.m11347hashCodeimpl(this.disabledDayContentColor)) * 31) + Color.m11347hashCodeimpl(this.selectedDayContentColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSelectedDayContentColor)) * 31) + Color.m11347hashCodeimpl(this.selectedDayContainerColor)) * 31) + Color.m11347hashCodeimpl(this.disabledSelectedDayContainerColor)) * 31) + Color.m11347hashCodeimpl(this.todayContentColor)) * 31) + Color.m11347hashCodeimpl(this.todayDateBorderColor)) * 31) + Color.m11347hashCodeimpl(this.dayInSelectionRangeContainerColor)) * 31) + Color.m11347hashCodeimpl(this.dayInSelectionRangeContentColor);
    }

    @NotNull
    /* renamed from: copy-tNwlRmA, reason: not valid java name */
    public final DatePickerColors m9348copytNwlRmA(long containerColor, long titleContentColor, long headlineContentColor, long weekdayContentColor, long subheadContentColor, long navigationContentColor, long yearContentColor, long disabledYearContentColor, long currentYearContentColor, long selectedYearContentColor, long disabledSelectedYearContentColor, long selectedYearContainerColor, long disabledSelectedYearContainerColor, long dayContentColor, long disabledDayContentColor, long selectedDayContentColor, long disabledSelectedDayContentColor, long selectedDayContainerColor, long disabledSelectedDayContainerColor, long todayContentColor, long todayDateBorderColor, long dayInSelectionRangeContainerColor, long dayInSelectionRangeContentColor, long dividerColor, @Nullable TextFieldColors dateTextFieldColors) {
        Color.Companion companion = Color.INSTANCE;
        return new DatePickerColors(containerColor != companion.m11376getUnspecified0d7_KjU() ? containerColor : this.containerColor, titleContentColor != companion.m11376getUnspecified0d7_KjU() ? titleContentColor : this.titleContentColor, headlineContentColor != companion.m11376getUnspecified0d7_KjU() ? headlineContentColor : this.headlineContentColor, weekdayContentColor != companion.m11376getUnspecified0d7_KjU() ? weekdayContentColor : this.weekdayContentColor, subheadContentColor != companion.m11376getUnspecified0d7_KjU() ? subheadContentColor : this.subheadContentColor, navigationContentColor != companion.m11376getUnspecified0d7_KjU() ? navigationContentColor : this.navigationContentColor, yearContentColor != companion.m11376getUnspecified0d7_KjU() ? yearContentColor : this.yearContentColor, disabledYearContentColor != companion.m11376getUnspecified0d7_KjU() ? disabledYearContentColor : this.disabledYearContentColor, currentYearContentColor != companion.m11376getUnspecified0d7_KjU() ? currentYearContentColor : this.currentYearContentColor, selectedYearContentColor != companion.m11376getUnspecified0d7_KjU() ? selectedYearContentColor : this.selectedYearContentColor, disabledSelectedYearContentColor != companion.m11376getUnspecified0d7_KjU() ? disabledSelectedYearContentColor : this.disabledSelectedYearContentColor, selectedYearContainerColor != companion.m11376getUnspecified0d7_KjU() ? selectedYearContainerColor : this.selectedYearContainerColor, disabledSelectedYearContainerColor != companion.m11376getUnspecified0d7_KjU() ? disabledSelectedYearContainerColor : this.disabledSelectedYearContainerColor, dayContentColor != companion.m11376getUnspecified0d7_KjU() ? dayContentColor : this.dayContentColor, disabledDayContentColor != companion.m11376getUnspecified0d7_KjU() ? disabledDayContentColor : this.disabledDayContentColor, selectedDayContentColor != companion.m11376getUnspecified0d7_KjU() ? selectedDayContentColor : this.selectedDayContentColor, disabledSelectedDayContentColor != companion.m11376getUnspecified0d7_KjU() ? disabledSelectedDayContentColor : this.disabledSelectedDayContentColor, selectedDayContainerColor != companion.m11376getUnspecified0d7_KjU() ? selectedDayContainerColor : this.selectedDayContainerColor, disabledSelectedDayContainerColor != companion.m11376getUnspecified0d7_KjU() ? disabledSelectedDayContainerColor : this.disabledSelectedDayContainerColor, todayContentColor != companion.m11376getUnspecified0d7_KjU() ? todayContentColor : this.todayContentColor, todayDateBorderColor != companion.m11376getUnspecified0d7_KjU() ? todayDateBorderColor : this.todayDateBorderColor, dayInSelectionRangeContainerColor != companion.m11376getUnspecified0d7_KjU() ? dayInSelectionRangeContainerColor : this.dayInSelectionRangeContainerColor, dayInSelectionRangeContentColor != companion.m11376getUnspecified0d7_KjU() ? dayInSelectionRangeContentColor : this.dayInSelectionRangeContentColor, dividerColor != companion.m11376getUnspecified0d7_KjU() ? dividerColor : this.dividerColor, takeOrElse$material3_release(dateTextFieldColors, new Function0<TextFieldColors>() { // from class: androidx.compose.material3.DatePickerColors$copy$25
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final TextFieldColors invoke() {
                return this.this$0.getDateTextFieldColors();
            }
        }), null);
    }
}
