package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class CorePalette {

    /* renamed from: a1 */
    public TonalPalette f693a1;

    /* renamed from: a2 */
    public TonalPalette f694a2;

    /* renamed from: a3 */
    public TonalPalette f695a3;
    public TonalPalette error;

    /* renamed from: n1 */
    public TonalPalette f696n1;

    /* renamed from: n2 */
    public TonalPalette f697n2;

    /* renamed from: of */
    public static CorePalette m1117of(int i) {
        return new CorePalette(i, false);
    }

    public static CorePalette contentOf(int i) {
        return new CorePalette(i, true);
    }

    public CorePalette(int i, boolean z) {
        Hct hctFromInt = Hct.fromInt(i);
        double hue = hctFromInt.getHue();
        double chroma = hctFromInt.getChroma();
        if (z) {
            this.f693a1 = TonalPalette.fromHueAndChroma(hue, chroma);
            this.f694a2 = TonalPalette.fromHueAndChroma(hue, chroma / 3.0d);
            this.f695a3 = TonalPalette.fromHueAndChroma(60.0d + hue, chroma / 2.0d);
            this.f696n1 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 12.0d, 4.0d));
            this.f697n2 = TonalPalette.fromHueAndChroma(hue, Math.min(chroma / 6.0d, 8.0d));
        } else {
            this.f693a1 = TonalPalette.fromHueAndChroma(hue, Math.max(48.0d, chroma));
            this.f694a2 = TonalPalette.fromHueAndChroma(hue, 16.0d);
            this.f695a3 = TonalPalette.fromHueAndChroma(60.0d + hue, 24.0d);
            this.f696n1 = TonalPalette.fromHueAndChroma(hue, 4.0d);
            this.f697n2 = TonalPalette.fromHueAndChroma(hue, 8.0d);
        }
        this.error = TonalPalette.fromHueAndChroma(25.0d, 84.0d);
    }
}
