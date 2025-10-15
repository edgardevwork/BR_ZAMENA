package androidx.compose.p003ui.text.android;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextLayout.kt */
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J(\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\u0014\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0006R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/ui/text/android/HorizontalPositionCache;", "", TtmlNode.TAG_LAYOUT, "Landroidx/compose/ui/text/android/TextLayout;", "(Landroidx/compose/ui/text/android/TextLayout;)V", "cachedKey", "", "cachedValue", "", "getLayout", "()Landroidx/compose/ui/text/android/TextLayout;", "get", TypedValues.CycleType.S_WAVE_OFFSET, "upstream", "", "cache", FeatureParser.FeatureHandler.PRIMARY, "getPrimaryDownstream", "getPrimaryUpstream", "getSecondaryDownstream", "getSecondaryUpstream", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HorizontalPositionCache {
    public int cachedKey = -1;
    public float cachedValue;

    @NotNull
    public final TextLayout layout;

    public HorizontalPositionCache(@NotNull TextLayout textLayout) {
        this.layout = textLayout;
    }

    @NotNull
    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i) {
        return get(i, false, false, true);
    }

    public final float getPrimaryUpstream(int i) {
        return get(i, true, true, true);
    }

    public final float getSecondaryDownstream(int i) {
        return get(i, false, false, false);
    }

    public final float getSecondaryUpstream(int i) {
        return get(i, true, true, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float get(int i, boolean upstream, boolean cache, boolean z) {
        boolean z2;
        float secondaryHorizontal;
        int i2 = 1;
        if (upstream) {
            int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout.getLayout(), i, upstream);
            z2 = i == this.layout.getLineStart(lineForOffset) || i == this.layout.getLineEnd(lineForOffset);
        }
        int i3 = i * 4;
        if (!z) {
            i2 = z2 ? 2 : 3;
        } else if (z2) {
            i2 = 0;
        }
        int i4 = i3 + i2;
        if (this.cachedKey == i4) {
            return this.cachedValue;
        }
        if (z) {
            secondaryHorizontal = this.layout.getPrimaryHorizontal(i, upstream);
        } else {
            secondaryHorizontal = this.layout.getSecondaryHorizontal(i, upstream);
        }
        if (cache) {
            this.cachedKey = i4;
            this.cachedValue = secondaryHorizontal;
        }
        return secondaryHorizontal;
    }
}
