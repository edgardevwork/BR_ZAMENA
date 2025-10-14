package com.blackhub.bronline.game.gui.socialaction;

import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.databinding.SocialInteractionBinding;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PositionsGetter.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PositionsGetter {
    public static final int $stable = 8;

    @NotNull
    public final SocialInteractionBinding binding;
    public int button1Height;

    @NotNull
    public final int[] button1Location;
    public int button1Width;
    public int button2Height;

    @NotNull
    public final int[] button2Location;
    public int button2Width;
    public int button3Height;

    @NotNull
    public final int[] button3Location;
    public int button3Width;
    public int button4Height;

    @NotNull
    public final int[] button4Location;
    public int button4Width;
    public int button5Height;

    @NotNull
    public final int[] button5Location;
    public int button5Width;
    public int button6Height;

    @NotNull
    public final int[] button6Location;
    public int button6Width;
    public int button7Height;

    @NotNull
    public final int[] button7Location;
    public int button7Width;

    public PositionsGetter(@NotNull SocialInteractionBinding binding) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.binding = binding;
        this.button1Location = new int[]{0, 0};
        this.button2Location = new int[]{0, 0};
        this.button3Location = new int[]{0, 0};
        this.button4Location = new int[]{0, 0};
        this.button5Location = new int[]{0, 0};
        this.button6Location = new int[]{0, 0};
        this.button7Location = new int[]{0, 0};
    }

    @NotNull
    public final int[] getButton1Location() {
        return this.button1Location;
    }

    public final int getButton1Height() {
        return this.button1Height;
    }

    public final void setButton1Height(int i) {
        this.button1Height = i;
    }

    public final int getButton1Width() {
        return this.button1Width;
    }

    public final void setButton1Width(int i) {
        this.button1Width = i;
    }

    @NotNull
    public final int[] getButton2Location() {
        return this.button2Location;
    }

    public final int getButton2Height() {
        return this.button2Height;
    }

    public final void setButton2Height(int i) {
        this.button2Height = i;
    }

    public final int getButton2Width() {
        return this.button2Width;
    }

    public final void setButton2Width(int i) {
        this.button2Width = i;
    }

    @NotNull
    public final int[] getButton3Location() {
        return this.button3Location;
    }

    public final int getButton3Height() {
        return this.button3Height;
    }

    public final void setButton3Height(int i) {
        this.button3Height = i;
    }

    public final int getButton3Width() {
        return this.button3Width;
    }

    public final void setButton3Width(int i) {
        this.button3Width = i;
    }

    @NotNull
    public final int[] getButton4Location() {
        return this.button4Location;
    }

    public final int getButton4Height() {
        return this.button4Height;
    }

    public final void setButton4Height(int i) {
        this.button4Height = i;
    }

    public final int getButton4Width() {
        return this.button4Width;
    }

    public final void setButton4Width(int i) {
        this.button4Width = i;
    }

    @NotNull
    public final int[] getButton5Location() {
        return this.button5Location;
    }

    public final int getButton5Height() {
        return this.button5Height;
    }

    public final void setButton5Height(int i) {
        this.button5Height = i;
    }

    public final int getButton5Width() {
        return this.button5Width;
    }

    public final void setButton5Width(int i) {
        this.button5Width = i;
    }

    @NotNull
    public final int[] getButton6Location() {
        return this.button6Location;
    }

    public final int getButton6Height() {
        return this.button6Height;
    }

    public final void setButton6Height(int i) {
        this.button6Height = i;
    }

    public final int getButton6Width() {
        return this.button6Width;
    }

    public final void setButton6Width(int i) {
        this.button6Width = i;
    }

    @NotNull
    public final int[] getButton7Location() {
        return this.button7Location;
    }

    public final int getButton7Height() {
        return this.button7Height;
    }

    public final void setButton7Height(int i) {
        this.button7Height = i;
    }

    public final int getButton7Width() {
        return this.button7Width;
    }

    public final void setButton7Width(int i) {
        this.button7Width = i;
    }

    public final void getPositions() {
        TextView textView = this.binding.button1;
        textView.getLocationInWindow(this.button1Location);
        this.button1Height = textView.getHeight();
        this.button1Width = textView.getWidth();
        TextView textView2 = this.binding.button2;
        textView2.getLocationInWindow(this.button2Location);
        this.button2Height = textView2.getHeight();
        this.button2Width = textView2.getWidth();
        TextView textView3 = this.binding.button3;
        textView3.getLocationInWindow(this.button3Location);
        this.button3Height = textView3.getHeight();
        this.button3Width = textView3.getWidth();
        TextView textView4 = this.binding.button4;
        textView4.getLocationInWindow(this.button4Location);
        this.button4Height = textView4.getHeight();
        this.button4Width = textView4.getWidth();
        TextView textView5 = this.binding.button5;
        textView5.getLocationInWindow(this.button5Location);
        this.button5Height = textView5.getHeight();
        this.button5Width = textView5.getWidth();
        TextView textView6 = this.binding.button6;
        textView6.getLocationInWindow(this.button6Location);
        this.button6Height = textView6.getHeight();
        this.button6Width = textView6.getWidth();
        TextView textView7 = this.binding.button7;
        textView7.getLocationInWindow(this.button7Location);
        this.button7Height = textView7.getHeight();
        this.button7Width = textView7.getWidth();
    }
}

