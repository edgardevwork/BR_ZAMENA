package com.sdkit.paylib.paylibnative.api.entity;

import androidx.media3.extractor.text.ttml.TtmlNode;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import kotlin.Metadata;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0013\u001a\u0004\b\u001b\u0010\u0015¨\u0006\u001e"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/api/entity/HostInsets;", "", "", "component1", "component2", "component3", "component4", "top", "bottom", TtmlNode.LEFT, TtmlNode.RIGHT, "copy", "", "toString", "hashCode", "other", "", "equals", "a", "I", "getTop", "()I", "b", "getBottom", "c", "getLeft", "d", "getRight", SegmentConstantPool.INITSTRING, "(IIII)V", "com-sdkit-assistant_paylib_native_api"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes8.dex */
public final /* data */ class HostInsets {

    /* renamed from: a, reason: from kotlin metadata */
    public final int top;

    /* renamed from: b, reason: from kotlin metadata */
    public final int bottom;

    /* renamed from: c, reason: from kotlin metadata */
    public final int left;

    /* renamed from: d, reason: from kotlin metadata */
    public final int right;

    public HostInsets(int i, int i2, int i3, int i4) {
        this.top = i;
        this.bottom = i2;
        this.left = i3;
        this.right = i4;
    }

    public static /* synthetic */ HostInsets copy$default(HostInsets hostInsets, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = hostInsets.top;
        }
        if ((i5 & 2) != 0) {
            i2 = hostInsets.bottom;
        }
        if ((i5 & 4) != 0) {
            i3 = hostInsets.left;
        }
        if ((i5 & 8) != 0) {
            i4 = hostInsets.right;
        }
        return hostInsets.copy(i, i2, i3, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public final HostInsets copy(int top, int bottom, int left, int right) {
        return new HostInsets(top, bottom, left, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HostInsets)) {
            return false;
        }
        HostInsets hostInsets = (HostInsets) other;
        return this.top == hostInsets.top && this.bottom == hostInsets.bottom && this.left == hostInsets.left && this.right == hostInsets.right;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getRight() {
        return this.right;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return Integer.hashCode(this.right) + C8054b.m1525a(this.left, C8054b.m1525a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
    }

    public String toString() {
        return "HostInsets(top=" + this.top + ", bottom=" + this.bottom + ", left=" + this.left + ", right=" + this.right + ')';
    }
}
