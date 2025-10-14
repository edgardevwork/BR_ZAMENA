package com.airbnb.lottie.utils;

/* loaded from: classes3.dex */
public class MeanCalculator {

    /* renamed from: n */
    public int f372n;
    public float sum;

    public void add(float f) {
        float f2 = this.sum + f;
        this.sum = f2;
        int i = this.f372n + 1;
        this.f372n = i;
        if (i == Integer.MAX_VALUE) {
            this.sum = f2 / 2.0f;
            this.f372n = i / 2;
        }
    }

    public float getMean() {
        int i = this.f372n;
        if (i == 0) {
            return 0.0f;
        }
        return this.sum / i;
    }
}
