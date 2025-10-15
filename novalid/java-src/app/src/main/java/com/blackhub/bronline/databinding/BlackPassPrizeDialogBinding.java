package com.blackhub.bronline.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.bless.client.R;

/* loaded from: classes2.dex */
public final class BlackPassPrizeDialogBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton bpdPrizeClose;

    @NonNull
    public final AppCompatButton bpdPrizeGet;

    @NonNull
    public final ImageView bpdPrizeImg;

    @NonNull
    public final TextView bpdPrizePrizeTitle;

    @NonNull
    public final TextView bpdPrizeTitle;

    @NonNull
    public final ConstraintLayout rootView;

    public BlackPassPrizeDialogBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatButton bpdPrizeClose, @NonNull AppCompatButton bpdPrizeGet, @NonNull ImageView bpdPrizeImg, @NonNull TextView bpdPrizePrizeTitle, @NonNull TextView bpdPrizeTitle) {
        this.rootView = rootView;
        this.bpdPrizeClose = bpdPrizeClose;
        this.bpdPrizeGet = bpdPrizeGet;
        this.bpdPrizeImg = bpdPrizeImg;
        this.bpdPrizePrizeTitle = bpdPrizePrizeTitle;
        this.bpdPrizeTitle = bpdPrizeTitle;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    @NonNull
    public static BlackPassPrizeDialogBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static BlackPassPrizeDialogBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.black_pass_prize_dialog, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @NonNull
    public static BlackPassPrizeDialogBinding bind(@NonNull View rootView) {
        int i = R.id.bpd_prize_close;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bpd_prize_close);
        if (appCompatButton != null) {
            i = R.id.bpd_prize_get;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.bpd_prize_get);
            if (appCompatButton2 != null) {
                i = R.id.bpd_prize_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.bpd_prize_img);
                if (imageView != null) {
                    i = R.id.bpd_prize_prize_title;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.bpd_prize_prize_title);
                    if (textView != null) {
                        i = R.id.bpd_prize_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.bpd_prize_title);
                        if (textView2 != null) {
                            return new BlackPassPrizeDialogBinding((ConstraintLayout) rootView, appCompatButton, appCompatButton2, imageView, textView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
