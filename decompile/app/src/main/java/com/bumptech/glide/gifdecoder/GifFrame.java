package com.bumptech.glide.gifdecoder;

import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public class GifFrame {
    public static final int DISPOSAL_BACKGROUND = 2;
    public static final int DISPOSAL_NONE = 1;
    public static final int DISPOSAL_PREVIOUS = 3;
    public static final int DISPOSAL_UNSPECIFIED = 0;
    public int bufferFrameStart;
    public int delay;
    public int dispose;

    /* renamed from: ih */
    public int f513ih;
    public boolean interlace;

    /* renamed from: iw */
    public int f514iw;

    /* renamed from: ix */
    public int f515ix;

    /* renamed from: iy */
    public int f516iy;

    @ColorInt
    public int[] lct;
    public int transIndex;
    public boolean transparency;
}
