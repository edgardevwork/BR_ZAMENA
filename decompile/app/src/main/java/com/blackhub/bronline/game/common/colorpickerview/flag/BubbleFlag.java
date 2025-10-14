package com.blackhub.bronline.game.common.colorpickerview.flag;

import android.content.Context;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.ImageViewCompat;
import com.blackhub.bronline.game.common.colorpickerview.ColorEnvelope;
import com.bless.client.R;

/* loaded from: classes3.dex */
public class BubbleFlag extends FlagView {
    public final AppCompatImageView bubble;

    public BubbleFlag(Context context) {
        super(context, R.layout.widget_bubble_colorpickerview_skydoves);
        this.bubble = (AppCompatImageView) findViewById(R.id.imBubble);
    }

    @Override // com.blackhub.bronline.game.common.colorpickerview.flag.FlagView
    public void onRefresh(ColorEnvelope colorEnvelope) {
        ImageViewCompat.setImageTintList(this.bubble, ColorStateList.valueOf(colorEnvelope.getColor()));
    }
}
