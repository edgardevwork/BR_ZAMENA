package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes4.dex */
public final class Hct {
    public int argb;
    public double chroma;
    public double hue;
    public double tone;

    public static Hct from(double d, double d2, double d3) {
        return new Hct(HctSolver.solveToInt(d, d2, d3));
    }

    public static Hct fromInt(int i) {
        return new Hct(i);
    }

    public Hct(int i) {
        setInternalState(i);
    }

    public double getHue() {
        return this.hue;
    }

    public double getChroma() {
        return this.chroma;
    }

    public double getTone() {
        return this.tone;
    }

    public int toInt() {
        return this.argb;
    }

    public void setHue(double d) {
        setInternalState(HctSolver.solveToInt(d, this.chroma, this.tone));
    }

    public void setChroma(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, d, this.tone));
    }

    public void setTone(double d) {
        setInternalState(HctSolver.solveToInt(this.hue, this.chroma, d));
    }

    public Hct inViewingConditions(ViewingConditions viewingConditions) {
        double[] dArrXyzInViewingConditions = Cam16.fromInt(toInt()).xyzInViewingConditions(viewingConditions, null);
        Cam16 cam16FromXyzInViewingConditions = Cam16.fromXyzInViewingConditions(dArrXyzInViewingConditions[0], dArrXyzInViewingConditions[1], dArrXyzInViewingConditions[2], ViewingConditions.DEFAULT);
        return from(cam16FromXyzInViewingConditions.getHue(), cam16FromXyzInViewingConditions.getChroma(), ColorUtils.lstarFromY(dArrXyzInViewingConditions[1]));
    }

    public final void setInternalState(int i) {
        this.argb = i;
        Cam16 cam16FromInt = Cam16.fromInt(i);
        this.hue = cam16FromInt.getHue();
        this.chroma = cam16FromInt.getChroma();
        this.tone = ColorUtils.lstarFromArgb(i);
    }
}
