package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ListItem.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\u0015\u0010\u0002\u001a\u00020\u0003H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u000eJ\u001d\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001cJ\u0015\u0010\u0006\u001a\u00020\u0003H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u000eJ\u0015\u0010\u001f\u001a\u00020\u0003H\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u000eJ\u001d\u0010\b\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\u001cR\u0019\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0019\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0011\u0010\u000eR\u0019\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0012\u0010\u000eR\u0019\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000eR\u0019\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0014\u0010\u000eR\u0019\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0015\u0010\u000eR\u0019\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0016\u0010\u000eR\u0019\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0017\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, m7105d2 = {"Landroidx/compose/material3/ListItemColors;", "", "containerColor", "Landroidx/compose/ui/graphics/Color;", "headlineColor", "leadingIconColor", "overlineColor", "supportingTextColor", "trailingIconColor", "disabledHeadlineColor", "disabledLeadingIconColor", "disabledTrailingIconColor", "(JJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getContainerColor-0d7_KjU", "()J", "J", "getDisabledHeadlineColor-0d7_KjU", "getDisabledLeadingIconColor-0d7_KjU", "getDisabledTrailingIconColor-0d7_KjU", "getHeadlineColor-0d7_KjU", "getLeadingIconColor-0d7_KjU", "getOverlineColor-0d7_KjU", "getSupportingTextColor-0d7_KjU", "getTrailingIconColor-0d7_KjU", "containerColor-0d7_KjU$material3_release", "enabled", "", "headlineColor-vNxB06k$material3_release", "(Z)J", "leadingIconColor-vNxB06k$material3_release", "overlineColor-0d7_KjU$material3_release", "supportingColor", "supportingColor-0d7_KjU$material3_release", "trailingIconColor-vNxB06k$material3_release", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ListItemColors {
    public static final int $stable = 0;
    private final long containerColor;
    private final long disabledHeadlineColor;
    private final long disabledLeadingIconColor;
    private final long disabledTrailingIconColor;
    private final long headlineColor;
    private final long leadingIconColor;
    private final long overlineColor;
    private final long supportingTextColor;
    private final long trailingIconColor;

    public /* synthetic */ ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9);
    }

    private ListItemColors(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9) {
        this.containerColor = j;
        this.headlineColor = j2;
        this.leadingIconColor = j3;
        this.overlineColor = j4;
        this.supportingTextColor = j5;
        this.trailingIconColor = j6;
        this.disabledHeadlineColor = j7;
        this.disabledLeadingIconColor = j8;
        this.disabledTrailingIconColor = j9;
    }

    /* renamed from: getContainerColor-0d7_KjU, reason: not valid java name */
    public final long m9522getContainerColor0d7_KjU() {
        return this.containerColor;
    }

    /* renamed from: getHeadlineColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getHeadlineColor() {
        return this.headlineColor;
    }

    /* renamed from: getLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getLeadingIconColor() {
        return this.leadingIconColor;
    }

    /* renamed from: getOverlineColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getOverlineColor() {
        return this.overlineColor;
    }

    /* renamed from: getSupportingTextColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getSupportingTextColor() {
        return this.supportingTextColor;
    }

    /* renamed from: getTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getTrailingIconColor() {
        return this.trailingIconColor;
    }

    /* renamed from: getDisabledHeadlineColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledHeadlineColor() {
        return this.disabledHeadlineColor;
    }

    /* renamed from: getDisabledLeadingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledLeadingIconColor() {
        return this.disabledLeadingIconColor;
    }

    /* renamed from: getDisabledTrailingIconColor-0d7_KjU, reason: not valid java name and from getter */
    public final long getDisabledTrailingIconColor() {
        return this.disabledTrailingIconColor;
    }

    /* renamed from: containerColor-0d7_KjU$material3_release, reason: not valid java name and from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    @Stable
    /* renamed from: headlineColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9531headlineColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.headlineColor : this.disabledHeadlineColor;
    }

    @Stable
    /* renamed from: leadingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9532leadingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.leadingIconColor : this.disabledLeadingIconColor;
    }

    @Stable
    /* renamed from: overlineColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m9533overlineColor0d7_KjU$material3_release() {
        return this.overlineColor;
    }

    @Stable
    /* renamed from: supportingColor-0d7_KjU$material3_release, reason: not valid java name */
    public final long m9534supportingColor0d7_KjU$material3_release() {
        return this.supportingTextColor;
    }

    @Stable
    /* renamed from: trailingIconColor-vNxB06k$material3_release, reason: not valid java name */
    public final long m9535trailingIconColorvNxB06k$material3_release(boolean enabled) {
        return enabled ? this.trailingIconColor : this.disabledTrailingIconColor;
    }
}
